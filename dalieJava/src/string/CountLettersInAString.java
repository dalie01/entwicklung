/*
 * CountLettersInAString.java 
 * @author Administrator on 10.08.2009 um 8:16:18 
 * 
 * no Copyright
 */
package string;
/**
 * <b>Class</b>CountLettersInAString:<br>for demonstration<br>
 * <b>Attribute</b> <li>Variable<li>Variable<br>
 * 
 * @version 1.00 on 10.08.2009 um 8:16:18
 * @author dv0101
 */
public class CountLettersInAString {

    public static void main(String[] args) {
        String str = "12345A";
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))
                counter++;
        }//for
        System.out.println(counter + " letters.");
    }//main
}//class CountLettersInAString
