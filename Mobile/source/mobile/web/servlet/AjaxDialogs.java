package mobile.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mobile.web.util.MobileAppServlet;

/**
 * Servlet implementation class AjaxDialogs
 */
public class AjaxDialogs extends MobileAppServlet {
    
	/**
     * perform for both HTTP <code>GET</code>
     * and <code>POST</code> methods.
     *
     * @param request The servlet container creates an HttpServletRequest object
     * @param response The servlet container creates an HttpServletResponse
     *
     * @throws ServletException Defines a general exception
     * @throws IOException Signals that an I/O exception
     * **/
	protected void perForm (
			final HttpServletRequest request, final HttpServletResponse response)
					throws ServletException , IOException {

		
		executeForward("/Hint", request, response); /* forward to next */
		
	} /* perForm */
	

	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjaxDialogs() {
        super();
    } /* AjaxDialogs */

} /* AjaxDialogs */
