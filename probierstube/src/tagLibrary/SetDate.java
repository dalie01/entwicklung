/*
 * Created on 15.12.2009
 *
 */
package tagLibrary;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class SetDate extends TagSupport {

	private static final String months[] = { "January", "February", "March",
			"April", "May", "June", "July", "August", "September", "October",
			"November", "December" };

	public int doStartTag() throws JspException {
		
			HttpServletRequest req = null;
			GregorianCalendar cal = null;
			String cmd = null;

			cal = (GregorianCalendar) pageContext.getAttribute("date",
					PageContext.SESSION_SCOPE);
			if (cal == null) {
				cal = new GregorianCalendar();
				cal.set(Calendar.DATE, 1);
				pageContext
						.setAttribute("date", cal, PageContext.SESSION_SCOPE);
			}//endif

			req = (HttpServletRequest) pageContext.getRequest();
			cmd = req.getParameter("submit");
			if (cmd != null) {
				if (cmd.equals("<<<"))
					cal.roll(Calendar.YEAR, -1);
				if (cmd.equals("<<"))
					cal.roll(Calendar.MONTH, -1);
				if (cmd.equals("---")) {
					cal = new GregorianCalendar();
					cal.set(Calendar.DATE, 1);
				}//endif
				if (cmd.equals(">>"))
					cal.roll(Calendar.MONTH, 1);
				if (cmd.equals(">>>"))
					cal.roll(Calendar.YEAR, 1);
				pageContext
						.setAttribute("date", cal, PageContext.SESSION_SCOPE);
			}//endif
			try {
				generate(pageContext.getOut(), cal);
			} catch (IOException e) {
				throw (new JspException(getClass().getName() + ": "
						+ e.toString()));
			}//catch
			
			return (SKIP_BODY);
		
	}//doStartTag

	private void generate(JspWriter out, GregorianCalendar cal)
			throws IOException {
		
			out.println("<h1>Calendar for " + months[cal.get(Calendar.MONTH)]
					+ " " + cal.get(Calendar.YEAR) + "</h1>");
		
	}//generate
}//class SetDate
