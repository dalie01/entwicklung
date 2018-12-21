package com.dalie.beehive.localization.internal;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

import com.dalie.beehive.domain.capi.Domain;
import com.dalie.beehive.localization.exception.LocalizationExecutionException;

/**
 * LocalizationResources.
 * 
 * @author DALiEWEB
 *
 */
public class LocalizationResources {

	/**
	 * bundelesForLocal: is Loaded from resources.
	 */
	private final Map<Locale, Map<String, String>> bundelLocal 
		= new HashMap<Locale, Map<String, String>>();
	
	private final Domain domain;
	
	public LocalizationResources(final Domain domain) {
		this.domain = domain;
	}
	
	/**
	 * 
	 * @param local Identifier
	 * @param key	Key value
	 * @return value String
	 */
	public String getString(final Locale local, final String key) 
			throws Exception {
		
		Map<String, String> bundle;
		String value = null;
		
		bundle = bundelLocal.get(local);
		
		if (bundle == null) {
			
			synchronized (this) {
			
				if (!bundelLocal.containsKey(local)) {
					
					bundle = getBundleForDomain(local);
					bundelLocal.put(local, bundle);
				} else {
			
					bundle = bundelLocal.get(local);
				}	
			
			}
			
		} 
		
		value = bundle.get(key);
		if (value == null) {
			value = "'" + key + "'";
		}
		
		return value;
		
	}
	
	/**
	 * Get a resource bundle for the given locale using the domain
	 * to lookup the bundle.
	 * 
	 * @param locale The locale for which the ResourceBundle 
	 * 			should be retrieved.
	 * 
	 * @return A ResourceBundle for the given locale in the given domain
	 * @throws Exception
	 */
	private Map<String, String> getBundleForDomain(final Locale locale) 
				throws LocalizationExecutionException {

		Map<String, String> result = new HashMap<String, String>();

		String dName = domain.getName();
		String bundlePath = null;
			
		try {
			bundlePath = "resources." + dName + ".localization.LocalizedStrings";
			ResourceBundle tmp = 
					ResourceBundle.getBundle(bundlePath, locale, new UTF8Control());
			for (String key : tmp.keySet()) {
				result.put(key, tmp.getString(key));
			}

		} catch (Exception e) {

			System.out.println("No Resource Bundle: " + bundlePath + " locale " 
					+ locale.toString() + " could be found. ");

		} finally {
			/* clear the ResourceBundleCache after loading the properties */
			ResourceBundle.clearCache();
		}

		if (result == null || result.isEmpty()) {
			throw new LocalizationExecutionException(
					"No resource bundle could be found for local "
					+  locale.toString());
		}

		return result;

	} /* getBundleForDomain */
	
	
	
} /* LocalizationResources */
