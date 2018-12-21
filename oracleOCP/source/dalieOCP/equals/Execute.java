package dalieOCP.equals;

class A {
	String a;

	A(String a) {
		this.a = a;
	}

}

class B {
	String a;

	B(String a) {
		this.a = a;
	}
	
	@Override
	public boolean equals(Object o){
		if(o instanceof B){
			B b = (B)o;
			if(b.a.equals(this.a))
				return true;
		}
		
		return false;
	}
}

class Execute {

	public static void main(String[] args) {
		A a1 = new A("A");
		A a2 = new A("A");
		System.out.println(a1.equals(a2));
		
		B b1 = new B("B");
		B b2 = new B("B");
		System.out.println(b1.equals(b2));
	}

}
