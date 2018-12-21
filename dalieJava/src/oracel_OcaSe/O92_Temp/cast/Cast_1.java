package oracel_OcaSe.O92_Temp.cast;

interface I1{}
class A1 {}
class B1 extends A1 implements I1 {}
class C1 implements I1{}
class D1 extends B1 {}

public class Cast_1 {

	public static void main(String[] args) {
		A1 a = new A1();
		B1 b = new B1();
		C1 c = new C1();
		
		//b = (B1)a;
		I1 i = c;
		I1 _i = b;
		System.out.println(a + "\"" + b + c +i + _i);
	}//main
	
}
