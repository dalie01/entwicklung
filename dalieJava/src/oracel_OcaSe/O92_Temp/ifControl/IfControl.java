package oracel_OcaSe.O92_Temp.ifControl;

public class IfControl {

	public void aMethod(int i){
		String s;
		if(i < 10)
			//System.out.println(s);
			System.out.println("Hello");
	}
	
	
	public static void main(String[] args) {
		long k = 1_0l;
		
		long lTest = 90L;
		double dTest = lTest;
		System.out.println(dTest);
		float fTest = lTest;
		System.out.println(fTest);		
		System.out.println(lTest);
		
		getTest(lTest);
	
		getTest(fTest);
		
		new IfControl().aMethod(1);
		
		boolean b1 = false, b2 = false;
		if ( !b1  && b2 == false) {
			System.out.println("here a");
		}
		
		int a = 0, b = 100;
		if ( b++ > 100 && a++ == 10) {
			System.out.println(a+b);
		}
	}

	private static void getTest(double test) {
		System.out.println(test);
		if (test < 10) 
			System.out.println("stryke");
		else
			System.out.println("lose");
	}
	
}
