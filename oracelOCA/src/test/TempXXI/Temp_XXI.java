package test.TempXXI;

class A {

	public static void main(String[] args) {
		
		while(true)
			if(false) 
				break;
		
		
		int i = 0;
//		UD001: while (0 == 0) {
//			System.out.println(++i);
//			continue;
//		}
		
		UD002: do {
			if (i == 2)
				break UD002;
			System.out.println(i);
		} while(++i < 5);
	}
}

abstract class Temp_XXI {

}
