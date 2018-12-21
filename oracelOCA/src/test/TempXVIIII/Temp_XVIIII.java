package test.TempXVIIII;

public class Temp_XVIIII {

	public static void main(String[] args) {
		int[] array1 , array2[];
		int[] aA[] = new int[0][];
		int[] array3[] = new int[0][];
		//array1 = array2;
		double daaa[][][] = new double[3][1][1];
		double d = 100.0;
//		daaa[0] = new double[0][0];
//		daaa[0][0] = new double[0];
//		daaa[0][0][0] = new Double(0);
		
		System.out.println(daaa.length);
		
		int[] aB = new int[20];
		aB[1] = 1;
		aB[12] = 2;
		for(int i = 0, y = 3, x = 10 ;i < aB.length; i++) {
			System.out.println(aB[i]);
		}
		int[] ac = {1,0};
		Character[] aD = {'1',0};
		
		int[] a0 = {}, a1[] = new int[1][];
		System.out.println(a0.length + "" + a0[1] +  a1.length +" "+ a1[1].length);
		a1[1] = a0;
		a1[1][1] = 1;
	}
	
}
