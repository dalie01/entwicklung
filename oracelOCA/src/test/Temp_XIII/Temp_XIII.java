package test.Temp_XIII;

class A{
	int h = 4;
	int h1 = 0;
	int getH() {
		System.out.println("class.A" + h);
		return h;
	}
}

class B extends A{
	int h = 44;
	int getH() {
		System.out.println("class.B" + h);
		return h;
	}
	String aMethod() { return "aMethod";}
}

class ABCD{
   int x = 10;
   static int y = 20;
}
class MNOP extends ABCD{
   int x = 30;
   static int y = 40;
}

public class Temp_XIII {

	public static void main(String[] args) {
		A a = new B();
		System.out.println("1main:" + a.h + ";"+ a.h1 + ";" + a.getH() + "" + ((B)a).aMethod());
		B b = (B)a;
		System.out.println("2main:" + b.h + ";"+ b.h1 + ";" + b.getH());
		b = new B();
		System.out.println("3main:" + b.h + ";"+ b.h1 + ";" + b.getH());
		
		ABCD a1 = new MNOP();
		System.out.println(a1.x);
		System.out.println(a1.y);
	}
}
