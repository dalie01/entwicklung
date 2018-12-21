package dalie.imme.design.sf.internal.product;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;

import dalie.imme.design.sf.capi.product.Product;

public class ProductFinder {
	
	private List<Product> products;

	ProductFinder(){
		
	}
	public ProductFinder(List<Product> products){
		this.products = products;
	}
	
	public synchronized Product getProductBySKU(final String sku){
		
		for (Product product : products) {
			if (StringUtils.equals(product.getSku(),sku)) {
				return product;
			}
		}
		
		return null;
	}
	
	public synchronized Set<Product> getCatalogProducts(){
		Set<Product> cProducts = new HashSet<Product>();
		Set<String> catalogIds = new HashSet<String>();
		for (Product product  : products) {

			if (!catalogIds.contains(product.getCatalog())) {
				catalogIds.add(product.getCatalog());
				cProducts.add(product);
			}
		}
		return cProducts;
	}
	
	public synchronized Set<String> getCategorysByCatalogId(
			final Product product){
		
		Set<String> cIds = new HashSet<String>();
		
		for (Product pr: products) {
			if ( StringUtils.equals(pr.getCatalog(),product.getCatalog())
					&& StringUtils.isNotEmpty(product.getCategory())) {
				
				
				cIds.add(pr.getCategory());
			}
		}
		
		return cIds;
	}
	
}

