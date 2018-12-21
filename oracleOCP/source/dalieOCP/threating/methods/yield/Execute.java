package dalieOCP.threating.methods.yield;


class A implements Runnable {
	
	public void run() {
//		yield();is static
		Thread.yield();
		System.out.println("A.Runnable.run");
	}
}

class B extends Thread {
	
	public void run() {
		yield();
		System.out.println("B.Thread.run");
	}
}
class Execute {

	public static void main(String[] args) {
		Thread task = new Thread(new A());
		task.start();
		
		Thread bTask = new B();
		bTask.start();
		
		/* 
		 * Method yield() is static. It can be called from any method,
		 * and it doesn’t throw any exceptions.
		 * causes the currently executing thread object to temporarily pause 
		 * and allow other threads to execute. 
		 * */
		Thread.yield();
		
		/* The method yield gives a chance to other threads to run
		 * and keep the current thread alive in runnable state.
		 * */  

	}
}
