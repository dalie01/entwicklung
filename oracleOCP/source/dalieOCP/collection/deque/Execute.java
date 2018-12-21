package dalieOCP.collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

class Execute {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
//		Deque<String> deque = new ArrayDeque<>(Arrays.asList(new String[]{"2"}));
		Deque<String> deque = new ArrayDeque<>();//initial capacity to hold 16 elements
//		Deque<String> deque = new ArrayDeque<>(8); capacity custom value 8 elements
//		ArrayDeque<String> arrayDeque = new ArrayDeque<>(Arrays.asList(new String[]{"4"}));

		/* all "increase" Methods throw a NullPointerExeception
		 * in case insert null element;
		 * **/
		deque.addFirst("1.0");//Add element to head
		deque.offerFirst("1.1");//Add element to head
		deque.push("1.2+");//Add element to head
		deque.push("1.2");//Add element to head
		deque.pop();//equivalent to removeFirst(), retrieve and remove the first element 
		
		deque.add("2.0");//Add element to tail
		deque.addLast("2.1");//Add element to tail
		deque.offer("2.2");//Add element to tail
		deque.offerLast("2.3");//add element to tail
//		deque.offer(null);// will throw a NullPointerExeception
		
		System.out.println(deque.peek());//retrieve element head;
		System.out.println(deque.peekFirst());//retrieve head
		System.out.println(deque.peekLast());//retrieve element tail
		
		deque.poll();//retrieve and remove head
		deque.pollFirst();//retrieve and remove head
		deque.pollLast();//retrieve and remove tail
		
		
		Iterator<String> i = deque.descendingIterator();
		
		/*
		 * All the insertion methods (add(), addFirst(), addLast(),
		 * offer(), offerFirst(), offerLast(), and push()) throw a NullPointer-
		 * Exception if you try to insert a null element into an ArrayDeque.
		 * 
		 * */
		
		/*
		 * The java.util.Deque interface is a subtype of the java.util.Queue interface. 
		 * It represents a queue where you can insert and remove elements from both ends of the queue. 
		 * Thus, "Deque" is short for "Double Ended Queue" and is pronounced "deck", like a deck of cards.
		 * The following classes implements Deque.
		 *  ArrayDeque
		 *  LinkedBlockingDeque
		 *  LinkedList
		 *  
		 *  Since Deque is an interface we need to instantiate a concrete implementation of the interface in order to use it. 
		 * */
	}
}
