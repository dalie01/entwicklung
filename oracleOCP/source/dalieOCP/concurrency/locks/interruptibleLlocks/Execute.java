package dalieOCP.concurrency.locks.interruptibleLlocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Bus {
	Lock lock = new ReentrantLock();
	
	public void boardBus(String name) {
		System.out.println(name + ": boarded");
	}
}

class Employee extends Thread {
	Bus bus;
	String name;
	
	Employee(String name, Bus bus) {
		this.bus = bus;
		this.name = name;
	}
	public void run() {
		try {
			bus.lock.lockInterruptibly();//Try to acquire lock while being available for interruption
			
			try { //If lock acquired, execute required code
				bus.boardBus(name); 
			} finally {
				bus.lock.unlock(); //Release acquired lock in finally block.
			}
		} catch(InterruptedException e) { //Define action if thread is e interrupted
			System.out.println(name + ": Interrupted!!");
			Thread.currentThread().interrupt();
		}
	}
}

class Execute {

	public static void main(String args[]) {
		Bus bus = new Bus();
		Employee e1 = new Employee("Paul", bus);
		e1.start(); //Start thread e1
		e1.interrupt();//Interrupt thread e1
		Employee e2 = new Employee("Shreya", bus);
		e2.start();
	}
}
