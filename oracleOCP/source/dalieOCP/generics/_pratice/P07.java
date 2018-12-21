package dalieOCP.generics._pratice;

import java.util.ArrayList;
import java.util.List;

final class P07 {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List l = new ArrayList<Integer>();
		l.add(new String("123"));
		System.out.println(l);
	}
}
