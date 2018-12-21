package database.factory.country;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import database.Database;
import database.Table;
import database.Utils.release.Release;
import logging.Logger;


public class DataTableCountry extends Table {
	
	protected static final String Id = "Countries";
	
	@Override
	protected String getId() {
		return Id;
	}
	
	public static synchronized boolean insert(final Database db, 
			final String countryId, final String desc){

		boolean found = exist(db, countryId);
		if ( ! found ) {
			
			try {
				return db.executeUpdate("insert into "+db.getDbSchema()+"."+ DataTableCountry.Id + 
						" values(" + ValueChar(countryId) + ValueChar(desc) +
						ValueAdditionals()+ ")");

			} catch (Exception e) {

				Logger.log(Object.class.getName(), e);
				return false;
			} /*catch*/
		} 
		
		return found;

	} /*insertUser*/
	
	public static synchronized boolean exist(final Database db, final String keyValue) {
		
		try {
			List<List<Object>> rows = db.executeQuery("select * from "+db.getDbSchema()+"." + DataTableCountry.Id +
					" where countryId = '" + keyValue +"'");
			
			if(rows.size() > 0){
				return true;
				
			} else {
				return false;
			}
			
		} catch (Exception e) {
			Logger.log(DataTableCountry.class, e);
			
		}
		
		return false;
	}
	
	protected synchronized boolean createTable(Database db){
		try {
			return db.executeUpdate (
				"CREATE TABLE "+db.getDbSchema()+"." + DataTableCountry.Id + " ( " +
					fieldChar("countryId", "12", "0", "Key countryId") +
					fieldChar("description", "128", "1", "Description") + 
					tableAdditions("2") + 
					"PRIMARY KEY (countryId)" +
					")" + tableDriver("TABLE of Countries Definitions"));
		} catch (Exception e) {
			Logger.log(DataTableCountry.class, e);
			
		} /* catch */
		
		return false;
	} /* createTable */
	
	public static synchronized boolean deleteCountry(final Database db, final String keyValue){

		try {
			return db.executeUpdate("delete from "+db.getDbSchema()+"." + DataTableCountry.Id + 
					" where countryId = '"+keyValue+"'");

		} catch (Exception e) {
			Logger.log(DataTableCountry.class, e);
			
		} /*catch*/

		return false;
	} /* deleteCountry */
	
	@Override
	public boolean executeDbMigrate(Database db, Release relase){
		
		if( StringUtils.equals("1.0.0.0" , relase.releaseID) ) {
			
			try {
				
				DataTableCountry.insert(db, "DE", "Germany");
				DataTableCountry.insert(db, "NZ", "New Zealand");
				DataTableCountry.insert(db, "AUS", "Australia");
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
	
} /* DataSetCountry */
