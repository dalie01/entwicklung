package dalieOCP.parsingTokenizingFormating.reqex.boundary;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Execute {

	public static void main(String[] args) {
		
		/* 
		 * \b is a word boundary. When placed before the text \bthe, it limits searches to
		 * finding words that start with the.*/
		determineG("\\bthe", "the leather in their code made her seethe");// found at 0;the and 15;the(ir)
		/*
		 * the\b it limits searches to
		 * finding words that end with the.
		 * */
		determineG("the\\b", "the leather in their code made her seethe");// found at 0;the and 38;(see)the
		/*
		 * \B is a nonword boundary. When placed before the text \Bthe, it limits its searches
		 * to finding words that don’t start with the.*/
		determineG("\\Bthe", "the leather in their code made her seethe");// found at 7;(lea)the(r) and 38;(see)the
		/*
		 * the\B, it limits its searches
		 * to finding words that don’t end with the.
		 * */
		determineG("the\\B", "the leather in their code made her seethe");// found at 7;(lea)the(r) and 15;the(ir)
		/*
		 *  its will match a word that either starts
		 *  with “the” or ends with “the”
		 * */
		determineG("\\bthe|the\\b", "the leather in their code made her seethe");// found at 7;(lea)the(r) and 15;the(ir) and 38;(see)the
	
		/* 
		 * it limits searches to
		 * find anything thats starts with numeric digits. 
		 * */
		determineG("\\b\\d+","AA7 5554 A0");
		/* 
		 * it limits searches to
		 * find anything thats ends with any numeric digits. 
		 * */
		determineG("\\d+\\b","AA7 5554 A0");
		determineG("\\b\\d+|\\d{2}\\b","AA7 5554 A00");
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
