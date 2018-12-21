package mobile.utilities.support;

import javax.servlet.jsp.PageContext;

import mobile.factorys.MobileLocalInformationFactory;

import com.dalie.beehive.localization.internal.LocalInformation;

public abstract class JspSupporter {

	/** valid Scopes by PageContext */
	private final static int[] scopes = {
			PageContext.REQUEST_SCOPE,
			PageContext.PAGE_SCOPE,
			PageContext.SESSION_SCOPE
	};
	
	public static LocalInformation getCurrentLocalInformation(PageContext pageContext){
		LocalInformation current = null;
		Object localInformation = lookUpPageContext(pageContext, LocalInformation.class.getName());
		
		if (localInformation != null 
				&& localInformation instanceof LocalInformation){  
		
			current = (LocalInformation)localInformation;
			
		} else {
			
			current = MobileLocalInformationFactory.getInstance()
			.getLocalInformation(pageContext.getRequest()
					.getLocale().getLanguage());
		}
		
		return current;
	}
	
	/**
	 * Looking for Attribute by PageContext.
	 * @param argum to find Attribute on PageContext
	 * @return object  
	 */
	private static Object lookUpPageContext(PageContext pageContext, String argum){
		Object object = null;
		int i = 0;
		do {
			object = pageContext.getAttribute(argum, scopes[i]);
			
		} while (++i < scopes.length && object == null);
		
		return object;
	} /* lookUpPageContext */
}
