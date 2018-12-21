package lists.union;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.collections.ListUtils;

public class ListUnion {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		String[] a = new String[] { "1", "3", "5", "6", "7", "8" };
		String[] b = new String[] { "2", "3", "5", "7", "9" };
		
			
		List<String> union = ListUtils.union(Arrays.asList(a), Arrays.asList(b));
		Set<String> unionUnique = new TreeSet<String>(union);
		assert Arrays.equals(unionUnique.toArray(),new String[] { "1", "2", "3", "5", "6", "7", "8", "9" });
		
	} /* main */
	
} /* ListUnion */
