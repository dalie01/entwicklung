/**
 * 
 */
package patterns.address;

import patterns.address.capi.Address;
import patterns.address.internal.BillingAddress;
import patterns.address.internal.ShippingAddress;

/**
 * @author DALiE
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BillingAddress address = new BillingAddress("1");
		ShippingAddress shippingAddress = new ShippingAddress("2");
		address.setAddressTyp("B");
		shippingAddress.setAddressTyp("S");
		
		Address billing = address;
		System.out.println(billing.isBillingAddress());
		Address shipping = shippingAddress;
		System.out.println(shipping.isShippingAddress());
				
	}

}
