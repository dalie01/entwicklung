package oracel_OcaSe.O92_Temp;

class A {
	
	static String a;
	String j;
	
	static String sMethod() {
		return "A.sMethod";
	}
	
	String aMethod() {
		return "A.aMethod";
	}
	
	Integer iMethod(){
		return new Integer("5");
	}
}

class B extends A {
	
	static String b;
	String x;
	
	static String sMethod() {
		return "B.sMethod";
	}
	
	String aMethod(){
		return "B.aMethod";
	}
	
	Integer iMethod(){
		return 5;
	}
}

public class Temp {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B();
		System.out.println(a2.aMethod());
	}
	
	
}
