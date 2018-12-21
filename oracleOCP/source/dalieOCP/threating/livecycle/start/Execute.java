package dalieOCP.threating.livecycle.start;

import java.util.Set;

class Task extends Thread{
	
	public void run(){
		System.out.println("Task.run");
	}
}

public class Execute {

	public static void main(String[] args) {
		Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
		for(Thread t : threadSet)
			System.out.println(t + " --- " + t.getState());
		
		/* always remember: no guarantee of execution order  */
		
		Thread task = new Task();//NEW - A thread that has been created but hasn't yet started is in this state
		
		task.start();//Calls start()—state of thread task changes to RUNNABLE
//		task.start();start() is allowed only is Thread in NEW State it will throw IllegalThreadStateException
		
//		task.run();//if you calls run it will execute run but, in same Thread( Thread instance dosen't start a new Thread)
		
		
	}
}
