package dalieOCP.concurrency.forkJoinPool.recursiveTask._practice;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;  

class P01 extends RecursiveTask<Integer>{ 
	static final int THRESHOLD = 3; 

	int[] ia; int from; int to; 
	
	public P01(int[] ia, int from, int to){ 
		this.ia = ia; 
		this.from = from; 
		this.to = to;
	} 
	public int transform(int t){
		//this can be a CPU intensive operation that       
		//transforms t and returns the value       
		//For now, just return t         
		return t;
	} 
		protected Integer compute() { 
			int sum = 0;
			if(from + THRESHOLD > to){ 
				for(int i = from; i<=to; i++){ 
					sum = sum+transform(ia[i]);
				}
			} else { 
				int mid = (from+to)/2; 
				P01 newtask1 = new P01(ia, from, mid); 
				P01 newtask2 = new P01(ia, mid+1, to); 
				newtask2.fork(); 
				sum = newtask1.compute()+newtask2.join(); 
			}
			
			return sum;
		} 
		
		public static void main(String[] args) { 
			int ia[] = new int[]{ 1, 2, 3, 4 , 5, 6, 7};
			ForkJoinPool fjp = new ForkJoinPool(); 
			P01 st = new P01(ia, 0, 6); 
			int sum = fjp.invoke(st);
			System.out.println("sum = "+sum);
		}
		
	}


