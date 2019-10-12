package dalieOCP.locale;

import java.util.Locale;

class Execute {
	public static void main(String[] args) {
		System.out.println("1" + Locale.getDefault());
		System.out.println("2" + Locale.getAvailableLocales());

		Locale l1 = new Locale("en", "CA");
		System.out.println("3" + l1.getCountry());
		System.out.println("4" + l1.getVariant());
		System.out.println("5" + l1.toString());
		
		Locale de = new Locale("de", "DE");// Remember: no modification is possible
		System.out.println(de.getLanguage() + de.getDisplayCountry() + de.getDisplayLanguage() + "\n" + de.getDisplayLanguage(new Locale("it","IT")));
		
		
		Locale locale = new Locale("fr", "FR");
		Locale locale2 = new Locale(Locale.FRANCE.toString(), "FR");
		System.out.println(locale2);//is invalid Locale
		Locale.setDefault(locale);
		Locale locale1 = Locale.FRENCH; // only the language component, its region or country part remains unassigned
		System.out.println(locale1.getDisplayCountry());// will return an empty string
		
		
		Locale bLocale = new Locale.Builder().setLanguage("en").setRegion("US").build();
		System.out.println(bLocale);
		Locale aLocale = Locale.forLanguageTag("en-US");
		System.out.println(aLocale);
	}
}
