package InkrementOrDekrement;

/**
 * @author dv0101 am 04.07.2008 um 21:27:11
 *
 * Inkrement und Dekrement.java
 * 
 * Das Herauf- und Heruntersetzen von Variablen!!!<br>
 * Operatoren ++ und -- kürzen<br> 
 * die Programmzeilen zum Inkrement und Dekrement ab.<br>
 * <b>Achtung bei der Platzierung!!!<b>
 * 
 */

public class InkrementundDekrement {

    /**
     * <b>Präfix<b>Inkrement (++)/Dekrement (--) 
     * Die Variable wird erst heraufgesetzt,<br> 
     * und dann ausgegeben!!!
     */
    public static void praefix() {
        int x = 30, y = 40; 
        System.out.println( ++x ); // 31 
        System.out.println( x ); // 31 
        System.out.println( --y ); // 39 
        System.out.println( y ); // 39
    }//prefix
    
    /**
     * <b>Postfix<b>Inkrement (++)/Dekrement (--)  
     * Erst wird der Wert im Ausdruck verwendet,<br> 
     * und anschließend erst heraufgesetzt.
     */
    public static void postfix() {
        int x = 30, y = 40; 
        System.out.println( x++ ); // 30 
        System.out.println( x ); // 31 
        System.out.println( y-- ); // 40 
        System.out.println( y ); // 39       
    }//postifx
    
    
    
    public static void main(String[] args) {
        praefix();
        postfix();
    }//main
    
}//class Inkrement und -Dekrement 

