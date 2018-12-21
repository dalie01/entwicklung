package oracel_OcaSe.O9_MockExam.ME_Q15;

public class LaserPrinter extends Printer {
	
	int pagesPerMin;
	
	public static void main(String[] args) {
		
		Printer myPrinter = new LaserPrinter();
		System.out.println(((LaserPrinter)myPrinter).pagesPerMin);
	}//main
	
}
