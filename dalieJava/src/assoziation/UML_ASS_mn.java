/*
 * Created of DV0101 on 15.09.2009 13:24:27
 *
 * Filename	  UML_ASS_mn.java
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
 * Implementierung einer 2..5 Beziehung zwischen zwei Objekten.
 * <p>bitte siehe hierzu uml_assziation.gif; um_ass_impl.gif </p><br>
 * <a href="http://www.jeckle.de/vorlesung/sei/kII.html">nachlesen</a><br>
 * <br>
 * @version 	1.00 14.09.2009 um 14:24:27
 * @author 		DV0101
 * <br><br>
 */
public class UML_ASS_mn {
    /* Implementierung einer 2..5 Beziehung <br> 
     * bitte siehe hierzu uml_ass_nm.gif */

    private Vector rolle5_beziehung5;

    UML_ASS_mn(Vector ZielederBeziehung){
       if (ZielederBeziehung.size() >=2 
               && ZielederBeziehung.size() <=5) {
          rolle5_beziehung5 = new Vector(ZielederBeziehung);
       }else{
          System.out.println("UrsprungsklasseBez5 kann über die Beziehung5 nicht mit weniger als zwei oder mehr als fünf Objekten der Klasse Zielklasse verbunden sein");
       }//endif
    }//UML_ASS_mn

    public boolean rolle5_beziehung5_aufbauen(Zielklasse neuesZielDerBeziehung){
       if (rolle5_beziehung5.size() == 5){
          //die Maximalmultiplizität ist erreicht
          System.out.println("Es können nicht mehr als 5 Beziehungen aufgebaut werden.");
          return false;
       }else{
          return (rolle5_beziehung5.add(neuesZielDerBeziehung));
       }//endif
    }//rolle5_beziehung5_aufbauen()

    public boolean beziehung4_entfernen(Zielklasse zuEntfernendesZiel){
       if (rolle5_beziehung5.size() == 2){
          //das Minimalmultiplizität ist erreicht
          System.out.println("Die Beziehung zu diesem Objekt kann nicht entfernt werden.");
          return false;
       }else{
          if (rolle5_beziehung5.remove(zuEntfernendesZiel) != true){
             System.out.println("Da keine Beziehung zu Diesen Objekt existiert, kann Sie nicht entfernt werden.");
             return false;
          }else{
             return true;
          }//endif
       }//endif
    }//beziehung5_aufbauen()
    
}//clas UML_ASS_nm
