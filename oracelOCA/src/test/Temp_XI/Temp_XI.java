package test.Temp_XI;

public class Temp_XI {

	public static void main(String[] args) {
		boolean b1 = true, b2 = false, b3;
		b3 = b2 & tMethod("1");
		System.out.println(b3);
		b3 = b2 && tMethod("2");
		System.out.println(b3);
		if(tMethod("3.1") | tMethod("3.2"));
			System.out.println(b3);
		if(!fMethod("4.1") || tMethod("4.2"))
			System.out.println(b3);
		
		b3 = (b1 = true) || print();
		System.out.println(b1 + "" + b3);
	}
	
	public static boolean tMethod(String s) {
		System.out.println(s);
		return true;
	}
	public static boolean fMethod(String s) {
		System.out.println(s);
		return false;
	}
	
	public static boolean print() {
		System.out.println("execute");
		return true;
	}
}
