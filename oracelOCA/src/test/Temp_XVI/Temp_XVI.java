package test.Temp_XVI;

class A {

	A(String a){
		
	}
}

class B extends A {

	public static B b;

	public static B getInstance() {
		if(b == null) {
			b = new B();
		}
		return b;
	}
	private B() {
		super("");
	}
}

public class Temp_XVI {

	public static void main(String[] args) {
		B b = B.getInstance();
		System.out.println(((A)b).toString());
	}
}
