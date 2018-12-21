package mobile.tag.grid;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import mobile.tag.Attr;
import mobile.tag.grid.builder.GridBuilder;

/**
 * Tag:DIV.
 * 
 * @author DALiEWEB
 * @since 1.0.0.0
 * 
 */
public class Div extends GridBuilder {

	/** grid-Value */
	private String grid;
	/** mobile-grid-Value */
	private String mobile;
	/** tablet-grid-Value */
	private String tablet;
	
	public int doStartTag() throws JspException {
		try {
			JspWriter out = pageContext.getOut();
			out.append("<div " + getProperty(Attr.ID, (StringUtils.isEmpty(id) ? RandomStringUtils.random(10, true, true) : this.id))
					 + getProperty(Attr.CLASS, buildGrid(grid, mobile, tablet) + (StringUtils.isEmpty(aclass) ? "" : " ".concat(this.aclass)))
					 + getProperty(Attr.ALIGN, (StringUtils.isEmpty(this.align) ? "" : this.align))
					 + getProperty(Attr.STYLE, (StringUtils.isEmpty(this.style) ? "" : this.style)) + " >");
			
		} catch (Exception e) {
			throw new JspException("Grid:DIV:StartTag:Exception= " 
						+ e.getStackTrace());
		}//try
		
		return EVAL_BODY_INCLUDE;
	} /* doStartTag */
	

	/**
	 * close div's
	 * 
	 * @see javax.servlet.jsp.tagext.TagSupport#doEndTag()
	 */
	public int doEndTag() throws JspException{
		try {
			JspWriter out = pageContext.getOut();
			out.append("</div>");

		} catch (Exception e) {
			throw new JspException("Grid:DIV:EndTagException= "
					+ e.getStackTrace());
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
		this.aclass = null;
		this.align = null;
		this.style = null;
		this.grid = null;
		this.mobile = null;
		this.tablet = null;
	} /* release */

	/**
	 * Set the Value of the attribute 'grid'.
	 * @param grid the new value of the attribute
	 */
	public void setGrid(String grid) {
		this.grid = grid;
	}

	/**
	 * Set the Value of the attribute 'mobile'.
	 * @param mobile the new value of the attribute
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * Set the Value of the attribute 'tablet'.
	 * @param tablet the new value of the attribute
	 */
	public void setTablet(String tablet) {
		this.tablet = tablet;
	}
	
}
