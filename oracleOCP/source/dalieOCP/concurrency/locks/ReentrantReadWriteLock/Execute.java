package dalieOCP.concurrency.locks.ReentrantReadWriteLock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class A {

	private final ReadWriteLock myLock = new ReentrantReadWriteLock(); //ReentrantReadWriteLock
	private static int pos;
	static Map<Integer, String> colors = new HashMap<>();

	public void addColor(String newColor) {
		myLock.writeLock().lock();//myLock.writeLock() returns writeLock and lock acquires a lock on it.
		try {
			colors.put(new Integer(++pos), newColor);
		} finally {
			myLock.writeLock().unlock();//Unlock writeLock
		}
	}

	public void display() {
		myLock.readLock().lock(); //myLock.readLock() returns readLock and lock acquires a lock on it.
		try {
			for (String s : colors.values()) {
				System.out.println(s);
			}
		} finally {
			myLock.readLock().unlock();//Unlock readLock.
		}
	}
}

class Execute {

}
