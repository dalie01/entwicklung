package com.dalie.beehive.domain.internal;

import com.dalie.beehive.domain.capi.Domain;
import com.dalie.beehive.domain.model.DomainRef;

public class ApplicationDomain extends DomainRef implements Domain {

	public ApplicationDomain(String name, String Id) {
		super(name, Id);
	}

	@Override
	public boolean isApplicationDomain() {
		
		return true;
	}

	@Override
	public boolean isProductDomain() {
		return false;
	}

	@Override
	public boolean isConfigurationDomain() {
		return false;
	}

	
}
