package test.Temp_IV;

public class Temp_IV {

	public static void main(String[] args) {
		char i;
		LOOP: for (int x = 0; x < 5; x++) {
			System.out.println(x);
			switch (x) {
				/* 
				 * The case '0' will never be executed 
				 * because the loop variable x is an integer 
				 * and the switch statement is comparing 
				 * x with integer values. 
				 * */
				case '0':
					System.out.println("A");
				case 1:
					System.out.println("B");
					break LOOP;
				/* 
				 * If x is 1, the string "B" 
				 * is printed to the console and the loop is terminated 
				 * using the labeled break statement "break LOOP;", 
				 * which breaks out of both the switch and the loop.
				 * */
				case 2:
					System.out.println("C");
					break;
				case 3:
					System.out.println("D");
					break;
				case 4:
					System.out.println("E");
				case 'E':
					System.out.println("F");
			}
		}

		byte b = 127;
		switch (b) {
		case 127: System.out.println(b);
			
			break;
		case -128: System.out.println(b);
			break;
		default:
			System.out.println(b);
		}
	}
}
