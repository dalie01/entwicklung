/*
 * Created of DV0101 on 29.04.2009 16:42:57
 *
 * Filename	  Sortieren.java
 */
package sortieren;

/**
 * A Demo of Sorting.
 *
 * @version 	1.00 29.04.2009 um 16:42:57
 * @author 		DV0101
 * 
 */
class CZahlen {
	double  x, y ;
}//class CZahlen

public class Sortieren {
    
    public static void main(String[] args) {
        int z, r;
		double temp;
		
		double[] Array = new double[5];
		CZahlen[] Zahl = new CZahlen[5];
	
   /* Initialisierung */
	for(z = 0;z < Array.length;z++){
		Zahl[z] = new CZahlen();
		Zahl[z].x = Zahl[z].x + Math.random() * z;
		Zahl[z].y = Math.random() * 49;
		Array[z] = Zahl[z].x + Zahl[z].y;
	}//for	
	System.out.println("\nNach Initialisierung");
    for(z = 0; z < Array.length; z++) 
      	System.out.println("\n"+"Array[" + Array[z] + "]." + z + " Zahl x = " + Zahl[z].x + "\n" + "Zahl y = " + Zahl[z].y);
	
		for(int j = 0; j < Array.length;j++){		
		for(int i = j + 1; i < Array.length;i++){ 	
			
			if(Array[j] > Array[i]){
				temp = Array[i];
				Array[i] = Array[j];
				Array[j] = temp;
			}//endif
		}//for
		}//for 
	System.out.println("\nNach Sortierung");
    for(z = 0; z < Array.length; z++) 
      	System.out.println("\n"+"Array[" + Array[z] + "]." + z + " Zahl x = " + Zahl[z].x + "\n" + "Zahl y = " + Zahl[z].y);
	
    }//main
    
}//class Sortieren
