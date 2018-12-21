package oracel_OcaSe.O9_MockExam.ME_Q04;

public class MainMethod {
	public static void main(String[] args) {
		int a = 10; String name = null;
		
		try {
			a = name.length();
			a++;
		} catch (Exception e) {
			++a;
		}
		System.out.println(a);
	}//main
}
