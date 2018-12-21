package database.factory.type;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import database.Database;
import database.Table;
import database.Utils.release.Release;
import logging.Logger;

public class DataTableType extends Table {
	
	protected static String Id = "Types";
	
	protected String getId() {
		return Id;
	}


	
	public static enum Types{
		Shipping,Billing
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
			final String typeId, final String desc){

		boolean found = exist(db, typeId);
		if ( ! found) {

			try {
				return db.executeUpdate("insert into "+db.getDbSchema()+"."+ DataTableType.Id + 
						" values(" + ValueChar(typeId) + ValueChar(desc) +
						ValueAdditionals()+ ")");

			} catch (Exception e) {

				Logger.log(DataTableType.class, e);
				return false;
			} /*catch*/
			
		} /* endif found */
		
		return found;

	} /*insert */
    
	/**
	 * Check Primary Key is exist 
	 * 
	 * @param db by defined
	 * @param keyValue
	 * @return true in case Entry is found.
	 */
	public static synchronized boolean exist(final Database db, final String keyValue) {
		
		try {
			List<List<Object>> rows = db.executeQuery("select * from "+db.getDbSchema()+"." + DataTableType.Id +
					" where typeId = '" + keyValue +"'");
			
			if(rows.size() > 0){
				return true;
				
			} else {
				return false;
			}
		} catch (Exception e) {
			
			Logger.log(DataTableType.class, e);
			return false;
		} /* catch */
		
	} /* exist */

	
	/**
	 * Create Table 
	 * 
	 * @param db by defined.
	 */
	protected synchronized boolean createTable(Database db){
		try {
			return db.executeUpdate (
				"CREATE TABLE "+db.getDbSchema()+"." + DataTableType.Id + " ( " +
					fieldChar("typeId", "12", "0", "Key TypeId") +
					fieldChar("description", "128", "1", "Description") + 
					tableAdditions("2") + 
					"PRIMARY KEY (typeId)" +
					")" + tableDriver("TABLE of Type Definitions"));
		} catch (Exception e) {
			
			Logger.log(DataTableType.class, e);
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
	public static synchronized boolean deleteType(final Database db, final String keyValue){

		try {
			
			return db.executeUpdate("delete from "+db.getDbSchema()+"." + DataTableType.Id + 
					" where typeId = '"+keyValue+"'");

		} catch (Exception e) {
			
			Logger.log(DataTableType.class, e);
			return false;
		} /* catch */

	} /* deleteType */
	
	
	
	
	@Override
	public boolean executeDbMigrate(Database db, Release relase) {
		
		if( StringUtils.equals("1.0.0.0" ,relase.releaseID) ){
			
			try {
				
				DataTableType.insert(db, DataTableType.Types.Shipping.toString(), "Shipping");
				DataTableType.insert(db, DataTableType.Types.Billing.toString(), "Billing");
				return true;
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				return false;
			}
			
			
		} else {
			
			return false;
		}
		
	}

	@Override
	public boolean executeDbInit(Database db) {
		return createTable(db);
	}

		
} /*DataSetType*/
