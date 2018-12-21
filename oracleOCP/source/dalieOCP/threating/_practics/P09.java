package dalieOCP.threating._practics;

final class P09 extends Thread {

	private static int threadcounter = 0;
	   public void run()
	   {
	      threadcounter++;
	      System.out.println(threadcounter);
	   }
	   
	   public static void main(String[] args) throws Exception
	   {
	      for(int i=0; i<10; i++)
	      {
	         synchronized(P09.class)
	         {
	            new P09().start();
	         }
	      }
	      System.out.println("thread_counter" + threadcounter);
	   }

}
