package test.Temp_XXVII;

class A{

	final static String a = "A.a";
	static String a1 = "A.a1";

	String a2 = "A.a2";
	final String a3 = "A.a3";
	B aMethod() { return new B();}
	void bMethod() {};
}
class B extends A {
	
	static String a = "B.a";
	static String a1 = "B.a1";
	String a2 = "B.a2";
	String c = "test";
	final String a3 = "B.a3";
	
	B aMethod() { return new B();}
	void bMethod(String s) {};
}

public class Temp_XXVII {
	public static void main(String[] args) {
		A t = new A();
		A a = new B();
		B b = new B();
		B a1 = (B)a;
		System.out.println(a.a1);
		System.out.println(a.a2 + b.a2);
		System.out.println(a1.a);
		aTest();
		int i[][] = {{1,2,3},{4,5,6}};
		System.out.println(i.length + "" + i[0].length);
	}

	public static void aTest() {
		int arr1[] = { 0, 1, 2, 3, 4, 5 };
		int arr2[] = { 100, 10, 20, 30, 40, 50 };

		// copies an array from the specified source array
		System.arraycopy(arr1, 1, arr2, 1, 2);
		System.out.print("array2 = ");
		System.out.print(arr2[0] + " ");
		System.out.print(arr2[1] + " ");
		System.out.print(arr2[2] + " ");
		System.out.print(arr2[3] + " ");
		System.out.print(arr2[4] + " ");
		for(int i: arr1) {
			System.out.println(i);
		}
	}
}
