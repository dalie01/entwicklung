package database.Utils.internal;

import database.Database;
import database.Table;
import database.factory.country.DataTableCountry;
import database.factory.postalCode.DataTablePostalCode;
import database.factory.property.DataTableProperty;
import database.factory.session.DataTableSessionInfo;
import database.factory.type.DataTableType;
import logging.Logger;

public abstract class DbInit {
	
	
	protected static boolean dbInit() {
		boolean successfully = false;
		Database mySql = Database.getInstance("mySql","localhost","test","root","inxs");
		Boolean drop = true;
		try {
			mySql.setUp();
			mySql.dbInit(drop, new Table[]{new DataTableSessionInfo(), new DataTableProperty(), new DataTablePostalCode(), new DataTableCountry(), new DataTableType()});
			
		} catch (Exception e) {
			Logger.log(DbInit.class, e);
		} finally {
			try { 
				mySql.close(); 
			} catch(Exception e) {
				Logger.log(DbInit.class, e);
			}
		}//catch
		return successfully;
	}
	
	public static void main(String[] args) {
		Logger.info(DbInit.dbInit());
	}
}
