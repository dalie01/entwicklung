package dalieOCP.collection.array._practice;

import java.util.ArrayList;
import java.util.List;

class P01 {

	public static void main(String[] args) {
		List<String> sL = new ArrayList<>();
		sL.add("one");
		sL.add("two");
		sL.add("three");
		
		String[]a = sL.toArray(new String[1]);
		System.out.println(a[0]);
		System.out.println(a.length);
		for(String s : a)
			System.out.println(s);
	}
}
