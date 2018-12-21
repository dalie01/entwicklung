/*
 * MainClass.java
 * @author dv0101 am 24.02.2009 um 20:29:27<BR><BR>
 * 
 * no Copyright
 */ 
package instanceo;
/**
 * <b>Class</b>MainClass1:<br>Only for Demonstration.<br>
 * <b>Attribute</b> <li>test<br>
 * 
 * @version 	1.00 24.02.2009 um 20:29:27*
 * @author 	    DV0101
 * <BR><BR>
 * However, applying instanceof on a null reference variable returns false. 
 * For example, the following if statement returns false.
 * 
 */
public class MainClass1 {
    /* used for demonstration of instecneof */
    
    public static void main(String[] args) {
        /** simply String */
        String test = null;
        if (test instanceof java.lang.String) {
          System.out.println("true");
        } else {
          System.out.println("false");
        }//endif
    }//main
}//class MainClass1

