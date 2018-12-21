package dalieOCP.assertion._practice;

final class P02 {

	public static void main(String[] args) {
		P02.aMethod();
	}
	
	public static void aMethod() {
		
		int i;
		i =+ 21;
		
		try {
			assert i == 20 : bMethod();
		} catch (Exception e) {
			i = 10;
		}
		System.out.println(i);
	}
	
	public static boolean bMethod() {
		return true;
	}
}
