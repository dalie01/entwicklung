package dalieOCP.initializing._practice;

class A {
	static {
		System.out.print("1");
	}

	{
		System.out.print("3");
	}
}

final class P01 extends A {

	static {
		System.out.print("2");
	}

	{
		System.out.print("4");
	}

	public static void main(String args[]) {
		new P01();
	}
}
