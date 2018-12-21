package dalieOCP.object.overloading;

import java.io.IOException;

class MyException extends Exception{}

class A {
	
	
	boolean aMethode(boolean b) throws MyException {
		return b;
	}
	
	int aMethode() throws Exception {
		return 100;
	}
	
}

class B extends A {
	
	float aMethode(int c) throws IOException {
		return 200f;
	}
}

class Exceute {
	
	static public void main(String[] args) throws Exception {
		A a = new A();
		System.out.println(a.aMethode(false));
		System.out.println(a.aMethode());
	}
}
