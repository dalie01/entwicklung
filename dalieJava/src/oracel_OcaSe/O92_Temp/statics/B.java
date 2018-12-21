package oracel_OcaSe.O92_Temp.statics;

import java.io.IOException;

class MyException extends Exception { };
class MyException1 extends MyException { };

interface SInterface {
	//Any number of final, static fields
	public static double _MswSt = 18.0;

	/*
     * - An interface is implicitly abstract. You do not need to use the abstract keyword when declaring an interface.
     * - Each method in an interface is also implicitly abstract, so the abstract keyword is not needed.
     * - Methods in an interface are implicitly public.
	 **/
	int getNum() throws Exception;
}

abstract class Z {}

abstract class Z1 extends Z {
	
	abstract int getNum() throws Exception;
}

class A extends Z1 {
	
	public Object getObject() throws MyException {
		return new Object();
	}
	
	public int getNum() throws MyException {
		return 1;
	}
}

class B extends A implements SInterface {

	public static int num = 200;
	public int c;
	
	B() {
		num += num;
	}
	
	static int getNum(int i) {
		System.out.println(num);
		short test = 0;
		return test;
	}
		
	public int getNum() throws MyException1 {
		return num;
	}
	
	public boolean getNum(boolean i) {
		return true;
	}
	
	public A getObject() {
		return new A();
	}
	
	
	public static void main(String[] args) throws IOException, Exception {
		SInterface s = new B();
		B.getNum(1);
		float test = 1.1f;
		double value = num + SInterface._MswSt;
		System.out.println(s.getNum() + SInterface._MswSt + "\n" + value + test);
		System.out.println(test);
		System.out.println(value + test);
		A a = new A();
		B b = new B();
		System.out.println(b instanceof SInterface);
		System.out.println(a instanceof SInterface);
	}
}
