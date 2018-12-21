package array.comparing;

import java.util.Arrays;

/**
 * This demo shows a easy way to compare arrays.
 */
public class compareArrays {

	/**
	 * Method main.
	 * @param args String[]
	 */
	public static void main(String[] args) {
		String[] arrOne = {"a", "b", "c"};
		String[] arrTwo = {"a", "b", "f"};
		
		System.out.println(Arrays.equals(arrOne, arrTwo));
		
	} /*main*/
	
} /*class compareArrays*/
