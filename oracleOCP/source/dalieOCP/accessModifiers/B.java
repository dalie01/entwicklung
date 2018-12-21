package dalieOCP.accessModifiers;

import dalieOCP.accessModifiers.a.A;

public class B extends A {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		A a1 = new B();
//		System.out.println(a.protectedS1);//won't compile
//		System.out.println(a1.protectedS1);
		System.out.println(a.publicS1);
		System.out.println(a1.publicS1);
		System.out.println(b.protectedS1);
	}
}
