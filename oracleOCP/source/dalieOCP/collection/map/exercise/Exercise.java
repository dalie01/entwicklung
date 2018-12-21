package dalieOCP.collection.map.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Exercise {

	enum Cream {CHOCLOATE,WALNUT};
	
	public static void main(String[] args) {
		Map<String, Double> salaryMap = new HashMap<>();
		salaryMap.put("Paul", 8888.8);
		salaryMap.put("Shreya", 99999.9);
		
		/*
		 * You can create a HashMap by passing its constructor 
		 * another Map object 
		 * */
//		Map<Object, String> copySalaryMap = new HashMap<>(salaryMap);//check here Type Match 
		Map<String, Double> copySalaryMap = new HashMap<>(salaryMap);

		Set<String> keys = copySalaryMap.keySet();
		for (String k : keys)
			System.out.println(k);
		
		salaryMap.remove("Paul");//it’s not removed from copy-SalaryMap:
		
		keys = copySalaryMap.keySet();
		for (String k : keys)
			System.out.println(k);
		
		@SuppressWarnings("rawtypes")
		Map<String, List> iceCream = new HashMap<>();//List without generics get waring but compile is possible.
		List<Cream> list = new ArrayList<>();
		list.add(Cream.CHOCLOATE);
		list.add(Cream.WALNUT);
		
		iceCream.put("1", list);
		System.out.println(iceCream.get("1"));//prints [CHOCLOATE, WALNUT]
	}
}
