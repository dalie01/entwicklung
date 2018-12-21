package database.factory.postalCode.business;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import database.Database;
import database.factory.postalCode.DataTablePostalCode;
import model.internal.postalCode.PostalCode;

public class DataSetPostalCode extends DataTablePostalCode {

	protected DataSetPostalCode() throws Exception {
		super();
	}

	public static PostalCode getPostalId(final Database db, 
			final String postalId) throws Exception {
		
		PostalCode pC = null;

		List<List<Object>> rows = db.executeQuery("select * from " + db.getDbSchema() + "."  
						+ DataTablePostalCode.Id + " where postalId = '" + postalId + "'");
		
		if(rows.size() == 0)
			throw new Exception("Record not Found");

		for(int i = 0;i < rows.size();i++) {
			pC = new PostalCode(rows.get(i));
		}//for

		return pC;
	} /* getPostalById */
	
	public static List<PostalCode> findPostalCodesbyCountryId(final Database db, 
			final String countryId) throws Exception {
		
		List<PostalCode> pCodes = Collections.synchronizedList(new ArrayList<PostalCode>());
		
		List<List<Object>> rows = db.executeQuery("select * from " + db.getDbSchema() + "."  
				+ DataTablePostalCode.Id + " where countryId = '" + countryId + "'");
		
		if(rows.size() == 0)
			throw new Exception("Record not Found");

		for(int i = 0;i < rows.size();i++) {
			pCodes.add(new PostalCode(rows.get(i)));
		}//for

		return pCodes;
	} /* findPostalCodebyCountryId */
	
	public static List<PostalCode> findPostalCodesByPostalCode(final Database db, 
			final String postalCode) throws Exception {
		
		List<PostalCode> pCodes = Collections.synchronizedList(new ArrayList<PostalCode>());
		
		List<List<Object>> rows = db.executeQuery("select * from " + db.getDbSchema() + "." 
					+ DataTablePostalCode.Id + " where postalCode = '" + postalCode + "'");
		
		if(rows.size() == 0)
			throw new Exception("Record not Found");

		for(int i = 0;i < rows.size();i++) {
			pCodes.add(new PostalCode(rows.get(i)));
		}//for

		return pCodes;
	} /* findPostalCodesByPostalCode */
	
	public static List<PostalCode> getAllPostalCodes(final Database db) throws Exception {
		List<PostalCode> pCodes = Collections.synchronizedList(new ArrayList<PostalCode>());

		List<List<Object>> rows = db.executeQuery("select * from " + db.getDbSchema() + "."  
				+ DataTablePostalCode.Id);
		
		if(rows.size() == 0)
			throw new Exception("Record not Found");

		for(int i = 0;i < rows.size();i++) {
			pCodes.add(new PostalCode(rows.get(i)));
		}//for

		if(pCodes.size() == 0)
			throw new Exception("Records not Found");

		return pCodes;
	} /* getAllPostalCodes */
	
	
} /* DataSetPostalCode */
