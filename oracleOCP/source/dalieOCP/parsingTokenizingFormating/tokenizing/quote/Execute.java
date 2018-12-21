package dalieOCP.parsingTokenizingFormating.tokenizing.quote;

import java.util.Arrays;
import java.util.regex.Pattern;

class Execute {

	public static void main(String[] args) {
		
		String value = "*Hello";
		String quote = Pattern.quote(value);
		System.out.println(quote);

		System.out.println(value);

		// Try matching with quoted value.
		boolean result1 = Pattern.matches(quote, value);
		System.out.println(result1);
		
		System.out.println(Arrays.asList(Pattern.quote("\\s c pb sddsf \\n").split("\\s")));

		
	}
}
