package mobile.internal.property;

import java.io.Serializable;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import mobile.utilities.model.Form;
import mobile.utilities.support.RegSupporter;
import model.internal.property.Property;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @author DALiEWEB
 *
 */
public class FormProperty extends Form implements Comparable<FormProperty>, Serializable {

	/**
	 * 	Constant used to access the Property Attribute with key 'WebFromIsSubmitted'
	 */
	public static final String WEBFORM_SUBMITTED = "WebFormIsSubmitted";
	/**
	 * 	Constant used to access the Property Attribute with key 'WebFromIsCleared'
	 */
	public static final String PROPERTY_CLEARED = "WebFromIsCleared";
	/**
	 * Constant used to access the pipeline dictionary with key 'Property'
	 */
	public static final String DN_IN_PROPERTY = "Property";
	
	private Property property;
	
	public FormProperty(final Property p){
		super();
		this.property = p;
	}
	
	public FormProperty(){
		super();
		this.property = new Property();
	}
		
	public void updateFormProperty(final HttpServletRequest req){
		
		Map<String, String> mParameter = 
				RegSupporter.getParameterMap(req,false);
		
		if (mParameter.containsKey(Property.PROPERTY_PROPERTY_ID)) {
			this.property.setPropertId(mParameter.get(Property.PROPERTY_PROPERTY_ID));
		}
		
		if (mParameter.containsKey(Property.PROPERTY_COUNTRY_ID)) {
			this.property.setCountryId(mParameter.get(Property.PROPERTY_COUNTRY_ID));
		}
		
		if (mParameter.containsKey(Property.PROPERTY_DESCRIPTION)) {
			this.property.setDescription(mParameter.get(Property.PROPERTY_DESCRIPTION));
		}
		
		if (mParameter.containsKey(Property.PROPERTY_RELEASE_ID)) {
			this.property.setReleaseId(mParameter.get(Property.PROPERTY_RELEASE_ID));
		}
		
		if (mParameter.containsKey(Property.PROPERTY_PROJECT_ID)) {
			this.property.setProjectId(mParameter.get(Property.PROPERTY_PROJECT_ID));
		}
		
	} /* FormProperty */
	
	@Override
	public boolean isValid(){
		
		/* PropertyID is mandatory */
		if (StringUtils.isBlank(this.property.getPropertId())) {
			error.add("PROPERTY_ID_INVALIDATE");
		}
		
		/* CountryID is mandatory */
		if (StringUtils.isBlank(this.property.getCountryId())) {
			error.add("COUNTRY_ID_INVALIDATE");
		}
		
		/* Description is mandatory */
		if (StringUtils.isBlank(this.property.getDescription())) {
			error.add("DESCRIPTION_ID_INVALIDATE");
		}
		
		/* ProjectID is mandatory */
		if (StringUtils.isBlank(this.property.getProjectId())) {
			error.add("PROJECT_ID_INVALIDATE");
		}
		
		/* ReleaseID is mandatory */
		if (StringUtils.isBlank(this.property.getReleaseId())) {
			error.add("RELEASE_ID_INVALIDATE");
		}
		
		return error.isEmpty();
	}
	
	public int compareTo(FormProperty p) {
		if (property.getPropertId() == null && p.property.getPropertId() == null)
			return 0;
		if (property.getPropertId() == null)
			return 1;
		if (p.property.getPropertId() == null)
			return -1;
		else
			return property.getPropertId().compareTo(p.property.getPropertId());
	}
	

	/**
	 * Returns the value of attribute 'property'.
	 * @return the value of the attribute 'property'
	 */
	public Property getProperty() {
		return property;
	} 
	/**
	 * Get PROPERTY_SUBMITTED.
	 * @return PROPERTY_SUBMITTED 
	 */
	public String getPROPERTY_SUBMITTED() {
		   return WEBFORM_SUBMITTED;
	}
	/**
	 * Get PROPERTY_CLEARED.
	 * @return PROPERTY_CLEARED final String 
	 */
	public String getPROPERTY_CLEARED() {
		   return PROPERTY_CLEARED;
	}
	/**
	 * Get PROPERTY_OBJECT_ID.
	 * @return PROPERTY_OBJECT_ID
	 */
	public String getPROPERTY_OBJECT_ID() {
		return Property.PROPERTY_OBJECT_ID;
	}
	/**
	 * Get PROPERTY_PROPERTY_ID.
	 * @return PROPERTY_PROPERTY_ID
	 */
	public String getPROPERTY_PROPERTY_ID() {
		return Property.PROPERTY_PROPERTY_ID;
	}
	/**
	 * Get PROPERTY_COUNTRY_ID.
	 * @return PROPERTY_COUNTRY_ID
	 */
	public String getPROPERTY_COUNTRY_ID() {
		return Property.PROPERTY_COUNTRY_ID;
	}
	/**
	 * Get PROPERTY_DESCRIPTION.
	 * @return PROPERTY_DESCRIPTION
	 */
	public String getPROPERTY_DESCRIPTION() {
		return Property.PROPERTY_DESCRIPTION;
	}
	/**
	 * Get PROPERTY_PROJECT_ID.
	 * @return PROPERTY_PROJECT_ID
	 */
	public String getPROPERTY_PROJECT_ID() {
		return Property.PROPERTY_PROJECT_ID; 
	}	
	/**
	 * Get PROPERTY_RELEASE_ID.
	 * @return PROPERTY_PROJECT_ID
	 */
	public String getPROPERTY_RELEASE_ID() {
		return Property.PROPERTY_RELEASE_ID; 
	}	
	
} /* FormProperty */
