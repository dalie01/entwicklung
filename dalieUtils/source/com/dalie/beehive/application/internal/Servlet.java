package com.dalie.beehive.application.internal;

import com.dalie.beehive.application.capi.WebApplication;
import com.dalie.beehive.application.enums.Type;
import com.dalie.beehive.application.model.Application;

/**
 * Servlet Type of Application.
 * 
 * @author DALiEWEB
 * @since 1.0.0.0
 */
public class Servlet extends Application implements WebApplication {

	private Type type;
	private Page page;
	private PageContent pageContent;
	
	/**
	 * Servlet.
	 * @param repository path of Servlet
	 * @param page Page to forward
	 */
	public Servlet(final String repository, final Page page){
		super(Type.SERVLET, repository);
		this.type = Type.PAGE;
		this.page = page;
	}
	
	/**
	 * Servlet.
	 * @param repository path of Servlet
	 * @param page Page to forward
	 */
	public Servlet(final String repository, final PageContent pagecontent){
		super(Type.SERVLET, repository);
		this.type = Type.PAGE_CONTENT;
		this.pageContent = pagecontent;
	}
	
	/**
	 * Returns the value of attribute 'siteType'.
	 * @return the value of the attribute 'siteType'
	 */
	public String getSiteType() {
		if (this.type == Type.PAGE) {
			return page.getSiteType();
		}
		
		if (this.type == Type.PAGE_CONTENT) {
			return this.pageContent.getSiteContent();
		}
		
		return "";
	} /* siteType */
	
	/**
	 * Returns the value of attribute 'siteTitle'.
	 * @return the value of the attribute 'siteTitle'
	 */
	public String getSiteTitle() {
		if (this.type == Type.PAGE) {
			return page.getSiteTitle();
		}

		return "";
	} /* siteTitle */


	@Override
	public String getSiteContent() {
		if (this.type == Type.PAGE) {
			return this.page.getSiteContent();
		}
		return "";
	}

	@Override
	public String getServletRepository() {
		return this.getRepository();
	}

}
