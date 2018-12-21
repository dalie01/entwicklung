package com.dalie.beehive.localization.factory;

import java.util.Locale;
import java.util.Map;

import com.dalie.beehive.localization.internal.LocalInformation;

public abstract class LocalInformationFactory {

	public final Map<String, LocalInformation> allLocales = loadLocalels();
	
	public abstract Map<String, LocalInformation> loadLocalels();
	
	public LocalInformation getLocalInformation(final String argum){
		LocalInformation localInfo = null;
		
		if (this.allLocales.containsKey(argum)) {
			
			localInfo = this.allLocales.get(argum);
		} else 
			localInfo = new LocalInformation(new Locale("en","DE"));
		
		return localInfo;
	}
	
}
