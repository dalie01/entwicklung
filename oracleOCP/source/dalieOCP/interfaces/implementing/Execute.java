package dalieOCP.interfaces.implementing;

interface A {
	boolean status = true;
	int number = 10;
	
	void aMethod();
	
	void cMethod();
	
//	String dMethod();
}

interface B {
	void aMethod();//double is fine
	
	void bMethod();
	
	void cMethod(int i);
	
//	void dMethod();
}

abstract class C implements A,B {
	/* Abstract class doesn’t have to implement 
	 * all methods from implemented interfaces */

	public void bMethod() {}
} 

class Execute implements A,B {
	/* A concrete class must implement all the methods 
	 * from the interfaces that it implements. */
	
	boolean status = false;//the same identifier Name is okay
	static int number = 11;
	
	Execute() {
		System.out.println(status);//print false
		System.out.println(A.status);//print true
		
		System.out.println(number);//print 11
		System.out.println(A.number);//print 10
	}
	
//	void aMethod() {}//Won’t compile method implemented using weaker access
	public void aMethod() {System.out.println("Okay");}//Method aMethod has only one implementation
	
	public void bMethod() {}
	
	/*
	 * A class can implement methods with the same name from multiple
	 * interfaces. But these must qualify as correctly overloaded methods.
	 * */
	public void cMethod() {}//Correctly overloaded from Interface A
	public void cMethod(int i) {} //Correctly overloaded from Interface B
	
	
//	public String dMethod() {} // incorrect
//	public void dMethod() {}//incorrectly overloaded methods.
	
	public static void main(String[] args) {
		Execute e = new Execute();
		e.aMethod();
	}
}
