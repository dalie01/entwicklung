package dalieOCP.collection.list._pratice;

import java.util.ArrayList;
import java.util.List;

class A {
	String id;
	
	A(String id) {
		this.id = id;
	}
		
//	@Override
//	public boolean equals(Object a){
//		return true;
//	}
}

final class P01 {

	public static void main(String[] args) {
		List<A> l1 = new ArrayList<>();
		A a1 = new A("1");
		l1.add(a1);
		l1.add(new A("1"));
		l1.add(new A("1"));
		System.out.println(l1.size());//prints 3
		System.out.println(l1.contains(a1));//prints true
		
		/* This is because A doesn’t define method equals(), so the default implementation 
		 * of method equals() of class Object is used. */
		System.out.println(l1.contains(new A("1")));//prints false -> with equals true
		
		/* remove() removes only the first occurrence of a matching element.*/
		System.out.println(l1.remove(new A("1")));//prints false -> with equals true
		
		List<Integer> l2 = new ArrayList<>();
		int i1 = 30;
		l2.add(20);
		l2.add(i1);
		System.out.println(l2.size());//prints 1
		i1 = 10;
		l2.remove(i1);// value 10 never assingt
//		l2.remove(20);// will try to remove an element at array position 20, throwing an IndexOutOfBoundException
	}
}
