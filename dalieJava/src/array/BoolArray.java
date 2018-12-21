/*
 * @author dv0101 am 30.04.2010 um 18:17:24
 * BoolArray.java
 *
 * no Copyright
 */
package array;
/**
 * <b>Class</b>BoolArray:<br>described Array of Typ Boolean.<br>
 * <b>Attribute</b> <li>Personal number<li>Name<br>
 * 
 * @version 	1.00 30.04.2010 um 18:17:24*
 * @author 	    DV0101
 */
public class BoolArray{
	
    
	public static void main(String[] args){	
        boolean[] feld = {true, false, true, false};
        System.out.println("True: " + invertieren(feld));
        System.out.println(feld[0]);
    }//main
    
    /** invertieren: umkehren */
    static int invertieren(boolean[] array){
        int counter = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i]){
                counter++;
                array[i] = false;
            }else
                array[i] = true;
            
        return counter;            
    }// invertieren
    
}//class
