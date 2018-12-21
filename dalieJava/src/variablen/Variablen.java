package variablen;

/**
 * @author dv0101 am 06.01.2009 um 20:43:04
 *
 * Variablen.java
 * 
 */

public class Variablen {

    public static void main(String args[]) {

        // integers
        byte largestByte = Byte.MAX_VALUE;
        short largestShort = Short.MAX_VALUE;
        int largestInteger = Integer.MAX_VALUE;
        long largestLong = Long.MAX_VALUE;

        // real numbers
        float largestFloat = Float.MAX_VALUE;
        double largestDouble = Double.MAX_VALUE;

        // other primitive types
        char aChar = 's';
        boolean aBoolean = true;

        // display them all
        System.out.println("The largest byte value is " + largestByte);
        System.out.println("The largest short value is " + largestShort);
        System.out.println("The largest integer value is " + largestInteger);
        System.out.println("The largest long value is " + largestLong);

        System.out.println("\n"+"The largest float value is " + largestFloat);
        System.out.println("The largest double value is " + largestDouble);

        if (Character.isUpperCase(aChar)) {
            System.out.println("\n"+"The character " + aChar + " is upper case (größere Argument).");
        } else {
            System.out.println("\n"+"The character " + aChar + " is lower case (kleiner Argument).");
        }//endif Caracter.isUppCase(aChar)
        
   		char bChar = 'B';
   		if (Character.isUpperCase(bChar)) {
            System.out.println("\n"+"The character " + bChar + " is upper case (größere Argument).");
        } else {
            System.out.println("\n"+"The character " + bChar + " is lower case (kleiner Argument).");
        }//endif Character.isUppCase(bChar)
   		
        System.out.println("\n "+"The value of aBoolean is " + aBoolean);
    }//main
    
}//class Variablen

