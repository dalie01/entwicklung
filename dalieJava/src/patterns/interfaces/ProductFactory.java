package patterns.interfaces;

public interface ProductFactory {

	public abstract MyProduct getProduct();
	public abstract MyProduct getProduct(String productSKU);
	public abstract MyProduct getProductAsMobile(String productSKU);
	
}//interface ProductFactory
