/**
 * 
 */
package mobile.utilities.capi;

import java.util.Map;


/**
 * @author DALiEWEB
 *
 */
public interface PipelineDictionary extends DICT {
	
	/**
	 * put Object to Dictionary.
	 * 
	 * @param paramString Key Value
	 * @param paramObject Object Value
	 */
	public void put(final String aKey, 
			final Object aValue);

	/**
	 * remove Object to Dictionary.
	 * 
	 * @param paramString Key Value
	 */
	public void remove(final String aKey);
	
	/**
	 * get Object from Dictionary.
	 * 
	 * @param paramString Key Value
	 * @return Object as stored on Dictionary
	 */
	public Object get(final String aKey);

	public Map<String, Object> getDictionary();
	
	/**
	 * console out all dictionaryValues 
	 */
	public void debug();
	
} /* PipelineDictionary */
