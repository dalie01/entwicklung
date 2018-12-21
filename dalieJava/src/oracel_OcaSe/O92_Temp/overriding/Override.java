package oracel_OcaSe.O92_Temp.overriding;

class A { 
	
	
	public String toString() {	
		return "A";
	} 
}

class B extends A { 
	
	public String toString() {	
		return "B";
	}
}

class Base {
	
	public short getValue() {
		return 1;
	}
	
	public A override(){ return new A(); }
}

class Base2 extends Base {
	
	public short getValue() {
		return 2;
	}
	
	public B override(){ return new B(); }
}

class Override {

	public static void main(String... args) throws Throwable {
		Base b = new Base2();
		System.out.println(b.getValue()); // --> print to 2
		System.out.println(b.override().toString()); // --> print to B
		
		//Base2 b2 = (Base2)new Base();
		//System.out.println(b2.getValue());
	}
}
