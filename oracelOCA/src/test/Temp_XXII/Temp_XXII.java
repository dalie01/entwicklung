package test.Temp_XXII;

public class Temp_XXII {
	public static int a = 0;
	public static String String;

	public static void main(String[] args) {
		Integer i = 0;
		Integer x = 0;
		if(i == x) System.out.println("Hello");
		UD001: do {
			if(i == 5) break UD001;

			while (x <= 2) {
				
				if(++x == 0)
					continue;
				System.out.println(x);
			}
		} while (++i < 10);
		aMethod(10);
		System.out.println('a' + Integer.parseInt("1") + a + i + "A");
	}
	
	static void aMethod(Integer a) {
		Temp_XXII.a = a;
	}
}
