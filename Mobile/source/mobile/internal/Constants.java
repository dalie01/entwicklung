package mobile.internal;

import java.io.Serializable;

public class Constants implements Serializable {

	/**
	 * Constant define MobileApplication
	 */
	public static final String APPLICATIONID = "MobileApplication";
	public static final String SITE_CONTENT = "SiteContent";
	public static final String SITE_TITLE = "SiteTitle";
	public static final String SITE_ERROR = "ErrorMessage";
	
	/**
	 * Constant used to access the pipeline dictionary with key 'ServiceOptions'
	 */
	public static final String SERVICEOPTIONS = "ServiceOptions";
	/**
	 * Constant used to access the pipeline dictionary with key 'FolderToXML'
	 */
	public static final String DIR_XML_SERVICEOPTIONS = 
			"/media/serviceoptions/ServiceOptionResponse.xml";	
	
	/**
	 * Constant used to access the pipeline dictionary with key 'PropertiesRecent'
	 */
	public static final String PROPERTIES_RECENT = "PropertiesRecent";
	/**
	 * Constant used to access the pipeline dictionary with key 'Property'
	 */
	public static final String PROPERTY = "Property";
	
	public static final String ALL_LOCAL_INFORMATIONS = "allLocalInformations";
	public static final String LANGUAGE_SELECTED_ID = "SelectedLanguage";
	public static final String PROPERTY_ID = "Id";
	public static final String PPOPERTY_COUNTRY_ID = "cId";
	

}
