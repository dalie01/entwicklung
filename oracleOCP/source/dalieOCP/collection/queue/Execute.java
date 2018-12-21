package dalieOCP.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

class Execute {

	public static void main(String[] args) {
		Queue<Object> queue = new LinkedList<>();
		
		queue.offer("Hello");
		queue.offer("World");
		queue.add(null);
//		System.out.println(queue.element());// "Retrieves the head element" throws NOSuchElementException if case queue is Empty
		System.out.println(queue.peek());// "Retrieve also the head element" of this queue
		
		while(!queue.isEmpty()){
			System.out.println(queue.peek());//looks Element
			queue.poll();// truncate (remove)
		}
	}
}
