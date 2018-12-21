package dalieOCP.pattern.singleton.byEnum;

import java.util.HashMap;
import java.util.Map;

enum A {
	Instance;
	
	public Map<String,String> s = fillMap();
	public void aMethod() {}
	public void bMethod() {}
	
	static Map<String,String> fillMap() {
		System.out.println("fillMap");
		Map<String,String> s = new HashMap<>();
		s.put("1", new String("1"));
		s.put("2", new String("2"));
		return s;
	}
}

class Execute {
	
	public static void main(String[] args) {
		A.Instance.aMethod();
		A.Instance.bMethod();
		
		A a = A.Instance;
		A a1 = A.Instance;
		a.aMethod();
		
		System.out.println(a == a1);
		
		for(String s: a.s.values()) {
			System.out.println(s);
		}
	}
}
