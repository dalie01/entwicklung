package xlsRead;

public class CountryVO {

	 public static final String PROPERTY_NAME = "name";
	    
	    private GroupVO countryGroup = null;
	    
	    private RegionVO region = null;
	    
	    private int published = -1;
	    
	    private String uuid = null;
	    
	    private String id = null;
	    
	    private String nameDe = null;
	    
	    private String nameFr = null;
	    
	    private String nameIt = null;
	    
	    private String nameEn = null;
	    
	    private String flatInclusive = null;
	    
	    private String additionalRateplans = null;
	   
	    /**
	     * Getter.
	     * @return value
	     */
	    public String getId() {
	        return id;
	    }

	    /**
	     * Setter.
	     * @param id  to set
	     */
	    public void setId(final String id) {
	        this.id = id;
	    }

	    /**
	     * Getter.
	     * @return value
	     */
	    public String getNameDe() {
	        return nameDe;
	    }

	    /**
	     * Setter.
	     * @param nameDe  to set
	     */
	    public void setNameDe(final String nameDe) {
	        this.nameDe = nameDe;
	    }

	    /**
	     * Getter.
	     * @return value
	     */
	    public String getNameFr() {
	        return nameFr;
	    }

	    /**
	     * Setter.
	     * @param nameFr  to set
	     */
	    public void setNameFr(final String nameFr) {
	        this.nameFr = nameFr;
	    }

	    /**
	     * Getter.
	     * @return value 
	     */
	    public String getNameIt() {
	        return nameIt;
	    }

	    /**
	     * Setter.
	     * @param nameIt  to set
	     */
	    public void setNameIt(final String nameIt) {
	        this.nameIt = nameIt;
	    }

	    /**
	     * Getter.
	     * @return value 
	     */
	    public String getNameEn() {
	        return nameEn;
	    }

	    /**
	     * Setter.
	     * @param nameIt  to set
	     */
	    public void setNameEn(final String nameEn) {
	        this.nameEn = nameEn;
	    }
	    
	    /**
	     * Getter.
	     * @return value 
	     */
	    public String getFlatInclusive() {
			return flatInclusive;
		}

	    /**
	     * Setter.
	     * @param flateInclusive to set
	     */
		public void setFlatInclusive(String flatInclusive) {
			this.flatInclusive = flatInclusive;
		}

		 /**
	     * Getter.
	     * @return value 
	     */
		public String getAdditionalRateplans() {
			return additionalRateplans;
		}
		
		/**
	     * Setter.
	     * @param additionalRateplans to set
	     */
		public void setAdditionalRateplans(String additionalRateplans) {
			this.additionalRateplans = additionalRateplans;
		}

		/**
	     * Getter.
	     * @return value
	     */
	    public String getUUID() {
	        return uuid;
	    }

	    /**
	     * Setter.
	     * @param uuid to set
	     */
	    public void setUUID(final String uuid) {
	        this.uuid = uuid;
	    }

	   

	    /**
	     * The ralated group.
	     * 
	     * @return the group
	     */
	    public GroupVO getCountryGroup() {
	        return countryGroup;
	    }
	        
	    /**
	     * Sets the related group.
	     *
	     * @param  aGroup to set
	     */
	    public void setCountryGroup(final GroupVO aGroup) {
	        countryGroup = aGroup;
	    }
	    
	    /**
	     * Returns the region.
	     *
	     * @return  the region
	     */
	    public RegionVO getRegion() {
	        return region;
	    }
	        
	    /**
	     * Set the region.
	     *
	     * @param  aRegion the region to set
	     */
	    public void setRegion(final RegionVO aRegion) {
	        region = aRegion;
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
			return "CountryVO [countryGroup=" + countryGroup 
					+ ",\n region=" + region 
					+ ",\n id=" + id
					+ ",\n nameDe=" + nameDe 
					+ ",\n nameFr=" + nameFr 
					+ ",\n nameIt=" + nameIt
					+ ",\n nameEn=" + nameEn
					+ ",\n flateInclusive=" + flatInclusive
					+ ",\n addionalRateplans=" + additionalRateplans
					+ ",\n published=" + published 
					+ ", uuid=" + uuid + "]";
		}
	    
	    
}
