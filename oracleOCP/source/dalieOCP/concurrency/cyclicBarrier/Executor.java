package dalieOCP.concurrency.cyclicBarrier;

import static java.lang.System.out;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author dalie.de
 *
 */
public class Executor {

	/**
	 * 
	 */
	private void remove() {
		out.format("%s\n", "remove");
	}

	private void clean() {
		out.format("%s\n", "clean");
	}

	private void add() {
		out.format("%s\n", "add");
	}
	
	private void doSomething() {
		out.format("%s\n", "do something");
	}
	
	public void executeTasks(CyclicBarrier c1, CyclicBarrier c2) {
		try {
			remove();
			c1.await();
			clean();
			c2.await();
			add();
		} catch (InterruptedException | BrokenBarrierException e) {
			out.format("%s", e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(4);
			Executor manager = new Executor();
			CyclicBarrier c1 = new CyclicBarrier(4);
			CyclicBarrier c2 = new CyclicBarrier(4, new Runnable() {
				public void run() {
					manager.doSomething();
				}
			});
			
			for (int i = 0; i < 4; i++)
				service.submit(new Runnable() {

					@Override
					public void run() {
						manager.executeTasks(c1, c2);

					}
				});
			
		} finally {
			if (service != null) {
				service.shutdown();
			}
		}
	}
}
