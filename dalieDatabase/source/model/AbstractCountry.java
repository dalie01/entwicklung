package model;

import model.internal.DataUtils;

public abstract class AbstractCountry {
	
	/** countryId */
	private String countryId;
	/** description */
	private String description;
	/** dataUtils */
	private DataUtils dataUtils;
	
	/**
	 * Get CountryId.
	 * @return countryId 
	 */
	public String getCountryId() {
		return countryId;
	}
	/**
	 * Set CountryId.
	 * @param countryId countryId
	 */
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	} 
	/**
	 * Get Description.
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * Set Description.
	 * @param desc description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Get DataUtils.
	 * @return dataUtils dataUtils
	 */
	public DataUtils getDataUtils() {
		return dataUtils;
	}
	/**
	 * Set DataUtils.
	 * @param dataUtils dataUtils
	 */
	public void setDataUtils(DataUtils dataUtils) {
		this.dataUtils = dataUtils;
	}
	
	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", description="
				+ description + ", dataUtils=" + dataUtils + "]";
	}
	
	
} /* AbstractCountry */
