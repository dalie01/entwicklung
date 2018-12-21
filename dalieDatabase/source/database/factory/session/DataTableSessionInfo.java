package database.factory.session;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import database.Database;
import database.Table;
import database.Utils.release.Release;
import logging.Logger;

public class DataTableSessionInfo extends Table {
	
	private static Object errorID = DataTableSessionInfo.class;
	protected static String Id = "SessionInfo";
	
	@Override
	protected String getId() {
		return Id;
	}

	
	public static synchronized boolean insert(final Database db, 
			String sessionId, String domainId, String userId, 
				boolean authenticationState, String language, String currency, Map<String,Object> dictionary, Float expires) {
		
		boolean found = exist(db, sessionId);
		if ( ! found ) {
			
			try {
				return db.executeUpdate("insert into " + db.getDbSchema() + "." +  DataTableSessionInfo.Id + 
						" values(" + ValueChar(sessionId) + ValueChar(domainId) 
							+ ValueChar(userId) 
							+ ValueInt(authenticationState ? 1 : 0) 
							+ ValueChar(language)
							+ ValueChar(currency) 
							+ ValueChar(serializeObject(dictionary)) 
							+ ValueInt(expires) +
						ValueAdditionals() + ")");

			} catch (Exception e) {

				Logger.log(errorID, e);
				return false;
			} /*catch*/
		} 
		
		return found;

	} /*insertUser*/
	
	public static synchronized boolean exist(final Database db, final String keyValue) {
		
		try {
			List<List<Object>> rows = db.executeQuery("select * from " + db.getDbSchema() + "." + DataTableSessionInfo.Id +
					" where sessionId = '" + keyValue + "'");
			
			if(rows.size() > 0){
				return true;
				
			} else {
				return false;
			}
		} catch (Exception e) {
			
			Logger.log(errorID, e);
			return false;
		}
	}
	
	public synchronized boolean createTable(Database db){
		try {
			return db.executeUpdate (
				"CREATE TABLE "+ db.getDbSchema() + "." + DataTableSessionInfo.Id + " ( " +
					fieldChar("sessionId", "128", "0", "Key sessionID") +
					fieldChar("domainID", "128", "1", "domainID") + 
					fieldChar("userID", "64", "2", "userID") + 
					fieldByte("authenticationState", "1", "3", "authenticationState") + 
					fieldChar("language", "12", "4", "languageID") + 
					fieldChar("currency", "12", "5", "currency") + 
					fieldText("dictionary","1024", "6", "dictionary") +
					fieldFloat("expires", "7", "expires") + 
					tableAdditions("8") + 
					"PRIMARY KEY (sessionId)" +
					")" + tableDriver("TABLE of Sessionen Definitions"));
		} catch (Exception e) {
			
			Logger.log(errorID, e);
			return false;
		} /* catch */
		
	} /* createTable */
	
	/**
	 * Delete from dbschema.table where ..
	 * 
	 * @param db defined
	 * @param keyValue for PrimaryKey
	 * @return true is successful in case keyValue is deleted form Table row.
	 */
	public static synchronized boolean deleteSessionInfo(final Database db, final String keyValue){

		try {
			
			return db.executeUpdate("delete from " + db.getDbSchema() + "." + DataTableSessionInfo.Id + 
					" where sessionID = '" + keyValue + "'");

		} catch (Exception e) {
			
			Logger.log(errorID, e);
			return false;
		} /* catch */

	} /* deleteType */
	
	@Override
	public boolean executeDbMigrate(Database db, Release relase) {
		
		if( StringUtils.equals("1.0.0.0" , relase.releaseID) ){
			
			
			try {
				if (DataTableSessionInfo.exist(db, "2")) {
					DataTableSessionInfo.deleteSessionInfo(db, "2");
				}
				Map<String,Object> test = new HashMap<String,Object>();
				test.put("Hello", DataTableSessionInfo.class);
				test.put("World", "Hello");
				test.put("Hello", "World");
				test.put("World", "Hello");
				test.put("Hello2", "World");
				test.put("World3", "Hello");
				test.put("Hello4", "World");
				test.put("World5", "Hello");
				test.put("Hello6", "World");
				test.put("World7", "Hello");
				test.put("Hello8", "World");
				test.put("World9", "Hello");
				DataTableSessionInfo.insert(db, "2", "dalie", "1", true, "de", "EUR", test, Float.valueOf(10));
				db.close();
				return true;
				
			} catch (Exception e) {
				Logger.log(DataTableSessionInfo.class, e);
				return false;
			} /* catch */
			
			
		} else {
			
			return false;
		} /* endif release */
	
	}

	@Override
	public boolean executeDbInit(Database db) {
		return createTable(db);
	}

}
