package oracel_OcaSe.O91_Test;

public class MyLoop22 {

	public static void main(String[] args) {
		int counter = 0;
		
		outer: for(int i = 0; i < 3 ; i++) {
		
			middel: for(int j = 0; j < 3 ; j++) {
			
				inner: for(int k = 0; k < 3 ; k++) {
					
					System.out.println("k " + k + " j " + j + " = " + (k - j));
					if (k - j > 0) {
						System.out.println("break");
						break middel;
					}
					
					counter++;
				}
			}
		}
		System.out.println(counter);
	}
	
}
