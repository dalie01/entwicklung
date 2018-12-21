package dalieOCP.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Execute {

	public static void main(String[] args) {
		List<String> s1 = new ArrayList<>();
		s1.add("Hello");
		Iterator<String> i = s1.iterator();
//		s1.add("World");//avoid ConcurrentModificationException;
		while(i.hasNext()){
			String s = (String)i.next();
			System.out.println(s);
		}
		
		ListIterator<String> sI = s1.listIterator();
		sI.add("World");
		while(sI.hasNext()){
			String s = sI.next();
			System.out.println(s);
		}
	}
}
