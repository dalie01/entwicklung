package dalieOCP.enums._practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class P04 {

	public static void main(String[] args) {
		String[] n = new String[] {"&","1","A","a"};
		List<String> s = Arrays.asList(n);
		Collections.sort(s);
		System.out.println(s);
	}
}
