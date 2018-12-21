package oracel;
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
	String getType() {
		return "gamma";
	}

	public static void main(String[] args) {
		//Gamma g1 = (Gamma) new Alpha();
		//Gamma g2 = (Gamma) new Beta();
		Alpha a1 = new Gamma();
//		System.out.println(g1.getType() + " " + g2.getType());
		System.out.println(a1.getType());
	}
}