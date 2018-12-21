package test.Temp_XXIII;

interface I1{}
interface I2 extends I1{}
interface I3 extends I1,I2{}

class A{
	private String a = "A.a";
	double aMethod() {System.out.println("A.aMethod"); return Long.MAX_VALUE;}
	public String getA() {
		return a;
	};
	
}
class B{}
class C extends A{
	
	protected double aMethod() {System.out.println("B.aMethod"); return Short.MAX_VALUE;}
	void bMethod() {System.out.println("B.bMethod");}
}
class Temp_XXIII {
	static private Boolean t4 = false;
	private boolean t5;
	
	public static void main(String[] args) {
		byte b1 = 1;
		Byte b2 = 1;
		byte b3 = new Byte((byte)1);
		
		short s1 = 1;
		Short s2 = 1;
		short s3 = new Short((short)1);
		
		char c1 = '1';
		Character c2 = '1'; 
		char c3 = new Character('c');
		char c4 = new Character((char)1);
		
		int i1 = 1;
		Integer i2 = 1;
		int i3 = new Integer(1);
		
		long l1 = 1;
		Long l2 = 0 * 1l;
		long l3 = new Long(1);
		
		float f1 = 1;
		Float f2 = 1F;
		float f3 = new Float(1);
		
		double d1 = 1;
		Double d2 = 1d; 
		double d3 = new Double(1);
		
		boolean t1 = false;
		Boolean t2 = false;
		boolean t3 = new Boolean(false);
		if(t1 = t2 != t4) {
		} else 
			System.out.println(new Temp_XXIII().t5);
		
		if(i2 == f1)
			System.out.println("true");
			
		A a = new A();
		B b = new B();
		C c = new C();
		
		A ac = c;
		ac.aMethod();
		System.out.println(ac.getA());
		if (b instanceof B) {
			
		}
		if(false) System.out.println("it will work's fine");
		if(true) System.out.println("also");

	}
	
}
