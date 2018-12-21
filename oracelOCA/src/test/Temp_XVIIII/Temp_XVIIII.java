package test.Temp_XVIIII;

import java.util.ArrayList;
import java.util.List;

abstract class A{
	static String s1 = sPrint("1");
	String s2 = A.sPrint("3");
	static {
		s1 = sPrint("2");
	}
	{
		s2 = sPrint("4");
	}
	A(){		
		s2 = sPrint("5");
	}
	static String sPrint(String s) {System.out.println(s); return s;}
	abstract String aMethod() throws Exception;
}

abstract class B extends A {
	abstract String aMethod(String s);
	String s3 = A.sPrint("3");
}

class C extends B {
	String aMethod() {return new String("A");}
	String aMethod(String s) {return new String("A");}
}
public class Temp_XVIIII {

	public static void main(String[] args) {
		A a = new C();
		System.out.println(((C)a).aMethod(""));
		System.out.println(a.s2);
		//boolean b = true;
		int[] iA = new int[] {1,2,3};
		List i = new ArrayList();
		i.add(1.0);
		i.add("S");
		aTest();
	}
	
	public static void aTest() {
		for(;;);
	}
}
