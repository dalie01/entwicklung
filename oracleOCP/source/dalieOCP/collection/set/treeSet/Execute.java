package dalieOCP.collection.set.treeSet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class MyComp implements Comparator<String>{
	 
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
     
}


class A implements Comparable<A> {
	String name;
	public A(String name) {
		this.name = name;
	}
	
	public int compareTo(A o2) {
		return -1;
	}
}

class Execute {
	
	public static void main(String[] args) {
		String[] aS = {"INXS","Stuttgart","Jena","New Zealand", "Auckland", "Auckland"};
		A sA[] = new A[]{new A("INXS"),new A("INXS"),new A("Auckland")};
//		Set<String> tS = new TreeSet<>();
//		Set<String> tS = new TreeSet<>(new MyComp());
//		SortedSet<String> tS = new TreeSet<>(Arrays.asList(aS));
		TreeSet<String> tS = new TreeSet<>(Arrays.asList(aS));
		
		/* it must be implement comparable Class otherwise 
		 * Cast-Exception is thrown at runtime
		 * */
		TreeSet<A> tA = new TreeSet<>(Arrays.asList(sA));
		
		Iterator<String> it = tS.descendingIterator();
			while (it.hasNext())
				System.out.println(it.next());
			
		for(A a: tA) 
			System.out.println(a.name);
		
	}
}
