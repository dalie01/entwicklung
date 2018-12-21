package com.dalie.beehive.localization.internal;

import java.util.Locale;

/**
 * LocalInformation all Information about Local
 * for an Application.
 *  
 * @author DALiEWEB
 * @since 1.0.0.0
 */
public class LocalInformation {

	private Locale locale;
	
	public LocalInformation(final Locale locale) {
		
		this.locale = locale;
	}
	
	/**
	 * Returns the value of attribute 'locale'.	
	 * @return the value of the attribute 'locale'
	 */
	public Locale getLocale() {
		return locale;
	}
	/**
	 * Set the Value of the attribute 'locale'.
	 * @param locale the new value of the attribute
	 */
	public void setLocale(final Locale locale) {
		
		this.locale = locale;
	}

	/**
	 * Returns the value of attribute 'languageId'.
	 * @return the value of the attribute 'languageId'
	 */
	public String getLanguageId() {
		return this.locale.getLanguage();
	}
	
	public String getAcceptLanguage(){
		return this.locale.getLanguage() + "-" + this.locale.getCountry();
	}
	
} /* LocalInformation */
