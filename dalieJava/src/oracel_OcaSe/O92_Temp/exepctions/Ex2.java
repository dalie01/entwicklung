package oracel_OcaSe.O92_Temp.exepctions;

import java.io.IOException;

class Ex2 { 
	
	void method1() throws IOException, NullPointerException {
		someMethode("Hello");
	}
	
	int someMethode(final String str) {
		if (str == null) throw new NullPointerException();
		else return str.length();
		
	}
}

class Ex21 extends Ex2 {

	void method1() {
		someMethode("Test");
	}
}
