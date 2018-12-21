package dalieOCP.threating.notify;

class A extends Thread  {
	Object o;

	public A(Object o) {
		this.o = o;
	}
	
	public void run() {
		System.out.println("A.run");
		
		synchronized(o) {
			System.out.println("o = " + o.hashCode());
			o.notifyAll();
		}
	}
}

class B extends Thread {

	Object o;

	public B(Object o) {
		this.o = o;
	}

	public void run() {

		synchronized (o) {
			System.out.println("B.run");
			try {
				o.wait(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Ready");
		}
	}

}
	


class Execute {

	public static void main(String[] args) {
		Object o = new Object();
		
		A a = new A(o);
		B b = new B(o);
				
		
//		try {
		b.start();
		a.start();
//			b.join();
//			b.start();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
	}
	
}

