package dalieOCP.concurrency.executor;

class Execute {

	/*
	 * java.util.concurrent.Executor is an interface that has only one method: 
	 * 	void execute(Runnable command)  
	 * 
	 * Java concurrent library has several implementations for this interface such as 
	 * 	ForkJoinPool, 
	 * 	ScheduledThreadPoolExecutor, and 
	 * 	ThreadPoolExecutor.  
	 * 
	 * As instance of an Executor is created using various static factory methods 
	 * of java.util.concurrent.Executors such as 
	 * 	newSingleThreadExecutor, 
	 * 	newFixedThreadPool and 
	 * 	newScheduledThreadPool.  
	 * 
	 * Thus, the number of threads used by an Executor instance depends on the class 
	 * of that instance and how that instance was created. 
	 * 
	 * For example, if an instance was created using 
	 * 	Executors.newSingleThreadExecutor(), only one thread will be created 
	 * but if it was created using 
	 *  Executors.newFixedThreadPool(5), five threads will be created.  
	 *  
	 *  Note: Most of the concrete classes that implement Executor, 
	 *  actually implement java.util.concurrent.ExecutorService interface. 
	 *  ExecutorService extends Executor.
	 * */
}
