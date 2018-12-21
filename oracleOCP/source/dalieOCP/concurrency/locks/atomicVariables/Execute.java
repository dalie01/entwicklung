package dalieOCP.concurrency.locks.atomicVariables;

import java.util.concurrent.atomic.AtomicInteger;

class A {
	/*
	 * Method incrementAndGet() returns the updated value but
	 * method AtomicInteger’s getAndIncrement() returns the previous value.
	 * 
	 * Class AtomicInteger defines method compareAndSet() but 
	 * not method setAndCompare().
	 * 
	 * The java.util.concurrent.atomic package doesn’t define
	 * classes by the names AtomicShort, AtomicByte, AtomicFloat, or 
	 * Atomic-Double. These invalid class names might be used on the exam.
	 * 
	 * */
	
	String title;
//	int copiesSold = 0;
	AtomicInteger copiesSold = new AtomicInteger(0);
	A(String title) {
		this.title = title;
	}

	public void newSale() {
		/*
		 * Non atomic statements include loading
		 * of variable values from memory to
		 * registers, manipulating values, and loading them back to memory.
		 * */
//		++copiesSold; 
		copiesSold.incrementAndGet();
	}

	public void returnBook() {
//		--copiesSold;
		copiesSold.decrementAndGet();
	}
}

class Execute {

}
