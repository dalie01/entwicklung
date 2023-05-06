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
		out.format("%2$s %1$s %4$b", s);
		out.format("%n%2$s %s", s1,s2);
	}
}
