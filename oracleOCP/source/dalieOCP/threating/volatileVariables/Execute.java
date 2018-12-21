package dalieOCP.threating.volatileVariables;

class A extends Thread {
	
	volatile int bound = 0;
//	int bound = 0;
	
	public void run() {
		while(bound <= 10) {
			System.out.println(Thread.currentThread().getName() + ";" + bound);
			++bound;
		}	
	}
	
}

class Execute {

	public static void main(String[] args) {
		A a = new A();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(a);
		t1.start();
		t2.start();
		while(a.bound < 10) {
			System.out.println(a.bound);
		}
	}
}
