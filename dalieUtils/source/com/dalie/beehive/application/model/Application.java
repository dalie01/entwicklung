package com.dalie.beehive.application.model;

import com.dalie.beehive.application.enums.Type;

/**
 * Application form Type Page or Servlet
 * 
 * @author DALiEWEB
 *
 */
public abstract class Application {

	private final Type type;
	private final String repository;
	
	/**
	 * @param type Type of Application
	 * @param repository Path of Application
	 */
	public Application(final Type type, final String repository){
		this.type = type;
		this.repository = repository;
	} /* Application */
	
	public abstract String getSiteContent();
	
	/**
	 * @return true is Page.
	 */
	public boolean isPage(){
		if (this.type == Type.PAGE) {
			return true;
		}
		
		return false;
	} /* isPage */
	
	/**
	 * @return true is Servlet
	 */
	public boolean isServlet() {
		if (this.type == Type.SERVLET) {
			return true;
		}
		
		return false;
	} /* isServlet */
	
	/**
	 * @return true is not Servlet or Page
	 */
	public boolean isPageContent() {
		if (this.type == Type.PAGE_CONTENT) {
			return true;
		}
		return false;
	}
	
	/**
	 * Returns the value of attribute 'repository'.
	 * @return the value of the attribute 'repository'
	 */
	public String getRepository() {
		return repository;
	}
	
} /* class Application */
