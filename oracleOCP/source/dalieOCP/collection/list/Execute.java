package dalieOCP.collection.list;


import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


class Execute {

	private static boolean removeAll;

	public static void main(String[] args) {
		
		Collection<Integer> cI = new ArrayList<>();
		cI.add(100);
//		List<String> l = new ArrayList<>(cI);//Collection<? extends E> c)
		
//		List<String> l = new ArrayList<>(4);List with initial capacity
		List<String> l = new ArrayList<>();//List with default capacity of 10
		l.add("1");
		l.add("3");
		l.add("2");
		l.add("0");
		l.add("5");
		l.add(0, "0");
//		l.add(10, "10");//IndexOutOfBoundsException
		l.set(4, "4.1");//"5" will replaced
		out.println(l.size());//is 6
		for(String s : l){
			out.println(s);//prints 0,1,2,3,4.1
		}
		out.println(l.get(0));//is 0
//		out.println(l.get(100));//also IndexOutOfBoundsException
		out.println(l.contains("1"));//true
		
//		l.remove("1");remove Object it will iterated the ArrayList and search by equals methods. The first occurrence will be removed 
//		l.remove(0);remove by index 0 is the first element
		removeAll = l.removeAll(cI);//<? extends Collection> Removes from this list all of its elements that are contained in the specified collection 
		System.out.println(l.size());
		l.clear();
		System.out.println(l.size());
		
		List<String> s = new ArrayList<>();
		s.add("B");
		s.add("A");
		for(String temp:s) {
			System.out.println(temp);
		}
		Collections.sort(s);
		for(String temp:s) {
			System.out.println(temp);
		}
		
	}

}