package dalieOCP.exam;

import static java.lang.System.out;

/**
 * @author ZOUDALIE
 *
 */
final class E01 {

	public static void main(String[] args) {
		Object[] s = {"A","B","C",null};
		String s1 = "Hello" , s2 = "World";
		out.format(" %2$s %s %1$s %4$b", s);
		out.format("%n %2$s %s", s1,s2);

		String[] arguments = {"one","two","tree"};
		out.format("%n %3$s %2$s %1$s", arguments); /** returns a formatted String tree two one */
		out.printf("%n %3$s %2$s %1$s", arguments); /** it writes tree two one */

		/**
		 * In Java, `System.out.format` and `System.out.printf` are two methods that are used to format and print output to the console in a formatted way. 
		 * These two methods have the same functionality and use the same syntax for format strings. 
		 * The only difference is that `System.out.format` returns a formatted string by locale as Default alway. 
		 */

		String name = "John";
		int age = 30;
		// Using out.printf to write the formatted string to the console
		out.printf("My name is %s and I am %d years old.", name, age);

		// Using out.format to store the formatted string in a variable. The locale as Default always used the one returned.
		String formattedString = out.format("My name is %s and I am %d years old.", name, age).toString();
		out.format(formattedString);
	}
}
