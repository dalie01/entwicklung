package dalieOCP.collection.list.linkedList;

import java.util.LinkedList;
import java.util.List;
 
class Execute {
	
	public static void main(String[] args) {
		
		List<String> l1 = new LinkedList<>();
		l1.add("1");
		l1.add("2");
		l1.add(0, "0");
//		l1.add(10, "10");//IndexOutOfBoundsException only size 3
	
		System.out.println(l1.size());
		for (String s : l1) {
			System.out.println(s);//prints 0,1,2
		}
		System.out.println(l1.get(0));
//		System.out.println(l1.get(10));//IndexOutOfBoundsException
		
		
		LinkedList<String> lL = new LinkedList<>();//implements also java.util.Deque<E>
		lL.offer("Java");//add
		lL.offerLast("Guru");
		lL.offerFirst("World");
		lL.add("1");
		lL.addLast("2");
		lL.addFirst("3");
		lL.push("4");//add String to beginning
		
		lL.element();//retrieve does not remove NoSuchElementException if list empty
		
		lL.peek();//retrieve the head but does not remove
		lL.peekLast();//retrieve last element of list not remove or null if list empty
		lL.peekFirst();//retrieve first element of list not remove returns null if list empty
		
		lL.poll();//retrieve and remove 
		lL.pollLast();
		lL.pollFirst();
		
		lL.pop();//returns and remove the first element of list NoSuchElementException
		
		
	}

}
