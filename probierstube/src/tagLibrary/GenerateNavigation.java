/*
 * Created on 15.12.2009
 *
 */
package tagLibrary;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class GenerateNavigation extends TagSupport {

	public int doStartTag() throws JspException {
		
			try {
				generate(pageContext.getOut());
			} catch (IOException e) {
				throw (new JspException(getClass().getName() + ": "
						+ e.toString()));
			}//catch
			
			return (SKIP_BODY);
		
	}//doStartTag

	private void generate(JspWriter out) throws IOException {
		
			String prefix = "<td class=\"navigation\"><input type=\"submit\" name=\"submit\" value = \"";
			String suffix = "\"></td>";

			out.println("<tr>");
			out.println("<th class=\"navigation\">Backward<br />a year</th>");
			out.println("<th class=\"navigation\">Backward<br />a month</th>");
			out.println("<th class=\"navigation\">Reset to<br />current</th>");
			out.println("<th class=\"navigation\">Forward<br />a month</th>");
			out.println("<th class=\"navigation\">Forward<br />a year</th>");
			out.println("</tr>");
			out.println("<tr>");
			out.println(prefix + "<<<" + suffix);
			out.println(prefix + "<<" + suffix);
			out.println(prefix + "---" + suffix);
			out.println(prefix + ">>" + suffix);
			out.println(prefix + ">>>" + suffix);
			out.println("</tr>");
		
	}//generate
}//class GenerateNavigation