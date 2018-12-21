package temp;

class A {
	static {
		System.out.println("staticA");
	}
	{
		System.out.println("class");
	}
	A(){
		System.out.println("constructor");
	}
	
	static void sMethod() {
		System.out.println("sMethod");
	}
	
	void aMethod() {
		System.out.println("aMethod");
	}
}

class B extends A {
	
	static {
		System.out.println("staticB");
	}
}

public class Temp {

	public static void main(String[] args) {
		B.sMethod(); 
	}
}
