package dalie.imme.design.sf.internal.navigation;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;


/**
 * Handling Navigation on barn-design.
 * 
 * @author dalie
 * @since 1.0.0.0
 * 
 */
public class Navigation {

	private static Navigation instance = null;
	/**
	 * Constant define path to JSP-StiteType01
	 */
	public static final String SiteType01 = "/siteType/SiteType01.jsp";
	/**
	 * Constant define path to JSP-StiteType01
	 */
	public static final String SiteType02 = "/siteType/SiteType02.jsp";
	/**
	 * Constant define path to JSP-StiteType01
	 */
	public static final String SiteType03 = "/siteType/SiteType03.jsp";
	/**
	 * Constant define path to JSP-StiteType01
	 */
	public static final String SiteError = "/ErrorPage";
	/**
	 * Constant define folder path where new a stored products
	 */
	public static final String DIR_WHERE_FOUND_NEW_PICTURE = "/media/images";
	/**
	 * Constant define folder path where new a stored products
	 */
	public static final String DIR_IMMEWEB_PICTURE = "./media/images/web/";
	/**
	 * Constant define path where xml file stored products
	 */
	public static final String DIR_XML_PRODUCTS = "/media/product/internet.xml";
	
	/**
	 *  Constant define to by used path to SiteContent
	 */
	public static final String REQUEST_ATTRIBUTE_LINK_TO_SITE = "LinkToSite";
	/**
	 *  Constant define to by used path to SiteContent
	 */
	public static final String REQUEST_ATTRIBUTE_PRODUCT = "Product";
	/**
	 *  Constant define to by used path to SiteContent
	 */
	public static final String REQUEST_ATTRIBUTE_PRODUCT_ATTRIBUTES = "ProductAttributes";
	/**
	 *  Constant define to by used path to SiteContent
	 */
	public static final String REQUEST_ATTRIBUTE_PRODUCT_IMAGE_LINKS = "ProductImageLinks";
	
	
	/**
	 *  Constant define to by used path to SiteContent
	 */
	public static final String SESSION_ATTRIBUTE_PRODCUCTS = "Products";
	
	public static String[] allNavigations = {"START", "HISTORY", "CONCEPT", "PRODUCT","CONTACT"};
	
	/** The instance of first type */
	public static final Navigation startPage = new Navigation(
			SiteType01, "/start/StartPage.jsp");

	/** The instance of first type */
	public static final Navigation historyPage = new Navigation(
			SiteType02, "/history/HistoryPage.jsp");
    
	/** The instance of first type */
	public static final Navigation conceptPage = new Navigation(
			SiteType02, "/concept/ConceptPage.jsp");
	
	/** The instance of first type */
	public static final Navigation productPage = new Navigation(
			"/ImmeProd", "/product/ProductPage.jsp");
	
	/** The instance of first type */
	public static final Navigation contactPage = new Navigation(
			SiteType02, "/contact/ContactPage.jsp");
	
	/** The instance of first type */
	public static final Navigation productDetailPage = new Navigation(
			"/ImmeProdDetail", "/product/ProductDetailPage.jsp");
	
	private String siteType = null;
	private String siteLink = null;
	
	private Map<String, Navigation> memberTable = null;
	
	/**
	 * private default constructor, because hide this instance.   
	 */
	private Navigation() {
		this.memberTable = init();
	}
	
	/**
	 * Constructor.
	 * 
	 * @param siteType Key to determine SiteType
	 * @param siteLink Value to determine SiteLink
	 */
	private Navigation(String siteType, String siteLink){
		this.siteType = siteType;
		this.siteLink = siteLink;
	} /* Navigation */
	
	/**
	 * static Method, delivered a own Instance of this class.
	 * 
	 * @return {@link Navigation} 
	 */
	public static Navigation getInstance() {
		if (instance == null) {
            instance = new Navigation();
        }

        return instance;
    }


	/**
	 * put all SiteTypes and SiteLink to Navigation.
	 * @return navigation filled by barn-design
	 */
	private Map<String, Navigation> init() {
		
		SortedMap<String,Navigation> members = new TreeMap<String, Navigation>();
		members.put("START", startPage);
		members.put("HISTORY", historyPage);
		members.put("CONCEPT", conceptPage);
		members.put("PRODUCT", productPage);
		members.put("CONTACT", contactPage);
		members.put("PRODUCTDETAIL", productDetailPage);

        return Collections.unmodifiableSortedMap(members);
    } /* init */
	
	/**
     * Returns a new Navigation based on the given String value.
     * @param argum SiteType required
     */
    public Navigation valueOf(String argum) {
        Navigation navigation = null;
        
        if (argum != null) 
            navigation = memberTable.get(argum);
        
        if (navigation == null) {
        	return new Navigation("/ErrorPage.jsp", "/ErrorPage.jsp");
        } /* endif */
        
        return navigation;
    } /* valueOf */ 
	
    
    
    
	/**
	 * Returns the all Navigations
	 * @return memberTable all Navigations
	 */
	public Map<String, Navigation> getMemberTable() {
		return this.memberTable;
	}

	/** Returns the SiteType of this Navigation */
    public String getSiteType(){
        return this.siteType;
    } /* getSiteType() */ 
    
    /** Returns the SiteLink of this Navigation */
    public String getSiteLink(){
        return this.siteLink;
    } /* getSiteLink() */ 
    
    /** Returns the SiteLink of this Navigation */
    public String toString(){
        return this.siteLink;
    } /* toString() */ 

} /* class Navigation */
