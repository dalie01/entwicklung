package test.Temp_XVII;

import java.util.Arrays;



public class Temp_XVII {

	public static void main(String[] args) {
		int source[] = new int[] {1,2,3};
		int[] destination=null;
		 destination = copyFullArrayUsingSystem(source);
	     System.out.println("Result array = "+Arrays.toString(destination));
		
	}
	
	private static int[] copyFullArrayUsingSystem(int[] source) {
        int[] temp= new int[6];
        System.arraycopy(source, 0, temp, 3, temp.length);
        return temp;
    }
}
