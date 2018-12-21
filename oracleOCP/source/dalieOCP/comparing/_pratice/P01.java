package dalieOCP.comparing._pratice;

class A{}

final class P01 {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = a1;
		A a3 = new A();
		int x1 = 1;
		int x2 = x1;
		int y = 1;
		System.out.println(a1.equals(a2) + "" + a2.equals(a1) + "" + (a1.hashCode() == a2.hashCode()));
		System.out.println(a1 == a2);
		System.out.println(x1 == x2);
		System.out.println(x1 == y);
		
		System.out.println(a1.equals(a3) + "" + a3.equals(a1) + "" + (a1.hashCode() == a3.hashCode()));
		System.out.println(a1 == a3);
	}
}
