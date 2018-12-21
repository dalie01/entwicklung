package com.dalie.beehive.application.internal;

import com.dalie.beehive.application.capi.WebApplication;
import com.dalie.beehive.application.enums.Type;
import com.dalie.beehive.application.model.Application;

/**
 * PageContent Type of Application.
 * 
 * @author DALiEWEB
 * @since 1.0.0.0
 */
public class PageContent extends Application implements WebApplication {

	/**
	 * PageContent
	 * @param repository path of Page
	 */
	public PageContent(final String repository){
		super(Type.PAGE_CONTENT, repository);
	}

	@Override
	public String getSiteType() {
		return "";
	}

	@Override
	public String getSiteTitle() {
		return "";
	}

	@Override
	public String getSiteContent() {
		return this.getRepository();
	}

	@Override
	public String getServletRepository() {
		return "";
	}
	
}
