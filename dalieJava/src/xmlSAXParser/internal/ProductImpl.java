package xmlSAXParser.internal;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import xmlSAXParser.capi.Product;


public class ProductImpl implements Product {

	
	/** Product-SKU */
	private String sku;
	/** Product-Name */
	private String name;
	/** Product-Online-Status */
	private String online;
	/** Product-Description */
	private String description;
	/** Product-Short-Description */
	private String shortDescription;
		
	/** Product CustomProductAttributes */
	private Map<String,String> customAttributes = new HashMap<String,String>();
	
	public ProductImpl(){
		
	}

	/**
	 * get customAttributeValue from product.
	 * 
	 * @param attribute as looking for
	 * @return value from ProductAttribute
	 */
	@Override
	public String getAttribute(String attribute) {
		String value = "";
		
		if (StringUtils.isNotEmpty(attribute) && 
				this.customAttributes.size() != 0) {
			
			return this.customAttributes.get(attribute);
		}
		
		return value;
	}
	
	/**
	 * get URL from ProductImage MEDIUM.
	 * 
	 * @return url ProductImage
	 */
	@Override
	public String getMediumPicture() {
		String pfad = "";
		
		if (this.customAttributes.containsKey(
				Product.ATTRIBUTE_MEDIUM_PICTURE)) {
			
			return this.customAttributes.get(
					Product.ATTRIBUTE_MEDIUM_PICTURE);
		}
		
		return pfad;
	}
	
	/**
	 * get URL from ProductImage MINI.
	 * 
	 * @return url ProductImage
	 */
	@Override
	public String getMiniPicture() {
		String pfad = "";
		
		if (this.customAttributes.containsKey(
				Product.ATTRIBUTE_MINI_PICTURE)) {
			
			return this.customAttributes.get(
					Product.ATTRIBUTE_MINI_PICTURE);
		}
		
		return pfad;
	}

	/**
	 * Get Product-SKU-ID.
	 * @return sku Product-SKU-ID
	 */
	@Override
	public String getSku() {
		return sku;
	}

	/**
	 * Set Product-SKU-ID.
	 * @param sku Product-SKU-ID
	 */
	@Override
	public void setSku(final String sku) {
		this.sku = sku;
	}

	/**
	 * Get Product Name.
	 * @return name Product.
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * Set Product Name.
	 * @param name Product Name
	 */
	@Override
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Get Online Status
	 * @return online Status
	 */
	@Override
	public String getOnline() {
		return online;
	}

	/**
	 * Set Online-Status.
	 * @param online String
	 */
	@Override
	public void setOnline(final String online) {
		this.online = online;
	}
	
	/**
	 * get the product description from product.
	 * 
	 * @return description refer Product
	 */
	@Override
	public String getDescription() {
		
		return description;
	}
	
	/**
	 * Set Description-Product.
	 * @param description from Product
	 */
	@Override
	public void setDescription(
			final String description) {
		
		this.description = description;
	}
	
	/**
	 * get the short description from product.
	 * 
	 * @return shortDescription refer Product
	 */
	@Override
	public String getShortDescription() {
		
		return shortDescription;
	}
	
	/**
	 * Set ShortDescription-Product.
	 * @param shortDescription from Product
	 */
	@Override
	public void setShortDescription(
			final String shortDescription) {
		
		this.shortDescription = shortDescription;
	}
	
	/**
	 * Get CustomAttributes
	 * @return Map customAttributes
	 */
	@Override
	public Map<String, String> getCustomAttributes() {
		return customAttributes;
	}

	/**
	 * Set CustomAttributes. 
	 * @param customAttributes Map
	 */
	@Override
	public void setCustomAttributes(Map<String, String> customAttributes) {
		this.customAttributes = customAttributes;
	}

	@Override
	public String toString() {
		return "ProductImpl [sku=" + sku + ", " +
				"name=" + name + ", " +
				"description=" + description + ", " +
				"shortDescription=" + shortDescription + ", " +
				"online=" + online + "]";
	}
	
}
