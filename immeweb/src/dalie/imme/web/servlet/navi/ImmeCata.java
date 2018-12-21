package dalie.imme.web.servlet.navi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dalie.imme.design.sf.capi.product.Product;
import dalie.imme.design.sf.internal.navigation.Navigation;
import dalie.imme.design.sf.internal.product.ProductFinder;

/**
 * Servlet implementation class ImmeCata
 */
public class ImmeCata extends HttpServlet {	
	
		private static final String NAVIGATION_CATALOG_ID = "CatalogId";

		/** perform for both HTTP <code>GET</code> and <code>POST</code> methods  */
		@SuppressWarnings("unchecked")
		protected void perForm(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	    
		 HttpSession session = request.getSession();
		List<Product> products = (List<Product>)session.getAttribute(Navigation.SESSION_ATTRIBUTE_PRODCUCTS);
		response.setContentType("text/html");
		if (products != null && products.size() > 0) {
		ProductFinder pf = new ProductFinder(products);
		
		PrintWriter out = response.getWriter();
		String catalogId = request.getParameter(NAVIGATION_CATALOG_ID);
		synchronized(this) {	    	
	    	StringBuffer content = new StringBuffer();
	    	content.append("<div><ul>");
	    	//for (String category : pf.getCategorysByCatalogId(catalogId)) {
	    	//	content.append("<li>" + category + "</li>");
	    		
			//}
	    	content.append("<ul></div>");

	    	out.println(content.toString());
	    	out.close();
	    } /* synchronized */
        
		}
    		
	} /* perForm */  
	
	/** handle the next step */
	protected void performForward(String destination,
			HttpServletRequest request, HttpServletResponse response) 
					throws ServletException, IOException {	
		
		ServletContext context = getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher(destination);
		dispatcher.forward(request, response);
	} /* performForward */
	
	/**
	 * The Post method to allow a servlet to handle a POST request.
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			perForm(request,response);
		} catch (Exception e) {
			performForward(Navigation.SiteError,request,response);
		}
		
	} /* doPost */
     /** 
	 * The GET method to allow a servlet to handle a GET request.
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
	
		try {
			
			perForm(request,response);
		} catch (Exception e) {
			performForward(Navigation.SiteError,request,response);
		}
	} /* doGet */  
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImmeCata() {
        super();
    }	

}
