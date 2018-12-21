package dalieOCP.enums;

enum E {
	ASSERT(1.4), // line1
	DO, IF, WHILE;

	double version = 1.0;

	E() { // constructor 1
		this.version = 1.0; // constructor 1
	}

	E(double version) { // constructor 2
		this.version = version; // constructor 2
	}
}

class Execute {

	public static void main(String[] args) {
		E[] keywords = E.values();
		for (E val:E.values()) System.out.println(val);
		for (E val:keywords) System.out.println(val);
		
	}
	
}
