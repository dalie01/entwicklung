package dalieOCP.object.overloading._practice;

final class P01 {

	public static void aMethod(int... i) {
		System.out.println("int...");
	}
	
	public static void aMethod(Integer i) {
		System.out.println("Integer");
	}
	
	public static void aMethod(Long i) {
		System.out.println("int");
	}
	
	
	public static void main(String[] args) {
		aMethod((short)5.0);
	}
}
