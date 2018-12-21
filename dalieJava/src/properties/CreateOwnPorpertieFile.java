/*
 * Created of DV0101 on 29.04.2009 17:43:25
 *
 * Filename	  CreateOwnPorpertieFile.java
 */
package properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * create a propertieFile.
 *
 * @version 	1.00 29.04.2009 um 17:43:25
 * @author 		DV0101
 */
public class CreateOwnPorpertieFile {
    
    public static void main(String[] args) {
       
        String pfaddatei =  System.getProperty("user.dir") + "/properties/dalieJava.prop";
        Properties dalie = new Properties();
        dalie.setProperty("Java", "yes");
        dalie.setProperty("Sitzplätze", "15");
        dalie.setProperty("JENA", "90");
        
        try {
            /* the secound argument of Methode store() -> creates a comment */
            dalie.store(new FileOutputStream(pfaddatei), "Die Daten meines Autos");
            dalie.load(new FileInputStream(pfaddatei));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }//catch
    	
        System.out.println(dalie.getProperty("Sitzplätze"));        
    }//main
    
}//class CreateOwnPropertieFile
