package mobile.utilities.support;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

import mobile.factorys.MobileDomainFactory;
import mobile.factorys.MobileLocalInformationFactory;
import mobile.internal.MobileApplications;
import mobile.tag.Data;

import org.apache.commons.lang3.StringUtils;

import com.dalie.beehive.domain.capi.Domain;
import com.dalie.beehive.localization.LookUpHelper;
import com.dalie.beehive.localization.internal.LocalInformation;

/**
 * @author DALiEWEB
 * @since 1.0.0.0
 */
public abstract class TagSupporter extends TagSupport {
	
	/**
	 * 	Constant used to access the PageContext with key 'DN_LOCAL_SERVER_URL'
	 */
	private static final String DN_LOCAL_SERVER_URL = "LocalServerURL";
	/**
	 * 	Constant used to access the PageContext with key 'INTERNAL_URL_PATTERN'
	 */
	private static final String INTERNAL_URL_PATTERN = "MobileApp?Page=";
	
	/** default Tag Values */
	private static Map<String,String> mTags;
	/** static constructor */
	static {
		mTags = init();
	} /* static */
	
	/**
	 * Load default Tags.
	 * @return tags Map by default Tags
	 */
	private static Map<String,String> init(){
		Map<String,String> tags = new HashMap<String,String>();
		tags.put(Data.ICON, "arrow-l");
		tags.put(Data.TRANSITION, "slide");
		tags.put(Data.DIRECTION, "reverse");
		tags.put(Data.THEME, "c");
		tags.put(Data.DATAOVERLAYTHEME, "c");
		tags.put(Data.DISMISSIBLE, "false");
		tags.put(Data.HISTORY, "false");
		return tags;
	} /* Map */
	
	/** valid Scopes by PageContext */
	private int[] scopes = {
			PageContext.REQUEST_SCOPE,
			PageContext.PAGE_SCOPE,
			PageContext.SESSION_SCOPE
	};
	
	private MobileApplications mApplication = null;
	
	protected String FB = "\'";
	protected String QM = "?";
	protected String EQ = "=";

	/** id-Prefix */
	protected String idSufix;
	/** <div id= */
	protected String id;
	/** id-Prefix */
	protected String idRefix;
	/** href url*/
	protected String href;
	/** href rel */
	protected String rel;
	/** href title */
	protected String title;
	/** href transition */
	protected String transition;
	/** href icon */
	protected String icon;
	/** class additional Class content */
	protected String aclass;
	/** align */
	protected String align;
	/** style */
	protected String style;
	
	/** data-theme */
	protected String dataTheme;
	/** data-overlay-theme= */
	protected String dataOverlayTheme;
	/** data-dismissible */
	protected String dataDismissible;
	/** data-history*/
	protected String dataHistory;
	
	
	/**
	 * Execute processRemoteInclude.
	 * 
	 * @param url String
	 * @throws Exception
	 */
	protected void processRemoteInclude(String url, String parms) throws Exception {
		String serverUrl = null;
		String currentApplication = null;
		String internalApplicationUrl = null;
		String processRemoteServerUrl = null;
		String internalApplicationParms = null;
		try {
			Object localServerUrl  = lookUpPageContext(DN_LOCAL_SERVER_URL);
			if (localServerUrl != null 
					|| localServerUrl instanceof String) 
			
				serverUrl = (String)localServerUrl;
			 
			else {
				
				serverUrl = getLocalServerURL(pageContext.getRequest());
				pageContext.setAttribute(
					 DN_LOCAL_SERVER_URL, serverUrl, 
					 PageContext.SESSION_SCOPE);
				
			} /* endif */
			
			currentApplication = (pageContext.getServletContext().getContextPath() + "/");
			internalApplicationUrl = getLocalApplicationURL(url);
			internalApplicationParms = getApplicationParams(parms);
			
			processRemoteServerUrl = new StringBuilder()
					.append(serverUrl)
					.append(currentApplication)
					.append(internalApplicationUrl)
					.append(internalApplicationParms).toString();
			
			/* build content by InternalServerURL */
			processRemoteIncludeByServer(processRemoteServerUrl);
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} /* try */
	
	} /* processRemoteInclude */
	
