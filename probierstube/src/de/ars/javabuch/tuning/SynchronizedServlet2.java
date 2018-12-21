package de.ars.javabuch.tuning;

import java.io.PrintWriter;

import javax.servlet.SingleThreadModel;
import javax.servlet.http.HttpServlet;

/**
 * 
 * */
public class SynchronizedServlet2 extends HttpServlet implements SingleThreadModel {
	/* durch das interface STM sorgt der Webcontainer dafür, dass das Servlet nur eine
	 * Anfrage gleichzeitig bearbeiten muss.
	 * Wenn ein Servlet dieses Interface implementiert, haben Sie die Garantie, dass keine
	 * zwei Threads parallel die Service-Methode des Servlets ausführen. */
	
  /** doGet */
  public void doGet(
    javax.servlet.http.HttpServletRequest request,
    javax.servlet.http.HttpServletResponse response)
    throws javax.servlet.ServletException, java.io.IOException {
    // Set MIME type of response
    response.setContentType("text/html");

    // Obtain writer
    PrintWriter out = response.getWriter();

    // Do something time consuming
    // This loop simply wastes time
    // In praxis better use class StringBuffer to concatenate strings
    String text = "a";
    for (int i = 0; i < 20000; i++) {
      text = text + "a";
    }

    // Write HTML output
    out.println("<html>");
    out.println("<head><title>" + getServletName() + "</title></head>");
    out.println("<body>");
    out.println("<h1>Hello World</h1>");
    out.println("</body>");
    out.println("</html>");

    // Close writer
    out.close();
  }//doGet
}//class SynchronizedServlet2
