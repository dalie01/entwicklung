/*
 * Created of DV0101 on 23.12.2009 10:23:11
 *
 * Filename	  CreateRandomString.java
 */
package random;

import java.util.Random;

/**
 * Generating a random string.
 *
 * @version 	1.00 23.12.2009 um 10:23:11
 * @author 		DV0101
 * <br><br>
 */
public class CreateRandomString {
	
	public static void main(String st[]) {
		String str = new String(
				"QAa0bcLdUK2eHfJgTP8XhiFj61DOklNm9nBoI5pGqYVrs3CtSuMZvwWx4yE7zR");
		StringBuffer sb = new StringBuffer();
		Random r = new Random();
		int te = 0;
		for (int i = 1; i <= 2; i++) {
			te = r.nextInt(62);
			sb.append(str.charAt(te));
		}//for
		System.out.print(sb.toString());
	}//main
	
}//class CreateRandomString
