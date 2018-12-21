package com.dalie.beehive.application.capi;


/**
 * @author DALiEWEB
 *
 */
public interface WebApplication {

	/**
	 * Returns the value of attribute 'siteTitle'.
	 * @return the value of the attribute 'siteTitle'
	 */
	public String getSiteTitle(); /* siteTitle */

	/**
	 * Returns the value of attribute 'siteType'.
	 * @return the value of the attribute 'siteType'
	 */
	public String getSiteType(); /* siteType */

	/**
	 * Returns the value of attribute 'siteContent'.
	 * @return the value of the attribute 'siteContent'
	 */
	public String getSiteContent(); /* siteContent */
	
	/**
	 * Returns the value of attribute 'servletRepository'.
	 * @return the value of the attribute 'servletRepository'
	 */
	public String getServletRepository();
	
	/**
	 * @return true is Page.
	 */
	public boolean isPage(); /* isPage */
	
	/**
	 * @return true is not Servlet or Page
	 */
	public boolean isPageContent();
	
	/**
	 * @return true is Servlet
	 */
	public boolean isServlet(); /* isServlet */
		
	
} /* interface WebApplication */
