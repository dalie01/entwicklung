package dalieOCP.collection.set.linkedHashSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class A {
	String name;
	
	A(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}


class Execute {
	
	public static void main(String[] args) {
		//with predictable iteration order.Following are the important points
		//iterator provide order of insertion
		//high performance
		//only Set is possible
		Set<A> s1 = new LinkedHashSet<>();
		s1.add(new A("Jena"));
		s1.add(new A("Stuttgart"));
		s1.add(new A("Auckland"));

		List<A> l1 = new ArrayList<>();
		l1.add(new A("Auckland"));
		s1.addAll(l1);
		
		Iterator<A> i = s1.iterator();
//		s1.add(new A("New York"));// avoid ConcurrentModificationException;
		while(i.hasNext()) {
			System.out.println(i.next());//can be retrieved in their insertion order
		}
		
		System.out.println(s1.contains(new A("Jena")));//is false dosn't override equals
	}
	
}
