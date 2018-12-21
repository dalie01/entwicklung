package com.dalie.beehive.localization;

import com.dalie.beehive.domain.capi.Domain;
import com.dalie.beehive.localization.capi.DomainLocalizationResourceMgr;
import com.dalie.beehive.localization.internal.DomainLocalizationResourceMgrImpl;
import com.dalie.beehive.localization.internal.LocalInformation;

/**
 * LookUpHelper to 
 * 
 * @author DALiEWEB
 *
 */
public class LookUpHelper {

	/**
	 * The singleton instance of the LookUpHelper.
	 */
	private static LookUpHelper instance;
	private DomainLocalizationResourceMgr domainLocalizationResourceMgr;
	
	static {
		instance = new LookUpHelper();
	}
	
	private LookUpHelper(){
		this.domainLocalizationResourceMgr = new DomainLocalizationResourceMgrImpl();
	} /* LookUpHelper */
	
	/**
	 * Returns the singleton instance of this class.
	 * @return LookUpHelper object
	 */
	public static LookUpHelper getInstance(){
		return instance;
	} /* getInstance */
	
	public String getLocalizedString(final Domain domain,
			final LocalInformation localInformation, final String key){
		
		return domainLocalizationResourceMgr.getLocalizedString(domain, 
				localInformation.getLocale(), key);
	} /* getLocalizedString */
	
	
} /* LookUpHelper */
