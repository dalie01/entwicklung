package dalieOCP.collection.map.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

class Execute {

	public static void main(String[] args) {
		Map<String, Integer> linkedColorMap = new LinkedHashMap<>();
		linkedColorMap.put("Red", 1);
		linkedColorMap.put("Blue", 2);
		linkedColorMap.put("Yellow", 3);
		linkedColorMap.put("Orange", 5);
		linkedColorMap.put("Purple", 4);
		linkedColorMap.put(null, null);//is allowed
		linkedColorMap.put(null, 1);//is also allowed

		for (Integer i : linkedColorMap.values())//prints 1,2,3,5,4,1 in oder of insertion
			System.out.print(i);
	}
}
