/*
 * MainClass.java 
 * @author Administrator on 24.02.2009 um 20:25:15 
 * 
 * no Copyright
 */
package instanceo;
/**
 * <b>Class</b>MainClass:<br>Only for Demonstration.<br>
 * 
 * @version 1.00 on 24.02.2009 um 21:04:38
 * @author dv0101
 * <br><br>
 * The instanceof keyword can be used to test, <BR>
 * if an object is of a specified type.
 */
public class MainClass {
    /* used for demonstration of instecneof */
    
    public static void main(String[] args) {
        String s = "Hello";
        if (s instanceof java.lang.String) {
            System.out.println("is a String");//The following if statement returns true.
        }//endif
    }//main
}//class MainClass

