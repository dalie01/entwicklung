package dalieOCP.concurrency.executor._practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class P03 implements Runnable {
	ConcurrentHashMap<Integer, String> map;
	private int key; 
	String value;

	P03(ConcurrentHashMap<Integer, String> map, int key, String value) {
		this.map = map;
		this.key = key;
		this.value = value;
	}

	@Override
	public void run() {
		try {
			map.put(key, value);
			System.out.format("Thread %s includes key %d value %s current size %d %n", Thread.currentThread().getName(), key, value, map.size());
		} catch (Exception e) {
			System.out.format("%s %n", e.getMessage());
		}
	}

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
		ExecutorService ex = Executors.newFixedThreadPool(2);
		try {
			for (int i = 0; i < 10; i++) {
				ex.submit(new P03(map,i,Integer.toString(i)));
			}
		} finally {
			ex.shutdown();
		}
		
		try {
			ex.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			System.out.format("%s %n", e.getMessage());
			
		}
		List<Integer> sortedMap = new ArrayList<>(map.keySet());
		Collections.sort(sortedMap);
		for (int s : sortedMap) {
			System.out.format("%d,%s %n",s,map.get(s));
		}
		System.out.format("count %d %n", map.size());
	}

}
