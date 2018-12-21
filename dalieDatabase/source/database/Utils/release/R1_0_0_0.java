package database.Utils.release;

import java.io.FileInputStream;
import java.util.Properties;

import database.Database;
import database.Table;
import database.factory.country.DataTableCountry;
import database.factory.postalCode.DataTablePostalCode;
import database.factory.property.DataTableProperty;
import database.factory.session.DataTableSessionInfo;
import database.factory.type.DataTableType;
import logging.Logger;

public class R1_0_0_0 extends Release {
	
	
	public R1_0_0_0() {
		super("1.0.0.0");
	}
	
	@Override
	protected Boolean dbMigrate() throws Exception {
		boolean successfully = false;
		Database mySql = Database.getInstance("mySql","localhost","test","root","inxs");
//		String pfaddatei = System.getProperty("user.dir")
				String pfaddatei = "../src/test/LocalizedStrings.properties";
		try {
			mySql.setUp();
			mySql.dbMigrate(new R1_0_0_0(),new Table[]{new DataTableSessionInfo(), new DataTableProperty(), 
					new DataTablePostalCode(), new DataTableType(), new DataTableCountry()});
			
			Properties property = new Properties();
			property.load(new FileInputStream(pfaddatei));
			successfully = DataTableProperty.executeDbMigrate(mySql, new R1_0_0_0(), property);
						
		} catch (Exception e) {
			Logger.log(R1_0_0_0.class, e);
		} finally {
			try { 
				mySql.close(); 
			} catch(Exception e) { 
				Logger.log(R1_0_0_0.class, e);				
			}
		}//catch
		return successfully;
	}
	
}
