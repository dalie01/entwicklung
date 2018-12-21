package dalieOCP.threating._practics;

final class P08 extends Thread {
	
	public void run() {
		System.out.println("starting");
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("ende");
	}

	public static void main(String[] args) throws Exception {
		P08 p08 = new P08();
		p08.start();
		Thread.sleep(1000);
		p08.interrupt();
	}
}