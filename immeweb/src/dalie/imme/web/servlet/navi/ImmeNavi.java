package dalie.imme.web.servlet.navi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dalie.imme.design.sf.internal.navigation.Category;
import dalie.imme.design.sf.internal.navigation.Navigation;

/**
 * Servlet implementation class ImmeNavi
 */
public class ImmeNavi extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String NAVIGATION_TASK = "NavigationTask";
	
	/** perform for both HTTP <code>GET</code> and <code>POST</code> methods  */
	protected void perForm(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		HttpSession session = request.getSession(true);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		 synchronized (this) {	    	
	    	StringBuffer content = new StringBuffer();
	    	String navigationTask = (String) session.getAttribute(NAVIGATION_TASK);
	    	
	    	content.append("<div id=\"navi\"><ul>");
	    	
	    	
	    	Map<String, Navigation> navigations = getNavigation();
	    	
	    	for (String site : Navigation.allNavigations) {
	    		
				if (navigations.containsKey(site)) {
					
					if (navigationTask.equals("PRODUCTDETAIL") && site.equals("PRODUCT")) {
		    			content.append ( 
								"<li class=\"on\" " +
								"onclick=\"location.href='" + request.getContextPath() + "/ImmeWeb?Page=" + site + "';\" > " +
								"<img src=\"./theme/images/logo/Logo_ScheunenDesing_Navigation.png\" />&nbsp;"  + Category.fromOrdinal(site) + "&nbsp;</li >");
					} else if (navigationTask.equals(site)) {
						content.append ( 
								"<li class=\"on\" " +
								"onclick=\"location.href='" + request.getContextPath() + "/ImmeWeb?Page=" + site + "';\" > " +
								"<img src=\"./theme/images/logo/Logo_ScheunenDesing_Navigation.png\" />&nbsp;"  + Category.fromOrdinal(site) + "&nbsp;</li >");
					
					} else {
						
						content.append ( 
								"<li class=\"next\" onclick=\"location.href='" + request.getContextPath() + "/ImmeWeb?Page=" + site + "';\" >&nbsp;"+ Category.fromOrdinal(site) + "&nbsp;</li >");
					}
				}
			}
	    	
	    	
	    	content.append("</ul></div> <!-- /.navi --> ");

	    	out.println(content.toString());
	    	out.close();
	    } /* synchronized */
	    
	} /* perForm */    
	
	/**
	 * Instance of ImmeNavigatine
	 * 
	 * @return Navigation 
	 */
	protected Map<String, Navigation> getNavigation() { 
			return Navigation.getInstance().getMemberTable();	
	} /* getNavigation */
	
    /**
	 * The Post method to allow a servlet to handle a POST request.
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {
		
		perForm(request,response);
	} /* doPost */
	
	/** 
	 * The GET method to allow a servlet to handle a GET request.
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		perForm(request,response);
	} /* doGet */	
	
	
	/**
	* @see HttpServlet#HttpServlet()
	*/
	public ImmeNavi() {
		super();
	} /* ImmeNavi */
	
} /* class ImmeNavi */
