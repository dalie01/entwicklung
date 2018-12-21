package mobile.web.pipelet.property;

import mobile.utilities.Pipelet;
import mobile.utilities.capi.PipelineDictionary;
import mobile.utilities.exceptions.PipeletExecutionException;
import model.internal.property.Property;
import database.Database;
import database.factory.property.DataTableProperty;
import database.factory.property.business.DataSetProperty;

public class SetPropertyToDatabase extends Pipelet{

	/**
	 * Constant used to access the pipeline dictionary with key 'Id'
	 */
	public static final String DN_IN_OUT_PROPERTY = "Property";
	
	private Database mySql;
	
	@Override
	public int execute(PipelineDictionary dict) 
			throws PipeletExecutionException {
		
		Property property = (Property)dict.get(DN_IN_OUT_PROPERTY);
		if (property == null) {
			throw new PipeletExecutionException(
					"Mandatory input parameter '" + DN_IN_OUT_PROPERTY + 
					"' not available in pipeline dictionary.");
		}
		
		try {
			mySql.setUp();
			DataTableProperty.insert(mySql, property.getPropertId(), 
				property.getCountryId(), 
				property.getDescription(), 
				property.getProjectId(), 
				property.getReleaseId());
			mySql.close();
			
				mySql.setUp();
				property = DataSetProperty.getProperty(mySql, property.getPropertId(), property.getCountryId()); 
				mySql.close();
				
			
			dict.put(DN_IN_OUT_PROPERTY, property);
			
			return PIPELET_NEXT;

		} catch (Exception e) {

			return PIPELET_ERROR;
		}
		
	} /* execute */
	
	public void init() { 
		
		mySql = Database.getInstance("mySql");
	} /* init */
	
} /* SetPropertyToDatabase */
