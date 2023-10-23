package dalieOCP.booleanValues;

import static java.lang.System.out;
public class Execute {

    public static void main(String[] args) {
        int x = 10, y = 12;
        boolean a = true, b = false;
        if (Boolean.logicalAnd(x++ > 11, y-- > y)){
            out.format("passed");
        } else {
            out.format("failed");
        }

        if (Boolean.logicalOr(x++ > 11, y-- > y)){
            out.format("passed");
        } else {
            out.format("failed");
        }

        /**
         * The Boolean.logicalXor() method takes two boolean operands and returns the logical XOR of the operands.
         * It returns true if only one of the operands is true, and false if both operands are either true or false.
         * */
        if (Boolean.logicalXor(a,b)) {

            out.format("passed");
        } else {
            out.format("failed");
        }
        /**
         * Note that Boolean.logicalXor() was introduced in Java 11.
         * If you are using an earlier version of Java, you can achieve the same functionality with the XOR operator ^:
         * */
        if (a ^ b) {

            out.format("passed");
        } else {
            out.format("failed");
        }
    }
}