package mobile.utilities.support;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.PatternSyntaxException;

import javax.servlet.ServletRequest;

import org.apache.commons.lang3.StringUtils;

/**
 * ParmSupporter
 * 
 * @author DALiEWEB
 * @since 1.0.0.0
 */
public class ParmSupporter {
	
	private String line;
	private ServletRequest sR;
	
	private Map<String, String> parms = new HashMap<String, String>();
	
	/**
	 * URL with given Parameters from per Line.
	 * e.g Line by PropertyId=${param.PropertyId};CountryId=WorldWorld
	 * 
	 * @param line parameter Line
	 */
	public ParmSupporter(String line) {
		this.line = line;
		parseLine();
	} /* ParmSupporter */
	
	/**
	 * URL with all Parameters from ServletRequest.
	 *  
	 * @param sR ServletRequest
	 */
	public ParmSupporter(ServletRequest sR){
		this.sR = sR;
		parseServletRequest();
	} /* ParmSupporter */
	
	/**
	 * URL with all Parameters from ServletRequest and
	 * given Parameters from per Line.
	 * e.g Line by PropertyId=${param.PropertyId};CountryId=WorldWorld
	 * 
	 * @param sR ServletRequest
	 * @param line parameter Line
	 */
	public ParmSupporter(ServletRequest sR, String line){
		this.sR = sR;
		parseServletRequest();
		this.line = line;
		parseLine();
	} /* ParmSupporter */
	
	/**
	 * @return valid UTF8 URL
	 */
	public String getParmUrl(){
		return urlEncodeUTF8(parms);
	} /* getParmUrl */
	
	/**
	 * parseServletRequest and convert To Map.
	 */
	private void parseServletRequest(){
		if (sR != null && sR.getParameterNames() != null) {
			
			Enumeration<?> names = sR.getParameterNames();
			
			while(names.hasMoreElements()){
				String name = (String)names.nextElement();
				String value = sR.getParameter(name);
				
				if ( !StringUtils.equalsIgnoreCase("Page", name) 
						&& StringUtils.isNotEmpty(value)) {
					
					parms.put(name, value);					
				}
			
			} /* while */
			
		} /* endif */

	} /* parseServletRequest */
	
	/**
	 * parse line Arguments and convert to Map.
	 */
	private void parseLine() {
		if (StringUtils.isNotEmpty(line)) {
			String[] allParams = splitString(line, ";");

			if (allParams != null && allParams.length > 0) {
				
				for (String entry : allParams) {
					String[] keyValue = splitString(entry, "=");

					if (keyValue != null && keyValue.length >= 1) {
						parms.put(keyValue[0], keyValue[1]);
					}
				} 
			}
		}

	} /* parseLine */
	
	/**
	 * use String split functionally tread save.
	 * 
	 * @param line String line to splitt
	 * @param splitter regex
	 * @return String[] matches
	 */
	private String[] splitString(String line, String splitter) {
		String[] parms;
		try {
			parms = line.split(splitter);
			
		} catch ( PatternSyntaxException | NullPointerException e) {
			return null;
		} 
		
		return parms;
	}
	
	/**
	 * convert Map to UTF URL.
	 * 
	 * @param map filled by Arguments
	 * @return UTF8 Url 
	 */
	private String urlEncodeUTF8(Map<?,?> map) {
        StringBuilder sb = new StringBuilder();
        if (map.size() > 0) 	
        	
        	for (Map.Entry<?,?> entry : map.entrySet()) {
        		if (sb.length() > 0) sb.append("&");
        		
        		try {
        			sb.append(String.format("%s=%s",
        				urlEncodeUTF8(entry.getKey().toString()),
        				urlEncodeUTF8(entry.getValue().toString())));
        		} catch (UnsupportedEncodingException e) {
        			return "";
        		} 
        	}
        
        return sb.toString();       
    } /* urlEncodeUTF8 */
	
	/**
	 * URL encoded UTF8
	 * 
	 * @param s
	 * @return encoded String 
	 */
	private String urlEncodeUTF8(String s) throws UnsupportedEncodingException {
		try {
            
        	return URLEncoder.encode(s, "UTF-8");
 
        } catch (UnsupportedEncodingException e) {
 
        	throw new UnsupportedOperationException(e);
        }
        
    } /* urlEncodeUTF8 */
	
} /* class ParmSupporter */
