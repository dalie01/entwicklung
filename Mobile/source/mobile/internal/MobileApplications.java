package mobile.internal;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import com.dalie.beehive.application.capi.WebApplication;
import com.dalie.beehive.application.internal.Page;
import com.dalie.beehive.application.internal.PageContent;
import com.dalie.beehive.application.internal.Servlet;
import com.dalie.beehive.application.model.Application;

/**
 * 
 * @author DALiEWEB
 *
 */
public class MobileApplications {

	private static MobileApplications instance = null;
	/**
	 * Constant define path to JSP-StiteType01
	 */
	public static final String SiteType01 = "/SiteType01";
	/**
	 * Constant define path to JSP-StiteType02
	 */
	public static final String SiteType02 = "/SiteType02";
	
	/**
	 * static Method, delivered a own Instance of this class.
	 * 
	 * @return {@link Application} 
	 */
	public static MobileApplications getInstance() {
		if (instance == null) {
            instance = new MobileApplications();
        }

        return instance;
    }
	
	private Map<String, WebApplication> applications = null;
	
	private MobileApplications(){
		this.applications = loadApplications();
	}
	
	private Map<String, WebApplication> loadApplications(){
		SortedMap<String, WebApplication> apps = new TreeMap<String, WebApplication>();
		apps.put("DALIE", new Page("/Dalie", SiteType02, "DAliE"));
		apps.put("MAIN", new Page("/Main", SiteType01, "DAliE-Backoffice"));
		apps.put("TRYOUT", new Page("/TryOut",SiteType02, "TryOuts"));
		apps.put("LOGO-BANNER", new PageContent("/Line"));
		apps.put("LOGO-BANNER-CITY", new PageContent("/Line_City"));
		apps.put("LOGO-BANNER-STEET", new PageContent("/Line_Street"));
		apps.put("LOGO-BANNER-PHONE", new PageContent("/Line_Phone"));
		apps.put("LOGO-BANNER-MAIL", new PageContent("/Line_Mail"));
		apps.put("LOGO-BANNER-MOBILE", new PageContent("/Line_Mobile"));
		apps.put("LOGO-BANNER-WEB", new PageContent("/Line_Web"));
		apps.put("LOGO-BANNER-HOBBIES", new PageContent("/Line_Hobbies"));
		apps.put("LOGO-BANNER-RESUME", new PageContent("/Line_Resume"));
		apps.put("RESUME", new Page("/Resume",SiteType02, "Resume"));
		apps.put("PAGE", new Page("/Page", SiteType01, "Page"));
		apps.put("ERROR", new Page("/ErrorSite", SiteType01, "Error"));
		apps.put("ERROR-CONTENT", new PageContent("/Error"));
		apps.put("SERVICEOPTIONS", new Servlet("/ServiceOptions", new Page("/ServiceOptionsList", SiteType01, "ServiceOptions")));
		apps.put("AJAX", new Page("/Ajax", SiteType01, "Ajax"));
		apps.put("FAVORITES", new Page("/FavoritesSite", SiteType01, "Favorites"));
		apps.put("FAVORITES-CONTENT", new PageContent("/FavoritesContent"));
		apps.put("BACKOFFICE", new Page("/BackOffice", SiteType01, "Backoffice"));
		apps.put("LANGUAGE-SITE", new Servlet("/Language", new Page("/LanguageSite", SiteType01, "Language")));
		apps.put("LANGUAGE-CONTENT", new Servlet("/Language", new PageContent("/LanguageContent")));
		apps.put("LANGUAGE-SET", new Servlet("/LanguageSetter", new Page("/BackOffice",SiteType01,"Backoffice")));
		apps.put("PROPERTY", new Page("/PropertySite", SiteType01, "Properties"));
		apps.put("PROPERTY-CONTENT", new Servlet("/WebPropertyFormCreate", new PageContent("/PropertyContent")));
		apps.put("PROPERTY-REFRESH", new Servlet("/WebPropertyFormById", new PageContent("/PropertyContentData")));
		apps.put("PROPERTY-REFRESH-01", new Servlet("/WebPropertyFormById", new PageContent("/PropertyMetaData")));
		apps.put("PROPERTY-CHECK", new Servlet("/WebPropertyFormCheck", new PageContent("/PropertyContent")));
		apps.put("PROPERTY-CHECK-01", new Servlet("/WebPropertyFormCheck", new PageContent("/SelectViewPropertyByUpdate")));
		apps.put("PROPERTIES-OVERVIEW-Site", new Page("/OverViewSite", SiteType01, "Properties"));
		apps.put("PROPERTIES-OVERVIEW", new Servlet("/GetAllProperties" ,new PageContent("/OverViewProperties")));
		
		return Collections.unmodifiableMap(apps);
	} /* loadApplications */
	
	/**
     * Returns a new Navigation based on the given String value.
     * @param argum SiteType required
     */
	
	public WebApplication valueOf(String argum) {
		WebApplication application = null;
		
		if (argum != null) 
			application = applications.get(argum);
		
		if (application == null) {
			return new Page("/Dalie",SiteType02,"DALiE");
		} /* endif */
		
		return application;
	} /* valueOf */ 
    
    /**
     * Returns boolean based on the given String value.
     * @param argum SiteType required
     */
    public boolean isValid(String argum) {
    	WebApplication application = null;
        
        if (argum != null) 
            application = applications.get(argum);
        
        if (application == null) {
        	return false;
        } /* endif */
        
        return true;
    } /* isValid */
    
} /* class MobileApplications */
