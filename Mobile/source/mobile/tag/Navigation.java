package mobile.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;

import mobile.utilities.support.TagSupporter;

import org.apache.commons.lang3.StringUtils;

/**
 * Tag:Navigation
 * 
 * @author DALiEWEB
 * @since 1.0.0.0
 */
public class Navigation extends TagSupporter {

	/** NavigationBar title */
	private String headerTitle;
	/** FavSite: true/false */
	private String favSite;
	/** FavTitle */
	private String favTitle;
	/** FavSubTitle */
	private String favSubTitle;
	
	
	/** 
	 * Build Navigation Header.
	 * 
	 * @see javax.servlet.jsp.tagext.TagSupport#doStartTag()
	 */
	public int doStartTag() throws JspException {
		
		try {
			JspWriter out = pageContext.getOut();
			out.append("<div" + getProperty(Data.ROLE, "header")  + 
					getProperty(Data.POSITION, "fixed") +">");
			
			if (StringUtils.isNotEmpty(href)) {
				out.append("<a" 
					+ getProperty(Attr.HREF, this.href)
					+ getProperty(Attr.REL, this.rel)  
					+ getProperty(Data.TRANSITION, this.transition)
					+ getProperty(Data.DIRECTION)
					+ getProperty(Data.ICON, this.icon)
					+ getProperty(Attr.TITLE, getLocalizedString(this.title))
					+ ">"+ getLocalizedString(this.title) + "</a>");
			}
			out.append("<h1>"+ getLocalizedString(this.headerTitle) + "<h1>");
			
			if (StringUtils.equalsIgnoreCase(favSite, "true")) {
				out.append("<a" 
					+ getProperty(Attr.HREF, "#")
					+ getProperty(Attr.ID, "navigationbar-bookmark-link")
					+ getProperty(Attr.CLASS, "ui-btn-right")
					+ getProperty(Data.ROLE, "button")
					+ getProperty(Data.ICON, "star")
					+ getProperty(Data.ICONPOS, "notext")
					+ getProperty(Attr.TITLE, "Add Favorites")
					+ getProperty(Data.FAVTITLE, getLocalizedString(this.favTitle))
					+ getProperty(Data.FAVSUBTITEL, getLocalizedString(this.favSubTitle))
					+ "></a>");
			}
			
			out.append("</div>");
		} catch (Exception e) {
			throw new JspException("Navigation:Exception= "
					+ e.getMessage() + " is not vaild");
		}// try
		return SKIP_BODY;
	} /* doStartTag */
	
	/**
	 * Set the Value of the attribute 'href'.
	 * @param href the new value of the attribute
	 */
	public void setHref(final String href) {
		this.href = href;
	} /* setHref */
	
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
	 * Set the Value of the attribute 'headerTitle'.
	 * @param headerTitle the new value of the attribute
	 */
	public void setHeaderTitle(final String headerTitle) {
		this.headerTitle = headerTitle;
	} /* setHeaderTitle */
	
	
	/**
	 * Set the Value of the attribute 'favSite'.
	 * @param favSite the new value of the attribute
	 */
	public void setFavSite(final String favSite){
		this.favSite = favSite;
	} /* setFavSite */
	
	/**
	 * Set the Value of the attribute 'favTitle'.
	 * @param favTitle the new value of the attribute
	 */
	public void setFavTitle(final String favTitle){
		this.favTitle = favTitle;
	} /* setFavTitle */
	
	/**
	 * Set the Value of the attribute 'favSubTitle'.
	 * @param favSubTitle the new value of the attribute
	 */
	public void setFavSubTitle(final String favSubTitle){
		this.favSubTitle = favSubTitle;
	} /* setFavSubTitle */
	
} /* class Navigation */
