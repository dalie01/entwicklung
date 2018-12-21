package mobile.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;

import mobile.utilities.support.TagSupporter;

import org.apache.commons.lang3.StringUtils;

/**
 * Tag:Dialog.
 * 
 * @author DALiEWEB
 * @since 1.0.0.0
 * 
 */
public class Dialog extends TagSupporter {

	/** hContent: HeaderContent */
	private String hContent;
		
	/** content: content to show on Dialog */
	private String content;
	
	/** cssClass: classId from css */
	private String cssClass;
	/** style: additional styling */
	private String style;
	
	public int doStartTag() throws JspException {
		try {
			JspWriter out = pageContext.getOut();
			out.append("<div" + getProperty(Data.ROLE, "popup")  
					+ getProperty(Data.DISMISSIBLE)
					+ getProperty(Data.CORNERS,"true")
					+ getProperty(Attr.ID, this.id)  
					+ getProperty(Data.HISTORY) + ">");
			
			out.append("<div" + getProperty(Data.ROLE, "header")
					+ getProperty(Data.THEME,"a")
					+ getProperty(Attr.CLASS, "ui-corner-top")
					+ " <h1> " + this.hContent + " </h1> ");
			/* <div data-role="header" */
			out.append("</div>");
			
			out.append("<div" + getProperty(Data.ROLE, "content")
					+ getProperty(Data.THEME)
					+ getProperty(Attr.CLASS, "ui-corner-bottom ui-content"));
			
			
			if (StringUtils.isNotEmpty(this.content)) {
				
				out.append("<span" + getProperty(Attr.CLASS, this.cssClass) 
						+ getProperty(Attr.STYLE, this.style) + " >" 
						+ this.content + "</span>");
			}
			
		} catch (Exception e) {
			throw new JspException("Dialog:Exception= "
			+ e.getMessage() + " is not vaild");
		}// try
	
		return EVAL_BODY_INCLUDE;
	}

	/**
	 * close div's
	 * 
	 * @see javax.servlet.jsp.tagext.TagSupport#doEndTag()
	 */
	public int doEndTag() throws JspException{
		try {
			/* <div data-role="content" */
			JspWriter out = pageContext.getOut();
			out.append("</div>");
			
			/* <div data-role="popup" */
			out.append("</div>");
		} catch (Exception e) {
			throw new JspException("Dialog:Exception= "
					+ e.getMessage() + " is not vaild");
		}
		
		return EVAL_PAGE;
	} /* doEndTag  */ 
	
	/** 
	 * clean attribute values;
	 * @see javax.servlet.jsp.tagext.TagSupport#release()
	 */
	@Override
	public void release() {
		super.release();
		this.content = null;
		this.hContent = null;
		this.cssClass = null;
		this.style = null;
	} /* release */
	
	/**
	 * Set the Value of the attribute 'x'.
	 * @param x the new value of the attribute
	 */
	public void sethContent(String hContent) {
		this.hContent = hContent;
	} /* sethContent */
	
	/**
	 * Set the Value of the attribute 'x'.
	 * @param x the new value of the attribute
	 */
	public void setContent(String content) {
		this.content = content;
	} /* setContent */
	
	/**
	 * Set the Value of the attribute 'style'.
	 * @param style the new value of the attribute
	 */
	public void setStyle(final String style) {
		this.style = style;
	} /* setStyle */
	
	/**
	 * Set the Value of the attribute 'x'.
	 * @param x the new value of the attribute
	 */
	public void setCssClass(String cssClass) {
		this.cssClass = cssClass;
	} /* setCssClass */
	
} /* Dialog */