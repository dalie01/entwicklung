package de.ars.javabuch.tuning;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SynchronizedServlet1 extends HttpServlet {

  /** doGet */
  public void doGet(HttpServletRequest request,HttpServletResponse response)
    throws ServletException, IOException {

    synchronized (this) {
      // Set MIME type of response
      response.setContentType("text/html");

      // Do something time consuming
      // This loop simply wastes time
      // In praxis better use class StringBuffer to concatenate strings
      String text = "a";
      for (int i = 0; i < 20000; i++) {
        text = text + "a";
      }
     
      // Obtain writer
      PrintWriter out = response.getWriter();

      // Write HTML output
      out.println("<html>");
      out.println("<head><title>" + getServletName() + "</title></head>");
      out.println("<body>");
      out.println("<h1>Hello World</h1>");
      out.println("</body>");
      out.println("</html>");

      // Close writer
      out.close();
    }//synchronized
  }//doGet
}//class SynchronizedServlet1
