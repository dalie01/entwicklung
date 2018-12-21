package test.Temp_IV;

public class Temp_IV {

	public static void main(String[] args) {
		char i;
        LOOP: for (int x=0;x<5;x++) {
        	System.out.println(x);
            switch(x){
                case '0': System.out.println("A");
                case 1: System.out.println("B"); break LOOP;
                case 2: System.out.println("C"); break;
                case 3: System.out.println("D"); break;
                case 4: System.out.println("E");
                case 'E' : System.out.println("F");
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
