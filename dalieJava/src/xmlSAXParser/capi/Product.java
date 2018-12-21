package xmlSAXParser.capi;

import java.util.Map;

public interface Product {

	static final String ATTRIBUTE_MEDIUM_PICTURE = "medium_picture";
	static final String ATTRIBUTE_MINI_PICTURE = "mini_picture";
	
	/** Product-SKU */
	String sku = null;
	/** Product-Name */
	String name = null;
	/** Product-Online-Status */
	String online = null;
	/** Product-Description */
	String description = null;
	/** Product-Short-Description */
	String shortDescription = null;
	
	/** Product CustomProductAttributes */
	Map<String,String> customAttributes = null; 
	
	/**
	 * get customAttributeValue from product.
	 * 
	 * @param attribute as looking for
	 * @return value from ProductAttribute
	 */
	public String getAttribute(final String attribute);

	
	/**
	 * get URL from ProductImage MEDIUM.
	 * 
	 * @return url ProductImage
	 */
	public String getMediumPicture();
	
	/**
	 * get URL from ProductImage MINI.
	 * 
	 * @return url ProductImage
	 */
	public String getMiniPicture();

	/**
	 * Get Product-SKU-ID.
	 * @return sku Product-SKU-ID
	 */
	public String getSku();

	/**
	 * Set Product-SKU-ID.
	 * @param sku Product-SKU-ID
	 */
	public void setSku(String sku);

	/**
	 * Get Product Name.
	 * @return name Product.
	 */
	public String getName();

	/**
	 * Set Product Name.
	 * @param name Product Name
	 */
	public void setName(final String name);

	/**
	 * Get Online Status
	 * @return online Status
	 */
	public String getOnline();

	/**
	 * Set Online-Status.
	 * @param online String
	 */
	public void setOnline(final String online);
	
	/**
	 * get the product description from product.
	 * 
	 * @return description refer Product
	 */
	public String getDescription();
	
	/**
	 * Set Description-Product.
	 * @param description from Product
	 */
	public void setDescription(
			final String description);
	
	/**
	 * get the short description from product.
	 * 
	 * @return shortDescription refer Product
	 */
	public String getShortDescription();
	
	/**
	 * Set ShortDescription-Product.
	 * @param shortDescription from Product
	 */
	public void setShortDescription(
			final String shortDescription);
		
	/**
	 * Get CustomAttributes
	 * @return Map customAttributes
	 */
	public Map<String, String> getCustomAttributes();

	/**
	 * Set CustomAttributes. 
	 * @param customAttributes Map
	 */
	public void setCustomAttributes(
			final Map<String, String> customAttributes);

	@Override
	public String toString();
}
