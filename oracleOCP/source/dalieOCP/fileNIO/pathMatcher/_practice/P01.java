package dalieOCP.fileNIO.pathMatcher._practice;

import java.nio.file.FileSystems;
import java.nio.file.PathMatcher;

final class P01 {

	
	
	public static void main(String[] args) {
	
		//java_June2012
		
		PathMatcher matcher = FileSystems.getDefault()
				//any four characters, followed by _ ,followed by any number of characters, and ending with 2
				.getPathMatcher ("glob:????_*2");
		
		
		/* - An asterisk, *, matches any number of characters (including none).
		 * - Two asterisks, **, works like * but crosses directory boundaries. 
		 *   This syntax is generally used for matching complete paths.
		 * - A question mark, ?, matches exactly one character.
		 * - Braces specify a collection of subpatterns. 
		 *   For example: {sun,moon,stars} matches "sun", "moon", or "stars." 
		 *                {temp*,tmp*} matches all strings beginning with "temp" or "tmp."
		 * */
	}
}
