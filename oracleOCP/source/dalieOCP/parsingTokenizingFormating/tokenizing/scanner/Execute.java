package dalieOCP.parsingTokenizingFormating.tokenizing.scanner;

import java.util.Scanner;

class Execute {
	
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		boolean b2, b;
		int i;
		String s, hits = "";
		Scanner s1 = new Scanner("1 true 34 hi");
		Scanner s2 = new Scanner("1 true 34 hi");
		
		while(b = s1.hasNext()) { // iterated over
			s = s1.next(); // which returns every token as a string
			hits += "s1";
		}
		
		while(b = s2.hasNext()) { // iterated over
			
			if(s2.hasNextInt()) { // specialized by every primitive type is possible 
				i = s2.nextInt();// has to map an there corresponded primitive type
				hits += "i";
				
			} else if (s2.hasNextBoolean() ) {
				b2 = s2.nextBoolean();
				hits += "b";

			} else  {
				s2.next();
				hits += "s2";
				
			}
			
		}
		
		Scanner s3 = new Scanner("Hello/World");
		s3.useDelimiter("/"); // allows you to set any delimiter to be any valid regex expression.
		while(b = s3.hasNext()){
			s = s3.next();
			hits += "s3";
			
		}
		
		System.out.println(hits);
	}
}
