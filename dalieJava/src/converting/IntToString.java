package converting;

/**
 * @author dv0101 am 10.01.2009 um 14:18:54
 *
 * Int nach String konvertieren
 * 
 */
public class IntToString {
    
    public static void main(String args[]) {
    String s = (new Integer(Integer.MAX_VALUE)).toString();
    String b = new Integer("123").toString();
    System.out.println(s + " " + b);
    }//main
    
}//class intToString

