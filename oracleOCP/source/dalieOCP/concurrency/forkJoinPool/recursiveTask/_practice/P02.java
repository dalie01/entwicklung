package dalieOCP.concurrency.forkJoinPool.recursiveTask._practice;

import java.util.concurrent.RecursiveTask;

class ComplicatedTask extends RecursiveTask<Integer>{ 
	int[] ia; int from; int to; static final int THRESHOLD = 3; 
	public ComplicatedTask(int[] ia, int from, int to){ 
		this.ia = ia;
		this.from = from; 
		this.to = to;
	}
	public int transform(int t){ 
		//this is a CPU intensive operation that
		//transforms t and returns the value 
		return 0;
	}
	
	protected Integer compute() { 
		if(from + THRESHOLD > to){ 
			int sum = 0; 
			for(int i = from; i<=to; i++){ 
				sum = sum+transform(ia[i]); 
			}
			return sum;
		} else { 
			int mid = (from+to)/2; 
			ComplicatedTask newtask1 = new ComplicatedTask(ia, from, mid); 
			ComplicatedTask newtask2 = new ComplicatedTask(ia, mid+1, to); 
			newtask2.fork(); 
			int x = newtask1.compute(); 
			int y = newtask2.join(); 
			return x+y;
		}
	} 
}




public class P02 {

}
