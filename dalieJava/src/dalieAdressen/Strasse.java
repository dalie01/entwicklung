package dalieAdressen;

import java.util.Vector;

import flex.Database;

/**
 * @author u.dalies am 06.03.2008 um 21:01:21
 *
 * Strasse.java
 * 
 */

public class Strasse {
    
	private int idStrasse;
    private String name;
    private GeoDaten geo;
    
    
    public Strasse() {
    }//Strasse
    public Strasse(String name){
        this.name = name;
    }//Strasse
    /**
     * Für den Datenbank zugriff!!!
     * */
    public Strasse(Vector col){
    	this.idStrasse = Integer.parseInt(col.elementAt(0).toString());
    	this.name = col.elementAt(1).toString();
    }//Strasse   
    
    /**
     * Holt die GeoDaten aus der Datenbank.
     * */
    public void getGeoDaten(Database con){
    	//Vector rows = con.
    }//addGeoDaten
    
}//class Strasse

