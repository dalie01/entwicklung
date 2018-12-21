package mobile.web.pipelet.property;

import java.util.*;

import mobile.utilities.Pipelet;
import mobile.utilities.capi.PipelineDictionary;
import mobile.utilities.exceptions.PipeletExecutionException;
import model.internal.property.Property;

import org.apache.commons.lang3.StringUtils;

public class GroupProperties extends Pipelet {

	/**
	 * Constant used to access the pipeline dictionary with key 'Properties'
	 */
	public static final String DN_IN_PROPERTIES = "Properties";
	/**
	 * Constant used to access the pipeline dictionary with key 'Properties'
	 */
	public static final String DN_OUT_PROPERTIES_MAP = "PropertiesMap";
	
	@Override
	public int execute(PipelineDictionary dict) 
			throws PipeletExecutionException {
		
		@SuppressWarnings("unchecked")
		List<Property> properties = (List<Property>)dict.get(DN_IN_PROPERTIES);
		
		Map<Property, Map<String,Property>> global = 
				new TreeMap<Property, Map<String,Property>>();
		
		/* LOOP OVER */
		for (Property property : properties) {
								
			Map<String,Property> de = 
				fillTranslationMap(properties, property.getPropertId(), "DE");
			fillAllMap(global, property, de);

			Map<String,Property> en = 
				fillTranslationMap(properties, property.getPropertId(), "EN");
			fillAllMap(global, property, en);
			
			Map<String,Property> fr = 
				fillTranslationMap(properties, property.getPropertId(), "FR");
			fillAllMap(global, property, fr);
			
			Map<String,Property> it = 
				fillTranslationMap(properties, property.getPropertId(), "IT");
			fillAllMap(global, property, it);
		}
		
		/* store 'Properties' in pipeline dictionary */
		dict.put(DN_OUT_PROPERTIES_MAP, global);
		
		return PIPELET_NEXT;
	}
	
	/**
	 * Checks is Property in global Map in case of this 
	 * raise or put GlobalMap.
	 * 
	 * @param global Map to hold Property belongs to CountryId
	 * @param property Property
	 * @param propertyBelong
	 */
	private void fillAllMap(Map<Property, Map<String,Property>> global, 
			Property property, Map<String,Property> propertyBelong) {
		
		if (propertyBelong != null && propertyBelong.size() > 0) {
			
			if (global.containsKey(property)) {
				/* raise GlobalMap */
				Map<String, Property> temp = global.get(property);
				
				for( Map.Entry<String,Property> entry : propertyBelong.entrySet() ) {
					temp.put(entry.getKey(), entry.getValue());
				}
				
				global.put(property, temp);
			
			} else {
			
				/* put to GlobalMap */
				global.put(property, propertyBelong);
			} /* containsKey */
			
		} /* propertBelong */
		
	} /*fillAllMap*/
	
	/**
	 * @param properties all Properties from Database
	 * @param propertyId Property Key Id,
	 * @param countryId CountryId LanguageId
	 * 
	 * @return
	 * @throws Exception
	 */
	private Map<String,Property> fillTranslationMap(List<Property> properties,  
			 String propertyId, String countryId){
		
		Map<String,Property> translations = new TreeMap<String,Property>();
		
		Property property = 
				getPropertiesByCountryId(properties, propertyId , countryId);
		
		if (property != null )  {
			translations.put(countryId, property);
			
		}
		
		return translations;
		
	} /* fillTranslationMap */

	/**
	 * find Property by CountryId
	 * 
	 * @param properties all Properties from Database.
	 * @param propertyId Property Key Id,
	 * @param countryId CountryId LanguageId
	 * @return Property for GlobalMap
	 * 
	 */
	private Property getPropertiesByCountryId(final List<Property> properties,  
			String propertyId, String countryId) {
		
		Property found = null;
		
		for (Property property : properties) {
			
			/* find by Id && countryId */
			if (StringUtils.equals(property.getPropertId(), propertyId) 
					&& StringUtils.equals(property.getCountryId(), countryId)) {
				
				found = property;
			} 
			
		} /* for */
		
		return found;
	} /* getPropertiesByCountryId */
}//
