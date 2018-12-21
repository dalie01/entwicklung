package dalieOCP.threating._practics;


class A4 implements Runnable {
	String name = "Joe";
	
	public void run() {
//		System.out.println("1" + name);
		synchronized (this) {
			System.out.println("2" + name);
		}
	}
	
}

final class P04 {

	public static void main(String[] args) {
		A4 a4 = new A4();
		Thread th = new Thread(a4);
		
		synchronized(a4) {
			try {
				th.start();
				Thread.sleep(1000);
				System.out.println(a4.name = "Pop");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
