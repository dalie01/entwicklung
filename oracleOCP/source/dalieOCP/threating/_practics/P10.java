package dalieOCP.threating._practics;

final class P10 extends Thread {

	private static Object gatekeeper = new Object();
	private boolean isReader = false;

	public P10(boolean isReader) {
		this.isReader = isReader;
	}

	public void run() {
		synchronized (gatekeeper) {
			try {
				if (isReader) {
					gatekeeper.wait();
					System.out.println("Waiting over"); // 1
					
				} else {
					System.out.println("Never waited");
					gatekeeper.notifyAll();
					/*
					 * Which of the following options can inserted at here so that "Waiting over" 
					 * is printed assuming that gatekeeper.wait() 
					 * is executed by the first thread before the second thread is started.
					 * */
				}
			} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new P10(true).start();
		new P10(false).start();
	}

}
