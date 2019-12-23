package dalieOCP.concurrency.executor._practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class P01 {

	private static final int THREADS = 5;

	public static void main(String[] args) {
		ExecutorService ex = Executors.newFixedThreadPool(THREADS);
		String[] hostList = {"http://yahoo.com", "http://www.ebay.com", "http://google.com",
				"http://www.example.co", "https://paypal.com", "http://bing.com/", "http://techcrunch.com/", "http://mashable.com/",
				"http://thenextweb.com/", "http://wordpress.com/", "http://wordpress.org/", "http://example.com/", "http://sjsu.edu/",
				"http://ebay.co.uk/", "http://google.co.uk/", "http://wikipedia.org/", "http://en.wikipedia.org" };
		for (int i = 0; i < hostList.length; i++) {
 
			String url = hostList[i];
			Runnable worker = new MyTread(url);
			ex.execute(worker);
		}
		ex.shutdown();
		// Wait until all threads are finish
		while (!ex.isTerminated()) {
		}
		
		System.out.println("\nFinished all threads");
		
		
	}
	
	
	static class MyTread implements Runnable {
		private final String url;
		
		public MyTread(String url) {
			this.url = url;
		}
		
		@Override
		public void run() {
			StringBuffer result = new StringBuffer("->");
			int code = 200;
			try {
				URL siteURL = new URL(url);
				HttpURLConnection connection = (HttpURLConnection) siteURL.openConnection();
				connection.setRequestMethod("GET");
				connection.setConnectTimeout(3000);
				connection.connect();
 
				code = connection.getResponseCode();
				
				if (code == 200) {
					result.append(" Green <-\t" + "Code: " + code);
					;
				} else {
					result.append(" Yellow <-\t" + "Code: " + code);
				}
				
			} catch (Exception e) {
				result.append(" Red <-\t Wrong domain - Exception" + e.getMessage());
			}
			
			System.out.println(url + "\t\tStatus:" + result.toString());
		}
		
	}
}
