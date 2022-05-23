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
	private static final int countOfThreads = 3;
	private void remove() {
		out.format("%s, %s\n", "remove",Thread.currentThread().getName());
	}

	private void clean() {
		out.format("%s, %s\n", "clean",Thread.currentThread().getName());
	}

	private void add() {
		out.format("%s, %s\n", "add",Thread.currentThread().getName());
	}
	
	private void doSomething() {
		out.format("%s, %s\n", "do something",Thread.currentThread().getName());
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
			service = Executors.newFixedThreadPool(Executor.countOfThreads);
			Executor manager = new Executor();
			CyclicBarrier c1 = new CyclicBarrier(countOfThreads);
			CyclicBarrier c2 = new CyclicBarrier(countOfThreads, new Runnable() {
				public void run() {
					manager.doSomething();
				}
			});
			
			for (int i = 0; i < countOfThreads; i++)
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
