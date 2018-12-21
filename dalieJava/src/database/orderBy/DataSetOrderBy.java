package database.orderBy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * DataSetOrderBy a Object to get defined 
 * OrderValues.
 * 
 * */
public final class DataSetOrderBy {
	
	/** Map of orderArguments */
	private static Map<String, String[]> orderArguments;

	static {
		Map<String, String[]> temp = new HashMap<String, String[]>();
		temp.put("Address_default", new String[] {"adressId", "adressArt", "strasse"});
		orderArguments = Collections.unmodifiableMap(temp);
	}

	private DataSetOrderBy() {
	}

	/**
     * GetOrderValue for DataBaseConnection.
     * <br/>
     * @param String argument, boolean desc;
     * @return a String with order direction.
     *
	 * */
	public static String getOrderValue(String argum, boolean desc) {
		StringBuffer result = new StringBuffer();
		String[] temp = getOrderByValue(argum);
		if (temp != null) {
			result.append(temp[0]);
			for (int i = 1; i < temp.length; i++) {
				result.append(",");
				result.append(temp[i]);
			}// for
			return result.toString() + getOrderDirection(desc);
		}// endif
		return "";
	}//getOrderValue

	/**
    * GetOrderValue for DataBaseConnection.
    * <br/>
    * @param argum to find the order key.
    * @return a String with default order direction.
    *
	**/
	public static String getOrderValue(String argum) {
		StringBuffer result = new StringBuffer();
		String[] temp = getOrderByValue(argum);
		if (temp != null) {
			result.append(temp[0]);
			for (int i = 1; i < temp.length; i++) {
				result.append(",");
				result.append(temp[i]);
			}// for
			return result.toString();
		}// endif
		return "";
	}//getOrderValue

	
	private static String[] getOrderByValue(String argum) {
		if (argum == null) 
			return null;
	
		if (orderArguments.containsKey(argum) == true)
			return orderArguments.get(argum);

		return null;
	}// getOrderByValue

	private static String getOrderDirection(boolean desc) {
		if (!desc) 
			return " desc";
		
		return "";
	}//getOrderDirection
	
}// DataSetOrderBy
