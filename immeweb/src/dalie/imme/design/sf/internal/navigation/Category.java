package dalie.imme.design.sf.internal.navigation;


import java.util.HashMap;
import java.util.Map;

/**
 * Translate between Page and Category description.
 * @author DV0101
 * 	
 */
public enum Category {
	Start,Geschichte,Idee,Produkte,Kontakt;
	
	/**
	 * lookup to store Categories.
	 */
	private static final Map<String, Category> lookup = 
				new HashMap<String, Category>();

	static {
	     lookup.put("START", Category.Start);
	     lookup.put("HISTORY", Category.Geschichte);
	     lookup.put("CONCEPT", Category.Idee);
	     lookup.put("PRODUCT", Category.Produkte);
	     lookup.put("CONCEPT", Category.Idee);
	     lookup.put("CONTACT", Category.Kontakt);
	}

	/**
	 * @param category to convert
	 * @return {@link Category}
	 */
	public static Category fromOrdinal(String category) {
		    return lookup.get(category);
	}

}
