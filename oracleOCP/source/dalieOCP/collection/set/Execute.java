package dalieOCP.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class Execute {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<>();
		s1.add("10");
		s1.add("2");
		s1.add("1");
		s1.add("3");
		s1.add("4");
		s1.add("1");
		s1.add(null);
		
		System.out.println(s1.size());//prints 5
		for (String s : s1) {
			System.out.println(s);//prints 1,2,3,4,10 no guarantee of order
		}
		
		System.out.println(s1.contains("1"));//true
		
		List<Integer> list = new ArrayList<>(5);
		list.add(5);
		list.add(5);
		list.add(4);
//		list.add(null);
		Set<Integer> i = new HashSet<>(list); 
//		i.addAll(list);//adds all Element from List; no duplicate elements
		
		Iterator<Integer> iT = i.iterator();
		while(iT.hasNext()) {
			int x = iT.next();
			System.out.println(x);//prints 4,5 no guarantee of order
		}
	}
}
