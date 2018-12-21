package test.Temp_XXVIII;

import java.util.ArrayList;
import java.util.List;

class A{
	String a = "A";
}

public class Temp_XXVIII {

	public static void main(String[] args) {
		String s2 = "Hello";
		s2.concat("1");
		System.out.println(s2);
		A[] a = new A[] {new A(),new A()};
		a[0].a = "B";
		
		for (A a2 : a) {
			a2.a = "C";
			a2 = new A();
		}
		
		for (A a2 : a) {
			System.out.println(a2.a);
		}
		
		int[] i = {0,1,2};
		i[2] = 0;
		
		int index = 0;
		for (int j : i) {
			i[index] = 1;
			index++;
		}
		
		for (int j : i) {
			System.out.println(i[j]);
		}
		StringBuilder sb = new StringBuilder("INXS");
		String s = null;
		sb.ensureCapacity(5);
		s = s + sb.append("A")  + sb.insert(0, "CC") + "012".substring(0,0);
		
		System.out.println(s);
		String s1 = "Hello";
		System.out.println( " ".substring(s1.indexOf("H")));
		List<String> l1 = new ArrayList<>();
		l1.add(0, "");
		l1.remove(0);
		l1.add(l1.size(), "UD000");
		l1.add(l1.size(), "UD001");
		l1.add(l1.size(), "UD002");
		System.out.println(l1.toString());
		List<String> l2 = l1.subList(2,3);
		System.out.println(l2.toString());
		while(true) 
			break;
		
		System.out.println(i);
		double Double = 8;
		for(Double = 0;Double < 4; Double++) {
			Double++;
		
		}
		System.out.println(Double);
		
		do
			System.out.println(""); 
		while(false);
		System.out.println("INXS".substring(1,3));
		List<String> ls = new ArrayList<String>();
		ls.add("HELLO"); 
		ls.add("WORLD");
		Object remove = "WORLD";
		System.out.println(ls.indexOf("HELLO"));
		ls.remove(ls.indexOf(remove));
		System.out.println(ls.toString());
		
	}
}
