package com.dalie.beehive.localization.internal;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import com.dalie.beehive.domain.capi.Domain;
import com.dalie.beehive.localization.capi.DomainLocalizationResourceMgr;

public class DomainLocalizationResourceMgrImpl 
			implements DomainLocalizationResourceMgr {

	private Map<String, LocalizationResources> domainLocalizationResourcesMap =
			new HashMap<String, LocalizationResources>();
	
	public String getLocalizedString(final Domain domain, 
			final Locale locale, final String key){
		
		String result = null;
		
		LocalizationResources localizationResourcesForDomain =
				domainLocalizationResourcesMap.get(domain.getId());
		
		if (localizationResourcesForDomain == null) {
			
			synchronized (this) {
				
				if (domainLocalizationResourcesMap.get(domain.getId()) == null) {
					localizationResourcesForDomain = new LocalizationResources(domain);
					
					domainLocalizationResourcesMap.put(domain.getId(), localizationResourcesForDomain);
				} else {
					
					localizationResourcesForDomain = new LocalizationResources(domain);
				}
				
			}
			
		}
		
		try {
			result = localizationResourcesForDomain.getString(locale, key);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		return result;
	}
	
} /* DomainLocalizationResourceMgrImpl */
