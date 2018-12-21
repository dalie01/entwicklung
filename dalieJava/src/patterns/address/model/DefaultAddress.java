package patterns.address.model;

import patterns.address.capi.AddressTyp;

public abstract class DefaultAddress implements AddressTyp {
	
	/** Constant to identify Address is a BillingAddress */
	public static final String ADDRESS_TYP_BILLING = "B";
	/** Constant to identify Address is a ShippingAddress */
	public static final String ADDRESS_TYP_SHIPPING = "S";
	
	/** Constant to usage Address.firstName */
	public static final String ADDRESS_FIRST_NAME = "Address.fristName";
	/** Constant to usage Address.lastName */
	public static final String ADDRESS_LAST_NAME = "Address.lastName";
	/** Constant to usage Address.street1 */
	public static final String ADDRESS_STREET_1 = "Address.street1";
	/** Constant to usage Address.street2 */
	public static final String ADDRESS_STREET_2 = "Address.street2";
	/** Constant to usage Address.city */
	public static final String ADDRESS_CITY = "Address.city";
	/** Constant to usage Address.state */
	public static final String ADDRESS_STATE = "Address.state";
	/** Constant to usage Address.postalCode */
	public static final String ADDRESS_POSTAL_CODE = "Address.postalCode";
	/** Constant to usage Address.contry */
	public static final String ADDRESS_COUNTRY = "Address.country";
	
	/** Address: addressId */
	private String addressId = null;
	/** Address: addressTyp */
	private String addressTyp = null;
	/** Address: firstName */
	private String firstName = null;
	/** Address: lastName */
	private String lastName = null;
	/** Address: street */
	private String street1 = null;
	/** Address: additional street */
	private String street2 = null;
	/** Address: city */
	private String city = null;
	/** Address: state */
	private String state = null;
	/** Address: postalCode */
	private String postalCode = null;
	/** Address: country */
	private String country = null;
	
	/**
	 * Default Constructor
	 * */
	public DefaultAddress(final String aString){
		this.addressId = aString;
	}
	
	/**
	 * get addressId from Address.
	 * @return addressId
	 */
	public String getAddressId() {
		return addressId;
	}
	
	/**
	 * set addressId to Address.
	 * @param addressId
	 */
	public void setAddressId(final String addressId) {
		this.addressId = addressId;
	}

	/**
	 * get addressTyp from Address.
	 * @return addressTyp
	 */
	public final String getAddressTyp() {
		return addressTyp;
	}
	
	/**
	 * Set addressTyp to Address.
	 * @param addressTyp  
	 */
	public final void setAddressTyp(final String addressTyp) {
		this.addressTyp = addressTyp;
	}

	/**
	 * get FristName from Address.
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * set LastName to Address.
	 * @param firstName
	 */
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	/**
	 * get LastName from Address.
	 * @return lastName  
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Set LastName to Address.
	 * @param lastName  
	 */
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	/**
	 * get Street1 from Address.
	 * @return Street1
	 */
	public String getStreet1() {
		return street1;
	}

	/**
	 * Set Street1 to Address.
	 * @param street1  
	 */
	public void setStreet1(final String street1) {
		this.street1 = street1;
	}

	/**
	 * get Street2 from Address.
	 * @return street2
	 */
	public String getStreet2() {
		return street2;
	}

	/**
	 * Set Street2 to Address.
	 * @param street2  
	 */
	public void setStreet2(final String street2) {
		this.street2 = street2;
	}

	/**
	 * get City from Address.
	 * @return city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Set City to Address.
	 * @param city  
	 */
	public void setCity(final String city) {
		this.city = city;
	}

	/**
	 * get State from Address.
	 * @return state 
	 */
	public String getState() {
		return state;
	}

	/**
	 * Set State to Address.
	 * @param state  
	 */
	public void setState(final String state) {
		this.state = state;
	}

	/**
	 * get PostalCode from Address.
	 * @return postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * Set PostalCode to Address.
	 * @param postalCode  
	 */
	public void setPostalCode(final String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * get Country from Address.
	 * @return country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Set Country to Address.
	 * @param country  
	 */
	public void setCountry(final String country) {
		this.country = country;
	}

}
