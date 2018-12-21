package oracel_OcaSe.O92_Temp.go;

class Phone {
	 String phoneNumber = "123456789";
	 
	 void setNumber (String phoneNumber) {
		 //String phoneNumber;
		 phoneNumber = "987654321";
	 }
}

public class TestPhone {
	
	public static void main(String[] args) {
		 Phone p1 = new Phone();
		 p1.setNumber(p1.phoneNumber);
		 System.out.println (p1.phoneNumber);
	}
	
}
