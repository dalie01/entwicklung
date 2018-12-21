package database.factory.session.business;

import java.util.List;

import database.Database;
import database.factory.session.DataTableSessionInfo;
import model.internal.session.SessionInfo;

public class DataSetSessionInfo extends DataTableSessionInfo {
	

	public static SessionInfo getSessionId(final Database db, 
			final String sessionID) throws Exception {
		
		SessionInfo sI = null;

		List<List<Object>> rows = db.executeQuery("select * from " + db.getDbSchema() + "."  
						+ DataTableSessionInfo.Id + " where sessionId = '" + sessionID + "'");
		
		if(rows.size() == 0)
			throw new Exception("Record not Found");

		for(int i = 0;i < rows.size();i++) {
			sI = new SessionInfo(rows.get(i));
		}//for

		return sI;
	} /* getSessionInfo */

}
