package model;

import model.internal.DataUtils;

public class AbstractPostalCode {

	/** postalId */
	private String postalId;
	/** countryId */
	private String countryId;
	/** stateId */
	private String stateId;
	/** cityId */
	private String cityId;
	/** postalCode */
	private String postalCode;
	/** dataUtil */
	private DataUtils dataUtils;
	
	/**
	 * Get postalId.
	 * @return postalId 
	 */
	public String getPostalId() {
		return postalId;
	}

	/**
	 * Set postalId.
	 * @param postalId postalId
	 */
	public void setPostalId(String postalId) {
		this.postalId = postalId;
	}

	/**
	 * Get CountryId
	 * @return countryId
	 */
	public String getCountryId() {
		return countryId;
	}

	/**
	 * Set countryId
	 * @param countryId countrId
	 */
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	/**
	 * Set stateId.
	 * @return stateId
	 */
	public String getStateId() {
		return stateId;
	}

	/**
	 * Set stateId.
	 * @param stateId stateId
	 */
	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	/**
	 * Get cityId
	 * @return cityId
	 */
	public String getCityId() {
		return cityId;
	}

	/**
	 * Set cityId.
	 * @param cityId cityId
	 */
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	/**
	 * Get postalCode.
	 * @return postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * Set postalCode.
	 * @param postalCode postalCode
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
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
		return "PostalCode [postalId=" + postalId + ", countryId="
				+ countryId + ", stateId=" + stateId + ", cityId=" + cityId
				+ ", postalCode=" + postalCode + ", dataUtils=" + dataUtils
				+ "]";
	}

} /* AbstractPostalCode */
