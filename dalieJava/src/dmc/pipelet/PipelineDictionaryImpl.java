package dmc.pipelet;

import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;

public class PipelineDictionaryImpl implements PipelineDictionary {

	private HashMap<String, Object> dictionary = null;
	
	public PipelineDictionaryImpl() {
		dictionary = new HashMap<String, Object>();
	}
	
	@Override
	public void put(String aKey, Object aValue) {
	     
		if (StringUtils.isNotEmpty(aKey)) {
	     
	    	 dictionary.put(aKey, aValue);
		}
	}

	
	@Override
	public Object get(String paramString) {
		return dictionary.get(paramString);
	}



	     
}
