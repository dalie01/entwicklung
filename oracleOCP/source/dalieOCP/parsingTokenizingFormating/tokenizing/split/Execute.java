package dalieOCP.parsingTokenizingFormating.tokenizing.split;

class A {
	
	static void aMethod(String argum, String regex) {
		
		if( (argum != null && argum.length() > 0) && 
				(regex != null && regex.length() > 0) ) {
			
			String[] tokens = argum.split(regex);
			for(String s : tokens) {
				System.out.println(s);
			}
		}
	}
}

public class Execute {
	
	public static void main(String[] args) {
		A.aMethod("Hello, Hello", ",");
		A.aMethod("Hello, Hello", "\\s*,\\s*");
		A.aMethod("ab5 ccc 45 @", "\\d");//remember of digits delimiter removing 
		A.aMethod("ab5.ccc.45.@", "\\.");//remember of digits delimiter removing 
	}

}
