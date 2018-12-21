package oracel_OcaSe.O92_Temp.operator;

public class Operator {
	
	public static void main(String[] args) {
		byte b1 = ~119;
		System.out.println(b1);
		int i1 = 1;
		int i2 = 10;
		i2 -= i1; // --> prints 9
		i2 =- i1; // --> prints -1
		System.out.println(i2);
		String s1 = null;
		s1 += i2;
		System.out.println(s1);
		
		boolean a = false, b = false;
		int c = 0;
		short x = 0;
		if (c > 10 | b) {
			
		}
		
		boolean execute = true;
		
		if (execute | aMethod(" oR ")) // Or true, aMethod() will not call
			System.out.println("execute1");

		if (execute || aMethod(" oRoR "))  // true, aMethod() will call
			System.out.println("execute2");
		
		
		if ( execute && aMethod(" AndAnd ")) // And true, aMehtod() will call 
			System.out.println("execute3");
		
	}

	static boolean aMethod(String i ){
		System.out.println("here:" + i);
		return false;
	}
}
