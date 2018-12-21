/*
 * Created of DV0101 on 06.01.2009 20:37:22
 *
 * Filename	  SortDemo.java
 */
package sortieren;

/**
 * Class description goes here.
 *
 * @version 	1.00 29.04.2009 um 16:29:44
 * @author 		DV0101
 * <br><br>
 */
public class SortDemo {

    public static void main(String[] args) {
        int[] arrayOfInts = { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };

        for (int i = arrayOfInts.length; --i >= 0; ) {
            for (int j = 0; j < i; j++) {
            	System.out.println("i is " + i + " j is " + j);
                if (arrayOfInts[j] > arrayOfInts[j+1]) {
                    int temp = arrayOfInts[j];
                    arrayOfInts[j] = arrayOfInts[j+1];
                    arrayOfInts[j+1] = temp;
                 }//endif
             }//for
         }//for

         for (int i = 0; i < arrayOfInts.length; i++) {
             System.out.print(arrayOfInts[i] + " ");
         }//for
    }//main

}//class SortDemo

