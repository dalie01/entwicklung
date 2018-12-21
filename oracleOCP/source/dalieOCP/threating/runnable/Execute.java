package dalieOCP.threating.runnable;


class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("Class.Task.withRunnable.run");
	}
	
}

class ATask extends Thread {
	
	public void run(){
		System.out.println("Class.ATask.extendsTread.run");
	}
}


class Execute {

	int i = 10;
	private Runnable t1 = new Runnable() {
		public void run() {
			System.out.println("Class.Execute.t1.run" + ++i);
		}
	};
	
	public static void main(String[] args) {
		
		Thread task = new Thread(new Task());
		task.start();
		System.out.println("Class.Execute.main.run");

		Thread aTask = new ATask();
		task = new Thread(aTask);
		task.start();
		
		Execute ex = new Execute();
		Thread t1 = new Thread(ex.t1);
		t1.start();
		
		Thread t2 = new Thread(ex.t1);
		t2.start();
	}
	
}
