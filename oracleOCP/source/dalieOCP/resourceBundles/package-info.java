/**
 * <h6>ResourceBundles benefit is:</h6>
 * <ul>
 * 	<li>easily localized,or translated in different languages</li>
 * 	<li>handle multiple locales at once</li>
 * 	<li>easily modified latter to support even more locales</li>
 * </ul>
 * <h6>Property-ResourceBundles .properties</h6>
 *  <ul>
 * 	<li>comments beginning with #</li>
 * 	<li>! also possible for comments</li>
 * 	<li>hello=Hello \<br/>Word <br/>end of line use / backslash</li>
 * 	<li>hello=Hello \nWorld line break</li>
 * 	<li>whitespace will be ignored</li>
 * 	<li><b>key/value pairs</b>
 * 		<ul><li>key=value</li><li>key:value</li><li>key value</li></ul>
 *  </li>
 * </ul>
 * <h6>Java-ResoucesBundles</h6>
 * <ul>
 * 	<li>write Java that extend ListResourceBundle</li>
 * </ul>
 * 
 * <h6>Java will look for the following files in the classpath in this order </h6>
 * RB_fr_CA.java			<b>exactly what we asket for</b><br/>
 * RB_fr_CA.properies   	<br/>
 * <br/>
 * RB_fr.java				<b>trying just request language</b><br/>
 * RB_fr.properties<br/>
 * <br/>
 * RB_en_US.java			<b>default locale</b><br/>
 * RB_en_US.properties<br/>
 * <br/>
 * RB_en.java				<b>default locale language</b><br/>
 * RB_en.properties		<br/>
 * <br/>
 * RB.java					<b>default bundle</b><br/>
 * RB.properties<br/>
 * <br> or throw MissingResourceException
 * 
 * <p>Remember that searching for a property file uses a linear list.<br/>
 * 	However, once a matching resource bundle is found, keys can only <br/>
 *  come from resource bundle's hierarchy.
 * </p>
 * */
package dalieOCP.resourceBundles;