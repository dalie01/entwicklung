package dalieOCP.object.overriding;

class MyException extends Exception { }

@SuppressWarnings("unused")
class Customer {
	
	int i = 1;
	
	int calculate(int i) throws Exception {
		return i * 100;
	}
	
	private int subtract(int i) throws Exception {
		return i - 100;
	}
	
//	int addUp (int i) throws Exception {
	int addUp (int i) {
		return i + 100;
	}
	
	void aMethod() throws NullPointerException {
		
	}
}

class MyCustomer extends Customer {
	
	int i = 2;
	
	public int calculate(int i) throws MyException  {
		return i * 200;
	}
	
	int subtract(int i) {
		return i - 100;
	}
	
//	int addUp (int i) throws IOException { will not compile is only valid as sub exception of overridden class
//		return i + 100;
//	}
	
	public void aMethod() {
	}
}

class Execute {

	public static void main(String[] args) throws Exception {
		Customer my = new MyCustomer();
		System.out.println(my.calculate(1) + my.i);
//		System.out.println(my.subtract(1));change visibility is private
	}	
	
}