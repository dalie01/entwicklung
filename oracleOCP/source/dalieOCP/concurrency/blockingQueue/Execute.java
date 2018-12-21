package dalieOCP.concurrency.blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Request{
	int iD = 0;
	Request(int i){
		iD = i;
	}
}

class Client implements Runnable {
	
	private BlockingQueue<Request> queue;
	
	Client(BlockingQueue<Request> queue) {
		this.queue = queue;
	}
	
	
	public void run() {
		Request req = null;
		try {
//			while(true) {
			for(int i = 0; i < 10; i++) {
				req = new Request(i);
				queue.put(req);
				System.out.println("Client added request - " + req.iD);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void addRequest(Request reg) {
		try {
			queue.put(reg);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Server extends Thread {
	
	private BlockingQueue<Request> queue;
	private volatile boolean running = true;
	
	Server(BlockingQueue<Request> queue) {
		this.queue = queue;
	}
	
	
	public void run() {
		try {
			while(running){
				/*
				 * queue.take() 
				 * Retrieves and removes the head of this queue, 
				 * waiting if necessary until an element becomes available.
				 * */
				
				System.out.println("Server processing - " + queue.take().iD);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void terminate(){
		running = false;
	}
}

class Execute {

	public static void main(String[] args) {
		
		/*
		 * LinkedBlockingQueue and ArrayBlockingQueue
		 * are concrete implementations of the BlockingQueue interface
		 * */
		
		BlockingQueue<Request> queue = new ArrayBlockingQueue<Request>(1);//constructor define initial capacity
		Client client = new Client(queue);
		Server server = new Server(queue);
		
		new Thread(client).start();
		new Thread(server).start();
//		Thread task = new Thread(server);
//		Server server = new Server(queue);
//		server.start();
//		client.addRequest(new Request());
//		client.addRequest(new Request());
//		client.addRequest(new Request());
//		try {Server.sleep(1000);} catch (InterruptedException e){e.printStackTrace();}
//		server.terminate();
	}
}
