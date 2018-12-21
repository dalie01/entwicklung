package dmc.internal.mapping.servicemanagement;

import dmc.capi.servicemanagement.ServiceOptionConflict;

public class ServiceOptionConflictImpl  implements ServiceOptionConflict{

	private String productId;
    private Long conflictKey;
    
    /**
     * Returns the product id.
     * @return Product id
     */
    @Override
	public String getProductId() {
        return productId;
    }
    
    /**
     * Sets the product id.
     * @param productId Product id to set
     */
    @Override
	public void setProductId(final String productId) {
        this.productId = productId;
    }
    
    /**
     * Returns the conflict key.
     * @return Conflict key
     */
    @Override
	public Long getConflictKey() {
        return conflictKey;
    }
    
    /**
     * Sets the conflict key.
     * @param conflictKey Conflict key to set
     */
    @Override
	public void setConflictKey(final Long conflictKey) {
        this.conflictKey = conflictKey;
    }
}
