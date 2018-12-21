package xlsRead;

public class OperatorVO {
	
	private int published = -1;

    private String frequency = null;
        
    private int mms = -1;
        
    private int umts = -1;
        
    private CountryVO country = null;
        
    private String tapCode = null;
        
    private String name = null;
        
    private int prepaid = -1;
        
    private int gprs = -1;
    
    /**
     * Getter.
     * @return value
     */ 
    public String getFrequency() {
        return frequency;
    }

    /**
     * Setter.
     * @param frequency to set
     */
    public void setFrequency(final String frequency) {
        this.frequency = frequency;
    }
    
    /**
     * Getter.
     * @return value
     */
    public int getMms() {
        return mms;
    }

    /**
     * Setter.
     * @param mms to set
     */
    public void setMms(final int mms) {
        this.mms = mms;
    }

    /**
     * Getter.
     * @return value
     */
    public int getUmts() {
        return umts;
    }

    /**
     * Setter.
     * @param umts to set
     */
    public void setUmts(final int umts) {
        this.umts = umts;
    }
    
    /**
     * Getter.
     * @return value
     */
    public CountryVO getCountry() {
        return country;
    }

    /**
     * Setter.
     * @param country to set
     */
    public void setCountry(final CountryVO country) {
        this.country = country;
    }

    /**
     * Getter.
     * @return value
     */
    public String getTapCode() {
        return tapCode;
    }

    /**
     * Setter.
     * @param tapCode to set
     */
    public void setTapCode(final String tapCode) {
        this.tapCode = tapCode;
    }

    /**
     * Getter.
     * @return value
     */
    public String getName() {
        return name;
    }

    /**
     * Setter.
     * @param name to set
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Getter.
     * @return value
     */
    public int getPrepaid() {
        return prepaid;
    }

    /**
     * Setter.
     * @param prepaid to set
     */
    public void setPrepaid(final int prepaid) {
        this.prepaid = prepaid;
    }

    /**
     * Getter.
     * @return value
     */
    public int getGprs() {
        return gprs;
    }

    /**
     * Setter.
     * @param gprs to set
     */
    public void setGprs(final int gprs) {
        this.gprs = gprs;
    }

    /**
     * Returns the publish state.
     *
     * @return  the publish state
     */
    public int getPublished() {
        return published;
    }
        
    /**
     * Sets the publish state.
     *
     * @param  publishState to set
     */
    public void setPublished(final int publishState) {
        published = publishState;
    }

	@Override
	public String toString() {
		return "OperatorVO [ name=" + name
				+ ",\n tapCode=" + tapCode
				+ ",\n prepaid=" + prepaid 
				+ ",\n countryVO=" + country
				+ ",\n gprs=" + gprs 
				+ ",\n umts=" + umts 
				+ ",\n mms=" + mms 
				+ ",\n frequency=" + frequency + "]";
	}
	
    
    
}
