package dalieOCP.parsingTokenizingFormating.reqex.quantifiers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * in A+ the quantifier + applies to the character A
 * in \w* the quantifier * applies to the token \w
 * in carrots? the quantifier ? applies to the character s—not to carrots
 * in (?:apple,|carrot,)+ the quantifier + applies to the subexpression (?:apple,|carrot,)
 * 
 * */

class Execute {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		determineG("\\d+f","f 1ff");
		determineG("A\\d?A","AA BA");
		determineG("Aug(ust)?","August Aug Augsburg und Auge");
		determineG("I[ts]?","It or Is");
		determineG("Colou?r","Color or Colour");
		
//		determineG("[a-zA-Z]\\d*[A-Z]","A4343AAAAA A");

//		determineG("\\bj[\\d\\s]+a", "This island j12  2a beautiful");
		
		determineG("\\.css\\b", "folder\\dir\\name.css");
		determineG("[.]+css\\b", "folder\\dir\\name.css");
		determineG("x\\s.*", "11.jx  a");
	}
	
	private static void determineG(String pattern, String inLine){
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(inLine);
		System.out.println(m);
		StringBuilder display = new StringBuilder(m.pattern().toString());
		display.append(" ").append(inLine);
		System.out.println(display);
		StringBuilder index = new StringBuilder(" ");
		for(int i = 0; i < m.pattern().toString().length() ; i++) {
			index.append(" ");
		}
		for (int i = 0; i < inLine.length(); i++) {
			index.append(i);
		}
		System.out.println(index);
		
		while(m.find()) {
			System.out.println(m.start() + ";" + m.group()  + ";" + m.end());
		}
	}

}
