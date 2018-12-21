package database.factory.property;

import java.util.List;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

import database.Database;
import database.Table;
import database.Utils.release.Release;
import logging.Logger;

public class DataTableProperty extends Table {
	
	private static Object errorID = DataTableProperty.class;
	protected static final String Id = "Property";
	
	@Override
	protected String getId() {
		return Id;
	}

	/**
	 * Insert into dbShema.Table values
	 * 
	 * @param db by define
	 * @param typeId Id of Type
	 * @param desc Type description
	 * @return true in case successful
	 */
	public static synchronized boolean insert(final Database db, 
			final String propertyId, final String countryId, final String description, 
			final String projectId, final String releaseId){

		boolean found = exist(db, propertyId, countryId);
		if ( ! found ) {

			try {
				return db.executeUpdate("insert into " + db.getDbSchema() + "." + DataTableProperty.Id + 
						" values(" + ValueChar(propertyId) + ValueChar(countryId) +
						ValueChar(description) + ValueChar(projectId) + ValueChar(releaseId) + 
						ValueAdditionals()+ ")");

			} catch (Exception e) {

				Logger.log(errorID, e);
				
			} /* catch */

		} else {
			
			try {
			
				return db.executeUpdate("update " + db.getDbSchema() + "." + DataTableProperty.Id + 
						" set" + fieldCharValue("projectId", propertyId) + fieldCharValue("countryId", countryId) 
						+ fieldCharValue("description", description) + fieldCharValue("projectId",projectId) 
						+ fieldCharValue("releaseId", releaseId) + ValueUpdateAdditionals()
						+ " where propertyId = '" + propertyId + "' and countryId = '" + countryId + "'");
			
			} catch (Exception e) {

				Logger.log(errorID, e);
				
			} /* catch */
			
		} /* endif */ 
		
		return found;

	} /* insert */
	
	/**
	 * Check Primary Key is exist 
	 * 
	 * @param db
	 * @param propertyId Identifier KeyValue 
	 * @param countryIdId Entry identify Language 
	 * @return true in case Entry is found.
	 */
	public static synchronized boolean exist(final Database db, 
			final String propertyId, final String countryId ) {

	try {
		List<List<Object>> rows = db.executeQuery("select * from "+db.getDbSchema()+"." 
				+ DataTableProperty.Id + " where propertyId = '" + propertyId + "'" + 
						" and countryId = '" + countryId + "'");

			if(rows.size() > 0) {
				return true;
			}
			
		} catch (Exception e) { 
			Logger.log(errorID, e);
		} /* catch */
		
		return false;
	} /* exist */
	
	/**
	 * Create Table 
	 * 
	 * @param db by defined.
	 */
	protected synchronized boolean createTable(Database db){
		try {
			return db.executeUpdate (
				"CREATE TABLE "+db.getDbSchema()+"." + DataTableProperty.Id + " ( " +
					fieldText("propertyId", "500", "0", "Key PropertyId") +
					fieldChar("countryId", "12", "1", "Key CountryId") +
					fieldText("description", "2000", "2", "Description") +
					fieldChar("projectId", "12", "3", "ProjectId") + 
					fieldChar("releaseId", "12", "4", "ReleaseId") +
					tableAdditions("5") + 
					"PRIMARY KEY (propertyId (500),countryId)" +
					")" + tableDriver("TABLE of Properties to Transalations "));
		} catch (Exception e) {
			
			Logger.log(errorID, e);
		} /* catch */
		
		return false;
	} /* createTable */
	
	/**
	 * Delete from dbschema.table where ..
	 * 
	 * @param db defined
	 * @param propertyId for PrimaryKey
	 * @return true is successful in case keyValue is deleted form Table row.
	 */
	public static synchronized boolean deleteProperty(final Database db, 
				final String propertyId , final String countryId){

		try {
			
			return db.executeUpdate("delete from "+db.getDbSchema()+"." + DataTableProperty.Id + 
					" where propertyId = '" + propertyId + "' and countryId = '" + countryId + "'");

		} catch (Exception e) {
			
			Logger.log(errorID, e);
			return false;
		} /* catch */

	} /* deleteType */
	
	@Override
	public boolean executeDbMigrate(Database db, Release relase) {
		
		if( StringUtils.equals("1.0.0.0" ,relase.releaseID) ){
			
			
			try {
				
				DataTableProperty.insert(db, "common.ok", "DE", "okay", "mobileApp", "1.0.0.0");
				
				DataTableProperty.insert(db, "common.abort", "DE", "beenden", "mobileApp", "1.0.0.0");
				DataTableProperty.insert(db, "common.open", "DE", "öffnen", "mobileApp", "1.0.0.0");
				DataTableProperty.insert(db, "common.close", "DE", "schließen", "mobileApp", "1.0.0.0");
				DataTableProperty.insert(db, "common.ok", "EN", "okay", "mobileApp", "1.0.0.0");
				DataTableProperty.insert(db, "common.notOk", "EN", "fail", "mobileApp", "1.0.0.0");
				DataTableProperty.insert(db, "common.open", "EN", "open", "mobileApp", "1.0.0.0");
				DataTableProperty.insert(db, "common.close", "EN", "close", "mobileApp", "1.0.0.0");
				
				return true;
				
			} catch (Exception e) {
				Logger.log(errorID, e);
				return false;
			} /* catch */
			
			
		} else {
			
			return false;
		} /* endif release */
	}
	
	
	public static boolean executeDbMigrate(final Database db, 
			final Release relase, final Properties property){
		
		if( StringUtils.equals("1.0.0.0" ,relase.releaseID) ){
			
			try {
				
				for ( Entry<Object, Object> prop : property.entrySet()) {
					String key = prop.getKey().toString();
					String val = prop.getValue().toString();
					DataTableProperty.insert(db, key, "DE", val, "mobileApp", "1.0.0.0");
					db.close();
					System.out.println(key.length() +":"+ key);
					System.out.println(val.length() +":"+ val);
					
				}
				
				return true;
				
			} catch (Exception e) {
				Logger.log(errorID, e);
				return false;
			} /* catch */
			
			
		} else {
			
			return false;
		} /* endif release */
		
	} /* db */

	
	@Override
	public boolean executeDbInit(Database db) {
		return createTable(db);
	}

	
} /* DataTablePropertiy */
