package array;
/**
 * @ # StringArray.java
 * A class repersenting how initialization String Arrays 
 * 
 */
public class StringArray {

    public static void main(String args[]) {

        //initialization String Arrays
        String arr[] = {"Hello", "World", "DV0101"};

        System.out.println("String Array arr ...");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }//for
        
        String arr1[] = new String[]{"Hello", "World", "DV0101"};
        System.out.println("\nString Array arr1...");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }//for

        // This allocates the array but they are all null
        String arr2[] = new String[3];

        // here you start to stuff in the values.
        arr2[0] = "Hello";
        arr2[1] = "World";
        arr2[2] = "DV0101";

        System.out.println("\nString Array arr2...");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }//for
    }//main
}//class StringArray