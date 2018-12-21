package com.dalie.beehive.application.internal;

import com.dalie.beehive.application.capi.WebApplication;
import com.dalie.beehive.application.enums.Type;
import com.dalie.beehive.application.model.Application;

/**
 * Page Type of Application.
 * 
 * @author DALiEWEB
 * @since 1.0.0.0
 */
public class Page extends Application implements WebApplication {

	private final String siteType;
	private final String siteTitle;
	
	/**
	 * Page
	 * @param repository path of Page
	 * @param siteType kind of SiteType 
	 * @param siteTitle SiteTitle
	 */
	public Page(final String repository, final String siteType, final String siteTitle){
		super(Type.PAGE, repository);
		this.siteType = siteType;
		this.siteTitle = siteTitle;
	} /* Page */

	/**
	 * Returns the value of attribute 'siteType'.
	 * @return the value of the attribute 'siteType'
	 */
	public String getSiteType() {
		return siteType;
	} /* siteType */
	
	/**
	 * Returns the value of attribute 'siteTitle'.
	 * @return the value of the attribute 'siteTitle'
	 */
	public String getSiteTitle() {
		return siteTitle;
	} /* siteTitle */

	@Override
	public String getSiteContent() {
		return this.getRepository();
	}

	@Override
	public String getServletRepository() {
		return null;
	}

	
} /* class Page */
