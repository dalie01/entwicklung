package test.temp_VI;
interface I{}
class A implements I {}
class B extends A {}
class C extends B {}
class D {}

public class Temp_VI {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		I i;
		System.out.println(a instanceof I);
		System.out.println(b instanceof I);
		System.out.println(c instanceof A);
		System.out.println(d instanceof D);
		i = (I)b;

	}
}
