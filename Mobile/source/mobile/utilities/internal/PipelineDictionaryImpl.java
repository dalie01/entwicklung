/**
 * 
 */
package mobile.utilities.internal;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import mobile.utilities.capi.PipelineDictionary;

/**
 * Handle a Map over all 
 * 	affiliated Pipelets to a Pipeline.
 * 
 * @author DALiEWEB
 *
 */
public class PipelineDictionaryImpl implements PipelineDictionary {

	private HashMap<String, Object> dictionary = null;
	
	/**
	 * PipelineDictionaryImpl
	 */
	public PipelineDictionaryImpl() { 
		dictionary = new HashMap<String, Object>();
	}
	
	@Override
	public void put(String aKey, Object aValue) {
		
		if (StringUtils.isNotEmpty(aKey)) 
	    	 dictionary.put(aKey, aValue);

	} /* put */

	@Override
	public Object get(String aKey) {

		return dictionary.get(aKey);
	} /* get */	

	@Override
	public void remove(String aKey) {
	
		if (StringUtils.isNotEmpty(aKey)) 
			
			if(dictionary.containsKey(aKey))
				dictionary.remove(aKey);
				
	}/* remove */
	
	@Override
	public Map<String,Object> getDictionary() {
		
		return this.dictionary;
	} /* get */

	
	/**
	 * console out all dictionaryValues 
	 */
	@Override
	public void debug() {
		
		for( Map.Entry<String, Object> entry : 
			getDictionary().entrySet() ) {
			
			System.out.println(
					entry.getKey() + "," + entry.getValue().toString() );
			
		}
	}/* debugDict */
	
} /* PipelineDictionaryImpl */
