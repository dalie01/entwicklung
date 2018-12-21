/*
 * Created on 27.04.2009
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package array;

/**
 * @author dv0101
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Feld2 {
    /* Mehrdimensionales Array */

    // static int [] feld1d = new int[5]; --für zentralen Aufruf Unterprogramm
    public static void main (String[] args) {
        // eindimensional
        int [] feld = new int [5];
        // zweidimensional
        int [] [] feld2d = new int [5] [4];
        // dreidimensional
        int [] [] [] feld3d = new int [5] [4] [2];     
        // Ausgabe der Anzahl der Elemente in der ersten Dimension
        System.out.println("1. feld2d.length is " + feld2d.length);
        // Ausgabe der Anzahl der Elemente iin der zweiten Dimension
        System.out.println("2. feld2d[0].length is " + feld2d[0].length);
        // Ausgabe der Anzahl der Elemente iin der dritten Dimension
        System.out.println("3. feld3d[0][0].length " + feld3d[0][0].length);
        //Zahl ist beliebig, darf nicht größer als die Elemente sein
        
    }//main
    
}
