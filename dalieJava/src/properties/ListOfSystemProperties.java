/*
 * Created of DV0101 on 15.04.2009 16:29:44
 *
 * Filename	  ListOfSystemProperties.java
 */
package properties;

import java.util.Enumeration;
import java.util.Properties;

/**
 * Show all Systemproperties.
 *
 * @version 	1.00 15.04.2009 um 16:29:44
 * @author 		DV0101
 * <br><br>
 * 
 */
public class ListOfSystemProperties {
    
    public static void main(String[] args){
        Properties sysprops   = System.getProperties();
        Enumeration propnames = sysprops.propertyNames();
        while (propnames.hasMoreElements()) {
            String propname = (String)propnames.nextElement();
            System.out.println(propname + "=" + System.getProperty(propname));
        }//while
    }//main
}//class ListOfSystemProperties
