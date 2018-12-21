package lists.find;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;

public class FindElementsInList {

	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("bill");
		names.add("jack");
		names.add("charles");
		names.add("jim");
		names.add("mike");
		
		Predicate jFinder = new Predicate() {
		  @Override
		public boolean evaluate(Object name) {
		    return name.toString().charAt(0) == 'j';
		  }
		};

		// Find all names that starts with 'j'
		Collection<?> selected = CollectionUtils.select(names, jFinder);
		System.out.println(compare(selected, new String[] { "jack", "jim" }));
		System.out.println(selected);
		
	} /* main */
	
	private static boolean compare(Collection<?> lst, String[] strs) {
	    Object[] array = lst.toArray();
	    
	    for (int i = 0; i < array.length; i++){

	      if(!strs[i].equals(array[i])) {
			return false;
	      }

	    }
	    
	    return true;
	}
} /* class FindElementsInList */
