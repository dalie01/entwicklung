package dalieOCP.constructor;

class A {
	
	A() throws Exception {
		
	}
}

class B extends A {

	/*
	 * So compiler complains that it has to be caught or declare it in a throws clause
	 * */
	B() throws Exception {//the Exception must be handled
		super();
	}
	
	
}

class C {
	
	static String prefix = "C";
	String iD;
	
	C(String iD) {
		this.iD = prefix + iD;
	}
}

class Execute {

}
