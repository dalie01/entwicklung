package dalieOCP.object.relationship.association.composition;

class A {
	String a;
}

class Execute {
	/* 
	 *  Composition is a special type of association, and
	 *  objects in this relationship are associated with each other
	 * 
	 * Composition: Since A is part-of Execute, 
	 * relationship between them is Composition.
	 * 
	 * Composition means A is only present as long Execute Object loaded.
	 *  Composition is a whole-part relationship;
	 *  if the enclosing object goes out of scope, the part also goes out of scope.
	 * 
	 * 
	 * One object is OWNER of other object.
	 * */
	private final A a;
	
	Execute(){
		a = new A();
	}

	public A getA() {
		return a;
	}
	
}
