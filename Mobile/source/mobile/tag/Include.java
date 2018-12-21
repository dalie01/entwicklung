package mobile.tag;


import javax.servlet.jsp.JspException;

import mobile.utilities.support.ParmSupporter;
import mobile.utilities.support.TagSupporter;


/**
 * 
 * @author DALiEWEB
 *
 */
public class Include extends TagSupporter {

	/** url: url to */
	private String url;
	private String parms;
	public int doStartTag() throws JspException {

		try {
			ParmSupporter p = new ParmSupporter(pageContext.getRequest(),parms);
			processRemoteInclude(url, p.getParmUrl());

		} catch (Exception e) {
			throw new JspException("Include:Exception= " + e.getMessage()
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
		this.url = null;
		this.parms = null;
	} /* release */
	
	/**
	 * Set the Value of the attribute 'Url'.
	 * @param url the new value of the attribute
	 */
	public void setUrl(final String url) {
		this.url = url;
	} 
	/**
	 * Set the Value of the attribute '@param'.
	 * @param Parm the new value of the attribute
	 */
	public void setParms(final String parms){
		this.parms = parms;
	}
	
} /* class Include */
