package test.Temp_IX;

class A {
	String a;
	int i;
	
	/**
	 * @param a
	 * @param s
	 * @param i
	 */
	void aMethod(String a, StringBuilder s, Integer i , int[] aI) {
		a = "Hello World";
		i += ++i;
		s.insert(1, "INXS");
		StringBuilder sb = new StringBuilder();
		s = sb;
		aI[1] = ++aI[0];
		System.out.println(i);
	}
}

public class Temp_IX {

	public static void main(String[] args) {
		A a = new A();
		StringBuilder sb = new StringBuilder("Hello");
		a.a = "Hello";
		System.out.println(a.a == sb.toString());
		System.out.println(a.a.equals(sb.toString()));
		int aI[] = {1,0};
		int i = 5;
		a.aMethod(a.a, sb, i, aI);
		String t = null;
		t += 'c';
		System.out.println(a.a + ";" + sb.toString() + ";" + i  + ";" + t + ";" + aI[1]);
	}
	
}
