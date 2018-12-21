package dalieOCP.concurrency.locks.acquireLocks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Execute {

	Lock mylook = new ReentrantLock();//Lock object
	static List<String> colors = new ArrayList<>();
	
	public static void main(String[] args) {
		Execute c = new Execute();
		c.addColor("blue");
	}
	
	public void addColor(String c) {
		mylook.lock(); //Call lock to acquire lock; wait if lock not available
		try {
			colors.add(c);
			
		} finally {
			/*
			 * Call method unlock() on a Lock object to release its lock
			 * when you no longer need it.
			 * */
			mylook.unlock();//Call unlock to release lock
		}
	}
}
