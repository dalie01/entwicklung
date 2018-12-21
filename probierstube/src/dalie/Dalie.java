package dalie;

import javax.servlet.http.HttpServletRequest;

import selinas.Dokument;
import database.Database;
import database.getDatabase.DataSetDokument;

public class Dalie {

	public static Dokument getDokumentOfDatabase(Database dbConn)
			throws Exception {
		
			dbConn.getConnection();
			Dokument dokumentOfDatabase = DataSetDokument.chain(dbConn, 1, 1,
					"yQ", 1, 1);
			dbConn.close();
			return dokumentOfDatabase;
	}//getDokumentOfDatabase

	public static Dokument getDokumentOfUpdate(Database dbConn,
			HttpServletRequest request) throws Exception {
			Dokument dokumentOfDatabase = null;
			dbConn.getConnection();
			DataSetDokument.update(dbConn, request.getParameter("selinasContent"), 1, 1, "yQ", 1, 1);
			dokumentOfDatabase = DataSetDokument.chain(dbConn, 1, 1, "yQ", 1, 1);
			dbConn.close();
			
			return dokumentOfDatabase;
	}//getDokumentOfDatabase

}//class Dalie

