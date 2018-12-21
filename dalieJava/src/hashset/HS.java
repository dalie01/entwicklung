/*
 * Created of DV0101 on 29.04.2009 16:29:44
 *
 * Filename	  HS.java
 */
package hashset;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
/**
 * Demo of HashSet
 *
 * @version 	1.00 29.04.2009 um 16:29:44
 * @author 		DV0101
 * <br><br>
 * private   = "false" nur sichtbar innerhalb der Klasse<br>
 * ohne      = 	       sichtbar innerhalb Package<br>
 * protected = "false" sichtbar innerhalb Package und abgeleiteten Klassen<br>
 * public    = "false" sichtbar ausserhalb<br>
 */
class HS{
    
    public static void main(String[] args){
        HashSet<Integer> hs = new HashSet<Integer>();
        /* Zufallszahlen erzeugen durch die Klasse Random */
        Random generator = new Random();
        int counter = 0;
        
        while (counter < 6){
            /* Erzeugt Zufallszahlen zwischen 1 und 49 */
            int zahl = generator.nextInt(49) + 1;
            /* hs.contains prüft, ob ein Object Teil der Menge ist. */
            if (!   hs.contains(new Integer(zahl))    ){
                hs.add(new Integer(zahl));
                System.out.println(zahl);                
                counter++;
            }//if            
        }//while      
        
        Set<String> argums = new HashSet<String>();
		argums.add("Hello");
		argums.add("World");
		for(String arg : argums){
			System.out.println(arg);
		}//for
        
    }//main
}//class HS