/*
 * TokenizingaString.java 
 * @author Administrator on 11.03.2009 um 19:50:18 
 * 
 * no Copyright
 */
package string;

import java.util.StringTokenizer;

/**
 * <b>Class</b>TokenizingaString:<br>for demonstration of tokenizing<br>
 * <b>Attribute</b> <li>Variable<li>Variable<br>
 * 
 * @version 1.00 on 11.03.2009 um 19:50:18
 * @author dv0101
 */
public class TokenizingaString {
    /* used for demonstration of Tokenizing */

    public static void main(String[] args) {
        /** a String with lots of delimiter */
        String s = "123;234;123;3454353;3453;"; 
        StringTokenizer st = new StringTokenizer(s, ";"); // Delimiter ;
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken()); // Token for Token out
        }//while
    }//main
}//class Tokenizing a String

