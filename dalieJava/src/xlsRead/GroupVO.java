package xlsRead;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;



public class GroupVO {

	 private String preMMS = null;
	    
	    private String preSMS = null;
	    
	    private String preFixnet = null;
	    
	    private String preMobile = null;
	    
	    private String postMMS = null;
	    
	    private String postSMS = null;
	    
	    private String postMobile = null;
	    
	    private String postFixnet = null;
	    
	    private String postMobileInternational = null;
	    
	    private String postFixnetInternational  = null;
	    
	    private String preMobileInternational = null;
	    
	    private String preFixnetInternational  = null;
	    
	    private String id = null;
	    
	    private String nameDe = null;
	    
	    private String nameFr = null;
	    
	    private String nameIt = null;
	    
	    private String nameEn = null;
	    
	    private String disclaimerDe = null;
	    
	    private String disclaimerFr = null;
	    
	    private String disclaimerIt = null;
	    
	    private String disclaimerEn = null;
	    
	    private String countries = null;

	    private int published = -1;

	    
	    /**
	     * Getter.
	     * @return value
	     */
	    public String getPreMMS() {
	        return preMMS;
	    }

	    /**
	     * Setter.
	     * @param preMMS to set
	     */
	    public void setPreMMS(final String preMMS) {
	        this.preMMS = preMMS;
	    }
	    
	    /**
	     * Getter.
	     * @return value
	     */
	    public String getPreSMS() {
	        return preSMS;
	    }

	    /**
	     * Setter.
	     * @param preSMS to set
	     */
	    public void setPreSMS(final String preSMS) {
	        this.preSMS = preSMS;
	    }
	    
	    /**
	     * Getter.
	     * @return value
	     */
	    public String getPreFixnet() {
	        return preFixnet;
	    }

	    /**
	     * Setter.
	     * @param preFixnet to set
	     */
	    public void setPreFixnet(final String preFixnet) {
	        this.preFixnet = preFixnet;
	    }
	    
	    /**
	     * Getter.
	     * @return value
	     */
	    public String getPreMobile() {
	        return preMobile;
	    }

	    /**
	     * Setter.
	     * @param preMobile to set
	     */
	    public void setPreMobile(final String preMobile) {
	        this.preMobile = preMobile;
	    }
	    
	    /**
	     * Getter.
	     * @return value
	     */
	    public String getPostMMS() {
	        return postMMS;
	    }

	    /**
	     * Setter.
	     * @param postMMS to set
	     */
	    public void setPostMMS(final String postMMS) {
	        this.postMMS = postMMS;
	    }
	    
	    /**
	     * Getter.
	     * @return value
	     */
	    public String getPostSMS() {
	        return postSMS;
	    }

	    /**
	     * Setter.
	     * @param postSMS to set
	     */
	    public void setPostSMS(final String postSMS) {
	        this.postSMS = postSMS;
	    }
	    
	    /**
	     * Getter.
	     * @return value
	     */
	    public String getPostMobile() {
	        return postMobile;
	    }

	    /**
	     * Setter.
	     * @param postMobile to set
	     */
	    public void setPostMobile(final String postMobile) {
	        this.postMobile = postMobile;
	    }
	    
	    /**
	     * Getter.
	     * @return value
	     */
	    public String getPostFixnet() {
	        return postFixnet;
	    }

	    /**
	     * Setter.
	     * @param postFixnet to set
	     */
	    public void setPostFixnet(final String postFixnet) {
	        this.postFixnet = postFixnet;
	    }
	    
	    /**
	     * Getter.
	     * @return value
	     */
	    public String getPostMobileInternational() {
	        return postMobileInternational;
	    }

	    /**
	     * Setter.
	     * @param postMobileInternational to set
	     */
	    public void setPostMobileInternational(
	                    final String postMobileInternational) {
	        this.postMobileInternational = postMobileInternational;
	    }
	    
	    /**
	     * Getter.
	     * @return value
	     */
	    public String getPostFixnetInternational() {
	        return postFixnetInternational;
	    }

	    /**
	     * Setter.
	     * @param postFixnetInternational to set
	     */
	    public void setPostFixnetInternational(
	                    final String postFixnetInternational) {
	        this.postFixnetInternational = postFixnetInternational;
	    }
	    
	    
	    
