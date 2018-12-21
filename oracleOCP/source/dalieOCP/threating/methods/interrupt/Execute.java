package dalieOCP.threating.methods.interrupt;

class A implements Runnable {

	Thread t;

	A() {

		t = new Thread(this);
		System.out.println("Executing " + t.getName());
		// this will call run() fucntion
		t.start();

		// interrupt the threads
		if (!Thread.interrupted()) {
			t.interrupt();
		}
		// block until other threads finish
		try {
			t.join();
		} catch (InterruptedException e) {
		}
	}

	public void run() {
		try {
			while (true) {
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.print(t.getName() + " interrupted:");
			System.out.println(e.toString());
		}
	}
}

class Execute {

	public static void main(String[] args) {
		new A();
		new A();
	}
	
	/* The method interrupt is used to check either the interrupted flag is set, or, 
	 * if the thread is waiting or sleeping, throws InterruptedException
	 * */
}
