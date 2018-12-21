package dalieOCP.object.nestedClasses.innerClass;

class Outer {
	
	Outer.Inner i1;
	Inner i2;
	
//	final class Inner { final or abstract is fine
//	abstract class Inner {  abstract
	class Inner { // private, default, protected and public possible or final and abstract
		/* define a Inner class 
		 * is member of Outer class */
		
		static final int i1 = 1;
//		static int i2 = 1; invalid
//		static void aMethod() {}; also invalid
	}
	
	Outer(){
		i2 = new Inner();
		i1 = new Outer().new Inner();
	}
	
	@SuppressWarnings("unused")
	static void staticMethod() {
//		Inner in = new Inner(); won't compile
		Outer outObj = new Outer();
		Inner innerObj = outObj.new Inner();
		Inner oneLine = new Outer().new Inner();
	}
	
	void aMethod() {
		
		@SuppressWarnings("unused")
		class LocalInner {
			/* LocalInner class */
			protected LocalInner() {};//constructor
//			static String s1 = "eJava";// non-final static variable is invalid
			final static String s2 = "eJava";//final static variable
			final String s3 = "eJava";
			String s4 = "eJava";
			Outer outer = new Outer();
			Inner inner = new Inner();
			
			private final void aMethod() {}
			private void bMethod() {}
			/*
			 * You can define final static variables in a method local inner class, but you
			 * can’t define non-final static variables, static methods, or static final methods. You can
			 * define constructors with any access modifier in a local inner class.
			 * */
			
//			static void print() {};
//			static final void print() {}
		}
	}
	
	
	Object bMethod() {
		
		return new Object() {
			/* Anonymous inner class */
			
			public String toString() {
				return "anonymous";
			}
			
		};
	}
}

class Execute {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/* You must have an outer class instance to create an inner class instance. */
		Outer outer = new Outer();
		Outer.Inner oInner0 = outer.new Inner();
		Outer.Inner oInner1 = new Outer().new Inner();
//		Outer.Inner oInner2 = Outer.new Inner(); won't compile
	}
}
