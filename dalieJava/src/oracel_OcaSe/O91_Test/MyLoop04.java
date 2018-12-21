package oracel_OcaSe.O91_Test;

public class MyLoop04 {
	
	public static void main(String[] args) {
		myLoop04(0);
	}

	public static void myLoop04(int x){
		loop: for( int i = 1 ; i < 5 ;  i++){
			System.out.println("i is: " + i);
			
			for(int j = 1;  j < 5 ;  j++){ 
					if(x == 0) continue loop;
				System.out.println(" j is: " + j);
			}
			
		}
	}
}
