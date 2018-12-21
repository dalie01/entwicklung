package dalie.imme.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dalie.imme.design.sf.internal.navigation.Navigation;



/**
 * Servlet implementation class GetNavigation.
 * @author dalie
 * @since 1.0.0.0
 */
public class ImmeWeb extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	/** Constant to usage  for Request Attribute. */
	private static final String NAVIGATION_PAGE_REQUEST = "Page";
	private static final String NAVIGATION_TASK = "NavigationTask";
    private static final String NAVIGATION_LINK_TO_SITE = "LinkToSite";

    /** perform for both HTTP <code>GET</code> and <code>POST</code> methods  */
	protected void perForm(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
	    
	    HttpSession session = request.getSession(true);
	   
	    String navigationTask = getTask(request.getParameter(NAVIGATION_PAGE_REQUEST));
	    session.setAttribute(NAVIGATION_TASK,navigationTask);
	    
	    Navigation immeweb = getNavigation(getTask(navigationTask));	    
	    request.setAttribute(NAVIGATION_LINK_TO_SITE, immeweb.getSiteLink());
	   
	    
	    
        performForward(immeweb.getSiteType(),request,response);//JSP- User Login
    		
	} /* perForm */  
    
	/**
	 * Instance of ImmeNavigatine
	 * 
	 * @return Navigation 
	 */
	protected Navigation getNavigation(String argum) {
	
		if (argum != null && argum.length() > 0) {
		
			return Navigation.getInstance().valueOf(argum);
		}
		
		return Navigation.getInstance().valueOf("START");
		
	} /* getNavigation */
	
	/**
	 * @param argum for PageNavigation
	 * @return PageNavigation
	 */
	protected String getTask(String argum){
		
		if (argum == null || argum.length() == 0) {
			
			return "START";
		}
		
		return argum;
	}
	
	/** handle the next step */
	protected void performForward(String destination, HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {	
		
		ServletContext context = getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher(destination);
		dispatcher.forward(request, response);
	} /* performForward */
	
	/** 
	 * The GET method to allow a servlet to handle a GET request.
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		perForm(request,response);
	} /* doGet */

	/**
	 * The Post method to allow a servlet to handle a POST request.
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		perForm(request,response);
	} /* doPost */

	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ImmeWeb() {
		super();
	}

	/**@return a short description of this Servlet */
	public String getServletInfo() {
	    return "start navigation";
	} /* getServletInfo */
	
	/** finally method */
	public void destroy() {
	} /* destroy */

}
