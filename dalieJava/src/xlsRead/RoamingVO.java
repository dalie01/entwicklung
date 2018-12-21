package xlsRead;

public class RoamingVO {
	

	 private String call = null;

	 private String callStd = null;
	 
	 private String callRoamingOption = null;

	 private RegionVO toRegion = null;
	    
	 private RegionVO fromRegion = null;
	 
	 private int published = -1;
	    
	    /**
	     * Getter.
	     * @return value
	     */
	    public String getCallRoamingOption() {
	        return callRoamingOption;
	    }

	    /**
	     * Setter.
	     * @param callRoamingOption to set
	     */
	    public void setCallRoamingOption(
	                    final String callRoamingOption) {
	        this.callRoamingOption = callRoamingOption;
	    }

	    /**
	     * Getter.
	     * @return value
	     */
	    public String getCall() {
	        return call;
	    }

	    /**
	     * Setter.
	     * @param call to set
	     */
	    public void setCall(final String call) {
	        this.call = call;
	    }

	    
	    
	    /**
	     * Getter.
	     * @return callStd value
	     */
	    public String getCallStd() {
			return callStd;
		}

	    
		/**
		 * Setter.
		 * @param callStd to set
		 */
		public void setCallStd(String callStd) {
			this.callStd = callStd;
		}

		/**
	     * Getter.
	     * @return value
	     */
	    public RegionVO getToRegion() {
	        return toRegion;
	    }

	    /**
	     * Setter.
	     * @param region to set
	     */
	    public void setToRegion(final RegionVO region) {
	        this.toRegion = region;
	    }

	    /**
	     * Getter.
	     * @return value
	     */
	    public RegionVO getFromRegion() {
	        return fromRegion;
	    }

	    /**
	     * Setter.
	     * @param fromRegion to set
	     */
	    public void setFromRegion(final RegionVO fromRegion) {
	        this.fromRegion = fromRegion;
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
			return "RoamingVO [" 
					+ "call=" + call
					+ ", callStd=" + callStd
					+ ", callRoamingOption=" + callRoamingOption 
					+ ", published=" + published 
					+ ", fromRegion=" + fromRegion.toString()
					+ ", toRegion=" + toRegion.toString() + "]";
		}

	    
}
