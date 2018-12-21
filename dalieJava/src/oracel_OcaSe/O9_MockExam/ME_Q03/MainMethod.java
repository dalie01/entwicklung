package oracel_OcaSe.O9_MockExam.ME_Q03;

public class MainMethod {
	
	public static void main(String[] args) {
		try {
			String[][] names = {{"Andre","Mike"},null,{"Pedro"}};
			
			System.out.println("here " + names[2][1]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("fail " + e.toString());
		}
	}//main
	
}
