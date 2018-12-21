package dalie.imme.design.sf.capi.product;

import java.util.Map;
import java.util.Set;

public interface Product {
	
	static final String ATTRIBUTE_MEDIUM_PICTURE = "img_mediumpicture";
	static final String ATTRIBUTE_MINI_PICTURE = "img_minipicture";
	static final String ATTRIBUTE_PRODUCT_LENGTH = "length";
	static final String ATTRIBUTE_PRODUCT_HIGHT = "hight";
	static final String ATTRIBUTE_PRODUCT_DEEP = "deep";
	static final String ATTRIBUTE_PRODUCT_RANGE = "range";
	
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
	/** Product-Custom-Attribute */
	String attribute = null;
	/** Product-MediumPicture */
	String mediumPicture = null;
	/** Product-MiniPricture */
	String miniPicture = null;
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
	 * Get CatalogId from product.
	 * 
	 * @return catalogId refer Product
	 */
	public String getCatalog();
	
	/**
	 * Set CatalogId-Product.
	 * @param catalog from Product
	 */
	public void setCatalog(
			final String catalog);
	
	/**
	 * Get CategroyId from product.
	 * 
	 * @return category refer Product
	 */
	public String getCategory();
	
	/**
	 * Set CategoryId-Product.
	 * @param category from Product
	 */
	public void setCategory(
			final String Category);
	
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
	
	/**
	 * get all URL's from ProductImageLinks.
	 * in Case of Link by .JPG
	 * 
	 * @return ProductImageLinks
	 */
	public Set<String> getProductImageLinks();
	
	@Override
	public String toString();
	
}
