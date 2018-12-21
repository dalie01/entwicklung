package oracel_OcaSe.O92_Temp.reference;

class A {
	
}

class B {
	
}

class Reference {
	static boolean z;
	static boolean k;
	static String t = " Jena Stuttgart  ";
	public static void main(String[] args) {
		System.out.println(t.trim());
		int A = 0;
		int i = 0;
		int x = 1;
		System.out.println(x == i);
		i = x;
		System.out.println(x == i);
		
		String e = null;
		
		String s1 = "Jena";
		String s2 = "Jena";
		System.out.println(s1 == s2);
		System.out.println(s2.length());
		s2 += s1;
		s2 += x;
		System.out.println("here" + s2);
		System.out.println(s2.length());
		s2 = new String();
		System.out.println(s1 == s2);
		
		A a = new A();
		A b = new A();
		System.out.println(a == b);
		
		System.out.println(k == z);
		
		short o = 0;
		short w = 0;
		
		System.out.println(o == w);
		
		String s = "Jena";
		System.out.println(s.equals(s1));
		
		System.out.println('*' + 0);
	}
	
}
