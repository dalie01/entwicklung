package mobile.web.pipelet.property;

import java.util.*;
import java.util.Map.Entry;

import mobile.internal.property.FormProperty;
import mobile.utilities.Pipelet;
import mobile.utilities.capi.PipelineDictionary;
import mobile.utilities.exceptions.PipeletExecutionException;
import model.internal.property.Property;

public class GroupPropertiesWebFormConverter extends Pipelet {

	/**
	 * Constant used to access the pipeline dictionary with key 'Properties'
	 */
	public static final String DN_IN_OUT_PROPERTIES_MAP = "PropertiesMap";
	
	@Override
	public int execute(PipelineDictionary dict)
			throws PipeletExecutionException {
		
		@SuppressWarnings("unchecked")
		Map<Property, Map<String,Property>> global = (Map<Property, Map<String, Property>>) 
				dict.get(DN_IN_OUT_PROPERTIES_MAP);
		
		Map<FormProperty, Map<String, Property>> transition = 
				new TreeMap<FormProperty, Map<String,Property>>();
		
		if (!global.isEmpty()) {
			
			for( Entry<Property, Map<String, Property>> entry : global.entrySet() ) {
				
				Property key = entry.getKey();
				Map<String, Property> value = entry.getValue();
		
				transition.put(new FormProperty(key), value);
				
			} /* for entry */
			
			dict.put(DN_IN_OUT_PROPERTIES_MAP, transition);
		} else {
		
			/* store 'origin' in pipeline dictionary */
			dict.put(DN_IN_OUT_PROPERTIES_MAP, global);
		}
		return PIPELET_NEXT;
	}

} /* class GroupPropertiesWebFormConverter */
