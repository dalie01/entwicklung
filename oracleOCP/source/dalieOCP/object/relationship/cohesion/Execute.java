package dalieOCP.object.relationship.cohesion;

/*
 * An element’s cohesion is a measure of whether its responsibilities form a meaningful unit. 
 * For example, a class that parses both dates and URLs is not coherent, 
 * because they’re unrelated concepts. 
 * Think of a machine that washes both clothes and dishes—it’s unlikely to do both well.
 * 2 At the other extreme, a class that parses only the punctuation in a URL 
 * is unlikely to be coherent, because it doesn’t represent a whole concept. 
 * To get anything done, the programmer will have to find other parsers for 
 * protocol, host, resource, and so on. 
 * Features with “high” coherence are easier to maintain.
 * */

class A {
	/*
	 * Low cohesion, a class performing
	 * diverse set of unrelated tasks
	 * */
	public void print() {}
	public void calculates() {}
	public void edit() {}
	
}

class B {
	/*
	 * High cohesion, a class performing
	 * multiple but related tasks
	 * */
	public void printB() {}
	public void calculatesB() {}
	public void editB() {}
	
}

class Execute {

}
