package model;

import java.util.Map;

public abstract class AbstractSessionInfo {

	/** SessionID */
	private String sessionID;
	/** DomainID */
	private String domainID;
	/** UserID */
	private String userID;
	/** AuthenticationState */
	private Boolean authenticationState;
	
	/** Language */
	private String language;
	/** Currency */
	private String currency;
	/** Dictionary */
	private Map<?, ?> dictionary;
	/** Expires */
	private Float expires;
	
	/**
	 * Returns the value of attribute 'sessionID'.
	 * @return the value of the attribute 'sessionID'
	 */
	public String getSessionID() {
		return sessionID;
	}

	/**
	 * Set the Value of the attribute 'sessionID'.
	 * @param sessionID the new value of the attribute
	 */
	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}

	/**
	 * Returns the value of attribute 'domainID'.
	 * @return the value of the attribute 'domainID'
	 */
	public String getDomainID() {
		return domainID;
	}

	/**
	 * Set the Value of the attribute 'domainID'.
	 * @param domainID the new value of the attribute
	 */
	public void setDomainID(String domainID) {
		this.domainID = domainID;
	}

	/**
	 * Returns the value of attribute 'userID'.
	 * @return the value of the attribute 'userID'
	 */
	public String getUserID() {
		return userID;
	}
	
	/**
	 * Set the Value of the attribute 'userID'.
	 * @param userID the new value of the attribute
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}

	/**
	 * Returns the value of attribute 'authenticationState'.
	 * @return the value of the attribute 'authenticationState'
	 */
	public Boolean getAuthenticationState() {
		return authenticationState;
	}
	
	/**
	 * Set the Value of the attribute 'authenticationState'.
	 * @param authenticationState the new value of the attribute
	 */
	public void setAuthenticationState(Boolean authenticationState) {
		this.authenticationState = authenticationState;
	}

	/**
	 * Returns the value of attribute 'language'.
	 * @return the value of the attribute 'language'
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Set the Value of the attribute 'language'.
	 * @param language the new value of the attribute
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * Returns the value of attribute 'currency'.
	 * @return the value of the attribute 'currency'
	 */
	public String getCurrency() {
		return currency;
	}
	
	/**
	 * Set the Value of the attribute 'currency'.
	 * @param currency the new value of the attribute
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * Returns the value of attribute 'dictionary'.
	 * @return the value of the attribute 'dictionary'
	 */
	public Map<?, ?> getDictionary() {
		return dictionary;
	}
	
	/**
	 * Set the Value of the attribute 'dictionary'.
	 * @param dictionary the new value of the attribute
	 */
	public void setDictionary(Map<?, ?> dictionary) {
		this.dictionary = dictionary;
	}

	/**
	 * Returns the value of attribute 'expires'.
	 * @return the value of the attribute 'expires'
	 */
	public Float getExpires() {
		return expires;
	}
	
	/**
	 * Set the Value of the attribute 'expires'.
	 * @param expires the new value of the attribute
	 */
	public void setExpires(Float expires) {
		this.expires = expires;
	}


	@Override
	public String toString() {
		return "AbstractSessionInfo [sessionID=" + sessionID + ", domainID=" + domainID + ", userID=" + userID
				+ ", authenticationState=" + authenticationState + ", language=" + language + ", currency=" + currency
				+ ", dictionary=" + dictionary + ", expires=" + expires + "]";
	}
}
