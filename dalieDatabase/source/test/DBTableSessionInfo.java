package test;

import java.util.Map;

import database.Database;
import database.factory.session.business.DataSetSessionInfo;
import logging.Logger;
import model.internal.session.SessionInfo;

public class DBTableSessionInfo {

	public static void main(String[] args) {

		Database mySql = Database.getInstance("mySql");
		try {
			mySql.setUp();
			SessionInfo ct = DataSetSessionInfo.getSessionId(mySql, "2");
			System.out.println(ct);
			
			@SuppressWarnings("unchecked")
			Map<String,Object> t = (Map<String, Object>) ct.getDictionary();


			for (Map.Entry<String, Object> entry : t.entrySet()) {
				System.out.println(entry.getKey() + "/" + entry.getValue().toString());
			}

		} catch (Exception e) {
			Logger.log(DBTableSessionInfo.class, e);
			
		} finally {
			try {
				mySql.close();
				
			} catch (Exception e) {
				Logger.log(DBTableSessionInfo.class, e);
				
			}

		} /* catch */

	} /* main */
}
