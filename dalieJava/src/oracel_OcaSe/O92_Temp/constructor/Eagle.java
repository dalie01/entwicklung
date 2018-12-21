package oracel_OcaSe.O92_Temp.constructor;

class Bird {
	
	public Bird(String name) {
		this();
	}
	
	private Bird() {
		
	}
}

class Eagle extends Bird {
	
	private Eagle(String name){
		super(name);
	}
	
	void test(){
		System.out.println("test");
	}

	public static void main(String[] args) {
		Eagle e = (Eagle)new Bird("DALIE");
		e.test();
	}
}