	/**
	 * ProcessRemote by ServerURL.
	 * 
	 * @param anUrl
	 * @throws IOException
	 */
	private void processRemoteIncludeByServer(String anUrl) throws IOException {
		  HttpURLConnection con = null;
		  InputStreamReader isr = null;
		  int code = 0;
		  String msg = null;
		  JspWriter out = pageContext.getOut();
		  LocalInformation lInfo = getCurrentLocale(pageContext.getRequest().getLocale());
		 
	try {
		  con = (HttpURLConnection)new URL(anUrl).openConnection();	  
		  con.setRequestProperty("Accept-Language", lInfo.getAcceptLanguage());
		  con.setRequestProperty("Connection", "close");
		  try {
		       code = con.getResponseCode();
		       msg = con.getResponseMessage();
		  } catch (FileNotFoundException e) {
			  code = 404;
			  msg = "Not Found";
		  } /* catch */

		  if ((code & 0x190) == 400) {
			  out.append("<strong>ResponseCode:<strong>" + code + 
					  "<br/> <strong>ResponseMessage:<strong>" + msg);
		  } else {
		  
			  String contentType = con.getContentType();
			  if (contentType != null) {
			  			
				  isr = new InputStreamReader(
						  new BufferedInputStream(con.getInputStream()));
				  int i = 0;
				  char[] cbuf = new char[1024];
				  while (true){
					  i = isr.read(cbuf, 0, 1024);
					  if (i <= 0)
						  break;
					  out.write(cbuf, 0, i);
				  } /* while */

			  } /* endif */
			  
		  } /* endif */
		  
		
		} catch (MalformedURLException e) {

			out.append(e.getMessage());

		} catch (IOException e) {

			out.append(e.getMessage());

		} finally {
			
			if (isr != null) {
			
				try {
					isr.close();
				} catch (IOException e) {

				} /* try */
				
			} /* endif */

			if (con != null)
				con.disconnect();
		} /* finally */
		
	} /* processRemoteIncludeByServer */
	
	public String getApplicationParams(final String aParms){
		StringBuilder sb = new StringBuilder();
		if (StringUtils.isNotEmpty(aParms)) {
			sb.append("&");
			sb.append(aParms);
		}
		return sb.toString();
	}
	
	/**
	 * Build your own internal URL.
	 * 
	 * @param pageUrl String 
	 * @return URL internal for DALIEWEB
	 */
	public String getLocalApplicationURL(final String pageUrl) {
		mApplication = MobileApplications.getInstance();

		StringBuilder internalUrl = new StringBuilder();

		if (StringUtils.contains(pageUrl, EQ)) {

			internalUrl.append(INTERNAL_URL_PATTERN).append(
					StringUtils.substring(pageUrl,
							((pageUrl.lastIndexOf(EQ)) + 1), pageUrl.length()));
		}

		if (!StringUtils.startsWith(pageUrl, INTERNAL_URL_PATTERN)) {

			internalUrl.append(INTERNAL_URL_PATTERN).append(pageUrl);
		}

		String checkUrl = StringUtils.substring(internalUrl.toString(),
				(internalUrl.toString().lastIndexOf(EQ) + 1), 
					internalUrl.toString().length());

		if (mApplication.isValid(checkUrl))

			return internalUrl.toString();

		else {
			return mApplication.valueOf("ERROR-CONTENT").getSiteContent();
		}

	} /* getLocalApplicationURL */
	
