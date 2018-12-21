package dalieOCP.collection.map.exercise1;

import java.util.HashMap;
import java.util.Map;

class A {
	String id;
	
	A(String id){
		this.id = id;
	}
}

class B {
	String id;
	
	B(String id){
		this.id = id;
	}
	
	public int hashCode() {
		return id.hashCode();
	}
	
	public boolean equals(Object o) {
		if(o instanceof B) 
			return ((B)o).id.equals(this.id);
		
		return false;
	}
}

class C {
	String id;
	
	C(String id){
		this.id = id;
	}
	
	public boolean equals(Object o) {
		if(o instanceof C) 
			return ((C)o).id.equals(id);
		
		return false;
	}
}

class Exercise {
	
	public static void main(String[] args) {
	
		Map<A,A> aMap = new HashMap<>();
		aMap.put(new A("1"), new A("1"));
		System.out.println(aMap.get(new A("1")));//prints null (no hascCode and equals)
		
		Map<B,B> bMap = new HashMap<>();
		bMap.put(new B("1"), new B("1"));
		System.out.println(bMap.get(new B("1")));//B@hashCode
		System.out.println(bMap.containsKey(new B("1")));//true
		System.out.println(bMap.containsValue(new B("1")));//true
		
		C c = new C("1");
		Map<C,C> cMap = new HashMap<>();
		cMap.put(new C("1"), new C("1"));
		cMap.put(new C("2"), c);
		/* 
		 * When objects of a class that only overrides method equals()
		 * and not method hashCode() are used as keys in a HashMap, containsKey() 
		 * will always return false.
		 */
		System.out.println(cMap.containsKey(new C("1")));//Prints false
		/*
		 * method containsValue() uses method only equals()
		 * */
		System.out.println(cMap.containsValue(new C("1")));//Prints true
		System.out.println(cMap.containsValue(c));//Prints true
	}
}
