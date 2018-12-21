package array.finding;

import java.util.Arrays;
import java.util.Collection;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;

/**
 * Demo for use find elements in Array.
 */
public class findingElements {

	/**
	 * Method main.
	 * @param args String[]
	 */
	public static void main(String[] args) {
		
		String[] names = new String[] { "bill", "jack", "charles", "jim", "mike" };
		
		Predicate jFinder = new Predicate() {
		  @Override
		public boolean evaluate(Object name) {
		    return name.toString().charAt(0) == 'j';
		  }
		};

		/* Find all names that starts with 'j' */
		Collection<?> selected = CollectionUtils.select(Arrays.asList(names), jFinder);
		assert Arrays.equals(selected.toArray(), new String[] { "jack", "jim" });
		
		System.out.println(selected);
		
	} /* main */
	
} /* class findingElements */
