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
 * Implementierung einer 1..1 Beziehung zwischen zwei Objekten.
 * <p>bitte siehe hierzu uml_assziation.gif; um_ass_impl.gif </p><br>
 * <a href="http://www.jeckle.de/vorlesung/sei/kII.html">nachlesen</a><br>
 * <br>
 * @version 	1.00 14.09.2009 um 14:24:27
 * @author 		DV0101
 * <br><br>
 */
public class UML_ASS_11 {
    /* Implementierung einer 1..1 Beziehung <br> 
     * bitte siehe hierzu uml_ass_11.gif */
    
    /* die Ursprungsklasse spielt die rolle4 
     * in der Beziehung beziehung4 zur Zielklasse */
    private Zielklasse rolle4_beziehung4 = null;

    public UML_ASS_11(Zielklasse ZielderBeziehung){
       if (ZielderBeziehung != null){
          rolle4_beziehung4 = ZielderBeziehung;
       }else{
          System.out.println("Eine Beziehung muss bei der Anlage eines Objekts angegeben werden");
       }//endif
    }//UML_ASS_11

    public void rolle4_beziehung4_tauschen(Zielklasse zuTauschendesZiel){
       rolle4_beziehung4 = zuTauschendesZiel;
    } //end rolle4_beziehung4_tauschen()

    
    
}//class UML_ASS_11
