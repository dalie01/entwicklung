package test.Temp_VIII;

interface I {
	int a = 0;
	void aMethod();
}

class A {
	static final int a = 10;
}

class B extends A implements I {
	private static final int a;
	private int i;
	static {
		a = 3;
	}
	{
		i = 0;		
	}
	public void aMethod() {};
}

class Temp_VIII {
	
	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = new B();
		B b1 = new B();
		
		b1 = (B)a2;
	}
	
}
