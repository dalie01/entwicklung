package com.dalie.beehive.localization.capi;

import java.util.Locale;

import com.dalie.beehive.domain.capi.Domain;

public interface DomainLocalizationResourceMgr {

	public String getLocalizedString(final Domain domain, 
			final Locale locale, final String key);
}
