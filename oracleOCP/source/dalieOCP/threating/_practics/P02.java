package dalieOCP.threating._practics;

final class P02 extends Thread {

	private static int thread_counter = 0;
	
	public void run() {
//		public synchronized void run() {
		synchronized (P02.class) {
			
			System.out.println(++thread_counter);
		}
	}
	
	
	public static void main(String[] args) {
		
		/*
		 * new P02 objects are being created in the main method for each thread. 
		 * So each thread will get a lock of a separate P02 object. 
		 * Thus, any thread can potentially preempt any other thread 
		 * while the thread is in the run method. 
		 * For example, thread 1 increments the thread_counter to 1 
		 * and before it could print thread_counter, OS preempts thread 1 and runs thread 2. 
		 * Thread 2 increments thread_counter to 2 and print 2. 
		 * OS schedules thread 1 again, which prints thread_counter (which is now 2). 
		 * So both the threads print 2 and 1 is never printed.
		 * */
		
		for (int i = 0; i < 5; i++) {
			new P02().start();//thread 1 will get a lock of separate P02 object
			new P02().start();//thread 2 will get a lock of separate P02 object
		}
//		P02 p02 = new P02();
//		for (int i = 0; i < 5; i++) {
//			try {
//				Thread a = new Thread(p02);
//				a.start();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
		
		/*
		 * Also, the main() thread is not using the thread_counter value in any synchronized block. 
		 * So depending on when the main() thread gets to run, it will print the current 
		 * value of thread_counter. 
		 * If the main thread gets to run first, then it will print 0 DONE first 
		 * and then the rest of the numbers.
		 * */
		
		System.out.println(thread_counter + " done");
	}
}
