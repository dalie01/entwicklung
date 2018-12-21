package test.Temp_XXIV;

class A{
	
	int i1 = 0;
	Integer i2 = 0100_0;
	int[] l3 = {1};
	int l4[] = new int[0];
	
	void aMethode(int l1) {};
	void aMethode(int l1, int... l2) {};
	//void aMethode(int l1, intl2) {};
	
	void aMethode(int i1, Integer i2, int[] l3) {
		i1++;
		i2++;
		l3[0]++;
		l3 = new int[] {4};
	}
	
}

class B extends A {
	float r;
}
public class Temp_XXIV {

	public static void main(String... args) {
		System.out.println(args.length);
		A a = new A();
		System.out.println(a.l4.length);
		a.aMethode(a.i1, a.i2, a.l3);
		System.out.println("" + a.i1 + "" + a.i2 + "" + a.l3[0]);
		a.aMethode(a.i1, a.i1, a.i2);
		a.aMethode(a.i1);
		A a1 = new B();
		System.out.println(((B)a1).r);
	}
	
}
