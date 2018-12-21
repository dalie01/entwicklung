package dalie.imme.web.servlet.product;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import dalie.imme.design.sf.capi.product.Product;
import dalie.imme.design.sf.internal.navigation.Navigation;
import dalie.imme.factorys.ProductParser;

/**
 * Servlet implementation class ImmeProd
 */
public class ImmeProd extends HttpServlet {
		
	/** perform for both HTTP <code>GET</code> and <code>POST</code> methods
	 * @param request HttpServletRequest
	 * @param response HttpServletResponse
	 * 
	 * @throws ServletException  
	 * @throws IOException
	 * @throws SAXException 
	 * @throws ParserConfigurationException 
	 * */
	@SuppressWarnings("unchecked")
	protected void perForm(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	    
	    HttpSession session = request.getSession();
	    List<Product> products = (List<Product>)session.getAttribute(
	    		Navigation.SESSION_ATTRIBUTE_PRODCUCTS);
	    
	    if (products == null) {
			try {
				ProductParser.parseProducts(
						getServletContext().getResourceAsStream(
								Navigation.DIR_XML_PRODUCTS));
				
			} catch (Exception e) {
				
				throw new ServletException();
			}
			
			products = ProductParser.getProducts();	
			session.setAttribute(Navigation.SESSION_ATTRIBUTE_PRODCUCTS, products);
		
	    } 
	    
	    Navigation immeweb = Navigation.getInstance().valueOf("PRODUCT");
	    request.setAttribute(Navigation.REQUEST_ATTRIBUTE_LINK_TO_SITE, immeweb.getSiteLink());
	    request.setAttribute(Navigation.SESSION_ATTRIBUTE_PRODCUCTS, products);
	    
	    performForward(Navigation.SiteType02,request,response);
    		
	} /* perForm */  

	/** handle the next step */
	protected void performForward(String destination,HttpServletRequest request, 
			HttpServletResponse response)throws ServletException, IOException {	
		
		ServletContext context = getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher(destination);
		dispatcher.forward(request, response);
	} /* performForward */
    
	/**
	 * The Post method to allow a servlet to handle a POST request.
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		try {
			perForm(request,response);
		} catch (Exception e) {
			 performForward(Navigation.SiteError,request,response);
		}
	} /* doGet */

	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ImmeProd() {
		super();
	}

	/**@return a short description of this Servlet */
	public String getServletInfo() {
	    return "determine Immes Products";
	} /* getServletInfo */
	
	/** finally method */
	public void destroy() {
	} /* destroy */
}
