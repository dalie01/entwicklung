package dalieOCP.parsingTokenizingFormating.tokenizing.stringTokenizer;

import java.util.StringTokenizer;

class Execute {

	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("a bc d e");//white spaces as delimiters 
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println(st.countTokens());

		StringTokenizer st2 = new StringTokenizer("a b cab a ba d", "a"); // uses "a" as delimiters
		System.out.println(st2.countTokens());
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		System.out.println(st2.countTokens());

		StringTokenizer st3 = new StringTokenizer("Herry;8765,Per[fec]t", "[;,]");
		System.out.println(st3.countTokens());
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
		
	}
}
