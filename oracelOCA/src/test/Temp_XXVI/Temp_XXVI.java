package test.Temp_XXVI;

class A{
	
	static protected String bMethod(int i) throws Exception { System.out.println("B.s.Method"); return new String();};
	void bMethod() { System.out.println("A.b.Method"); };
}

class B extends A {
	
	static String b1 = "B.b1";
	String b2 = "B.b2";
		
	static protected String bMethod(String s) throws Exception { System.out.println("B.s.Method"); return s;};
	void bMethod() { System.out.println("B.b.Method"); };
	
}


public class Temp_XXVI {

	public static void main(String[] args) {
		A a = new B();
		a.bMethod();
	}
}