	    /**
	     * Getter.
	     * @return value
	     */
	    public String getPreMobileInternational() {
			return preMobileInternational;
		}
	    /**
	     * Setter.
	     * @param preFixnetInternational to set
	     */
		public void setPreMobileInternational(String preMobileInternational) {
			this.preMobileInternational = preMobileInternational;
		}
		 /**
	     * Getter.
	     * @return value
	     */
		public String getPreFixnetInternational() {
			return preFixnetInternational;
		}
		/**
	     * Setter.
	     * @param preFixnetInternational to set
	     */
		public void setPreFixnetInternational(String preFixnetInternational) {
			this.preFixnetInternational = preFixnetInternational;
		}

		/**
	     * Getter.
	     * @return value
	     */
	    public String getId() {
	        return id;
	    }

	    /**
	     * Setter.
	     * @param name to set
	     */
	    public void setId(final String name) {
	        this.id = name;
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

	    


		public String getNameDe() {
			return nameDe;
		}

		public void setNameDe(String nameDe) {
			this.nameDe = nameDe;
		}

		public String getNameFr() {
			return nameFr;
		}

		public void setNameFr(String nameFr) {
			this.nameFr = nameFr;
		}

		public String getNameIt() {
			return nameIt;
		}

		public void setNameIt(String nameIt) {
			this.nameIt = nameIt;
		}

		public String getNameEn() {
			return nameEn;
		}

		public void setNameEn(String nameEn) {
			this.nameEn = nameEn;
		}
		
		public String getDisclaimerDe() {
			return disclaimerDe;
		}

		public void setDisclaimerDe(String disclaimerDe) {
			this.disclaimerDe = disclaimerDe;
		}

		public String getDisclaimerFr() {
			return disclaimerFr;
		}

		public void setDisclaimerFr(String disclaimerFr) {
			this.disclaimerFr = disclaimerFr;
		}

		public String getDisclaimerIt() {
			return disclaimerIt;
		}

		public void setDisclaimerIt(String disclaimerIt) {
			this.disclaimerIt = disclaimerIt;
		}

		public String getDisclaimerEn() {
			return disclaimerEn;
		}

		public void setDisclaimerEn(String disclaimerEn) {
			this.disclaimerEn = disclaimerEn;
		}

	    /**
	     * Returns the country id.
	     *
	     * @return  the country Id
	     */
	    public String getCountries() {
	    	return countries;
	    }
	  
	    /**
	     * Sets the country Id.
	     *
	     * @param  countryId to set
	     */	    
	    public void setCountries(String countries) {
	    	this.countries = countries;
	    }
	 
	    /**
	     * Get Country Tokenizer.
	     * @return StringTokenizer
	     * */
	    public List<String> getCountryList() {
	    	List<String> ids = new ArrayList<String>();
	    	StringTokenizer st = new StringTokenizer(getCountries(), ",");
			
	    	while (st.hasMoreTokens()) {
				ids.add(st.nextToken().toString().trim());
			}
			
	    	return ids;
	    }
	    
		@Override
		public String toString() {
			return "GroupVO [id=" + id 
					+ ",\n postFixnetInternational=" + postFixnetInternational
					+ ",\n postMobileInternational=" + postMobileInternational
					+ ",\n postFixnet=" + postFixnet
					+ ",\n postMobile=" + postMobile
					+ ",\n postSMS=" + postSMS 
					+ ",\n postMMS=" + postMMS
					+ ",\n preFixnetInternational=" + preFixnetInternational
					+ ",\n preMobileInternational=" + preMobileInternational
					+ ",\n preFixnet=" + preFixnet
					+ ",\n preMobile=" + preMobile
					+ ",\n preSMS=" + preSMS 
					+ ",\n preMMS=" + preMMS
					+ ",\n nameDe=" + nameDe
					+ ",\n nameFr=" + nameFr
					+ ",\n nameIt=" + nameIt
					+ ",\n nameEn=" + nameEn
					+ ",\n disclaimerDe=" + disclaimerDe
					+ ",\n disclaimerFr=" + disclaimerFr
					+ ",\n disclaimerIt=" + disclaimerIt
					+ ",\n disclaimerEn=" + disclaimerEn
					+ ",\n countryId=" + countries + "]";
		}
	    
	
	    
}
