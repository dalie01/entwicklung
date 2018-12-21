package dalieOCP.threating.sharedData;

class A {
	String Id;
	int value;
	
	A(String Id) {
		this.Id = Id;
	}
	
//	void incrementValue(){//is not Thread safe
	synchronized void incrementValue() {
		/* if an object is visible to more than one thread, 
		 * all reads or writes to that object's variables 
		 * are done through synchronized methods.
		 * */
		++value;
	}
	
	void decrementValue() {
		--value;
	}
}

class Increment extends Thread {
	
	private A a;
	
	Increment(A a) {
		this.a = a;
	}
	
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		a.incrementValue();
		System.out.println(t.getName() + ", status = " + t.isAlive() +  ", value = " + a.value);
	}
	
}

class Decrement extends Thread {
	
	private A a;
	
	Decrement(A a) {
		this.a = a;
	}
	
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		a.decrementValue();
		System.out.println(t.getName() + ", status = " + t.isAlive() +  ", value = " + a.value);
	}
	
}

class Execute {
	
	public static void main(String[] args) {
		A value = new A("Salary");
		Thread increment = new Increment(value);
		Thread decrement = new Decrement(value);
		increment.start();//it will start multi Threads with one Object
		decrement.start();
		System.out.println("here" + value.value);
	}
}
