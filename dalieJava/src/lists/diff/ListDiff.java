package lists.diff;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections.ListUtils;

/**
 * 
 * <a href="http://pleac.sourceforge.net/pleac_java/arrays.html">read up</a><br>
 * 
 * */
public class ListDiff {

	
	public static void main(String[] args) {
		
		String[] a = new String[] { "1", "3", "5", "6", "7", "8" };
		String[] b = new String[] { "2", "3", "5", "7", "9" };
		
		List<?> diff = ListUtils.subtract(Arrays.asList(a), Arrays.asList(b));
		
		assert (Arrays.equals(diff.toArray(), new String[] { "1", "6", "8" })) : "bad";
		
		System.out.println(diff);
		
	} /* main */
	
} /* class ListDiff */
