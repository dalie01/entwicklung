package hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Class just for Demo of Map.
 * */
public class ForMap {

	/**main: start*/
	public static void main(String[] args) {
		
		Map<String, String> mapForDemo = new HashMap<String, String>();
		mapForDemo.put("Hello", "World");
		mapForDemo.put("Demo", "in dealing with Map");
		
		for( Map.Entry<String, String> entry : mapForDemo.entrySet() ) {
			
			String key = entry.getKey();
			String value = entry.getValue();
	
			System.out.println(key + "," + value );
			
		} /* for entry */
	
		System.out.println("containsKey: " + mapForDemo.containsKey("Demo"));
		System.out.println("containsValue: " + mapForDemo.containsValue("World"));

		Collection<String> string = mapForDemo.values();
		
		for (String argum : string) {
			System.out.println("argum is: " + argum);
		} /* for argum */
		
	} /* main */
	
} /* class ForMap */
