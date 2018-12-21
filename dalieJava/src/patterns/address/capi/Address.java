/**
 * 
 */
package patterns.address.capi;

/**
 * interface Address.
 * 
 * @author DALiE
 *
 */
public interface Address extends AddressTyp {

	/** Address: addressId */
	String addressId = null;
	/** Address: addressTyp */
	String addressTyp = null;
	/** Address: firstName */
	String firstName = null;
	/** Address: lastName */
	String lastName = null;
	/** Address: street */
	String street1 = null;
	/** Address: additional street */
	String street2 = null;
	/** Address: city */
	String city = null;
	/** Address: state */
	String state = null;
	/** Address: postalCode */
	String postalCode = null;
	/** Address: country */
	String country = null;
	
	/**
	 * get addressId from Address.
	 * @return addressId
	 */
	public String getAddressId();
	
	/**
	 * set addressId to Address.
	 * @param addressId
	 */
	public void setAddressId(final String addressId);
	
	/**
	 * get addressTyp from Address.
	 * @return addressTyp
	 */
	public String getAddressTyp();
	
	/**
	 * Set addressTyp to Address.
	 * @param addressTyp  
	 */
	public void setAddressTyp(final String addressTyp);
	
	/**
	 * get FristName from Address.
	 * @return firstName
	 */
	public String getFirstName();
	
	/**
	 * set LastName to Address.
	 * @param firstName
	 */
	public void setFirstName(final String firstName);
	
	
	/**
	 * get lastName from Address.
	 * @return lastName
	 */
	public String getLastName();
	
	/**
	 * Set lastName to Address.
	 * @param lastName  
	 */
	public void setLastName(final String lastName);
	
	/**
	 * get Street1 from Address.
	 * @return Street1
	 */
	public String getStreet1();

	/**
	 * Set Street1 to Address.
	 * @param street1  
	 */
	public void setStreet1(final String street1);

	/**
	 * get Street2 from Address.
	 * @return street2
	 */
	public String getStreet2();

	/**
	 * Set Street2 to Address.
	 * @param street2  
	 */
	public void setStreet2(final String street2);

	/**
	 * get City from Address.
	 * @return city
	 */
	public String getCity();

	/**
	 * Set City to Address.
	 * @param city  
	 */
	public void setCity(final String city);

	/**
	 * get State from Address.
	 * @return state 
	 */
	public String getState();

	/**
	 * Set State to Address.
	 * @param state  
	 */
	public void setState(final String state);

	/**
	 * get PostalCode from Address.
	 * @return postalCode
	 */
	public String getPostalCode();

	/**
	 * Set PostalCode to Address.
	 * @param postalCode  
	 */
	public void setPostalCode(final String postalCode);

	/**
	 * get Country from Address.
	 * @return country
	 */
	public String getCountry();

	/**
	 * Set Country to Address.
	 * @param country  
	 */
	public void setCountry(final String country);
	
}
