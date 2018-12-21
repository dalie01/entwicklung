package oracel_OcaSe.O91_Test;

public class MyLoop02 {
	
	public static void main(String[] args) {
		int i = 0, j= 0;
		x1: for( i = 0 ; i < 3 ; i++) {
			System.out.println("x1 i is: " + i);
			
			x2: for( j=3 ; j > 0 ; j--){
				System.out.println("x2 j is: " + j);
				
				if(i < j) continue x1;
				else break x2;
			}
		}
		System.out.println(i + "" + j);
	}

}
