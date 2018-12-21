package dalieOCP.threating.methods.sleep._practice;

class T implements Runnable {

	private int i;
	synchronized void aMethod() {
		++i;
		try {

			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			System.out.println(e);
		}

	}

	synchronized void bMethod() {
		
		System.out.println("done");
	}

	public void run() {
		System.out.println(i);
		if(i == 0) {
			aMethod();
		} else {
			bMethod();
		}
	}
}

final class P01 {

	public static void main(String[] args) {
		T t = new T();
		new Thread(t).start();
		new Thread(t).start();
		/*
		 * In this case, the first thread acquires the lock for the object and goes to sleep for 10 seconds. 
		 * Therefore, the second thread will not be able to get the lock to execute the second synchronized method 
		 * until the first thread comes out of sleep (after 10 seconds) and releases the lock.
		 * */
	}
}
