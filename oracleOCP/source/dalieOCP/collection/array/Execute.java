package dalieOCP.collection.array;

import java.util.Arrays;
import java.util.Collections;

class Execute {

	public static void main(String[] args) {
		String[] sA = new String[2];
		sA[0] = "1";
		sA[1] = "2";
//		sA[100] = "0";//ArrayIndexOutOfBoundsException
		
		System.out.println(sA.length);
		for (String temp : sA) {
			System.out.println(temp);
		}
		
		System.out.println(sA[0]);
//		System.out.println(sA[10]);//also ArrayIndexOutOfBoundsException
		
		Arrays.sort(sA, Collections.reverseOrder());
		for (String temp : sA) {
			System.out.println(temp);
		}
	}
}
