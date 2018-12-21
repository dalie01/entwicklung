package mobile.utilities.support;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

/**
 * @author DALiEWEB
 * @since 1.0.0.0
 */
public class RegSupporter {
	
	/**
	 * Check Parameter exist.
	 * 
	 * @param req HttpServletRequest
	 * @param argum Value to found.
	 * 
	 * @return true in case is found other wise false
	 */
	public static boolean isInRequest(
			final HttpServletRequest req, final String argum) {
		
		return isInRequest(req, argum, false);
	} /* isInRequest */
	
	/**
	 * Check Parameter exist.
	 * 
	 * @param req HttpServletRequest
	 * @param argum Value to found.
	 * @param debug mode
	 * 
	 * @return true in case is found false otherwise
	 */
	public static boolean isInRequest(
			final HttpServletRequest req, final String argum, boolean debug) {
		boolean found = false;
		
		Map<String, String> mParameter = 
				RegSupporter.getParameterMap(req, debug);
		
		if (mParameter != null ) {
			return mParameter.containsKey(argum);
		}
		
		return found;
	} /* isInRequest */
	
	/**
	 * determine RequestValue
	 * @param req HttpServletRequest
	 * @param argum 
	 * @return 
	 */
	public static String getRequestValue(
			final HttpServletRequest req, final String argum){

		return getRequestValue(req, argum, false);
		
	} /* getRequestValue */
	
	
	/**
	 * determine RequestValue.
	 * 
	 * @param req HttpServletRequest
	 * @param argum Name of Parameter
	 * @param debug mode
	 *  
	 * @return String value by RequestParameter Name
	 */
	public static String getRequestValue(
			final HttpServletRequest req, final String argum, boolean debug){

		String parmValue = null;
		
		if (StringUtils.isEmpty(argum)) 
			return parmValue;
		
		Map<String, String> mParameter = 
				RegSupporter.getParameterMap(req,debug);
		
		if (mParameter == null) 
			return parmValue;
		
		if(mParameter.containsKey(argum)) 
			parmValue = mParameter.get(argum);
		
		return parmValue;
	} /* getRequestValue */
	
	/**
	 * Determine Map<String, String> all Parameters. 
	 * 
	 * @param req HttpServletRequest
	 * @return map hold all HttpServletParameter
	 */
	public static Map<String,String> getParameterMap(
			final HttpServletRequest req, final boolean debug){
		
		Map<String, String> mParameter = new HashMap<String, String>();
		
		if (req == null || ! req.getParameterNames().hasMoreElements()) {
			return null;
		}
		
		Enumeration<?> names = req.getParameterNames();
		
		while (names.hasMoreElements()) {
			String name = (String) names.nextElement();
			
			if (debug) System.out.println(name +":"+ req.getParameter(name));
			
			mParameter.put(name, req.getParameter(name));
		}
		
		return mParameter;
	}
	
} /* HttpRequestHelper */
