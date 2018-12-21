package array.contains;

import java.util.Arrays;

/**
 * Demo find String on ArrayList.
 * @author dalieuwe
 *
 */
public class ContainsElementByArray {

	/**
	 * just demo.
	 * @param args
	 */
	public static void main(String[] args) {
		
	    String[] error = {"202", "204", "207", "2636"};
	    
	    if (error.length > 0 &&
	    		Arrays.asList(error).contains("202")) {
	    	System.out.println("true");
        } else {
        	System.out.println("false");
        }
	    
	}

}
