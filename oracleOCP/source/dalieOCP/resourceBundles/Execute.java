package dalieOCP.resourceBundles;

import java.util.Locale;
import java.util.ResourceBundle;

class Execute {

	public static void main(String[] args) {
		Locale locale = new Locale("fr","CA");
		ResourceBundle rb = ResourceBundle.getBundle("dalieOCP.resourceBundles.Labels", locale);
		System.out.println(rb.getString("hello"));
		/* in case no valid .properties File is found ->
		 *  throws a MissingResourceException at runtime */
		System.out.println(rb.getString("hello.backslash"));
		
		locale = new Locale("en", "CA");
		rb = ResourceBundle.getBundle("dalieOCP.resourceBundles.Labels", locale);
		System.out.println(rb.getObject("hello"));
		
		locale = new Locale("language", "country");
		rb = ResourceBundle.getBundle("RB", locale);
		
		/* Java will look for the following files in the classpath in this order 
		 * RB_fr_CA.java			exactly what we asket for
		 * RB_fr_CA.properies   	
		 * 
		 * RB_fr.java				trying just request language
		 * RB_fr.properties
		 * 
		 * RB_en_US.java			default locale
		 * RB_en_US.properties
		 * 
		 * RB_en.java				default locale language
		 * RB_en.properties		
		 * 
		 * RB.java					default bundle
		 * RB.properties
		 * 
		 * or throw MissingResourceException
		 *  */
		
		/* 
		 * However, once a matching resource bundle is found, keys can only
		 * come from resource bundle's hierarchy.
		 * 
		 * RB_en.properties
		 * 	ride.in=Take a ride in the
		 * 
		 * RB_en_US.properties
		 *  elevator=elevator
		 *  
		 * RB_en_UK.properties
		 *  elevator=lift
		 * 
		 * Locale locale = new Locale("en", "UK");
		 * ResourceBundle rb = ResourceBundle.getBundle("RB", locale);
		 * 
		 * The output will be:
		 * 	->	Take a ride in the lift
		 * 
		 * */
	}
	
}
