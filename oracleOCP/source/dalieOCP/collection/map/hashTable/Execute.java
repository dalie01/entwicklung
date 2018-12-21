package dalieOCP.collection.map.hashTable;

import java.util.Hashtable;
import java.util.Map;

class Execute {

	public static void main(String[] args) {
		Map<String, String> ht = new Hashtable<>();
//		ht.put(null, null);//throw NullPointerException
//		ht.put("1", null);// also NullPointerException
		ht.put("1", "1");
		System.out.println(ht.size());//print 1
		
	}
}
