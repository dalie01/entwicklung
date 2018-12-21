package dalieOCP.concurrency.forkJoinPool.recursiveTask;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class CalcSum extends RecursiveTask<Integer> {

	private int UNIT_SIZE = 15;
	private int[] values;
	private int startPos;
	private int endPos;

	public CalcSum(int[] values) {
		this(values, 0, values.length);
	}

	public CalcSum(int[] values, int startPos, int endPos) {
		this.values = values;
		this.startPos = startPos;
		this.endPos = endPos;
	}

	@Override
	protected Integer compute() {//For CalcSum, overridden method compute() returns an integer value.
		
		final int currentSize = endPos - startPos;
		if (currentSize <= UNIT_SIZE) {
			return computeSum();
		} else {
			int center = currentSize / 2;
			int leftEnd = startPos + center;
			CalcSum leftSum = new CalcSum(values, startPos, leftEnd);
			
			leftSum.fork();//Calling fork on leftSum makes it execute asynchronously.
			
			int rightStart = startPos + center + 1;
			CalcSum rightSum = new CalcSum(values, rightStart, endPos);
			
			/* leftSum.join waits until it returns a value; 
			 * compute is main computation  performed by task. */
			return (rightSum.compute() + leftSum.join()); //The join method returns the result of the computation when it is done
		}
	}

	private Integer computeSum() {
		int sum = 0;
		for (int i = startPos; i < endPos; i++) {
			sum += values[i];
		}
		System.out.println("Sum(" + startPos + "-" + endPos + "):" + sum);
		return sum;
	}

}

class Execute {

	public static void main(String[] args) {
		int[] intArray = new int[100];
		java.util.Random randomValues = new java.util.Random();
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = randomValues.nextInt(10);
		}
		
		ForkJoinPool pool = new ForkJoinPool();//Instantiates a ForkJoinPool.
		CalcSum calculator = new CalcSum(intArray);
		
		System.out.println(pool.invoke(calculator));//invoke() awaits  and obtains result
	}
	
	/*
	 * The compute() method must return a result. These results must be retrieved 
	 * from the newly created MyTask Instances and combined.
	 * A RecursiveTask is a recursive result-bearing ForkJoinTask.
	 * The invokeAll(ForkJoinTask<>... tasks) forks the given tasks, returning when isDone 
	 * holds for each task or an (unchecked) exception is encountered, in which case the exception is re thrown.
	 * Using the fork/join framework is simple. The first step is to write some code that performs a segment of the work.
	 * 
	 * Your code should look similar to this:
	 * if (my portion of the work is small enough)
	 *  do the work directly
	 * else
	 * 	split my work into two pieces
	 *  invoke the two pieces and wait for the results
	 *  Wrap this code as a ForkJoinTask subclass, typically as one of its more specialized types.
	 *  RecursiveTask(which can return a result) or RecursiveAction.
	 * 
	 * */
}
