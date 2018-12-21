package oracel_OcaSe.O92_Temp.array;

public class Test {

	public static void main(String[] args) {
		String argum[][] = {{"Jena","Stuttgart"},{"Hello","World"}};
		System.out.println(argum[0][1]);
		System.out.println(argum[1][1]);
		int[] a = {1,2}; 
		aMethod(a);
		String j = null;
		aMethod(j);
		
		int r = 1200;
		int b = 200;
		int z = r  - b;
		System.out.println(r + "-" + b + "=" + z);
		
	}
	
	public static void aMethod(int... a){
		
	}
	
	public static void aMethod(String... a){
		
	}
}
