package oracel_OcaSe.O92_Temp.inherit;

class Phone {
	
	String j = "Jena";
	
	static void sCall(){
		System.out.println("P.sCall");
	}
	
	void mCall(){
		System.out.println("P.mCall");
	}
}

class SmartPhone extends Phone {

	String s = "Stuttgart";
	
	static void sCall(){
		System.out.println("SP.sCall");
	}

	void mCall(){
		System.out.println("SP.mCall");
	}
}



public class Inherit {

	public static void main(String[] args) {
		Phone phone = new Phone();
		Phone sPhone = new SmartPhone();
		phone.sCall();
		sPhone.sCall();
		
		phone.mCall();
		sPhone.mCall();
		
		System.out.println(sPhone.j);
	}
}
