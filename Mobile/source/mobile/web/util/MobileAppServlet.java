package mobile.web.util;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mobile.internal.Constants;
import mobile.internal.MobileApplications;
import mobile.utilities.capi.PipelineDictionary;
import mobile.utilities.internal.PipelineDictionaryImpl;

import com.dalie.beehive.application.capi.WebApplication;

/**
 * MobileAppServlet is an Extension to perform special Tasks 
 * for Operating HttpServlet.
 * 
 * 
 * @author DALiEWEB
 * @since 1.0.0.0
 */
public abstract class MobileAppServlet extends HttpServlet {

	private static final String PAGE_REQUEST = "Page";
	protected static final String PAGE_REQUEST_NEXT = "nextPage";
	
	protected static MobileApplications mApplications = null;
	public PipelineDictionary dict = new PipelineDictionaryImpl(); 
	
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
	protected abstract void perForm(final HttpServletRequest request,
			final HttpServletResponse response) throws ServletException , IOException; 
	
	
	/**
	 * handle the next step.
	 * 
	 * @param destination
	 *            next Task
	 * @param request
	 *            The servlet container creates an HttpServletRequest object
	 * @param response
	 *            The servlet container creates an HttpServletResponse
	 * 
	 * @throws ServletException
	 *            Defines a general exception
	 * @throws IOException
	 *             Signals that an I/O exception.
	 **/
	protected void perFormNext (
			final HttpServletRequest request, final HttpServletResponse response, 
			final PipelineDictionary dict )
					throws ServletException, IOException {
		
		String nextPage = request.getAttribute(PAGE_REQUEST_NEXT).toString();
		preFixForward(dict, request);
		executeForward(nextPage, request, response);
		
	} /* performForward */
	
	/**
	 * handle the next step.
	 * 
	 * @param destination
	 *            next Task
	 * @param request
	 *            The servlet container creates an HttpServletRequest object
	 * @param response
	 *            The servlet container creates an HttpServletResponse
	 * @param dict
	 * 			  Web Application Dictionary
	 * 
	 * @throws ServletException
	 *            Defines a general exception
	 * @throws IOException
	 *             Signals that an I/O exception.
	 **/
	protected void performForward ( 
			final HttpServletRequest request, final HttpServletResponse response,
			final PipelineDictionary dict )  
					throws ServletException, IOException {

		String nextPage = "";
		preFixForward(dict, request);
		WebApplication application = mApplications.valueOf(request.getParameter(PAGE_REQUEST));
		
		
		if (application.isPage()) {
			request.setAttribute(Constants.SITE_TITLE, application.getSiteTitle());
			request.setAttribute(Constants.SITE_CONTENT, application.getSiteContent());
			nextPage = application.getSiteType();
		}
		
		if (application.isPageContent()) {
			nextPage = application.getSiteContent();
		}
		
		if (application.isServlet()) {
			request.setAttribute(Constants.SITE_TITLE, application.getSiteTitle());
			request.setAttribute(Constants.SITE_CONTENT, application.getSiteContent());
			request.setAttribute(PAGE_REQUEST_NEXT, application.getSiteType());
			nextPage = application.getServletRepository();
		}
		
		
		if (nextPage == null) {
			throw new ServletException("Link is not Korrekt");
		}
		
		executeForward(nextPage, request, response);
		
	} /* performForward */
	
	/**
	 * Set all DicionaryValues to Request.
	 * @param dict
	 * @param request
	 */
	private void preFixForward(final PipelineDictionary dict, 
			final HttpServletRequest request){
		
		Map<String, Object> pip = dict.getDictionary();
		
		if (pip.size() > 0 ) {
			
			for( Map.Entry<String, Object> params : pip.entrySet() ) {
				
				request.setAttribute(params.getKey(), params.getValue());
			
			} /* for entry */
		
		}
		
	} /* preFixForward */
	
	/**
	 * Perform Dispatcher Forward.
	 * 
	 * @param page next JSP-Site
	 * @param request HttpServletRequest
	 * @param response HttpServletResponse
	 * 
	 * @throws ServletException 
	 * @throws IOException
	 */
	protected void executeForward(final String page, 
			final HttpServletRequest request, final HttpServletResponse response)
					throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher(page);

		dispatcher.forward(request, response);
		
	} /* performForward */
	
	
	/**
	 * Handle ErrorSite Setting.
	 * 
	 * @param request HttpServletRequest
	 */
	private void getErrorSite(final HttpServletRequest request, final Exception e) {
		
		request.setAttribute(Constants.SITE_CONTENT, 
				mApplications.valueOf("ERROR").getSiteContent());
		
		request.setAttribute(Constants.SITE_TITLE, 
				mApplications.valueOf("ERROR").getSiteTitle());
		
		request.setAttribute(Constants.SITE_ERROR, e.getMessage());
		
	} /* getErrorSite */
	
	/**
	 * Load all Web-Applications.
	 */
	public void init(ServletConfig config) throws ServletException {
	    super.init(config);
	   
	    mApplications = MobileApplications.getInstance();
		
	} /* init */
	
	/**
	 * 
	 * @param request
	 *            The servlet container creates an HttpServletRequest object
	 * @param response
	 *            The servlet container creates an HttpServletResponse
	 * 
	 * @throws ServletException
	 *             Defines a general exception
	 * @throws IOException
	 *             Signals that an I/O exception
	 * **/
	protected final void doGet(
			final HttpServletRequest request, final HttpServletResponse response) 
					throws ServletException, IOException {
		
		try {
			perForm(request,response);
		} catch (Exception e) {
			
			getErrorSite(request,e);
			executeForward(mApplications.valueOf("ERROR").getSiteType(),request,response);
		}
		
	} /* doGet */

	/**
	 * 
	 * @param request
	 *            The servlet container creates an HttpServletRequest object
	 * @param response
	 *            The servlet container creates an HttpServletResponse
	 * 
	 * @throws ServletException
	 *             Defines a general exception
	 * @throws IOException
	 *             Signals that an I/O exception
	 * **/
	protected final void doPost(final HttpServletRequest request,
			final HttpServletResponse response) throws ServletException, IOException {
		
		try {
			perForm(request, response);
		} catch (Exception e) {

			getErrorSite(request,e);
			executeForward(mApplications.valueOf("ERROR").getSiteType(), request, response);
		}
		
	} /* doPost */
	
} /* MobileAppServet */
