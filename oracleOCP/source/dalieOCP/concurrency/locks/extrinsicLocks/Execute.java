package dalieOCP.concurrency.locks.extrinsicLocks;

import java.util.concurrent.locks.ReentrantLock;

class Bus {
	/* extrinsic locks:
	 * */
	
	ReentrantLock lock = new ReentrantLock();
	boolean locked = false;

	public void board(String name) {
		if (lock.tryLock()) {// Acquire lock in one method
			locked = true;
			System.out.println(name + ": boarded");
		}
	}

	public void deboard(String name) {
		if (lock.isHeldByCurrentThread() && locked) {
			
			System.out.println(name + ": deboarded");
			lock.unlock(); // Release lock in another method.
			locked = false;
		}
	}
}

class Execute {
	
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.board("Passinger1");//only demo, normally is has to use by Thread
		bus.deboard("Passinger1");
	}
}
