package dalieOCP.pattern.singleton;

class A {
	/* These steps ensure that only one object of class Singleton ever exists */
	private static A anInstance = null;
	
	private A() {
		
	}
	
	public static A getInstance() {
		if(anInstance == null)
				anInstance = new A();
		return anInstance;
			
	}
}

class B {
	/* eager initialization creates an object of 
	 * class Singleton, even if it’s never used */
	
	//Eager initialization;
	private static B anInstance = new B(); // anInstance is initialized as soon as class loaded
	
	private B() {
		
	}
	
	public static B getInstance() {
		return anInstance;
	}
}

class C {
	
	private static C anInstance;
	
	private C() {
		System.out.println("C");
	}
	
	/* can’t execute this method concurrently. */
//	public static synchronized C getInstance() { performance hit if a lot of classes call method getInstance()
	public static C getInstance() {
		if(anInstance == null)
			synchronized(C.class) { // Synchronize code block that creates new object
				anInstance = new C();
			}
		return anInstance;
			
	}
}

class Execute {

	public static void main(String[] args) {
		C c1 = C.getInstance();
		C c2 = C.getInstance();
		System.out.println(c1 == c2);
	}
}
