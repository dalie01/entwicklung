package dalieOCP.collection.set.exercise;

import java.util.HashSet;
import java.util.Set;

class A {
	String id;
	
	A(String id) { 
		this.id = id; 
	}

}

class B {
	String id;

	B(String id) {
		this.id = id;
	}

	public boolean equals(Object o) {
		return true;
	}

	public int hashCode() {
		return 10;
	}
}


class Exercise {

	public static void main(String[] args) {
		System.out.println("World".hashCode() == "World".hashCode());

		String str1 = new String("ABBA");//69496448 50 is bucket 5
		String str2 = new String("Jena");//hashcode is 2305102 13 bucket 4 
		String str3 = new String("Jena");//hashcode is also 2305102 13 bucket 4
		String i1 = "INXS";//hashcode is 2252512 19 10 bucket 1 
		String i2 = "INXS";//hashcode is 2252512 19 10 bucket 1
		HashSet<String> hSet = new HashSet<>();
		hSet.add(str1);
		hSet.add(str2);
		hSet.add(str3);
		hSet.add(i1);//first check over hashcode/bucket, is bucket empty always add otherwise check by equals 
		hSet.add(i2);
		for (String s : hSet) {
			System.out.println(s);
		}
		
		HashSet<A> set = new HashSet<A>();
		A p1 = new A("Harry");//2018699554
		A p2 = new A("Shreya");//705927765
		A p3 = new A("Selvan");//366712642
		A p4 = new A("Shreya");//18291164700
		System.out.println(p2.hashCode() == p4.hashCode());
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		for (A e : set) 
			System.out.println(e.hashCode());
		
		B b1 = new B("INXS");
		B b2 = new B("INXS");
		B b3 = new B("WORLD");
		Set<B> bSet = new HashSet<>();
		bSet.add(b1);
		bSet.add(b2);
		bSet.add(b3);
		for (B b : bSet) {
			System.out.println(b.id);
		}
	}
}
