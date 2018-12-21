package com.dalie.beehive.domain.internal;

import com.dalie.beehive.domain.capi.Domain;
import com.dalie.beehive.domain.model.DomainRef;

public class ProductDomain extends DomainRef implements Domain {

	public ProductDomain(String name, String Id) {
		super(name, Id);
	}

	@Override
	public boolean isApplicationDomain() {
		return false;
	}

	@Override
	public boolean isProductDomain() {
		return true;
	}

	@Override
	public boolean isConfigurationDomain() {
		return false;
	}

	
}
