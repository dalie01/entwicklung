/**
 * 
 */
package patterns.address.internal;

import org.apache.commons.lang3.StringUtils;

import patterns.address.capi.Address;
import patterns.address.capi.AddressTyp;
import patterns.address.model.DefaultAddress;

/**
 * @author DALiE
 *
 */
public class BillingAddress extends DefaultAddress implements AddressTyp, Address {

		/**
		 * {@link Address}
		 * @param adressId identifier Address
		 */
		public BillingAddress(String adressId) {
			super(adressId);
		}

 
		/* (non-Javadoc)
		 * @see patterns.address.capi.Address#isShippingAddress()
		 */
		@Override
		public boolean isShippingAddress() {
			
			return false;
		}

		/** 
		 * Check is current address a BillingAddress.
		 * @see patterns.address.capi.Address#isBillingAddress()
		 * @return true is a BillingAddress
		 */
		@Override
		public boolean isBillingAddress() {
			
			if ( StringUtils.equals(ADDRESS_TYP_BILLING, 
					this.getAddressTyp()) ) {
				return true;
			}
			return false;
		}

}
