package dalieOCP.collection.list._pratice;

import java.util.ArrayList;
import java.util.List;

final class P02 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add(0, "1");
		l.remove("2");
		l.add(0, "2");		
		System.out.format("%s %d;", (l) , l.size());
	}
}
