/*
 * Created on 16.06.2009
 *
 */
package isInteger;

/**
 * Methode to check of Value Integer
 * @author dv0101
 *
 */
public class IsInteger {
    
    public static boolean isInteger(Object object) {
        try {
            Integer.parseInt((String) object);
            return true;
        } catch (Exception e) {
            return false;
        }//try
    }//isInteger
    
}//class IsInteger
