package oracel_OcaSe.O91_Test;

class Feline {
	public String type = "f";
	
	public Feline(){
		System.out.println("1 feline");
	}
}

public class Cougar extends Feline {

	public Cougar(){
		System.out.println("2 gougar");
	}
	
	public static void main(String[] args) {
		new Cougar().go();
	}
	
	void go(){
		type = "c";
		System.out.println(this.type + super.type);
	}
}
