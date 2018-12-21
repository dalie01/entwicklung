package temp;

interface I {
	void aMethode();
}

abstract class R implements I {
	public void aMethode(){};
}

class C extends R {
	
}

class A {
	String a = "a";
	void aMethode() {
		System.out.println("aMethode");
	}
	A(){};
	A(String s){
		a = s;
	}
}

class B extends A {
	String b = "b";
	
	void aMethode(){
		System.out.println("bMethode");
	}
	B(){}
	B(String s){
		super(s);
	}
	
}
class Main {
	public static void main(String[] args){
		R r = new C();
		r.aMethode();
		A a = new A();
		B b = new B();
		A x = new B();
		System.out.println(x.a + new String(x.getClass().getName()).substring(new String(x.getClass().getName()).indexOf(".")+1));
		x.aMethode();
		
		String c = "j";
		aMethod(a);
		System.out.println(a.a);
		bMethod(b);
		System.out.println(b.b);
		cMethod(c);
		System.out.println(c);
	}
	
	public static void aMethod(A a){
		a = new A();
		a.a = "x";
		System.out.println(a.a);
	}
	
	public static void bMethod(B b){
		b.b = "c";
		System.out.println(b.b);
	}
	
	public static void cMethod(String c){
		c = "v";
		System.out.println(c);
	}
}
