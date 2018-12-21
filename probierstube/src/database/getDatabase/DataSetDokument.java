package database.getDatabase;

import java.util.Vector;


import selinas.Dokument;
import database.Database;

public class DataSetDokument {

	public static synchronized Dokument chain(Database dbConn, int kundenId,
			int standortId, String typ, int nr, int id) throws Exception {
		
			Vector rows = dbConn.executeQuery("select * from "
					+ dbConn.getDbSchema() + ".dokument " + "where kundenId = "
					+ kundenId + " and standortId = " + standortId
					+ " and typ = '" + typ + "'" + " and nummer = " + nr
					+ " and id = " + id + "");
			if (rows.size() == 0)
				throw new Exception("Record not Found");
			
			return new Dokument((Vector) rows.elementAt(0));
		
	}//chain

	public static synchronized void update(Database dbConn, String content,
			int kundenId, int standortId, String typ, int nr, int id)
			throws Exception {
			try {
				dbConn.executeUpdate("update " + dbConn.getDbSchema()
						+ ".dokument " + " set content='" + content
						+ "', changeUser='DV0101', changeDate=now()"
						+ "where kundenId = " + kundenId + " and standortId = "
						+ standortId + " and typ = '" + typ + "'"
						+ " and nummer = " + nr + " and id = " + id + "");
			} catch (Exception e) {
				throw new Exception("DataSetDokument.update <br>"
						+ e.getMessage());
			}
	}//update

}//class DataSetDokument

