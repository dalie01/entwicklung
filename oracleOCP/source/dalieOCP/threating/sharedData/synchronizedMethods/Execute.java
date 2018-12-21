package dalieOCP.threating.sharedData.synchronizedMethods;

class A {
	int i;
	
	A() {
		this.i = 0;
	}

	public synchronized void increment() {
		i += 17;
		System.out.println(i);
	}

	public synchronized void decrement() {
		i += 15;
		System.out.println(i);
	}
}

class AHandler {
	
	A a;
	
	AHandler(A a){
		this.a = a;
	}
	
	Runnable increment = new Runnable() {
		public void run() {
			a.increment();
		}
	};

	Runnable decrement = new Runnable() {
		public void run() {
			a.decrement();
		}
	};
}

class Execute {

	public static void main(String[] args) throws InterruptedException {
		AHandler cH = new AHandler(new A());
		Thread t1 = new Thread(cH.increment);
		Thread t2 = new Thread(cH.decrement);
		t1.start();
		t2.start();
		System.out.println(cH.a.i);
		
	}
}
