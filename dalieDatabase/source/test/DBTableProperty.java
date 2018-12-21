package test;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.lang3.StringUtils;

import database.Database;
import database.factory.property.DataTableProperty;
import database.factory.property.business.DataSetProperty;
import model.internal.property.Property;

public class DBTableProperty {

	public static void main(String[] args) {

		Database mySql = Database.getInstance("mySql");
		try {
			/*
			mySql.setUp();
			Property noOkay = DataSetProperty.getProperty(mySql, "common.notOk", "EN");
			mySql.close();
			System.out.println(noOkay);
			
			mySql.setUp();
			List<Property> all = DataSetProperty.getAllProperties(mySql);
			mySql.close();
			for (Property property : all) {
				System.out.println(property);
			}
			
			mySql.setUp();
			List<Property> byCountries = DataSetProperty.findPropertiesByCountryId(mySql, "DE");
			mySql.close();
			for (Property property : byCountries) {
				System.out.println(property);
			}
			 */
			
			mySql.setUp();
			DataTableProperty.insert(mySql, "dalie.mobile", "DE", "2", "1", "1");
			mySql.close();
			
			List<Property> properties = null;
			mySql.setUp();
			properties = DataSetProperty.getAllProperties(mySql);
			mySql.close();
			
			Map<Property,Map<String,Property>> global = new TreeMap<Property,Map<String,Property>>();
			for (Property property : properties) {
			
			if (StringUtils.contains(property.getPropertId(),"common.ok") || 
					StringUtils.contains(property.getPropertId(),"common.open")|| 
					StringUtils.contains(property.getPropertId(),"common.notOk")) {
					
				Map<String,Property> de = fillTranslationMap(properties, property.getPropertId(), "DE");
				fillAllMap(global, property, de);

				Map<String,Property> en = fillTranslationMap(properties, property.getPropertId(), "EN");
				fillAllMap(global, property, en);
			}
			
			}
		
			
			for( Map.Entry<Property, Map<String,Property>> entry : global.entrySet() ) {
				
				Property key = entry.getKey();
				Map<String,Property> value = entry.getValue();
		
				System.out.println(value.toString());
				
			} /* for entry */
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				mySql.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} /* catch */

	} /* main */
	
	/**
	 * Checks is Property in global Map in case of this 
	 * raise or put GlobalMap.
	 * 
	 * @param global Map to hold Property belongs to CountryId
	 * @param property Property
	 * @param propertyBelong
	 */
	private static void fillAllMap(Map<Property,Map<String,Property>> global, 
			Property property, Map<String,Property> propertyBelong){
		
		if (propertyBelong != null && propertyBelong.size() > 0) {
			
			if (global.containsKey(property)) {
				/** raise GlobalMap */
				Map<String, Property> temp = global.get(property);
				
				for( Map.Entry<String,Property> entry : propertyBelong.entrySet() ) {
					temp.put(entry.getKey(), entry.getValue());
				}
				
				global.put(property, temp);
			
			} else {
			
				/** put to GlobalMap */
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
	private static Map<String,Property> fillTranslationMap(List<Property> properties,  
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
	private static Property getPropertiesByCountryId(final List<Property> properties,  
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
	
} /* DataTableProperty */
