package oracel_OcaSe.O91_Test;

class Alpha {
	
	String getType() { 
		return "alpha";
	}
}

class Beta extends Alpha {
	
	String getType() {
		return "beta";
	}
}

class Gamma extends Beta {
	
	public static void main(String[] args) {
		Alpha g1 = new Alpha();
		Beta g2 = new Gamma();
		System.out.println(g1.getType() + g2.getType());
	}
	
	String getType() {
		return "gamma";
	}
}
