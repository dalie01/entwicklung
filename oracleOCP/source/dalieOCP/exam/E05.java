package dalieOCP.exam;
import static java.lang.System.out;
/**
 * 
 */
public class E05 {

    public static void main(String args[]) {

        short aShort = 5; /* short is a 16-bit signed integer data type. */
        int aInt = 5; /* int is a 32-bit signed integer data type. */

        /* calculates the sum of aShort and aInt, 
         * and then explicitly casts the result to short. 
         * The sum of a short and an int will be an int by default, 
         * so the cast is necessary to assign 
         * the result back to a short variable. */
        short result = (short) (aShort + aInt);
        out.format("%S",result);
    }
}
 