package dalieOCP.initializing;

class A {

	static {
		System.out.println("1");
	}

	{
		System.out.println("3");
	}

	A() {
		System.out.println("4");
	}
}

class Execute extends A {

	boolean status = false;
	static int number;

	static {
		/*
		 * Static initialization block: Runs once (when the class is
		 * initialized).
		 */
		System.out.println("2");
		number = 11;
	}

	{
		/*
		 * Instance initialization block: Runs before the constructor each time
		 * you instantiate an object
		 */
		System.out.println("5");
		status = true;
	}

	Execute() {
		System.out.println("6");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Execute a = new Execute();
	}
}
