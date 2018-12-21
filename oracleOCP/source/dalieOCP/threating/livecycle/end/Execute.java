package dalieOCP.threating.livecycle.end;

class Task extends Thread {
	boolean isRunning;
	
	Task(boolean b) {
		isRunning = b;
	}
	
	public void run() {
		do{
			System.out.println("Hello");
		} while(isRunning);
	}
	
	public void setStopp(boolean b){
		this.isRunning = b;
	}
	
}

class Execute {
	
	public static void main(String[] args) {
		Task task = new Task(true);
		task.start();
		try {Thread.sleep(100);} catch (InterruptedException e){ e.printStackTrace();}
		task.setStopp(false);
	}
	
}
