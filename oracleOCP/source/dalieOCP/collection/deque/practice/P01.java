package dalieOCP.collection.deque.practice;

import java.util.ArrayDeque;
import java.util.Deque;

final class P01 {

	public static void main(String[] args) {
		Deque<Integer> d = new ArrayDeque<>();
		d.push(1);
		print(1,d,"p.push(1)");
		d.offerLast(2);
		print(2,d,"p.offerLast(2)");
		d.push(10);
		print(3,d,"p.push(10)");
		System.out.println("p.peek() get:" + d.peek());
		print(4,d,"p.peek()");
		d.removeLast();
		print(5,d, "p.removeLast()");
		d.pop();
		print(6,d, "p.pop()");
		
	}
	
	private static void print(int i, Deque<? extends Integer> push, String s) {
		System.out.printf("%1$d. \"%3$-15s\" %2$s \n", i, push, s);
		
	}

}
