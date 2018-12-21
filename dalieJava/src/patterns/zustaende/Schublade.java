/*
 * Created of DV0101 on 03.09.2009 20:56:29
 *
 * Filename	  Schublade.java
 */
package patterns.zustaende;

/**
 * Class description goes here.
 *
 * @version 	1.00 03.09.2009 um 20:56:29
 * @author 		DV0101
 * <br><br>
 * private   = "false" nur sichtbar innerhalb der Klasse<br>
 * ohne      = 	       sichtbar innerhalb Package<br>
 * protected = "false" sichtbar innerhalb Package und abgeleiteten Klassen<br>
 * public    = "false" sichtbar ausserhalb<br>
 */
public class Schublade {
    String[] SchubladenZustaende = new String[] {"offen","zu_unverschlossen","zu_verschlossen"};
    
    private String zustand;
    
    public String getZustand() {
        	return zustand;
        }//getZustand
    
    public void oeffnen() {
        if(zustand == "zu_unverschlossen")
            zustand = "offen";
    	}//oeffnen
    
}//class Schublade
