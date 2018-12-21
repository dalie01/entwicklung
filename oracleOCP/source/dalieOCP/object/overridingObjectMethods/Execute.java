package dalieOCP.object.overridingObjectMethods;

class A { 
	
	@Override public String toString() {
		return "class.A";
	}
	
	@Override public boolean equals(Object c) {
		return this.toString().equals(c.toString());
	}
	
	@Override public int hashCode() {
		return 100;
	}
}

class B {
	

	@Override public String toString() {
		return "class.B";
	}
	
	@Override public int hashCode() {
		return 300;
	}
	
}

class Execute {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.equals(new B()));
	}
}
