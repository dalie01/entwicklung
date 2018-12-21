package mobile.web.pipelet.property;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import mobile.utilities.Pipelet;
import mobile.utilities.capi.PipelineDictionary;
import mobile.utilities.exceptions.PipeletExecutionException;
import model.internal.property.Property;

import org.apache.commons.lang3.StringUtils;

import database.Database;
import database.Utils.exception.DataSetNotFoundException;
import database.factory.property.business.DataSetProperty;

/**
 * Pipelet: Get all Properties from Database, <br/> 
 * as you can find.
 * 
 * @author DALiEWEB
 *
 */
public class GetPropertiesFromDatabase extends Pipelet {
	
	static final long serialVersionUID = 42L;
	
	/**
	 * Constant used to access the pipeline dictionary with key 'pId'
	 */
	public static final String DN_IN_PROPERTY_ID = "id";
	
	/**
	 * Constant used to access the pipeline dictionary with key 'pId'
	 */
	public static final String DN_IN_PROJECT_ID = "pId";
	
	/**
	 * Constant used to access the pipeline dictionary with key 'cId'
	 */
	public static final String DN_IN_COUNTRY_ID = "cId";
	
	/**
	 * Constant used to access the pipeline dictionary with key 'rId'
	 */
	public static final String DN_IN_RELEASE_ID = "rId";
	
	/**
	 * Constant used to access the pipeline dictionary with key 'Properties'
	 */
	public static final String DN_OUT_PROPERTIES = "Properties";
	
	/**
	 * Constant used to access the pipeline dictionary with key 'Property'
	 */
	public static final String DN_OUT_PROPERTY = "Property";
	
	Database mySql;
	
	@Override
	public int execute(PipelineDictionary dict) 
			throws PipeletExecutionException {
		
		Property property = null;
		try {
			String Id = (String)dict.get(DN_IN_PROPERTY_ID);
			String countryId = (String)dict.get(DN_IN_COUNTRY_ID);
			
			if (StringUtils.isNotEmpty(Id) && StringUtils.isNotEmpty(countryId)) {
				mySql.setUp();
				property = DataSetProperty.getProperty(mySql, Id, countryId); 
				mySql.close();

				dict.put(DN_OUT_PROPERTY, property);
				return PIPELET_NEXT;
			} else {
			
				List<Property> properties = determinePropertyStrategy(dict);
				
				Comparator<Property> custom = new Comparator<Property>() {
				@Override
				public int compare(Property o1, Property o2) {
			    	Property s1 = o1;
			    	Property s2 = o2;
			       
			       	int diff = s1.getPropertId().length() - 
			       		s2.getPropertId().length();
			     
			       	if (diff == 0) {
			           	diff = s1.compareTo(s2);
			       	}
			       	return diff;
			    }
				};
	
				Collections.sort(properties, custom);
				/* store 'Properties' in pipeline dictionary */
				dict.put(DN_OUT_PROPERTIES, properties);
				return PIPELET_NEXT;
			}
						
		} catch (Exception e) {
		
			return PIPELET_ERROR;
		}
	
	}
	
	private List<Property> determinePropertyStrategy(final PipelineDictionary dict) 
			throws Exception,DataSetNotFoundException{
		
		List<Property> properties = null;
		String Id = (String)dict.get(DN_IN_PROPERTY_ID);
		String countryId = (String)dict.get(DN_IN_COUNTRY_ID);
		String projectId = (String)dict.get(DN_IN_PROJECT_ID);
		String releaseId = (String)dict.get(DN_IN_RELEASE_ID);
		
		if (StringUtils.isNotEmpty(countryId) 
				&& StringUtils.isEmpty(Id) && StringUtils.isEmpty(projectId) 
				&& StringUtils.isEmpty(releaseId)) {
			
			/* Properties by Country */
			properties = getPropertiesByCountryId(countryId);
			
		} else if (StringUtils.isNotEmpty(projectId)
				&& StringUtils.isEmpty(Id) && StringUtils.isEmpty(countryId) 
				&& StringUtils.isEmpty(releaseId) ) {
			
			/* Properties by Project */
			properties = getPropertiesByProjectId(projectId);
		
		} else if (StringUtils.isNotEmpty(releaseId)
				&& StringUtils.isEmpty(Id) && StringUtils.isEmpty(countryId) 
				&& StringUtils.isEmpty(projectId) ) {
			
			/* Properties by Release */
			properties = getPropertiesByReleaseId(releaseId);
		} else if (StringUtils.isNotEmpty(Id)
				&& StringUtils.isEmpty(countryId) && StringUtils.isEmpty(projectId) 
				&& StringUtils.isEmpty(releaseId) ) {
			
			/* Properties by Id */
			properties = getPropertiesByPropertyId(Id);
			
		} else {
			/* default all */
			properties = getAllProperties();
		}
		return properties;
	}
	
	/**
	 * Get all Properties.
	 * 
	 * @return
	 * @throws Exception
	 * @throws DataSetNotFoundException
	 */
	private List<Property> getAllProperties() 
			throws Exception,DataSetNotFoundException {
		
		List<Property> properties = null;
		mySql.setUp();
		properties = DataSetProperty.getAllProperties(mySql);
		mySql.close();
		return properties;
	} /* getAllProperties */
	
	/**
	 * Get all Properties by ReleaseId.
	 * 
	 * @param ReleaseId Release Identifier
	 * @return
	 * @throws Exception
	 * @throws DataSetNotFoundException
	 */
	private List<Property> getPropertiesByReleaseId(final String releaseId) 
			throws Exception,DataSetNotFoundException {
		
		List<Property> properties = null;
		mySql.setUp();
		properties = DataSetProperty.getPropertiesByReleaseId(mySql, releaseId);
		mySql.close();
		return properties;
	} /* getPropertiesByReleaseId */
	
	/**
	 * Get all Properties by ProjectId.
	 * 
	 * @param PorjectId Project Identifier
	 * @return
	 * @throws Exception
	 * @throws DataSetNotFoundException
	 */
	private List<Property> getPropertiesByProjectId(final String projectId) 
			throws Exception,DataSetNotFoundException {
		
		List<Property> properties = null;
		mySql.setUp();
		properties = DataSetProperty.getPropertiesByProjectId(mySql, projectId);
		mySql.close();
		return properties;
	} /* getPropertiesByProjectId */
	
	/**
	 * Get all Properties by CountryId.
	 * 
	 * @param countryId Country Identifier
	 * @return
	 * @throws Exception
	 * @throws DataSetNotFoundException
	 */
	private List<Property> getPropertiesByCountryId(final String countryId) 
			throws Exception,DataSetNotFoundException {
		
		List<Property> properties = null;
		mySql.setUp();
		properties = DataSetProperty.findPropertiesByCountryId(mySql, countryId);
		mySql.close();
		return properties;
	} /* getPropertiesByCountryId */
	
	
	/**
	 * Get all Properties by PropertyId.
	 * 
	 * @param PropertyId Identifier
	 * @return
	 * @throws Exception
	 * @throws DataSetNotFoundException
	 */
	private List<Property> getPropertiesByPropertyId(final String propertyId) 
			throws Exception,DataSetNotFoundException {
		
		List<Property> properties = null;
		mySql.setUp();
		properties = DataSetProperty.findPropertyById(mySql, propertyId);
		mySql.close();
		return properties;
	} /* getPropertiesByPropertyId */
	
	@Override
	public void init() { 
		
		mySql = Database.getInstance("mySql");
	} /* init */
	
	
} /* GetPropetiesFromDatabase */
