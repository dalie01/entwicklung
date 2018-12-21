package dalieOCP.threating.sharedData._pratice;

final class P01 {

	public synchronized void lockedByThis() {
		System.out.println(" This synchronized method is locked"
				+ " by current instance of object i.e. this");
	}
	
	public static synchronized void lockedByClassLock() {
        System.out.println("This static synchronized method is locked"
        			+ "	by class level lock of this class i.e. P01.class");
    }

	/*
	 * Synchronized block generally reduce scope of lock. As scope of lock is 
	 * inversely proportional to performance, its always better to lock only critical section of code.
	 * */
	public void lockedBySynchronizedBlock() {
        System.err.println("This line is executed without locking");
     
        Object obj = String.class; //class level lock of Stirn class
     
        synchronized(obj){
            System.out.println("synchronized block, locked by lock represented using obj variable");
        }
    }
}
