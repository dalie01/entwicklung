package dalie.imme.design.sf.internal.product;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;

import dalie.imme.design.sf.capi.product.Product;
import dalie.imme.design.sf.internal.navigation.Navigation;




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
	/** Product-Catalog */
	private String catalog;
	/** Product-Catalog-Category  */
	private String category;
	/** Product-Attribute*/
	private String attribute;
	/** Product-MediumPicture */
	private String mediumPicture;
	/** Product-MiniPricture */
	private String miniPicture;
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
	public String getAttribute(String attribute) {
		
		if (StringUtils.isNotEmpty(attribute) && 
				this.customAttributes.size() != 0) {
			
			this.attribute = this.customAttributes.get(attribute);
		}
		
		return this.attribute;
	}
	
	/**
	 * get URL from ProductImage MEDIUM.
	 * 
	 * @return url ProductImage
	 */
	public String getMediumPicture() {
		
		if (this.customAttributes.containsKey(
				Product.ATTRIBUTE_MEDIUM_PICTURE)) {
			
			this.mediumPicture = getCustomAttributes().get(
					Product.ATTRIBUTE_MEDIUM_PICTURE);
		}
		
		return this.mediumPicture;
	}
	
	/**
	 * get URL from ProductImage MINI.
	 * 
	 * @return url ProductImage
	 */
	public String getMiniPicture() {
		
		if (this.customAttributes.containsKey(
				Product.ATTRIBUTE_MINI_PICTURE)) {
			
			this.miniPicture = getCustomAttributes().get(
					Product.ATTRIBUTE_MINI_PICTURE);
		}
		
		return this.miniPicture;
	}

	/**
	 * get all URL's from ProductImageLinks.
	 * in Case of Link by .JPG
	 * 
	 * @return ProductImageLinks
	 */
	public Set<String> getProductImageLinks(){
		Set<String> images = new HashSet<String>();
		
		for( Map.Entry<String, String> entry : getCustomAttributes().entrySet() ) {
			
			String image = entry.getValue();
			if (StringUtils.containsIgnoreCase(image, ".JPG")) {
				images.add(image);				
			}
			
		} /* for entry */
		return images;
	}
	
	/**
	 * Get Product-SKU-ID.
	 * @return sku Product-SKU-ID
	 */
	public String getSku() {
		return sku;
	}

	/**
	 * Set Product-SKU-ID.
	 * @param sku Product-SKU-ID
	 */
	public void setSku(final String sku) {
		this.sku = sku;
	}

	/**
	 * Get Product Name.
	 * @return name Product.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set Product Name.
	 * @param name Product Name
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Get Online Status
	 * @return online Status
	 */
	public String getOnline() {
		return online;
	}

	/**
	 * Set Online-Status.
	 * @param online String
	 */
	public void setOnline(final String online) {
		this.online = online;
	}
	
	/**
	 * get the product description from product.
	 * 
	 * @return description refer Product
	 */
	public String getDescription() {
		
		return description;
	}
	
	/**
	 * Set Description-Product.
	 * @param description from Product
	 */
	public void setDescription(
			final String description) {
		
		this.description = description;
	}
	
	/**
	 * get the short description from product.
	 * 
	 * @return shortDescription refer Product
	 */
	public String getShortDescription() {
		
		return shortDescription;
	}
	
	/**
	 * Set ShortDescription-Product.
	 * @param shortDescription from Product
	 */
	public void setShortDescription(
			final String shortDescription) {
		
		this.shortDescription = shortDescription;
	}
	
	/**
	 * Get CatalogId from product.
	 * 
	 * @return catalogId refer Product
	 */
	public String getCatalog() {
		return catalog;
	}
	/**
	 * Set CatalogId-Product.
	 * @param catalog from Product
	 */

	public void setCatalog(
			final String catalog) {
		
		this.catalog = catalog;
	}

	/**
	 * Get CategroyId from product.
	 * 
	 * @return category refer Product
	 */
	public String getCategory() {
		return category;
	}
	
	/**
	 * Set Category-Product.
	 * @param shortDescription from Product
	 */
	public void setCategory(
			final String category) {
		
		this.category = category;
	}
	
	/**
	 * Get CustomAttributes
	 * @return Map customAttributes
	 */
	public Map<String, String> getCustomAttributes() {
		return customAttributes;
	}

	/**
	 * Set CustomAttributes. 
	 * @param customAttributes Map
	 */
	public void setCustomAttributes(Map<String, String> customAttributes) {
		this.customAttributes = customAttributes;
	}

	@Override
	public String toString() {
		return "ProductImpl [sku=" + sku + ", " +
				"name=" + name + ", " +
				"description=" + description + ", " +
				"shortDescription=" + shortDescription + ", " +
				"catalog=" + catalog + ", " +
				"cateogry=" + category + ", " +
				"online=" + online + "]";
	}
	
}
