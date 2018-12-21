package patterns.interfaces;
/**
 * an abstract class that describe a product 
 * */
public abstract class AbstractMyProduct implements MyProduct {

	/** productSKU: just for demo a simple attribute */
	private String productSKU;
	
	/** default constructor */
	public AbstractMyProduct(String productSKU){
		this.productSKU = productSKU;
	}//AbstractMyProduct
	
	/** default isHardware is false */
	@Override
	public boolean isHardware(){
		return false;
	}//isHardware
	/** default isRateplan is false */
	@Override
	public boolean isRateplan(){
		return false;
	}//isRateplan
	
	@Override
	public String getMediumPictuer() {
		String folderFileToPictuer = null;
		
		if (getProductSKU() != null) 
				folderFileToPictuer = "\\local\\pictuer\\Mediumpic.png";
		
		return folderFileToPictuer;
	}//getMediumPictuer

	@Override
	public String getMiniPictuer() {
		String folderFileToPictuer = null;
		
		if (getProductSKU() != null) 
				folderFileToPictuer = "\\local\\pictuer\\Minipic.png";
		
		return folderFileToPictuer;
	}//getMiniPicuter

	/** @return Returns productSKU */
	public String getProductSKU() {
		return productSKU;
	}//getProductSKU

	/** set SKU to productSKU @param sku */
	public void setProductSKU(String sku) {
		this.productSKU = sku;
	}//setProductSKU
	
}//class AbstractMyProduct
