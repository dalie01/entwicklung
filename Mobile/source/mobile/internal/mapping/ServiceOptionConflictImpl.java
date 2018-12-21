package mobile.internal.mapping;

import mobile.capi.mapping.ServiceOptionConflict;


public class ServiceOptionConflictImpl implements ServiceOptionConflict {

	private String productId;
    private Long conflictKey;
    
    /**
     * Returns the product id.
     * @return Product id
     */
	public String getProductId() {
        return productId;
    }
    
    /**
     * Sets the product id.
     * @param productId Product id to set
     */
	public void setProductId(final String productId) {
        this.productId = productId;
    }
    
    /**
     * Returns the conflict key.
     * @return Conflict key
     */
	public Long getConflictKey() {
        return conflictKey;
    }
    
    /**
     * Sets the conflict key.
     * @param conflictKey Conflict key to set
     */
	public void setConflictKey(final Long conflictKey) {
        this.conflictKey = conflictKey;
    }
    
}
