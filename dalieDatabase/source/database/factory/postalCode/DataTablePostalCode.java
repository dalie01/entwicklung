package database.factory.postalCode;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import database.Database;
import database.Table;
import database.Utils.release.Release;
import database.factory.postalCode.business.DataSetPostalCode;
import logging.Logger;


public class DataTablePostalCode extends Table {
	
	protected static final String Id = "PostalCode";
	
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
			final String postalId, final String countryId, final String stateId, final String cityId, 
			final String postalCode) {

		boolean found = exist(db, postalId);
		if ( ! found ) {

			try {
				return db.executeUpdate("insert into " + db.getDbSchema() + "." + DataTablePostalCode.Id + 
						" values(" + ValueChar(postalId) + ValueChar(countryId) +
						ValueChar(stateId) + ValueChar(cityId) + ValueChar(postalCode) + 
						ValueAdditionals()+ ")");

			} catch (Exception e) {

				Logger.log(DataTablePostalCode.class, e);
				return false;
			} /*catch*/
		} 
		
		return found;

	} /*insert */
	
	/**
	 * Check Primary Key is exist 
	 * 
	 * @param db
	 * @param keyValue
	 * @return true in case Entry is found.
	 */
	public static synchronized boolean exist(final Database db, final String keyValue) {
		
		try {
			List<List<Object>> rows = db.executeQuery("select * from " + db.getDbSchema()+ "." + 
					DataTablePostalCode.Id + " where postalId = '" + keyValue + "'");
			
			if(rows.size() > 0){
				return true;
			} 
			
		} catch (Exception e) {
			Logger.log(DataTablePostalCode.class, e);
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
				"CREATE TABLE "+db.getDbSchema()+"." + DataTablePostalCode.Id + " ( " +
					fieldChar("postalId", "12", "0", "Key postalId") +
					fieldChar("countryId", "12", "1", "CountryId") +
					fieldChar("stateId", "12", "2", "StateId") + 
					fieldChar("cityId", "12", "3", "CityId") +
					fieldChar("postalCode", "128", "4", "CountryId") +
					tableAdditions("5") + 
					"PRIMARY KEY (postalId)" +
					")" + tableDriver("TABLE of Internal Postal Codes "));
		
		} catch (Exception e) {
			Logger.log(DataTablePostalCode.class, e);

		} /* catch */
		
		return false;
	} /* createTable */
	
	/**
	 * Delete from dbschema.table where ..
	 * 
	 * @param db defined
	 * @param keyValue for PrimaryKey
	 * @return true is successful in case keyValue is deleted form Table row.
	 */
	public static synchronized boolean deletePostal(final Database db, final String keyValue){

		try {
			
			return db.executeUpdate("delete from " + db.getDbSchema() + "." + DataTablePostalCode.Id + 
					" where postalId = '" + keyValue + "'");

		} catch (Exception e) {
			Logger.log(DataTablePostalCode.class, e);

		} /* catch */

		return false;
	} /* deleteType */
	
	@Override
	public boolean executeDbMigrate(Database db, Release relase) {
		
		if( StringUtils.equals("1.0.0.0" ,relase.releaseID) ){
			
			try {
				
				DataSetPostalCode.insert(db, "1", "DE", "TH", "Jena", "04711");
				DataSetPostalCode.insert(db, "2", "DE", "TH", "Jena", "04712");
				DataSetPostalCode.insert(db, "3", "DE", "TH", "Jena", "04714");
				DataSetPostalCode.insert(db, "4", "DE", "BW", "Stuttgart", "70176");
				DataSetPostalCode.insert(db, "5", "DE", "BW", "Stuttgart", "70177");

				return true;
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				return false;
			} /* catch */
			
			
		} else {
			
			return false;
		} /* endif release */
		
	} /* dbMigrate */

	@Override
	public boolean executeDbInit(Database db) {
		return createTable(db);
	}
	
} /* DataTablePostalCode */
