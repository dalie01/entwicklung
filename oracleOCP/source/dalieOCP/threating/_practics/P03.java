package dalieOCP.threating._practics;

final class P03 extends Thread implements Runnable {

	@SuppressWarnings("static-access")
	public void run() {
		System.out.println("1");
		this.yield();
		System.out.println("2");
	}
	
	public static void main(String[] args) {
		new P03().start();
	}
}
