package patterns.interfaces;

public class ProductFactoryImpl implements ProductFactory {

	private static ProductFactory factory = null;
	
	/**default constructor */
	protected ProductFactoryImpl(){
		super();
	}//ProductFactoryImpl
	
	/**
	 * 
	 * Returns the unique singleton(an instance of an object)<br/> 
	 *  instance of class
	 *  
	 *  @return the singleton instance
	 * */
	public static ProductFactory getInstance(){
		if (factory == null) {
			
			factory = new ProductFactoryImpl();
		}
		return factory;
	}//getInstance
	
	@Override
	public MyProduct getProduct() {
		return new MyProductWrapper("");
	}//getProduct

	@Override
	public MyProduct getProduct(String productType) {
		if (productType.equals("R")) {
			return getProductAsRateplan("");			
		} else if(productType.equals("M")) {
			return getProductAsMobile("");
		}else{
			return null;
		}
	}//getProduct

	@Override
	public MobileWrapper getProductAsMobile(String productSKU){
		MobileWrapper myProduct = null;
		
		if (productSKU != null) {
			myProduct = new MobileWrapper(productSKU);
		}
		return myProduct;
	}//getProductAsMobile
	
	public MobileRateplanWrapper getProductAsRateplan(String productSKU){
		MobileRateplanWrapper myProduct = null;
		if (productSKU != null) {
			myProduct = new MobileRateplanWrapper(productSKU);
		}
		return myProduct;
	}//getProductAsRateplan
	

	
}//class ProductFactoryImpl