	/**
	 * 
	 * Build current local server URL.
	 * 
	 * @param request ServletRequest
	 * @return localServerURL String
	 */
	public String getLocalServerURL(ServletRequest request) {
		int port = request.getServerPort();
		
		StringBuilder result = new StringBuilder();
		
		result.append(request.getScheme()).append("://")
			.append(request.getServerName());

		if (port != 80) {
			result.append(':').append(port);
		}

		return result.toString();
	} /* getLocalServerURL */


	
	/**
	 * Determine actual valid Application-Domain.
	 * is stored on PageContext -> in Case not found
	 * get fall back.
	 * 
	 * @return Domain Application scope
	 */
	protected Domain getCurrentDomain() {
		Domain currentDomain = null;
		Object domain = lookUpPageContext(Domain.class.getName());
		
		if (domain != null 
				|| domain instanceof Domain) 
		
			currentDomain = (Domain)domain;
		 
		else {
			 currentDomain = 
					 MobileDomainFactory.getInstance().getApplicationDomain(
							 pageContext.getServletContext().getContextPath());
			 
			 pageContext.setAttribute(
					 Domain.class.getName(), currentDomain, 
					 PageContext.SESSION_SCOPE); 
		 }	
		
		return currentDomain;
		
	} /* getCurrentDomain */
	
	/**
	 * Localized Date Format.
	 * 
	 * @param key date as String
	 * 
	 * @return dateFormat
	 */
	protected String getLocalizedDateFormat(final String key){
		String localizedDateFormat = "";
		try{
			if (StringUtils.isNotEmpty(key)) {
				Locale currentLanguage = 
						getCurrentLocale(
							pageContext.getRequest().getLocale()).getLocale();
				DateFormat df = DateFormat.getDateTimeInstance(
						DateFormat.LONG, DateFormat.MEDIUM, currentLanguage);
				DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				localizedDateFormat = df.format(dFormat.parse(key));
			}
		} catch (Exception e){
			return key;
		}
		return localizedDateFormat;
	} /* getLocalizedDateFormat */
	
	/**
	 * Determine from 
	 * LocalizedString_language_Country.propties
	 * the Value of Key.
	 * 
	 * @param key to find Value on propertyFiles 
	 * @return value String Value from PropertyFile
	 */
	protected String getLocalizedString(final String key) {
		String fromLocalizedSting = "";
		
		if (StringUtils.isNotEmpty(key)) {

			fromLocalizedSting = LookUpHelper.getInstance()
					.getLocalizedString(
							getCurrentDomain(),
							getCurrentLocale(pageContext.getRequest()
									.getLocale()), key);
		}

		return fromLocalizedSting;

	} /* getLocalizedString */
	
	/**
	 * Get for internal Use the LocalInformation. 
	 * 
	 * @param locale RequestLocale
	 * @return LocalInformation MobileApplication LocalInformation
	 */
	protected LocalInformation getCurrentLocale(Locale locale){
		LocalInformation current = null;
		Object localInformation = lookUpPageContext(LocalInformation.class.getName());
		
		if (localInformation != null 
				&& localInformation instanceof LocalInformation) 
		
			current = (LocalInformation)localInformation;
		 
		else {
			
			current = MobileLocalInformationFactory.getInstance()
						.getLocalInformation(locale.getLanguage());
			
			pageContext.setAttribute(
					 LocalInformation.class.getName(), current, 
					 PageContext.SESSION_SCOPE);
		 }
		
		return current;
	} /* getCurrentLocale */
	
	/**
	 * Looking for Attribute by PageContext.
	 * @param argum to find Attribute on PageContext
	 * @return object  
	 */
	private Object lookUpPageContext(String argum){
		Object object = null;
//		int i = 0;
//				do {
//			object = pageContext.getAttribute(argum, scopes[i]);
//		} while (++i < scopes.length && object == null);
		
		for(int x = 0; x < scopes.length; x++) {
			object = pageContext.getAttribute(argum, scopes[x]);
			if(object != null)
				break;
		}
		
		return object;
	} /* lookUpPageContext */
	
	/**
	 * Get DOM-Tag by Type=Value based on default mTags
	 * @param typ which kind of Tag
	 * @return value Tag Type=Value
	 */
	protected String getProperty(final String typ) {
		return getProperty(typ, "");
	
	} /* getProperty */
	
