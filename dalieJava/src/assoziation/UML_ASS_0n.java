/*
 * Created of DV0101 on 14.09.2009 14:24:27
 *
 * Filename	  UML_ASS_0n.java
 * 
 * Semantik:
 * Eine Beziehung beschreibt als Relation zwischen Klassen die gemeinsame Semantik und Struktur 
 * einer Menge von Objektverbindungen.
 * Synonym: Assoziation. 
 * 
 * 
 */
package assoziation;

import java.util.Vector;

/**
 * Implementierung einer 0..* Beziehung zwischen zwei Objekten.
 * <p>bitte siehe hierzu uml_assziation.gif; um_ass_impl.gif </p><br>
 * <a href="http://www.jeckle.de/vorlesung/sei/kII.html">nachlesen</a><br>
 * <br>
 * @version 	1.00 14.09.2009 um 14:24:27
 * @author 		DV0101
 * <br><br>
 */
public class UML_ASS_0n {
    /* Implementierung einer 0..* Beziehung <br> 
     * bitte siehe hierzu uml_ass_0n.gif */
    
    private Vector rolle1_beziehung1;
    
    
    public boolean rolle1_beziehung1_aufbauen(Zielklasse zielklasse){
        if(rolle1_beziehung1 == null) {
            rolle1_beziehung1 = new Vector();
        }//endif
        if(rolle1_beziehung1.add(zielklasse) == false) {
            	return false;
        	}else {
        	    return true;
        }//endif
    }//rolle1_beziehung1_aufbauen
    
    public boolean rolle1_beziehung1_entfernen(Zielklasse zielklasse) {
        if(rolle1_beziehung1.remove(zielklasse) == false) {
        	return false;
    	}else {
    	    return true;
    	}//endif
    }//rolle2_beziehung1_entfernen
    
}//class UML_ASS_0n
