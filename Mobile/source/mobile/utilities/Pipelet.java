package mobile.utilities;

import mobile.utilities.capi.DICT;
import mobile.utilities.capi.PipelineDictionary;
import mobile.utilities.exceptions.PipeletExecutionException;


/**
 * 
 * Pipelet execute business Logic.
 * 
 * @author DALiEWEB
 *
 */
public abstract class Pipelet implements DICT {
	
	public static final int PIPELET_NEXT = 1;
	public static final int PIPELET_ERROR = 2;
	
	public Pipelet() {
		init();
	}
	
	public abstract int execute(PipelineDictionary dict)
			throws PipeletExecutionException;

	public void init() {}
}
