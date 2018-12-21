package dalieOCP.instanceOf;

interface I {}

class A {}
class B extends A {}
class C implements I {}


class Exceute {
	
	public static void main(String args[]) {
		C c = null;
		System.out.println(c instanceof I);
		c = new C();
		System.out.println(c instanceof I);
	}
}
