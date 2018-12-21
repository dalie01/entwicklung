package dalieOCP.initializing._practice;

class A2 {
	
	static {
		System.out.println("3");
	}
	{
		System.out.println("4");
	}
}

final class P02 {
	
	static {
		System.out.println("1");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		A2 a1;
		System.out.println("2");
		a1 = new A2();
		
		A2 a2 = new A2();
	}
}
