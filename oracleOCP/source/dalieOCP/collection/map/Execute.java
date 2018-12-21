package dalieOCP.collection.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Execute {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Map<String,String> m1 = new HashMap<>();
		m1.put("1", "Hello");
		m1.put("2", "World");
		m1.put("1", "Hello World");//Hello will be removed
		m1.put(null, null);//null as key is allowed
		m1.put(null, "NULL");//null as key is allowed only one no duplicates
		
		System.out.println(m1.size());
		
		for (String k : m1.keySet()) { //returns a Set
			System.out.println(m1.get(k));
		}
		
		for (String v : m1.values())//returns a Collection
			System.out.println(v);
		
		for (Map.Entry<String, String> eSet : m1.entrySet())//returns Map.Entry Object
			System.out.println(eSet.getKey() + ";"  + eSet.getValue());
			
		System.out.println(m1.containsKey(1));//false check by HashCode & equals
		System.out.println(m1.containsKey("1"));//true
		System.out.println(m1.containsValue(null));//false
		System.out.println("here" + m1.containsValue("World"));//true uses method only equals()
		System.out.println(m1.get("1"));//Hello World check by HashCode & equals
		System.out.println(m1.get(null));//"NULL"
		
		System.out.println(m1.remove(null));//prints NULL and removed
		System.out.println(m1.remove(null));//prints null Method remove() can return a null value
		
		/*
		 * String and all Wrapper classes override 
		 * their hashCode() and equals() methods.
		 * */
		
		
//		Map<String, List<Double>> m2 =
//				new HashMap<String, ArrayList<Double>>();//want's compile
		Map<String, List<Double>> m3 = new HashMap<>();
		Map<String, List<Double>> m4 = new HashMap<String, List<Double>>();
		
		Map<A,A> aMap = new HashMap<>();
		aMap.put(new A("1"), new A("2"));
		System.out.println(aMap.get(new A("1")));//prints null no hashCode an equals
		
		Map<B,B> bMap = new HashMap<>();
		bMap.put(new B("1"), new B("2"));
		System.out.println(bMap.get(new B("1")));//prints B@51 has hashCode an equals
	}
}

class A {
	String id;
	
	A(String id){
		this.id = id;
	}
}

class B {
	String id;
	
	B(String id){
		this.id = id;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof B)
			return this.id.equals(((B)o).id);
		return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

}