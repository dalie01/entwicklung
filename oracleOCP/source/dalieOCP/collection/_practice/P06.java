package dalieOCP.collection._practice;

import java.util.HashSet;
import java.util.Set;

final class P06 {
	
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		s.add(30);
		s.add(20);
		s.add(null);
		Set<Integer> s1 = new HashSet<>(s);
		s1.addAll(s);//no duplicate allowed
		System.out.println(s1);//[null,20,30]no guarantee of order
	}
	
}
