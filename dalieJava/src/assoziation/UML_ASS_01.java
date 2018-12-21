/*
 * Created of DV0101 on 15.09.2009 13:24:27
 *
 * Filename	  UML_ASS_01.java
 * 
 * Semantik:
 * Eine Beziehung beschreibt als Relation zwischen Klassen die gemeinsame Semantik und Struktur 
 * einer Menge von Objektverbindungen.
 * Synonym: Assoziation. 
 * 
 * 
 */
package assoziation;

/**
 * Implementierung einer 0..1 Beziehung zwischen zwei Objekten.
 * <p>bitte siehe hierzu uml_assziation.gif; um_ass_impl.gif </p><br>
 * <a href="http://www.jeckle.de/vorlesung/sei/kII.html">nachlesen</a><br>
 * <br>
 * @version 	1.00 14.09.2009 um 14:24:27
 * @author 		DV0101
 * <br><br>
 */
public class UML_ASS_01 {
    /* Implementierung einer 0..1 Beziehung <br> 
     * bitte siehe hierzu uml_ass_01.gif */

    /* die Ursprungsklasse hat die rolle3 in Beziehung beziehung3 zur Zielklasse */
    private Zielklasse rolle3_beziehung3 = null;

    public boolean rolle3_beziehung3_aufbauen(Zielklasse neuesZielDerBeziehung){
       if (rolle3_beziehung3 == null){
          rolle3_beziehung3 = neuesZielDerBeziehung;
          return true;
       }else{
          System.out.println("In einer 1..1 Beziehung kann nicht mehr als eine Beziehung aufgebaut werden");
          return false;
       }//endif
    }//rolle3_beziehung3_aufbauen()

    public boolean rolle3_beziehung3_entfernen(Zielklasse zuEntfernendesZiel){
        //zuEntfernendesZiel  muss das Ziel der Beziehung sein
        if (rolle3_beziehung3 == zuEntfernendesZiel){
          rolle3_beziehung3 = null; //Beziehung entfernen
          return true;
       }else{
          System.out.println("Da keine Beziehung zu Diesen Objekt existiert, kann Sie nicht entfernt werden.");
          return false;
       }//endif
    }//rolle3_beziehung3_entfernen()

}//class UML_ASS_01
