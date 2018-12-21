package dalieOCP.collection._practice;

import java.util.ArrayDeque;
import java.util.Queue;

final class P07 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue<Integer> q = new ArrayDeque<>();
		for(int i = 0;i < 5; i++)
			q.add(i);
		
	System.out.println(q.peek());//Retrieve, but does not remove,the head
	System.out.println(q.poll());//Retrieve, but removes,the head
	System.out.println(q);//[1,2,3,4]
	}
}
