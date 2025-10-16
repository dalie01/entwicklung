# Code Review: `convert` Method

## Major Issues

1. **Attribute name is dropped for most branches**  
   The method only calls `attributeResource.name(name);` in the final `else` branch.  For every other type branch (`String`, `Integer`, `Long`, etc.) the name never gets assigned, so the returned `RawProductAttributeResource` instances will be missing their attribute names.  The name should be set before the type switch so that it is always preserved.

2. **Localized map handling is brittle**  
   * The Accept-Language header can contain quality (`q=`) parameters (e.g. `"en-US;q=0.9"`), but the split/trim logic does not strip them, so the comparison against the map keys will fail.  
   * `entry.getValue().toString()` will throw a `NullPointerException` if any localized value is `null`.  
   * The code only matches exact strings—if the map contains locale tags like `"en"` but the header contains `"en-US"`, no value will be returned.  A more robust matching strategy is needed.

## Minor Issues

1. **Unnecessarily specific list type check**  
   The branch `value instanceof ArrayList<?>` misses other `List` implementations.  Using `value instanceof List<?>` would make the conversion work for any list.

2. **Repeated access to `rawProductAttribute.value()`**  
   The code already stores `var value = rawProductAttribute.value();`, yet the localized-string branch re-reads `rawProductAttribute.value()` instead of reusing the local variable.  While harmless, it is inconsistent and makes the code harder to follow.

3. **Missing default raw value propagation**  
   When the value is converted into a formatted representation (e.g. joining a list into a string), the original raw value is lost.  If the consumer needs both the typed value and the raw payload, consider always setting `attributeResource.rawValue(value)` alongside the specific setter.

