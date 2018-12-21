package mobile.factorys;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import com.dalie.beehive.localization.factory.LocalInformationFactory;
import com.dalie.beehive.localization.internal.LocalInformation;

public class MobileLocalInformationFactory extends LocalInformationFactory {

	public static LocalInformationFactory instance;
	
	static {
		instance = new MobileLocalInformationFactory();
	}
	
	public static LocalInformationFactory getInstance(){
		return instance;
	} 
	
	public Map<String, LocalInformation> loadLocalels(){
		
		Map<String, LocalInformation> allLocales = new HashMap<String, LocalInformation>();
		allLocales.put("de", new LocalInformation(new Locale("de","DE")));
		allLocales.put("en", new LocalInformation(new Locale("en","DE")));
		allLocales.put("fr", new LocalInformation(new Locale("fr","DE")));
		allLocales.put("it", new LocalInformation(new Locale("it","DE")));
		return allLocales;
	}
	
	
} /* MobileLocalInformationFactory */
