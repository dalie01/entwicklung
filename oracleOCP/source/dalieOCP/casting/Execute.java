package dalieOCP.casting;

class A { 
	
}

class B extends A {
	
}

class Execute {

	public static void main(String[] args) {
		B b = (B) new A(); //cast is required but it will throw ClassCastException
		System.out.println(b);
	}
}
