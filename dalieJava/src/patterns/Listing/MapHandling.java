package patterns.Listing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * This class is just for demo.
 * 
 **/
public final class MapHandling {
	
	private static final Map<Character, String> UTF8readOnly;
	private static final Map<Character, String> UTF8threadSave;
	
	static {
		Map<Character, String> tmp = new HashMap<Character, String>();
		tmp.put(new Character('Ü'), "&Uuml;");
		tmp.put(new Character('í'), "&iacute;");
		UTF8readOnly = Collections.unmodifiableMap(tmp);
		
		tmp = new HashMap<Character, String>();
		tmp.put(new Character('2'), "HelloDalie");
		UTF8threadSave = Collections.synchronizedMap(tmp);
	}
	
	
	/**
     * Convert input to .
     * 
     * @param input     input to UTF8Code.
     * @return          The  input.
     */
	public static String valueOfUTF8(String string) {
		if (string == null)
			return string;

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {

			if (UTF8readOnly.containsKey(new Character(string.charAt(i))) == true) {
				result.append(UTF8readOnly.get(new Character(string.charAt(i))));
				
			} else {
				result.append(new Character(string.charAt(i)));
			}

		}
		return result.toString();
	}//valueOfUTF8
	
}//class MapHandling
