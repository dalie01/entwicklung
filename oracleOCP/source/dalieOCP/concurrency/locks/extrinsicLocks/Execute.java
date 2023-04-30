package dalieOCP.concurrency.locks.extrinsicLocks;

import java.util.concurrent.locks.ReentrantLock;

class Bus {
	/**
	 * Overall, the code uses a ReentrantLock to manage access
	 * to a shared resource (in this case, the Bus object),
	 * ensuring that only one thread can access the resource at a time.
	 */
	ReentrantLock lock = new ReentrantLock();

	/**
	 * If the board method of the Bus class is called
	 * and the tryLock method of the ReentrantLock object returns false,
	 * it means that another thread already holds the lock,
	 * and the calling thread cannot acquire the lock at this time.
	 * In this case, the board method will not print the "boarded"
	 * message to the console, since the lock was not acquired.
	 * Instead, the method will return immediately,
	 * and the calling thread can proceed with other work.
	 * 
	 * @param name
	 */
	public void board(String name) {
		if (lock.tryLock()) {// Acquire lock in one method

			System.out.println(name + ": boarded");
		} else {
			System.out.println(name + " looked: boarded");
		}
	}

	/**
	 * If the calling thread needs to acquire the lock before proceeding,
	 * it can block and wait for the lock to become
	 * available using the lock method of the ReentrantLock object.
	 * 
	 * @param name
	 */
	public void board(int name) {
		lock.lock(); // Acquire lock and block until it becomes available
		System.out.println(name + ": boarded");
	}

	/**
	 * The deboard method of the Bus class checks
	 * if the lock is currently held by the calling thread
	 * using the isHeldByCurrentThread method,
	 * and if it is, it releases the lock using the unlock method.
	 * The method then prints a message to the console
	 * indicating that a passenger has deboarded the bus.
	 * 
	 * @param name
	 */
	public void deboard(String name) {
		if (lock.isHeldByCurrentThread()) {

			System.out.println(name + ": deboarded");
			lock.unlock(); // Release lock in another method.

		} else {
			System.out.println(name + " looked: deboarded");
		}
	}
}

/**
 * In this example, the Execute class creates an instance of the 
 * Bus class, and then creates two threads (t1 and t2) 
 * using lambda expressions that call the board and deboard methods 
 * of the Bus object.
 * Each thread simulates some work being done by sleeping 
 * for a certain amount of time using the Thread.sleep method, 
 * and then calls the deboard method to release the lock.
 * 
 * The t1 and t2 threads are started using the start method, 
 * and the join method is called on each thread 
 * to wait for them to complete before exiting the program.
 * 
 * Note that using threads in this way can introduce 
 * additional concurrency issues, 
 * such as deadlocks and race conditions, 
 * so it's important to ensure that the code 
 * is properly synchronized and that shared resources 
 * are accessed in a thread-safe manner.
 * */
public class Execute {

	public static void main(String[] args) {
		Bus bus = new Bus();
		Thread t1 = new Thread(() -> {
			bus.board("Passenger1");
			try {
				// Simulate some work being done
				Thread.sleep(1000); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			bus.deboard("Passenger1");
		});
		Thread t2 = new Thread(() -> {
			bus.board("Passenger2");
			try {
				// Simulate some work being done
				Thread.sleep(2000); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			bus.deboard("Passenger2");
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
