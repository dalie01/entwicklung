package dalieOCP.object._practice;

interface A {
	String s1 = "A.s1";
	int i1 = 2;
}

final class P01 implements A {
	
//	static String s1 = "P01.s1";// won't compile,a class can’t define static and instance variables with the same name
	String s1 = "P01.s1";
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		P01 p01 = new P01();
//		System.out.println(P01.s1);//won't compile
		System.out.println(A.s1);
		System.out.println(p01.s1);
		System.out.println(p01.i1);
		System.out.println(A.i1);
	}
}
