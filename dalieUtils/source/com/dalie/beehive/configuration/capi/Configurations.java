package com.dalie.beehive.configuration.capi;

import java.util.List;

public interface Configurations {

	
//	public abstract Configuration getConfiguration(Domain paramDomain);

//	public abstract Configuration getConfiguration(String paramString);
	
	public abstract Boolean getBooleanConfiguration(String key, String domainId);
	public abstract Boolean getBooleanConfiguration(String key);
	 
	public abstract List<?> getListConfiguration(String key, String domainId);
	public abstract List<?> getListConfiguration(String key);
	 
//	public abstract String[] getArrayConfiguration(String paramString, Domain paramDomain);
	 
	public abstract String getString(String key, String domainId);
	public abstract String getString(String key);
	 
//	public abstract Integer getIntegerConfiguration(String paramString, Domain paramDomain);
}
