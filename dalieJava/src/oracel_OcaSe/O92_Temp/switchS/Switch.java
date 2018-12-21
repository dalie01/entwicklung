package oracel_OcaSe.O92_Temp.switchS;

public class Switch {
	enum Week { Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Satarday }

	public static int switchTest(int k) {

		int j = 1;
		switch (k) {
			case 1:
				j++;
			case 2:
				j++;
			case 3:
				j++;
			break;
			case 4:
				j++;
		}

		return j + k;

	}
	
	public static void switchEnum()	{
		final float i = 5.5f;
		int j = 5;
		Week week = Week.Sunday;
		
		switch (week) {
			case Sunday: System.out.println("default");
			
			switch(j){
				case 5: System.out.println("int");
			}
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(switchTest(20));
		switchEnum();
	}
}
