package oracel_OcaSe.O91_Test;

public class MyLoop {

	public static void main(String... args) {
		
		String[] sa = { "tom ", "jerry ", "twity " };
		
		outer: for (int x = 0; x < 3; x++) {
			System.out.print("outer " + x);
			
			inner: for (String s : sa) {
				System.out.print(" inner " + x + " " + s);
				if (x == 1)
					break outer;
			}
			
		}
		
	} 
}
