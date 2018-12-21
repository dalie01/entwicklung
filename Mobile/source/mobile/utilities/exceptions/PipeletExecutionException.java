package mobile.utilities.exceptions;

/**
 * 
 * PipeletExecuteException
 * 
 * @author DALiEWEB
 *
 */
public class PipeletExecutionException extends Exception {

	/**
	 * PipeletExecutionException
	 */
	public PipeletExecutionException() {
	}

	/**
	 * @param message String
	 */
	public PipeletExecutionException(String message) {
		super(message);
	}

	/**
	 * @param ex Exception
	 */
	public PipeletExecutionException(Exception ex) {

		super(ex);
	} /* PipeletExecutionException */

	/**
	 * @param message String
	 * @param ex Exception
	 */
	public PipeletExecutionException(
			final String message, final Exception ex) {
		
		super(message, ex);
	} /* PipeletExecutionException */
	
} /* PipeletExecutionException */
