package com.dalie.beehive.domain.capi;

public interface Domain {

	/**
	 * Get Domain Name.
	 * @return name of Domain
	 */
	public String getName();

	/**
	 * Set Domain Name.
	 * @param name to Domain
	 */
	public void setName(final String name);

	/**
	 * Get Domain Id.
	 * @return id of Domain.
	 */
	public String getId();

	/**
	 * Set Domain Id.
	 * @param id to Domain.
	 */
	public void setId(String id);
	
	public boolean isApplicationDomain();
	
	public boolean isProductDomain();
	
	public boolean isConfigurationDomain();
} /* Domain */
