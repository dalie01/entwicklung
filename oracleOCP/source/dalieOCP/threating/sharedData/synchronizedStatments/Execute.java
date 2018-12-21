package dalieOCP.threating.sharedData.synchronizedStatments;

class A extends Thread{
	int value = 0;
	
	/* defines objects that are used to
	 * execute synchronized statements
	 * */
	Object add = new Object(); 
	Object sub = new Object();
	
	public void add() {
		/* 
		 * a thread that executes line 17 must acquire a lock on the object add,
		 * before it can execute the synchronized statements 
		 * */
		synchronized(add) {
			++value;
		}
	}
	
	public void sub() {
		/* another thread can execute sub() method on the same A instance 
		 * because sub() and add() acquire locks on monitors of separate objects */
		synchronized(sub) { 
			--value;
		}
	}
}

class Execute {

	public static void main(String[] args) {
		Thread t1 = new A();
		Thread t2 = new A();
		t1.start();
		t2.start();
	}
}
