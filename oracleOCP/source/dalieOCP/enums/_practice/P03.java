package dalieOCP.enums._practice;

enum Pets { 
	DOG("D"), CAT("C"), FISH("F"); 
	static String prefix = "I am "; 
	String name;
	
	Pets(String s) { 
//		name = prefix + s; is not valid
		name = s;
	} 
	public String getData(){ return name; } 
}

final class P03 {

	
	
}
