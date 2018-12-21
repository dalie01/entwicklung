package dalieOCP.interfaces.extend;

interface A {
	void aMethod();
	void bMethod();
	void cMethod();
}

interface B extends A {
	void aMethod();
	void bMethod(String s);
}

class Execute implements B {

	@Override public void aMethod() {
		System.out.println("aMethod");
	}

	@Override public void bMethod() {
		System.out.println("bMethod");
	}

	@Override public void bMethod(String s) {
		System.out.println("bMethod");
	}
	
	@Override public void cMethod() {
		System.out.println("cMethod");
	}

	public static void main(String[] args) {
		Execute e = new Execute();
		e.aMethod();
		e.bMethod();
		e.bMethod("Inxs");
		e.cMethod();
	}

}
