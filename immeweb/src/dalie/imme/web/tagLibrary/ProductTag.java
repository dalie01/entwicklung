package dalie.imme.web.tagLibrary;

import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import dalie.imme.design.sf.capi.product.Product;
import dalie.imme.design.sf.internal.navigation.Navigation;

public class ProductTag extends TagSupport {

	final String FB = "\"";
	private List<Product> products;
	/** join for ccsValue  */
	private String cssDefinition;
	
	public int doStartTag() throws JspException {

		try {
			JspWriter out = pageContext.getOut();
			
			out.append("<table cellspacing='0' cellpadding='0' width='100%' class="
					+ FB + cssDefinition + FB + ">");
			int index = 0;
			out.append("<tr>");
			for (Product product : products) {
				
				if (index == 3) {
					index = 0;
					out.append("</tr><tr><td onclick=" + FB + "location.href='./ImmeWeb?Page=PRODUCTDETAIL&SKU="+product.getSku()+"';" + FB + "><div class='nailthumb-container'><img src='" + Navigation.DIR_IMMEWEB_PICTURE + product.getMediumPicture() + "' alt='' " + "title=''/></div><br/>"+product.getName()+"</td>");

				} else{
					
					out.append("<td onclick=" + FB + "location.href='./ImmeWeb?Page=PRODUCTDETAIL&SKU="+product.getSku()+"';" + FB + "><div class='nailthumb-container'><img src='"+ Navigation.DIR_IMMEWEB_PICTURE + product.getMediumPicture() + "' alt='' " + "title=''/></div><br/>"+product.getName()+"</td>");
				}
				index++;
			}
			
			out.append("</tr></table>");
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
