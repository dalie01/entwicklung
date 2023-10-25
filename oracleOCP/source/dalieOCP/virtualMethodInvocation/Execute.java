package dalieOCP.virtualMethodInvocation;

import static java.lang.System.out;

class A {
	
	int i = 1;
	
	String aMethod() throws Exception {
		return "A.aMethod";
	}
}

class B extends A {
	
	int i = 2;
	
	String aMethod() {
		return "B.aMethod";
	}
}

class Execute {

	public static void main(String[] args) {
		A a = new B();
		B b = new B();
		
		try {
			/* the output will be B.aMethod11 (method identified at runtime) */
			out.printf("output is %s",a.aMethod() + a.i + ((A)b).i);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
