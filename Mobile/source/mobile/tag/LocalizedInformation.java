/**
 * 
 */
package mobile.tag;

import javax.servlet.jsp.JspException;

import mobile.factorys.MobileLocalInformationFactory;
import mobile.utilities.support.TagSupporter;

import org.apache.commons.lang3.StringUtils;

import com.dalie.beehive.localization.internal.LocalInformation;

/**
 * @author Dalie
 *
 */
public class LocalizedInformation extends TagSupporter {

	/** selectedLanguage: User selected LanguageId */
	private String selectedLanguageId;
	

	public int doStartTag() throws JspException {

		try {
			if (StringUtils.isNotEmpty(selectedLanguageId)) {
				pageContext.removeAttribute(LocalInformation.class.getName());
				getCurrentLocale( MobileLocalInformationFactory.getInstance()
						.getLocalInformation(selectedLanguageId).getLocale());
						
			}

		} catch (Exception e) {
			throw new JspException("LocalizedInformation:Exception= "
					+ e.getMessage() + " is not vaild");
		}// try
		return SKIP_BODY;
	} /* doStartTag */
	
	/**
	 * Set the Value of the attribute 'selectedLanguageId'.
	 * @param id the new value of the attribute
	 */
	public void setSelectedLanguageId(final String id) {
		this.selectedLanguageId = id;
	}
} /* LocalizedInformation */
