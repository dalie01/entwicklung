package dalieOCP.initializing.enums;

enum Execute {
	A;

	static {
		System.out.println("3. Static init");
	}

	{
		System.out.println("1. Init block");
	}

	Execute() {
		System.out.println("2. Constructor");
	}

	@SuppressWarnings("unused")
	public static void main(String args[]) {
		Execute e = Execute.A;
	}
}
