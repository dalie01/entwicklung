/*
 * ConvertFromASCII_CodeToString.java 
 * @author dv0101 on 10.08.2009 um 8:20:22 
 * 
 * no Copyright
 */
package string;

/**
 * <b>Class</b>ConvertFromASCII_CodeToString:<br>only for demonstration<br>
 * <b>Attribute</b> <li>Variable<li>Variable<br>
 * 
 * @version 1.00 on 10.08.2009 um 8:20:22
 * @author dv0101
 */
public class ConvertFromASCII_CodeToString {

    public static void main(String[] args) {
        int i = 64;
        String aChar = new Character((char) i).toString();
        System.out.println(aChar);
    }//main
}//class ConvertFromASCII_CodeToString
