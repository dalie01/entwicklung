package dalieOCP.threating.methods.join;

class PreTask extends Thread { 
	
	public void run() {
		
		for(int i = 0; i < 10; i++){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//slow down the execute 1 second
		}
		
	}
	
}

class Task {
	
	Thread preTask;
	
	Task(Thread preTask) {
		this.preTask = preTask;
	}
	
	public void execute() {
		
		try {
			System.out.println("Waiting for PreTask to complete");
			/* 
			 * Method join() guarantees that the calling thread won’t execute
			 * its remaining code until the thread on which it calls join() completes.
			 * */
			preTask.join(); 
			System.out.println("Execute now is run!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}


class Execute {
	
	public static void main(String[] args) {
		PreTask pT = new PreTask();
		pT.start();
		
		Task task = new Task(pT);
		task.execute();
	}
	
}
