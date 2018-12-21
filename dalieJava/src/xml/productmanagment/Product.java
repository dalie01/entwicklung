package xml.productmanagment;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class Product {
	
	private static final String ATTRIBUTE_DESCRIPTION = "description"; 
	private static final String ATTRIBUTE_SHORT_DESCRIPTION = "short_description";
	private static final String ATTRIBUTE_MEDIUM_PICTURE = "medium_picture";
	private static final String ATTRIBUTE_MINI_PICTURE = "mini_picture";
	
	
	private String sku;
	private String name;
	private String online;
	private Map<String,String> customAttributes = new HashMap<String,String>();
	
	public Product(){
		
	}

	/**
	 * get customAttributeValue from product.
	 * 
	 * @param attribute as looking for
	 * @return value from ProductAttribute
	 */
	public String getAttribute(String attribute) {
		String value = "";
		
		
		if (StringUtils.isNotEmpty(attribute) && this.customAttributes.size() != 0) {
			
			return this.customAttributes.get(attribute);
		}
		
		return value;
	}
	
	/**
	 * get the product description from product.
	 * 
	 * @return description refer Product
	 */
	public String getDescription() {
		String description = "";
		
		if (this.customAttributes.containsKey(ATTRIBUTE_DESCRIPTION)) {
			return this.customAttributes.get(ATTRIBUTE_DESCRIPTION);
		}
		
		return description;
	}
	
	/**
	 * get the short description from product.
	 * 
	 * @return shortDescription refer Product
	 */
	public String getShortDescription() {
		String shortDescription = "";
		
		if (this.customAttributes.containsKey(ATTRIBUTE_SHORT_DESCRIPTION)) {
			return this.customAttributes.get(ATTRIBUTE_SHORT_DESCRIPTION);
		}
		
		return shortDescription;
	}
	
	/**
	 * get URL from ProductImage MEDIUM.
	 * 
	 * @return url ProductImage
	 */
	public String getMediumPicture() {
		String pfad = "";
		
		if (this.customAttributes.containsKey(ATTRIBUTE_MEDIUM_PICTURE)) {
			return this.customAttributes.get(ATTRIBUTE_MEDIUM_PICTURE);
		}
		
		return pfad;
	}
	
	/**
	 * get URL from ProductImage MINI.
	 * 
	 * @return url ProductImage
	 */
	public String getMiniPicture() {
		String pfad = "";
		
		if (this.customAttributes.containsKey(ATTRIBUTE_MINI_PICTURE)) {
			return this.customAttributes.get(ATTRIBUTE_MINI_PICTURE);
		}
		
		return pfad;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOnline() {
		return online;
	}

	public void setOnline(String online) {
		this.online = online;
	}

	public Map<String, String> getCustomAttributes() {
		return customAttributes;
	}

	public void setCustomAttributes(Map<String, String> customAttributes) {
		this.customAttributes = customAttributes;
	}
	
}
