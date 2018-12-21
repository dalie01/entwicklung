package dalie.imme.web.servlet.product;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
 * Servlet implementation class ImmeProdDetail
 */
public class ImmeProdDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;	
	
	/** Constant to usage  for Request Attribute. */
	private static final String REQUEST_NAVIGATION_SKU = "SKU";
	
	/** perform for both HTTP <code>GET</code> and <code>POST</code> methods  */
	@SuppressWarnings({ "unchecked" })
	protected void perForm(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	    
	    HttpSession session = request.getSession();
	    List<Product> products = (List<Product>)session.getAttribute(
	    		Navigation.SESSION_ATTRIBUTE_PRODCUCTS);
	    Product product = null;
	    Map<String,String> productAttributes = null;
	    Set<String> productImageLinks = null;
	    if (products != null && products.size() > 0) {
	    	String sku = request.getParameter(REQUEST_NAVIGATION_SKU);
	    	if (sku == null) {
				throw new ServletException();
			}
	    	
	    	ProductFinder pf = new ProductFinder(products);
			product = pf.getProductBySKU(sku);
			if (product == null) {
				throw new ServletException();
			}			
			productAttributes = product.getCustomAttributes();
			productImageLinks = product.getProductImageLinks();
			
	    } else {
	    	throw new ServletException();
	    }
	    
	    Navigation immeweb = Navigation.getInstance().valueOf("PRODUCTDETAIL");
	    request.setAttribute(Navigation.REQUEST_ATTRIBUTE_LINK_TO_SITE, immeweb.getSiteLink());
	    request.setAttribute(Navigation.REQUEST_ATTRIBUTE_PRODUCT, product);
	    request.setAttribute(Navigation.REQUEST_ATTRIBUTE_PRODUCT_ATTRIBUTES, productAttributes);
	    request.setAttribute(Navigation.REQUEST_ATTRIBUTE_PRODUCT_IMAGE_LINKS, productImageLinks);
        performForward(Navigation.SiteType03,request,response);//JSP- User Login
    		
	} /* perForm */  
	
	/** handle the next step */
	protected void performForward(String destination,HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {	
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
    public ImmeProdDetail() {
        super();
    }
}
