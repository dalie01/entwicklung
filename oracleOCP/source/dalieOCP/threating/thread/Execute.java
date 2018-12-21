package dalieOCP.threating.thread;

class Task extends Thread {
	
	public void run() { //is will be executed, if Task (Tread) instantiated and start() will be called
		System.out.println("Tread.Task.run");
	}
}

class TaskA extends Thread{
	
	public void run() {
		System.out.println(this.getClass().getSimpleName() +".run");
	}
	
	public void start() { //it won’t start a new thread of execution
		System.out.println("no Task started");
	}
}

class Execute {

	public static void main(String[] args) {
		Thread task = new Task(); //Instantiate Thread
		task.start(); // will execute/start Task.run()
		System.out.println("Execute.task.run"); //first print
		
		/*
		 * No order of Execution is guaranteed.
		 * 1. print -> Execute.task.run
		 * 2. print -> Tread.Task.run
		 * 3. print -> no Task started
		 * 4. print -> Execute.aTask.run
		 * */
		
		Thread aTask = new TaskA();
		aTask.start();// start is overridden is dosn't starts a new task it will print "no Task started"
		System.out.println("Execute.aTask.run");
	}
}
