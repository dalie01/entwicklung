package dalieOCP.concurrency.concurrentMap;

import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

class Execute {

	public static void main(String[] args) {
		ConcurrentMap<Integer, String> aMap = new ConcurrentHashMap<>();
		
		aMap.putIfAbsent(5, "Hello");
		aMap.replace(5, "World");//Atomic operation replaces value in map if corresponding key is present
		for(String s: aMap.values()) {
			System.out.println(s);
		}
//		aMap.remove(5);//Atomic operation
		for(Entry<Integer, String> e: aMap.entrySet()) {
			Integer key = e.getKey();
			String value = e.getValue();
			System.out.format("%2$s %1$+10d", key, value);
		}
	}
}
