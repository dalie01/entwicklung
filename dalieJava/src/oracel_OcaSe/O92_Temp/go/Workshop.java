package oracel_OcaSe.O92_Temp.go;

class Laptop{
	String memory = "1GB";
}

class SPhone {
	 String phoneNumber = "123456789";
	 
	 void setNumber (String phoneNumber) {
		 //String phoneNumber;
		 phoneNumber = "987654321";
	 }
}


class Workshop {

	public static void main(String[] args) {
		Laptop test = new Laptop();
		repair(test);
		System.out.println(test.memory);
		
		 SPhone p1 = new SPhone();
		 p1.setNumber(p1.phoneNumber);
		 System.out.println (p1.phoneNumber);
	}
	
	public static void repair(Laptop laptop){
		laptop.memory = "2GB";
	}
}
