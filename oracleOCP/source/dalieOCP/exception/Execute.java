package dalieOCP.exception;


class E1 extends Exception {

	E1() {
		super();
	}
	
	E1(String s) {
		super(s);
	}
}

class E2 extends E1 {
	
	E2() {
		super();
	}
	
	E2(String s) {
		super(s);
	}
}


class MyException1 extends Exception { }
class MyException2 extends MyException1 { }

class A {
		
	void aMethod(Integer i) throws Exception  /* is required */ {
		try {
			
			throw new Exception("here");
//		} catch (Exception e){ //catch or finally is required one of them
		} finally {
			/* it will always execute  */
		}
		
//		System.out.println("is will executed after Error treatment");
	}
	
	public void gTest() {
		try {
			throw new E2("E2");
		} catch (E1 e) {
			System.out.println("1" + e.getMessage());
		} catch (Exception e) {
			System.out.println("2" + e.getMessage());
		} finally {
			System.out.println("3");
		}
		System.out.println("END");
	}
}

public class Execute {

	public static void main(String[] args) {
		A a = new A();
		try {
			a.aMethod(null); //it will throw a NullPointerException

		/* here is catch Exception required -> aMethod throws Exception  */	
		} catch (Exception e) { //Exception hierarchy
			
			e.printStackTrace();
		}
		
		a.gTest();
	}
	
}
