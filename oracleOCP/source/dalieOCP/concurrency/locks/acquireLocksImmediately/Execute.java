package dalieOCP.concurrency.locks.acquireLocksImmediately;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Inventory {
	
	int inStock; String name;
	
	Lock lock = new ReentrantLock();
	
	Inventory(String name){
		this.name = name;
	}
	
	public void stockIn(long qty) {
		inStock += qty;
	}

	public void stockOut(long qty) {
		inStock -= qty;
	}
}


class Shipment extends Thread {
	
	Inventory loc1, loc2; int qty;
	
	Shipment(Inventory loc1, Inventory loc2, int qty) {
		this.loc1 = loc1;
		this.loc2 = loc2;
		this.qty = qty;
	}
	
	public void run() {
//		synchronized (loc1) {// they might deadlock
//			synchronized (loc1) {
		
		if (loc1.lock.tryLock()) { // loc1.lock.tryLock() tries to acquire a lock on object loc1.lock 
								   // and returns immediately.
			
			if (loc2.lock.tryLock()) {//also loc2
				
				loc2.stockOut(qty); //ensuring that no other thread is modifying these objects. With
				//explicit locks, Shipment can acquire a lock on object lock, which is defined as an
				//instance member of class Inventory.
				loc1.stockIn(qty);
				
				System.out.println(loc1.inStock + "" + loc2.inStock);
				loc2.lock.unlock();
				loc1.lock.unlock();
				
			} else 
				System.out.println("Locking false:" + loc2.name);
		} else 
			//If lock couldn’t be acquired, outputs appropriate messages
			System.out.println("Locking false:" + loc1.name);
	}
}

class Execute {

//	Watch out for the use of methods acquire(), acquireLock(),
//	release(), and releaseLock() on the exam. None of these is a valid
//	method. Because the terms acquire and release are used to discuss methods
//	lock(), unlock(), tryLock(), lockInterruptibly() and newCondition(), these terms
//	might be used on the exam to confuse you.
	
	public static void main(String[] args) {
		
		Inventory loc1 = new Inventory("Seattle"); loc1.inStock = 100;
		Inventory loc2 = new Inventory("LA"); loc2.inStock = 200;
		Shipment s1 = new Shipment(loc1, loc2, 1);
		Shipment s2 = new Shipment(loc2, loc1, 10);
		s1.start();
		s2.start();
	}
}
