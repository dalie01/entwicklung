package dalieOCP.string.literal;

public class Execute {
    /**
     * @param args
     */
    public final static void main(String[] args){
        final String s =  "\"\"\"\"\"\"\"\"\"\"";
        System.out.println(s);

        String code ="""
            String text = \"""
                    A text block inside a text block
                \""";
                
        """;
        System.out.println(code);
    }

    /**
     * defines a string variable named "code" 
     * using the new text block syntax introduced in Java 15. 
     * The text block starts with three double quotes ("""), 
     * and the string value is defined on the next line. 
     * The string value contains a text block itself, 
     * which starts with a double quote (") and contains a semicolon (;). 
     * However, because this string value is inside a text block, 
     * it does not need to be escaped with backslashes, making it easier to read and write. 
     * Finally, the program prints out the value of "code" 
     * using System.out.println, which will output the text block to the console.
     * 
     * In summary, this program demonstrates the use 
     * of text blocks in Java to make it easier to write 
     * and read multi-line string literals that contain 
     * special characters like double quotes and escape sequences.
    */
}
