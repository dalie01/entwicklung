package oracel_OcaSe.O92_Temp.exepctions;

public class Ex3 {

	public static void main(String[] args) {
		aMethod();
		aMethod(4);
	}
	
	static void aMethod() {
		try {
			System.out.println("Hello ");
		} finally {
			System.out.println("World");
		}
	
		System.out.println(" Jena");
	}
	
	static void aMethod(int i){
		if (i == 5) {
			return;
		}
		System.out.println("Hello World");
	}
}
