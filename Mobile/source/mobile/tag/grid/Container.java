package mobile.tag.grid;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;

import mobile.tag.Attr;
import mobile.tag.grid.builder.GridBuilder;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * Tag:DIV:Container.
 * 
 * @author DALiEWEB
 * @since 1.0.0.0
 * 
 */
public class Container extends GridBuilder {
	
	public Container() {
		super();
		this.id = (StringUtils.isEmpty(this.id) ? 
				RandomStringUtils.random(10,true, true) : this.id);
	}
	
	public int doStartTag() throws JspException {
		try {
			JspWriter out = pageContext.getOut();
			out.append("<div" + getProperty(Attr.ID, this.id)
					 + getProperty(Attr.CLASS, buildContainer(this.aclass))
					 + getProperty(Attr.ALIGN, (StringUtils.isEmpty(this.align) ? "" : this.align))
					 + getProperty(Attr.STYLE, (StringUtils.isEmpty(this.style) ? "" : this.style)) + " >");
			
		} catch (Exception e) {
			throw new JspException("Grid:Container:StartTag:Exception= " 
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
			out.append("</div>".concat("<!-- /grid-"+ this.id +" -->"));

		} catch (Exception e) {
			throw new JspException("Grid:Container:EndTagException= "
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
		this.id = null;
		this.aclass = null;
		this.align = null;
		this.style = null;
	} /* release */
}
