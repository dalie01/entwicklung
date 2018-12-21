package test.Temp_XVIII;

interface C {
	String a1 = "C.a1";
	void iMethode();
}

abstract class A implements C {
	static String a1 = null;
	String a2 = null;
	static {
		System.out.println("A.static");
		a1 = "A.a1";
	}
	{
		System.out.println("A.default");
		a2 = "A.a2";
	}
	A(){
		System.out.print("A.Constructor");
	}
	
	public static void sMethode() {
		System.out.println("A.sMethode");
	}

	abstract void aMethode();
	
	void aMethode(String s) {
		System.out.println("A.aMethode" + s);
	}

	public static void main(String[] args) {
		A a = new B();
		B b = new B();
		C c = a;
		System.out.println("\n" + (a.a1 += a.a2) + (C.a1 + ((C)a).a1));
		a.sMethode();
		a.aMethode();
		a.aMethode(((C)a).a1);
		a.iMethode();
		System.out.println(((B)a).a3);
		System.out.println(((B)c).a2);
	}
}

class B extends A  {

	static final String a1;
	String a2 = null;
	String a3;
	static {
		System.out.println("B.static");
		a1 = "B.a1";
		sMethode();
	}
	
	{
		System.out.println("B.default");
		a2 = "B.a2";
		super.sMethode();
	}
	
	public static void sMethode() {
		System.out.println("B.sMethode");
		
	}
	
	void aMethode() {
		System.out.println("B.aMethode");
	}
	
	void aMethode(String s) {
		System.out.println("B.aMethode" + s);
	}
	
	public void iMethode() {
		System.out.println("B.iMethode");
	}
}



	
