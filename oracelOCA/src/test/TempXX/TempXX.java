package test.TempXX;

import java.io.IOError;
import java.io.IOException;

class MyException extends RuntimeException {
	
	public MyException(String s) {
		super();
	}
}

class A {
//	A() throws ClassNotFoundException {
		
//	}
	
	void aMethod(int i) {
		try {
			if(i == 2)
				throw new MyException("Hello");
			
//			jaMethod();
			
		//} catch (Exception e) {;
			//System.out.println(e.getMessage());
		} finally {
			System.out.println("finally");
		}
		
		System.out.println(1+2 + "3" + null + 2);
	}
	
	void aMethod() {
		throw new IOError(null);
	}
}


public class TempXX {
//	static short j=5;
	
	public static void main(String[] args) {
		A a = new A();
		a.aMethod(1);
		//a.aMethod();
//		short i = 1;
	      for(short i = 0, j=5;  i<j ; i++) {  j--;  }
	}
}
