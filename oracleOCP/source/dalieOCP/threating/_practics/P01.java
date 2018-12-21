package dalieOCP.threating._practics;

final class P01 extends Thread implements Runnable {

	public void run(int n) {
		System.out.println("P01");
	}
	
	public static void main(String[] args) {
		/*
		 * calling the start() method will call the run() method of the Thread class. 
		 * */
		new P01().start();//So no output will be displayed. 
	}
}
