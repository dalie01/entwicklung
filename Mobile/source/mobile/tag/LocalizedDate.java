package mobile.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;

import mobile.utilities.support.TagSupporter;

public class LocalizedDate extends TagSupporter {

	/** fmt: date */
	private String fmt;
	
	public int doStartTag() throws JspException {
		try {
			JspWriter out = pageContext.getOut();
			out.append(getLocalizedDateFormat(this.fmt));
		} catch (Exception e) {
			throw new JspException("LocalizedDate:Exception= " + e.getMessage()
					+ " is not vaild");
		}
	
		return SKIP_BODY;
	} /* doStartTag */
	
	/** 
	 * clean attribute values;
	 * @see javax.servlet.jsp.tagext.TagSupport#release()
	 */
	@Override
	public void release() {
		super.release();
		this.fmt = null;
	} /* release */
	
	/**
	 * Set the Value of the attribute 'Fmt'.
	 * @param url the new value of the attribute
	 */
	public void setFmt(final String fmt) {
		this.fmt = fmt;
	} 
} /* class Date */
