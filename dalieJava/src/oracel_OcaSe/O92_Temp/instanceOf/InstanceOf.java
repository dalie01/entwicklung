package oracel_OcaSe.O92_Temp.instanceOf;

interface T1{}
interface T2{}

class A implements T1,T2 { }

class B extends A implements T2 { }

class C implements T1 { }

class InstanceOf {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		System.out.println(a instanceof T1);
		System.out.println(a instanceof T2);
		System.out.println(b instanceof T2);
		System.out.println(b instanceof A);
		
		System.out.println(b instanceof T1);
		System.out.println(c instanceof T1);
		System.out.println(c instanceof T2);
		
		
		String num = "Java";
		num = null;
		if (num instanceof Object) {
			System.out.println("here");
		}
		
	}
}
