package oracel_OcaSe.O92_Temp.nested;



class OuterClass {

	String j = "Jena";
	public static void main(String[] args) {
		OuterClass o = new OuterClass();
		
		System.out.println(o.new NestedClass().s);
		o.new NestedClass().aMethod();
		
		OuterClass.StaticNestedClass.aMethod();
	}
	
	String s = "Jena";
	
	static class StaticNestedClass { 
		
		static void aMethod() {
			System.out.println(new OuterClass().j);
		}
	}
	
	class NestedClass {
		
		private String s = "Java 7";
		private static final String x = "Stuttgart";
		
		void aMethod(){
			System.out.println(OuterClass.this.s + j.length() + j.indexOf("a")); // --> print 43
		}
	}
	
}
