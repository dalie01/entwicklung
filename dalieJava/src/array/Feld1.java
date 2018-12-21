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
public class Feld1 {
    	
    public static void main(String[] args) {
        int [] feld = new int[3];
        feld[0] = 0;
        feld[1] = 1;
        feld[2] = 2;
        System.out.println("Das Feld hat " + feld.length + " Elemente.");
        for (int i = 0; i < feld.length ; i++)
            System.out.println(feld[i]);
        
        
    }//main
}
