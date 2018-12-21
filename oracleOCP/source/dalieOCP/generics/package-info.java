/**
 * <h6>Generics</h6>
 * 
 * <p>Generics enable you to abstract over types.
 * 	The basic purpose behind using generics is to enable you to mark<br/>
 * 	<b>your intent of using a class, method, or interface</b> with a particular data type.<br/>
 * 	Generics add <b>compile-time safety</b> to collections.
 * </p>
 * <br/>
 * 
 * <table border="1" style="border-collapse: collapse;">
 * 	<tr><th>Term</th><th>Meaning</th></tr>
 * 	<tr><td>Generic types</td><td>A generic type is a class or interface, which have on or more type parameters in this declaration</td></tr>
 * 	<tr><td>Parameterized types</td><td>An invocation of a generic type is generally known as a parameterized type.<br/>
 * 		For generic type List&lt;E&gt;, List&lt;String&gt; is a parameterized type.</td></tr>
 *  <tr><td>Type parameter</td><td>You use type parameters to define generic classes, interfaces, or methods.<br/>
 *  	E in List&lt;E&gt; is a type parameter.</td></tr>
 *  <tr><td>Type argument</td><td>A type argument specifies the type of objects to be used for a type parameter.<br/>
 *  	For List&lt;String&gt;, String is a type argument.</td></tr>
 *  <tr><td>Wildcard</td><td>A wildcard is represented by a ? (a question mark). It refers to an unknown type.</td></tr>
 *  <tr><td>Bounded wildcard</td><td>A wildcard is bounded when it is a base or supertype of a type.</td></tr>
 *  <tr><td>Raw type</td><td>The name of a generic class, or a generic class without any type arguments,<br/> 
 *  	is a raw type. For List&lt;E&gt;, List is a raw type.<br/> Raw Type exist <b>only</b> for generic types</td></tr>
 * </table>
 * <br/>
 * @author dalieuwe
 *
 */
package dalieOCP.generics;