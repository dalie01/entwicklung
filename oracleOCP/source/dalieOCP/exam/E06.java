package dalieOCP.exam;

public class E06 {
    public static void main(String[] args) {

        /**
         * In these examples, you can observe 
         * how the smaller or narrower data types (byte, short, char, int, and float) 
         * are automatically promoted to larger or wider types (int, long, and double) 
         * to perform the respective operations. 
         * This automatic promotion ensures that the operations 
         * are carried out with the appropriate 
         * data types and avoids loss of precision or truncation.
         * 
         */

        byte ab = 10;
        byte bb = 20;
        int resultb = ab + bb;  // byte values are promoted to int before addition
        System.out.println(resultb);  // Output: 30

        short as = 1000;
        short bs = 2000;
        int results = as * bs;  // short values are promoted to int before multiplication
        System.out.println(results);  // Output: 2000000

        char ac = 'A';
        char bc = 'B';
        int resultc = ac + bc;  // char values are promoted to int before addition
        System.out.println(resultc);  // Output: 131

        int ai = 100;
        long bl = 200L;
        long resultl = ai + bl;  // int value is promoted to long before addition
        System.out.println(resultl);  // Output: 300

        float af = 1.5f;
        double bd = 2.5;
        double resultd = af * bd;  // float value is promoted to double before multiplication
        System.out.println(resultd);  // Output: 3.75


    }
}
