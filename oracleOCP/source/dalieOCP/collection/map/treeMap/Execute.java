package dalieOCP.collection.map.treeMap;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

class Execute {

	enum ARGUM {ONE, TWO, THREE};
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
//		Map<String, String> map = new java.util.SortedMap<String, String>();// won't compile is an Interface
		SortedMap<ARGUM, String> sMap = new TreeMap<>();
		
		Map<ARGUM, String> aMap = new TreeMap<>();
		aMap.put(ARGUM.TWO, "Jena");
		aMap.put(ARGUM.ONE, "Auckland");
		
		/*
		 * The set of values that you retrieve from a TreeMap is sorted on its keys and not on its values.
		 * */
		for (String s : aMap.values())
			System.out.println(s);//prints Auckland,Jena
		/*
		 * The natural order of enum elements is the sequence in which they’re defined
		 * */
		for(ARGUM s : aMap.keySet())
			System.out.println(s);//prints ONE,TWO
		
	}
}
