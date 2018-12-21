package test;

public class Temp_III {

	public static void main(String[] args) {
		boolean t = true;
		boolean k = false;
		boolean n = false;
		System.out.println("1" + n + k + t);
		System.out.println(n != k != t);
		if (n != k != t) {
			System.out.println("1.1" + n + k + t + new Temp_III().aTest(null));
		}
		System.out.println("2" + n + k + t);
		if (n = k != t) {
			System.out.println("2.1" + n + k + t + new Temp_III().aTest(null));
		}
		int x, y, z; 
		x = 2; y = 1; z = 4;
		if(x + y == z) {
			System.out.println("3.1" + x + "" + y + "" + z);
		}
	}
	
	public String aTest(String s){
		System.out.println("aTest");
		return s;
	}
}
