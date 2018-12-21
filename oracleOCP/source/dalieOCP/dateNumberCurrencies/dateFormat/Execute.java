package dalieOCP.dateNumberCurrencies.dateFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

class Execute {
	
	public static void main(String[] args) {
		Date now = new Date();
		DateFormat[] df = new DateFormat[6];
		
		df[0] = DateFormat.getInstance();
		df[1] = DateFormat.getDateInstance();
		df[2] = DateFormat.getDateInstance(DateFormat.LONG);
		df[3] = DateFormat.getDateInstance(DateFormat.LONG,Locale.ITALY);
		df[4] = DateFormat.getDateInstance(DateFormat.LONG, new Locale("en", "EN"));
		
		for (DateFormat dateFormat : df) {
			if(dateFormat != null)
				System.out.println(dateFormat.format(now));
			
		}
		for (DateFormat dFormat : df) {
			if(dFormat != null) 
				try {
					System.out.println(dFormat.parse(now.toString()));
				} catch (ParseException e) {
					e.printStackTrace();
				}
			
		}
		
		Locale de = new Locale("de", "DE");// Remember: no modification is possible
		System.out.println(de.getLanguage() + de.getDisplayCountry() + de.getDisplayLanguage() + de.getDisplayLanguage(new Locale("it","IT")));
	}

}
