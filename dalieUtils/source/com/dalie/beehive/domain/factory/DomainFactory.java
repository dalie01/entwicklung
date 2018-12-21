package com.dalie.beehive.domain.factory;

import java.util.Map;

import com.dalie.beehive.domain.capi.Domain;

/**
 * DomainFactory to handle different Object scope.
 * 
 * @author DALiEWEB
 * @since 1.0.0.0
 */
public abstract class DomainFactory {
		
	/** all Domains constraint by Application */
	public Map<String, Domain> allApplications = loadDomains();
	/** load all Domains by Application */
	public abstract Map<String, Domain> loadDomains();
	
	/** get domain by argument they are as already stored */
	public Domain getApplicationDomain(final String argum){
		Domain doamin = null;
		doamin = this.allApplications.get(argum);
		return doamin;
	}
	
} /* DomainFactory */
