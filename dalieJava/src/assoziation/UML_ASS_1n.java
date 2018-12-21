/*
 * Created of DV0101 on 15.09.2009 13:24:27
 *
 * Filename	  UML_ASS_1n.java
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
 * Implementierung einer 1..* Beziehung zwischen zwei Objekten.
 * <p>bitte siehe hierzu uml_assziation.gif; um_ass_impl.gif </p><br>
 * <a href="http://www.jeckle.de/vorlesung/sei/kII.html">nachlesen</a><br>
 * <br>
 * @version 	1.00 14.09.2009 um 14:24:27
 * @author 		DV0101
 * <br><br>
 */
public class UML_ASS_1n {
    /* Implementierung einer 1..N* Beziehung <br> 
     * bitte siehe hierzu uml_ass_1n.gif */
    
    private Vector rolle2_beziehung2;
    
    public UML_ASS_1n(Zielklasse zielklasse){
        rolle2_beziehung2 = new Vector();
        rolle2_beziehung2_aufbauen(zielklasse);
    }//UML_ASS_1n
    
    public boolean rolle2_beziehung2_aufbauen(Zielklasse zielklasse){
       if (rolle2_beziehung2.add(zielklasse) == false){
          System.out.println("Die Beziehung kann zu diesem Objekt nicht hergestllt werden.");
          return false;
       }else{
          return true;
       }//endif
    }//rolle2_beziehung2_aufbauen()

    public boolean rolle2_beziehung2_remove(Zielklasse zuEntfernendesZiel){
       if (rolle2_beziehung2.remove(zuEntfernendesZiel) == false){
          System.out.println("Die Beziehung zu diesem Objekt kann nicht entfernt werden.");
          return false;
       }else{
          return true;
       }//endif
    }//rolle2_beziehung2_entfernen()
    
}//class UML_ASS_1n
