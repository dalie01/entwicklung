package lists.intersection;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections.ListUtils;

public class ListIntersection {

	public static void main(String[] args) {
		String[] a = new String[] { "1", "3", "5", "6", "7", "8" };
		String[] b = new String[] { "2", "3", "5", "7", "9" };
		
		List<?> intersection = ListUtils.intersection(Arrays.asList(a), Arrays.asList(b));
		assert Arrays.equals(intersection.toArray(), new String[] { "3", "5", "7" });
		
	} /* main */
	
} /* class ListIntersection */
