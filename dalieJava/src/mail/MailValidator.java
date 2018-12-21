package mail;
/* File: MailValidator.java
 * Module: mail
 * Author: DALiE
 * Last modified by: DALiE
 * Date: 2011-10-29 15:30:24
 * Version: 1.0
 * Description: Check String for valid email address content.
 *
 * */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Check for valid email address content.
 *
 * @version 1.0
 * @author Dalie
 * */
public class MailValidator {

	/** pattern. */
	private Pattern pattern;
	/** matcher. */
	private Matcher matcher;

	/** Constants for EMail Pattern. */
	private static final String
		EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	  /**
	   * Constructor.
	   * */
	  public MailValidator() {
		 pattern = Pattern.compile(EMAIL_PATTERN);
	  }

	  /**
	   * Validate hex with regular expression.
	   * @param hex hex for validation
	   * @return true valid hex, false invalid hex
	   */
	  public final boolean validate(final String hex) {
		  matcher = pattern.matcher(hex);
		  return matcher.matches();

	  }

} //MailValidator
