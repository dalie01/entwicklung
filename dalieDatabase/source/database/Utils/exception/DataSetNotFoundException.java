package database.Utils.exception;

/**
 * DataSetNotFoundExceptions
 * 
 * @author DALiEWEB
 * @since 1.0.0.0	
 */
public class DataSetNotFoundException extends Exception {

	/**
	 * DataSetNotFoundException
	 */
	public DataSetNotFoundException(){
		super(DataSetExceptions.EX_RECORD_NOT_FOUND);
	} /* DataSetNotFoundException */
	
} /* DataSetNotFoundException */
