package oracel_OcaSe.O92_Temp.go;

class Class2 {

	String test;
	
	void setTest(Class2 c2){
		test = c2.test;
		System.out.println(test);
	}
}

public class Class1 {
	
	public static void main(String[] args) {
		Class2 c2 = new Class2();
		c2.test = "Hello";
		
		System.out.println(c2.test);
		c2.setTest(c2);
		System.out.println(c2.test);
	}
}