package dalieOCP.object.nestedClasses;

import dalieOCP.object.nestedClasses.Outer.StaticNested;

class Outer {
	
	static String x1;
	private String o;
	private String o1 = "World";
	
	/* private, public protected or package is possible */
	protected static class StaticNested {
		/* Nested classes that are declared static
		 * are called static nested classes.
		 *  
		 * A nested class is a member of its enclosing class.
		 * 
		 * Static nested classes do not have access to other members of the enclosing class
		 * */
//		String i1 = o;
		String i = x1;
	}
	
	class Inner {
		/* Non-static nested classes 
		 * are called inner classes. 
		 * 
		 * Non-static nested classes (inner classes) have access 
		 * to other members of the enclosing class, 
		 * even if they are declared private.
		 * */
		String o1 = Outer.this.o1;
		String t1 = o;
	}
	
	static void sMethod() {
		final String s1 = "Hello";
		
		@SuppressWarnings("unused")
		class LocalInner {
			/* Local inner classes are local to a method. They
			 * can access all the members of a class, including its private members, but
			 * they can be accessed only within the method in which they’re defined. 
			 * */
			String t1 = Outer.x1;
			String t2 = s1;
		}
	}
	
	static Object sMethod(String a) {
		
		return new Object() { //Anonymous inner class
			
			public String toString() {
				return "anonymous";
			}
		};
	}
	
	void aMethod() {
		final String s1 = "Hello";
		
		@SuppressWarnings("unused")
		class LocalInner {
			String t = s1;
		}
	}
	
	Object aMethod(String a) {
		
		return new Object() {//Anonymous inner class
			
			public String toString() {
				return "anonymous";
			}
		};
	}
}


class Execute {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		StaticNested nestedObject1 = new StaticNested();
		Outer.StaticNested nestedObject2 = new Outer.StaticNested();
		
		Outer outer = new Outer();
		Outer.Inner oI = outer.new Inner();
	}
}
