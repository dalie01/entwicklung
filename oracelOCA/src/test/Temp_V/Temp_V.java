package test.Temp_V;

interface I1{ String i1 = "i1"; };
interface I2{ String i2 = "i2"; };

interface Runnable{};
interface Observer{};

class C1 implements I1{}
class C2 implements I2{}
class C3 extends C1 implements I2{}

class A implements Runnable{} 
class B1 extends A implements Observer {}

public class Temp_V {
	public static void main(String[] args) {
		C1 c1 = new C1();
		C2 c2 = new C2();
		C3 c3 = new C3();
		A a = new A();
		B1 b = new B1();
		
		I1 i1 = c3;
		System.out.println(i1.getClass().getSimpleName() + ((I2)i1).i2 );
		I2 i2 = (I2)i1;
		System.out.println(i2.getClass().getSimpleName());
		
		Object o = a; 
		Runnable r = (Runnable) o;
	}
	
}
