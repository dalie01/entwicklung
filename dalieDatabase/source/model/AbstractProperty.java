/**
 * 
 */
package model;

import model.internal.DataUtils;

/**
 * @author DALiEWEB
 *
 */
public abstract class AbstractProperty {
	
	/**
	 * 	Constant used to access the Property Object with key 'Properties'
	 */
	public static final String PROPERTY_OBJECT_ID = "PROPERTIES";
	/**
	 * 	Constant used to access the Property Attribute with key 'Property.propertId'
	 */
	public static final String PROPERTY_PROPERTY_ID = "PropertId";
	/**
	 * 	Constant used to access the Property Attribute with key 'Property.countryId'
	 */
	public static final String PROPERTY_COUNTRY_ID = "CountryId";
	/**
	 * 	Constant used to access the Property Attribute with key 'Property.description'
	 */
	public static final String PROPERTY_DESCRIPTION = "Description";
	/**
	 * 	Constant used to access the Property Attribute with key 'Property.projectId'
	 */
	public static final String PROPERTY_PROJECT_ID = "ProjectId";
	/**
	 * 	Constant used to access the Property Attribute with key 'Property.releaseId'
	 */
	public static final String PROPERTY_RELEASE_ID = "ReleaseId";
	
	
	/** propertyId */
	private String propertId;
	/** countryId */
	private String countryId;
	/** description */
	private String description;
	/** projectId */
	private String projectId;
	/** releaseId */
	private String releaseId;
	/** dataUtils */
	private DataUtils dataUtils;
	
	/**
	 * Get PropertyId.
	 * @return propertyId
	 */
	public String getPropertId() {
		return propertId;
	}
	/**
	 * Set PropertyId.
	 * @param propertId propetyId
	 */
	public void setPropertId(String propertId) {
		this.propertId = propertId;
	}
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
	 * Get ProjectId.
	 * @return projectId
	 */
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	/**
	 * Get ReleaseId.
	 * @return releaseId
	 */
	public String getReleaseId() {
		return releaseId;
	}
	/**
	 * Set ReleaseId.
	 * @param releaseId releaseId
	 */
	public void setReleaseId(String releaseId) {
		this.releaseId = releaseId;
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
		return "Property [propertId=" + propertId + ", countryId="
				+ countryId + ", description=" + description + ", projectId="
				+ projectId + ", releaseId=" + releaseId + ", dataUtils="
				+ dataUtils + "]";
	}
	
} /* abstractProperty */
