package dalieOCP.dateNumberCurrencies;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/*
 * java.util.Date -> use this class to bridge between the Calendar and DateFormat class.
 * 
 * java.util.Calander -> convert and manipulate dates and Time
 * 
 * java.util.DateFormat -> class is used to format dates 
 * 
 * java.util.NumberFormat -> to format numbers and currencies for locales around the world
 * 
 * java.util.Local -> for specific locales
 * */

class Execute {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/* UseCase: Get the current date and Time */
		Date d = new Date(); //represents a sing date & time (primitive long on milliseconds(1000 per second))
		String s1 = d.toString();
		System.out.println(s1);
		
		
		/* UseCase: Get an object that lets you perform date and time calculations
		 * in your locale */
		Calendar c1 = Calendar.getInstance();
		c1.setTime(d); 
//		c1.add(field, amount);//to perform date and time manipulations
		
		/* UseCase: Get an object that lets you perform date and time calculations
		 * in different locale */
		Calendar c2 = Calendar.getInstance(new Locale("language"));
//		c1.add(field, amount);//to perform date and time manipulations
		
		/* UseCase: Get an object that lets you perform date ant time calculations 
		 * and then format it for output in different locales with different date styles.*/
		Calendar c3 = Calendar.getInstance();
		Locale l3 = new Locale("language", "country");
		Date d1 = c3.getTime();
		DateFormat df = DateFormat.getDateInstance(1, l3);
		String s2 = df.format(d1);
		
		
		NumberFormat nf = NumberFormat.getInstance(l3);
		String s3 = nf.format(d1);
		
	}
}
