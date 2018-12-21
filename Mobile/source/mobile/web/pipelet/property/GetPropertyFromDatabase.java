package mobile.web.pipelet.property;

import mobile.utilities.Pipelet;
import mobile.utilities.capi.PipelineDictionary;
import mobile.utilities.exceptions.PipeletExecutionException;
import database.Database;

/**
 * Pipelet: Get Property by 
 * PropertyId and CountryId 
 * form Database.
 * 
 * @author DALiEWEB
 *
 */
public class GetPropertyFromDatabase extends Pipelet {

	static final long serialVersionUID = 43L;
	
	/**
	 * Constant used to access the pipeline dictionary with key 'Id'
	 */
	public static final String DN_IN_PROPERTY_ID = "Id";
	
	/**
	 * Constant used to access the pipeline dictionary with key 'cId'
	 */
	public static final String DN_IN_PROPERTY_CID = "cId";
	
	/**
	 * Constant used to access the pipeline dictionary with key 'Property'
	 */
	public static final String DN_OUT_PROPERTY = "Property";
	
	
	Database mySql;
	
	@Override
	public int execute(PipelineDictionary dict) throws PipeletExecutionException {
		
//		String propertyId = (String)dict.get(DN_IN_PROPERTY_ID);
//		if (propertyId == null) {
//			throw new PipeletExecutionException(
//		      "Mandatory input parameter '" + DN_IN_PROPERTY_ID + 
//					"' not available in pipeline dictionary.");
//		}
//		String countryId = (String)dict.get(DN_IN_PROPERTY_CID);
//		if (countryId == null) {
//			throw new PipeletExecutionException(
//		      "Mandatory input parameter '" + DN_IN_PROPERTY_CID + 
//					"' not available in pipeline dictionary.");
//		}
		
//		Property prop = null;
//		try {
//			mySql.setUp();
//			prop = DataSetProperty.getProperty(mySql, propertyId, countryId); 
//			mySql.close();
			
//		} catch (Exception e) {
//			return PIPELET_ERROR;
//		}
		
//		dict.put(DN_OUT_PROPERTY, prop);
		return PIPELET_NEXT;
		
	} /* execute */
	
	@Override
	public void init() { 
		
//		mySql = Database.getInstance("mySql");
	} /* init */
	
} /* GetPropertyFromDatabase */
