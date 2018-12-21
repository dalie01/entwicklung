package dalieOCP.string;

class Execute {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String s1 = "Hello";
		s1.concat("World");// strings always immutable;
		System.out.println(s1);
		
		String s2 = s1.concat(" World");
		System.out.println(s2);
		
		System.out.println("  233 erer  ".trim());
		
		
		/* The code at 1 creates a new String object with the value "Summer". 
		 * This object is not placed in the String constant pool */
		String summer = new String("Summer");     //1
		
		/* The code at 2 creates a new String object with the value "Summer" 
		 * and places it in String pool constant */
		String summer2 = "Summer";                //2
		
		/* The code at 3 doesn't need to create any new String Object. 
		 * It reuse the String object with the value "Summer" that already exist */
		System.out.println("Summer");             //3
		
		/* The code at 4 creates a new String object with the value "autumn" 
		 * and places it in the String pool constant */
		System.out.println("autumn");             //4
		
		/* The code at 5 reuse the String value "autumn" 
		 * from the String constant pool. 
		 * It creates a String object with value "summer" 
		 * Java case sEnSitiVe */ 
		System.out.println("autumn" == "summer"); //5
		/* The code at 6 creates a new String object. */
		String autumn = new String("Summer");     //6
		
		String x1 = new String("Hello");
		String x2 = new String("Hello");
		System.out.println(x1 == x2);//is false (this compares the object references for equality and not the object contents.)
		x2 = x1;
		System.out.println(x1 == x2);//now is true
		
	}	

}
