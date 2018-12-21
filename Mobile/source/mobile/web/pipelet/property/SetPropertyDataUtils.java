package mobile.web.pipelet.property;

import mobile.utilities.Pipelet;
import mobile.utilities.capi.PipelineDictionary;
import mobile.utilities.exceptions.PipeletExecutionException;
import database.Database;

public class SetPropertyDataUtils extends Pipelet {

	/**
	 * Constant used to access the pipeline dictionary with key 'Id'
	 */
	public static final String DN_IN_OUT_PROPERTY = "Property";
	
	Database mySql;
	
	@Override
	public int execute(PipelineDictionary dict) 
			throws PipeletExecutionException {
		
//		FormProperty webFormProperty = (FormProperty)dict.get(DN_IN_OUT_PROPERTY);
//		if (webFormProperty == null) {
//			throw new PipeletExecutionException(
//					"Mandatory input parameter '" + DN_IN_OUT_PROPERTY + 
//					"' not available in pipeline dictionary.");
//		} /* endif */
		
//		try {
//			Property prop = null;
//			mySql.setUp();
//			prop = DataSetProperty.getProperty(mySql, 
//					webFormProperty.getPropertId(), webFormProperty.getCountryId()); 
//			mySql.close();
				
//			webFormProperty.setDataUtils(prop.getDataUtils());
//			dict.put(DN_IN_OUT_PROPERTY, webFormProperty);
				
			return PIPELET_NEXT;

//		} catch (Exception e) {

//			return PIPELET_ERROR;
//		} /* try */
		
	} /* execute */
	
	public void init() { 
		
		mySql = Database.getInstance("mySql");
	} /* init */
} 
