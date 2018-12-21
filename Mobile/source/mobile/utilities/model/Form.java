/**
 * 
 */
package mobile.utilities.model;

import java.util.Collection;
import java.util.HashSet;

/**
 * Form to define WebFormular
 * 
 * @author DALiEWEB
 * @since 1.0.0.0
 */
public abstract class Form {

	/** Collection errorId */
	protected Collection<String> error;
	
	public Form(){
		error = new HashSet<String>();
	} /* Form */

	/**
	 * Check is WebFormular valid.
	 * @return true in Case Form is Valid
	 */
	public abstract boolean isValid();
	
	/**
	 * @return Collection of ErrorId
	 */
	public Collection<String> getError() {
		return error;
	} /* getError */
	
	
} /* class Form */
