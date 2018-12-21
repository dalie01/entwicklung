package dmc.capi.servicemanagement;

public interface ServiceOptionConflict {

	/**
     * Returns the product id.
     * @return Product id
     */
    String getProductId();
    
    /**
     * Sets the product id.
     * @param productId Product id to set
     */
    void setProductId(String productId);
    
    /**
     * Returns the conflict key.
     * @return Conflict key
     */
    @Deprecated
    Long getConflictKey();
    
    /**
     * Sets the conflict key.
     * @param conflictKey Conflict key to set
     */
    @Deprecated
    void setConflictKey(Long conflictKey);
	
}
