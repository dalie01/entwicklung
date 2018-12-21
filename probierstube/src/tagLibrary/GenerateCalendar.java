/*
 * Created on 15.12.2009
 *
 */
package tagLibrary;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class GenerateCalendar extends TagSupport {

	public int doStartTag() throws JspException {
	
			GregorianCalendar cal = null;

			cal = (GregorianCalendar) pageContext.getAttribute("date",
					PageContext.SESSION_SCOPE);
			if (cal == null)
				throw (new JspException("date missing from page"));
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
		
			int i = -1;
			int mon = -1;

			cal.set(Calendar.DATE, 1);
			out.println("<tr>");
			out.println("<th width=\"15%\" class=\"calendar\">Sun.</th>");
			out.println("<th width=\"14%\" class=\"calendar\">Mon.</th>");
			out.println("<th width=\"14%\" class=\"calendar\">Tue.</th>");
			out.println("<th width=\"14%\" class=\"calendar\">Wed.</th>");
			out.println("<th width=\"14%\" class=\"calendar\">Thu.</th>");
			out.println("<th width=\"14%\" class=\"calendar\">Fri.</th>");
			out.println("<th width=\"15%\" class=\"calendar\">Sat.</th>");
			out.println("</tr>");
			out.println("<tr>");
			for (i = 1; i <= 7; i++) {
				out.print(getHeader(i));
				if (i == cal.get(Calendar.DAY_OF_WEEK)) {
					out.print(cal.get(Calendar.DATE));
					cal.add(Calendar.DATE, 1);
				} else
					out.println(" ");
				out.println("</td>");
			}//for
			out.println("</tr>");
			mon = cal.get(Calendar.MONTH);
			while (mon == cal.get(Calendar.MONTH)) {
				out.println("<tr>");
				for (i = 1; i <= 7; i++) {
					out.print(getHeader(i));
					if (mon == cal.get(Calendar.MONTH)) {
						out.print(cal.get(Calendar.DATE));
						cal.add(Calendar.DATE, 1);
					} else
						out.println(" ");
					out.println("</td>");
				}//for
				out.println("</tr>");
			}//while
			cal.set(Calendar.MONTH, mon);
			cal.set(Calendar.DATE, 1);
		
	}//generate

	private String getHeader(int dayOfWeek) {
		
			String style = "weekday";

			if ((dayOfWeek == 1) || (dayOfWeek == 7))
				style = "weekend";
			
			return ("<td class=\"" + style + "\">");
		
	}//getHeader
}//class GenerateCalendar
