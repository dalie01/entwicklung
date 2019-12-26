package dalieOCP.concurrency.executor._practice;

import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class P03 {
	ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
	
	private void putToMap(String key, String value ) {
		try {
			map.wait();
			map.putIfAbsent(key, value);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ExecutorService ex = Executors.newFixedThreadPool(100);
		final P03 p = new P03();
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(p.map.size());
				ex.submit(new Runnable() {
					int x = p.map.size();
					@Override
					public void run() {
						p.putToMap(Integer.toString(x), Integer.toString(x));
					}
				});
			}
			
		} finally {
			ex.shutdown();
		}
		
		for (Entry<String, String> s : p.map.entrySet()) {
			System.out.println(s.getKey() + "," + s.getValue());
		}
	}
}