	/**
	 * Get DOM-Tag by Type=Value.
	 * @param typ TagType
	 * @param arg TagValue
	 * @return value DOM-Tag Type=Value
	 */
	protected String getProperty(final String typ, final String arg){
		String htmlAttrTag = "";
		
		if (StringUtils.isEmpty(arg) ) {
			
			if (mTags.containsKey(typ)) {
				
				htmlAttrTag = tagBuilder(typ, mTags.get(typ));
			}
		
		} else {
			
			htmlAttrTag = tagBuilder(typ, arg);
		}
		
		return htmlAttrTag;
	} /* getProperty */

	/**
	 * tagBuilder build complete HTML Tag e.g name="attrVal"
	 * 
	 * @param attrTyp
	 *            Identifier
	 * @param attrVal
	 *            Value to be set
	 * @return tagValue
	 * 
	 * */
	private String tagBuilder(final String attrTyp, final String attrVal) {

		return new StringBuilder(" ").append(attrTyp).append("=").append(FB)
				.append(((attrVal == null) ? "" : attrVal)).append(FB).toString();
	} /* tagBuilder */
	
	/**
	 * Set the Value of the attribute 'idSufix'.
	 * @param idSufix the new value of the attribute
	 */	
	public void setIdSufix(String idSufix) {
		this.idSufix = idSufix;
	} /* setIdSufix */
	
	/**
	 * Set the Value of the attribute 'id'.
	 * @param id the new value of the attribute
	 */
	public void setId(String id) {
		this.id = id;
	} /* setId */
	
	/**
	 * Set the Value of the attribute 'idPrefix'.
	 * @param idPrefix the new value of the attribute
	 */	
	public void setIdRefix(String idRefix) {
		this.idRefix = idRefix;
	}

	
	/**
	 * Set the Value of the attribute 'href'.
	 * @param href the new value of the attribute
	 */
	public void setHref(final String href) {
		this.href = href;
	} /* setHref */

	/**
	 * Set the Value of the attribute 'rel'.
	 * @param rel the new value of the attribute
	 */
	public void setRel(final String rel) {
		this.rel = rel;
	} /* getRel */
	
	/**
	 * Set the Value of the attribute 'title'.
	 * @param title the new value of the attribute
	 */
	public void setTitle(final String title) {
		this.title = title;
	} /* getTitle */
	
	/**
	 * Set the Value of the attribute 'transition'.
	 * @param transition the new value of the attribute
	 */
	public void setTransition(final String transition) {
		this.transition = transition;
	} /* setTransition */
	
	/**
	 * Set the Value of the attribute 'icon'.
	 * @param icon the new value of the attribute
	 */
	public void setIcon(final String icon) {
		this.icon = icon;
	} /* setIcon */
	
	/**
	 * Set the Value of the additional 'class'.
	 * @param aClass the new value of the attribute
	 */
	public void setAclass(final String aclass) {
		this.aclass = aclass;
	} /* setClass */
	
	/**
	 * Set the Value of the attribute 'align'.
	 * @param align the new value of the attribute
	 */
	public void setAlign(final String align) {
		this.align = align;
	} /* setAlign */
	
	/**
	 * Set the Value of the attribute 'style'.
	 * @param style the new value of the attribute
	 */
	public void setStyle(final String style) {
		this.style = style;
	} /* setStyle */
	
	/**
	 * Set the Value of the attribute 'dataOverlayTheme'.
	 * @param dataOverlayTheme the new value of the attribute
	 */
	public void setOverlayTheme(String dataOverlayTheme) {
		this.dataOverlayTheme = dataOverlayTheme;
	} /* setOverlayTheme */
	
	/**
	 * Set the Value of the attribute 'dataDismissible'.
	 * @param dataDismissible the new value of the attribute
	 */
	public void setDataDismissible(String dataDismissible) {
		this.dataDismissible = dataDismissible;
	} /* setDataDismissible */
	
} /* TagSupporters */
