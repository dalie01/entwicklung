package oracel_OcaSe.O92_Temp.loop;

public class Loop {

	public static void main(String[] args) {
		for (int ctr = 0; ctr <= 30; ++ctr) {
		
			//if (ctr % 7 == 0)
			//	System.out.println("Here " + ctr);
		
			//if (ctr % 14 == 0)
		//		System.out.println(ctr);
		}
		
		
		int a = 0;
		for (; a <= 20 ; ++a) {
			
			if (a % 1 == 0)
				a++;
			else if (a % 2 == 0)
				a = a * 2;
			
			System.out.println(a);
		}
		int x = 0;
		do {  }
			while(x == 10);
		
		for (boolean i = true; i == true ; i = false, x++) {
			System.out.println("Here");
		}
		
	}
	
}
