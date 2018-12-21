package patterns.address.internal;

import org.apache.commons.lang3.StringUtils;

import patterns.address.capi.Address;
import patterns.address.capi.AddressTyp;
import patterns.address.model.DefaultAddress;

public class ShippingAddress extends DefaultAddress implements AddressTyp, Address {

	/**
	 * {@link Address}
	 * @param adressId identifier Address
	 */
	public ShippingAddress(String addressId) {
		super(addressId);
	}

	/* (non-Javadoc)
	 * @see patterns.address.capi.Address#isBillingAddress()
	 */
	@Override
	public boolean isBillingAddress() {
		
		return false;
	}

	/* (non-Javadoc)
	 * @see patterns.address.capi.Address#isShippingAddress()
	 */
	@Override
	public boolean isShippingAddress() {
		
		if (StringUtils.equals(ADDRESS_TYP_SHIPPING, 
				this.getAddressTyp()) ) {
			
			return true;
		}
		
		return false;
	}

}
