package dalie.imme.web.tagLibrary;

import java.util.List;
import java.util.Set;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import dalie.imme.design.sf.capi.product.Product;
import dalie.imme.design.sf.internal.product.ProductFinder;

public class CatalogTag extends TagSupport {

	final String FB = "\"";
	private List<Product> products;
	/** join for ccsValue  */
	private String cssDefinition;
	
	public int doStartTag() throws JspException {

		try {
			JspWriter out = pageContext.getOut();
			ProductFinder pf = new ProductFinder(products);
			out.append("<div id='layer1'> <ul class='" + cssDefinition + "'>");
			for (Product product : pf.getCatalogProducts()) {
				
				out.append("<li id='product_"+ product.getCatalog() + "' class='" + cssDefinition +"'>" + product.getCatalog()+ "");
				
				Set<String> categorys = pf.getCategorysByCatalogId(product);
				if (categorys != null && categorys.size() > 0) {
					
					out.append("<div id='product_"+ product.getCatalog() + "' style='display:none'><ul>");
					for (String category : categorys) {
						out.append("<li>" + category + "</li>");
					}
					out.append("</ul></div></li>");
		    		
				} else {
					out.append("</li>");
				}
			
			}
			out.append("</ul></div>");
		} catch (Exception e) {
			throw new JspException("Create of TableContent " + " Exception "
					+ e.getMessage() + " is not vaild");
		}// try
		return SKIP_BODY;
	}

	
	/** To find the internal state */
    public void release() {
    	super.release();
    	products = null;
    	cssDefinition = null;
    }//release
    
    
	/**
	 * Set all Products to iterate.
	 * 
	 * @param products all Products
	 */
	public void setProducts( 
			final List<Product> products) {
		
		this.products = products;
	}

	/**
	 * Set Name of CSS Class.
	 * 
	 * @param cssDefinition Name of CSS
	 */
	public void setCssDefinition(
			final String cssDefinition) { 
		
		this.cssDefinition = cssDefinition;
	}
	
	
}
