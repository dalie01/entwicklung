/**
 * 
 */
package patterns.address.capi;

/**
 * @author DALiE
 *
 */
public interface AddressTyp {
	
	/** check is Address from Type BillingAddress */
	public boolean isBillingAddress();
	/** check is Address from Type ShippingAddress */
	public boolean isShippingAddress();
	
}
