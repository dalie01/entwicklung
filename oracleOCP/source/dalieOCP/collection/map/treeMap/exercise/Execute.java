package dalieOCP.collection.map.treeMap.exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class A {
	String id;
	
	A(String id) {
		 this.id = id;
	}
	
}

class B implements Comparable<B> {
	/* The Comparable interface is used to define the natural order of
		the objects of the class that implements it. */
	
	String id;
	
	B(String id){
		this.id = id;
	}
	
	/*
	 * Method compareTo() returns a negative integer, zero, or a 
	 * positive integer if this object is less than, equal to, or greater than the
	 * specified object.
	 * 
	 * */
	public int compareTo(B b){
		if(b instanceof B) 
			this.id.compareTo(b.id);

		return 0;
	}
	
}

class MyComparable implements Comparator<B> {
	
	public int compare(B b1, B b2) {
		return b2.id.compareTo(b1.id);
	}

}

class Execute {

	public static void main(String[] args) {
		
		try {
			Map<A, String > aTMap = new TreeMap<>();
			aTMap.put(new A("1"), "Hello World");// it will compile but it will throw ClassCastExeciption no Comparable 
		} catch (ClassCastException e){
			e.printStackTrace();
		}
		
		Map<B,String> bTMap = new TreeMap<>(new MyComparable());//When you pass a Comparator object to a TreeMap constructor,the natural order of its keys is ignored.
		bTMap.put(new B("100"), "World");
		bTMap.put(new B("200"), "Hello");
		bTMap.put(new B("300"), "INXS");
		
		for(B b: bTMap.keySet())
			System.out.println(b.id);//prints 300,200,100 (please see MyComparable.compare first b2.id normally b1.id is first)
		
	}
}
