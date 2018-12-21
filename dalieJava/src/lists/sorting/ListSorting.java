package lists.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorting {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		String[] names = new String[] { "bill", "jack", "charles", "jim", "mike" };

		/* Build a custom comparator to sort 
		 * names by length and alphabetically */
		Comparator custom = new Comparator() {
		    @Override
			public int compare(Object o1, Object o2) {
		        String s1 = (String) o1;
		        String s2 = (String) o2;
		        
		        int diff = s1.length() - s2.length();
		        if (diff == 0) {
		            diff = s1.compareTo(s2);
		        }
		        return diff;
		    }
		};

		/* Sorting list of String with custom comparator */
		List<String> list = Arrays.asList(names);
		
		Collections.sort(list, custom);
		
		assert Arrays.equals(list.toArray(), new String[] { "jim", "bill", "jack", "mike", "charles" });
		
		System.out.println(list);
		
	} /* main */
	
} /* class ListSorting */
