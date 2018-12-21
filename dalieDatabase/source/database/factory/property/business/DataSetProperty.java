package database.factory.property.business;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import database.Database;
import database.Utils.exception.DataSetNotFoundException;
import database.factory.property.DataTableProperty;
import model.internal.property.Property;

/**
 * DataSetProperty DatabaseManager.
 * 
 * @author DALiEWEB
 * @since 1.0.0.0
 * 
 */
public class DataSetProperty extends DataTableProperty {

	/**
	 * Get all Properties on ProjectId.
	 * 
	 * @param db Database
	 * @param projectId String
	 * 
	 * @return List<Property> all Properties as found by ProjectId
	 * 
	 * @throws DataSetNotFoundException 
	 * @throws Exception 
	 */
	public static List<Property> getPropertiesByProjectId(Database db, 
			final String projectId) throws DataSetNotFoundException, Exception {
		
		List<Property> properties = Collections.synchronizedList(new ArrayList<Property>());

		List<List<Object>> rows = db.executeQuery("select * from " +db.getDbSchema() + 
				"."  + DataTableProperty.Id + " where projectId = '" + projectId + "'");
		
		if(rows.isEmpty())
			throw new DataSetNotFoundException();

		for(int i = 0; i < rows.size(); i++) {
			properties.add(new Property(rows.get(i)));
		}//for

		return properties;
	} /* getPropertiesByProjectId */
	
	/**
	 * Get all Properties on ReleaseId.
	 * 
	 * @param db Database
	 * @param releaseId String
	 * 
	 * @return List<Property> all Properties as found by ReleaseId
	 * 
	 * @throws DataSetNotFoundException no Record found
	 * @throws Exception
	 */
	public static List<Property> getPropertiesByReleaseId(Database db, 
			final String releaseId) throws DataSetNotFoundException, Exception {
		
		List<Property> properties = Collections.synchronizedList(new ArrayList<Property>());

		List<List<Object>> rows = db.executeQuery("select * from " +db.getDbSchema() + 
				"."  + DataTableProperty.Id + " where releaseId = '" + releaseId + "'");
		
		if(rows.isEmpty())
			throw new DataSetNotFoundException();

		for(int i = 0; i < rows.size(); i++) {
			properties.add(new Property(rows.get(i)));
		}//for

		return properties;
	} /* getPropertiesByReleaseId */
	
	/**
	 * Get all Properties by CountryId.
	 * 
	 * @param db Database
	 * @param countryId String
	 * 
	 * @return List<Property> all Properties found by CountryId
	 * 
	 * @throws DataSetNotFoundException no Record found
	 * @throws Exception
	 */
	public static List<Property> findPropertiesByCountryId(Database db, 
			final String countryId) throws DataSetNotFoundException, Exception {
		
		List<Property> properties = Collections.synchronizedList(new ArrayList<Property>());

		List<List<Object>> rows = db.executeQuery("select * from " +db.getDbSchema() + 
				"."  + DataTableProperty.Id + " where countryId = '" + countryId + "' order by createDate desc");
		
		if(rows.isEmpty())
			throw new DataSetNotFoundException();

		for(int i = 0; i < rows.size(); i++) {
			properties.add(new Property(rows.get(i)));
		}//for

		return properties;
	} /* findPropertiesByCountryId */
	
	/**
	 * Get all Properties by PropertyId.
	 *
	 * @param db
	 * @param propertyId
	 * 
	 * @return List<Property> all Properties found by PropertyId
	 * 
	 * @throws DataSetNotFoundException no Record found
	 * @throws Exception
	 */
	public static List<Property> findPropertyById(Database db, 
			final String propertyId) throws DataSetNotFoundException, Exception {
		
		List<Property> properties = Collections.synchronizedList(new ArrayList<Property>());

		List<List<Object>> rows = db.executeQuery("select * from " +db.getDbSchema() + 
				"."  + DataTableProperty.Id + " where propertyId = '" + propertyId + "'");
		
		if(rows.isEmpty())
			throw new DataSetNotFoundException();

		for(int i = 0; i < rows.size(); i++) {
			properties.add(new Property(rows.get(i)));
		}//for

		return properties;
	} /* findPropertyById */
	
	
	/**
	 * Get Property from Database 
	 * by PropertyId and CountryId.
	 * 
	 * @param db Database
	 * @param propertyId String KeyValue
	 * @param countryId String KeyValue
	 * 
	 * @return Property as found 
	 * 
	 * @throws DataSetNotFoundException no Record found
	 * @throws Exception
	 */
	public static Property getProperty(Database db, 
			final String propertyId, final String countryId) 
					throws DataSetNotFoundException, Exception {
		
		Property pT = null;

		List<List<Object>> rows = db.executeQuery("select * from " +db.getDbSchema() + 
				"."  + DataTableProperty.Id + " where propertyId = '" + propertyId + "'" +
				" and countryId = '"+ countryId +"'");
		
		if(rows.isEmpty())
			throw new DataSetNotFoundException();

		for(int i = 0; i < rows.size(); i++) {
			pT = new Property(rows.get(i));
		}//for

		return pT;
	} /* getProperty */
	
	/**
	 * Get all Properties which exist on Database.
	 * 
	 * @param db Database
	 * 
	 * @return List<Property> all Properties which exist on Database
	 * 
	 * @throws DataSetNotFoundException no Record Found
	 * @throws Exception
	 */
	public static List<Property> getAllProperties(Database db) 
			throws DataSetNotFoundException,  Exception {
		
		List<Property> properties = Collections.synchronizedList(new ArrayList<Property>());

		List<List<Object>> rows = db.executeQuery("select * from "+db.getDbSchema()+ "."  + DataTableProperty.Id);
		if(rows.isEmpty())
			throw new DataSetNotFoundException();

		for(int i = 0;i < rows.size();i++) {

			properties.add(new Property(rows.get(i)));
		}//for

		if(properties.isEmpty())
			throw new DataSetNotFoundException();

		return properties;
	} /* getAllProperties */
	
} /* DataSetProperty */
