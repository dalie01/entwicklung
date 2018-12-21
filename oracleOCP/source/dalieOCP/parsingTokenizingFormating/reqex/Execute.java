package dalieOCP.parsingTokenizingFormating.reqex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Execute {

	public static void main(String[] args) {
		
		/*
		 * the simplest way to use.
		 * */
		determine("ab","abaaaab");//the "ab" will found at position 0 and 5
	
		/* 
		 * first a character s 
		 * second any character is allow
		 * third character must be n
		 * */
		determineG("s.n","sun soon son");//will match sun & son 
		determineG("sun","sun soon son");//will match to sun 
		
		/* 
		 * [sz] would match either s or z
		 * */
		determineG("organi[sz]ed","organised by UK and organized by US");
		/*
		 * [fdn] would match fine,dine,nine
		 * */
		determineG("[fdn]ine","I m fine to dine at nine");
		/* 
		 * [a-c] look rages a-c begin-index end-index
		 * */ 
		determine("[a-cA-C]", "acfjabca B");// found at 0 1 4 5 6 7 9
		
		/*
		 * Simple [agfd] Match exactly one from a or one from g or one from f or one from d
		 * 
		 * Range [a-f0-7] Match exactly one from 
		 * 	the range a to f (both inclusive) 
		 * 	or 0 to 7 (both inclusive)
		 * 
		 * Negation [^123k-m] Match exactly one character 
		 * 	that is not 1, 2, or 3 or 
		 * 	from the range k to m (both inclusive)
		 * */

		/* 
		 * Here in general, a regex search from left to right, and once a source's 
		 * character has been used in a match, it cannot be reused.
		 * 
		 * The "aba" will found at position 0 and 4
		 * */
		determineG("aba", "abababa");// and the "aba" at position 2 will be ignored
		
		/* 
		 * look first char is a 0, the second is either an "x" or an "X" 
		 * and the third character is a digit from "0" to "9" 
		 * or a letter from "a" to "f" 
		 * or an uppercase letter from "A" to "F" 
		 * */
		determineG("0[xX][0-9a-fA-F]","0X2");// found at 0;0X2;9
		
		/* 
		 * Character class \d -> A digit: [0-9]
		 * lock for numeric digits
		 * */
		determineG("\\d", "a12c3e456f2");// found at 1 2 4 6 7 8 10 
		
		/*
		 * Character class \D -> A no digit [^0-9]
		 * lock for all non-digit
		 * */
		determine("\\D", "a12c3e456f2");// found at 0 3 5 9
		
		/*
		 * Character class \s ->
		 * A whitespace character: [ space, \t (tab), \n (new line), \x0B (end of line), 
		 * \f (form feed), \r (carriage) ]
		 *   
		 * */
		determineG("\\s", "A B  890");// found at 1 3 4
		
		/*
		 * Character class \S -> A non whitespace character: [^\s]
		 * 
		 * */
		determineG("\\S", "A B $890");// found at 0 2 4 5 6 7 

		/* 
		 * Character class \w -> word character: [a-zA-Z_0-9] 
		 * (letters (a– z and A– Z), digits, or the “_” [underscore])
		 * */
		determine("\\w", "a 1 56 _Zy");// found at 0 2 4 5 7 8 9
		
		/* 
		 * Character class \W A non word character: [^\w]
		 * */
		determine("\\W", "a 1 56 _Z$");// found at 1 3 6 9
		
	}
	
	private static void determine(String search, String in){
		Pattern p = Pattern.compile(search);
		Matcher m = p.matcher(in);
		System.out.println(m);
		System.out.println("\"" + in  + "\" regex:" +  m.pattern());
		System.out.println(" 0123456789V " );
		
		while(m.find()) {
			System.out.println(m.start());
		}
	}
	public static void determineG(String pattern, String line){
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(line);
		String sb = "";
		for(int i = 0; i < line.length(); i++  ) {
			sb += i;
		}
		System.out.printf("%4$s%n\"%2$s\" regex: %1$s %n %3$s %n", m.pattern(), line, sb, m);
		while(m.find()) {
			System.out.println(m.start() + ";" + m.group() + ";" + m.end());
		}
	}
}
