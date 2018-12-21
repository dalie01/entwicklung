package dalieOCP.object.relationship.has_A;

class A {}

class B {
	A a;//only B has-A relationship
}

class AFactory {
	
	A createA() {
		return new A();
	}
}

class AValid {
	
	boolean aValid(A a) {
		return true;
	}
}

interface I {
	A a = null;//I has-A relationship
}

class Execute {

}
