package dalieOCP.threating.methods.sleep;

class A extends Thread {
	
	volatile int x = 0;
	
	public void run() {
		try {
			do {
				for(int i = 0; i < 10; i++){
					System.out.println(x + ";" + i);
				}
				
				Thread.sleep(1000);//slow down the execute 1 second
			} while(++x < 5);
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

class Execute {

	public static void main(String[] args) {
		Thread task = new A();
		task.start();
		
		System.out.println("Here:" + ((A)task).x);
	}
}
