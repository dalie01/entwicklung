package mobile.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;

import mobile.utilities.support.TagSupporter;

public class LocalizedString extends TagSupporter {

	/** key: value of PropertyKey */
	private String key;
	
	public int doStartTag() throws JspException {
	
		try {
			JspWriter out = pageContext.getOut();
				out.append(getLocalizedString(this.key)
			);
			
		} catch (Exception e) {
			throw new JspException("LocalizedString:Exception= "
			+ e.getMessage() + " is not vaild");
		}// try
		return SKIP_BODY;
	} /* doStartTag */
	
	/**
	 * Set the Value of the attribute 'key'.
	 * @param key the new value of the attribute
	 */
	public void setKey(String key) {
		this.key = key;
	}
	
	
} /* LocalizedString */
