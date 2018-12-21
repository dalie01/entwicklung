package dalieOCP.collection.set.treeSet._practice;

import java.util.TreeSet;

final class P01 {

	public static void main(String[] args) {
		TreeSet<Integer> s = new TreeSet<Integer>(); 
		TreeSet<Integer> subs = new TreeSet<Integer>(); 
		for(int i = 324; i<=328; i++) { 
			s.add(i);
		}
		subs = (TreeSet<Integer>) s.subSet(326, true, 328, true );
//		subs.add(329);  java.lang.IllegalArgumentException: key out of range
		System.out.println(s+" "+subs);
	}
}
