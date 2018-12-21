package lists.sorting;

import java.util.ArrayList;
import java.util.List;

public class ListSortingByValue {

	public static void main(String[] args) {
		
		List<String> simCards = new ArrayList<String>();
		simCards.add("MINI");
		simCards.add("NANO");
		simCards.add("MICRO");
		
		List<String> sortSimCards = new ArrayList<String>();
		int indexList = 0;
		
		if (simCards.contains("MINI")) 
			sortSimCards.add(indexList++,"MINI");
		
		if (simCards.contains("MICRO")) 
			sortSimCards.add(indexList++, "MICRO");
		
		
		if (simCards.contains("NANO")) 
			sortSimCards.add(indexList++, "NANO");
		
		
		for (String string : sortSimCards) {
			System.out.println(string);
		}
		
	}
	
}
