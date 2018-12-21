package test;

import java.util.ArrayList;
import java.util.List;

interface Test {
	String test = null;
	void aTest();
}

public class Temp implements Test {

	static double f = 0.0F;
	String t;
	char v;
	static {
		f = 1.0;
	}
	
	public void aTest(){
		
	}
	
	public void test(String t){
		t = t;
		System.out.println(t);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String q = "kpyhs";
		String[] o = {"I","N","X","S"}; 
		List<String> l = new ArrayList<String>();
		l.add("I");
		l.add("N");
		l.add("X");
		l.add("S");
		System.out.println(q.indexOf('S'));
		System.out.println(q.length() + q.substring(3,4) + q.charAt(3) + o.length + l.get(0) +  l.size());
		StringBuilder sb = new StringBuilder("SXNI");
		
		System.out.println(sb.reverse());
		System.out.println(sb.append("-INXS"));
		System.out.println(sb.insert(0,"EU-DE"));
		System.out.println(sb.delete(3,4));
		//System.out.println(sb.deleteCharAt(11));
//		System.out.println("UD001 " + sb.substring(3,12));
		
		int u = 0_1234_1234_777;
		int k = 1234_1234_12;
		int m = 0x1234_A23F;
		int p = 0b1111_1111_1111_1111_1111_1111_1111;
		int i = 1;
		int x = 2;
		long y = 3;
		short z = 32767;
		char s = 65535;
		byte b1 = 127;
		float f = 1.0f;
		double d1 = 10.11010;
		d1 = i;
		i = z;
		System.out.println(d1);
		System.out.println(x + y * ++z - i - s);
		System.out.println(new Temp().v);
		int a = 10;
		int b = 1;
		int c = ++a + b--;
		float r = 1.00f;
		System.out.println(++a + b--);
		System.out.println(a);
		System.out.println(b);
		System.out.println(Temp.f + new Temp().f);
		Temp t = new Temp();
		t.test("a");
		System.out.println(t.t);
		Object d = new Object();
		Object g, j = new Object();
		d = j = null;
		
		int k1 = 5;
		{
			int k2 = 10;
			System.out.println(++k1);
		}
		System.out.println(k1);
		Integer k5 = 5;
		Integer s5 = 5;
		Short s0 = 0;
		boolean b5 = f == b1;
		boolean l1 = false;
		System.out.println(k5.equals(s5) + "" + (k5 == s5));
		String k2 = "19" + 'c';
		System.out.println(k2);
		if (l1 = b5 == new Boolean(true)) { 
			
		} else 
			System.out.println("finish");
		int r2 = 1 + 3 * 2 * 4;
		System.out.println(r2);
		r2 = (int)s5 + (int)f;
		b1 += s5;
		z = (short)(b1 * b1);
		b1 = (byte)r;
	}
}
