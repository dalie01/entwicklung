package test.Temp_XXV;

public class Temp_XXV {


	public static void main(String[] args) {
		int[] i1 = {0,1,2,3,4};
		String[] s1 = new String[] {null,"1","2","c"};
		System.out.println(s1.length);
		String s = i1[1] + i1[2] + s1[1] + s1[2];
		System.out.println(s);
		
		int i2[][] = {{0,1,2,3,4},null,{0,1,2,3}};
		System.out.println(i2[1] + s1[0]);
		for(int i = 0;i < i2.length; i++) {
			int x = i2[i][0];
		}
	}
	
}
