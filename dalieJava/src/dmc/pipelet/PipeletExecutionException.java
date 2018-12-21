package dmc.pipelet;

/**
 * @author dalieuwe
 *
 */
public class PipeletExecutionException extends Exception {

	/**
	 * PipeletExecutionException
	 */
	public PipeletExecutionException() {
	}

	/**
	 * @param message
	 */
	public PipeletExecutionException(String message) {
		super(message);
	}

	/**
	 * @param ex
	 */
	public PipeletExecutionException(Exception ex) {
		super(ex);
	}

	/**
	 * @param message
	 * @param ex
	 */
	public PipeletExecutionException(String message, Exception ex) {
		super(message, ex);
	}

	/** @deprecated */
	@Deprecated
	public Exception getNestedException() {
		return ((Exception) getCause());
	}

}
