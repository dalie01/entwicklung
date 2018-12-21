package dalieOCP.dateNumberCurrencies.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

class Execute {
	
	public static void main(String[] args) {
		Date now = new Date();
		Calendar c = Calendar.getInstance(Locale.getDefault());
		c.setTime(now);
		c.add(Calendar.MONTH, 1);
		Date future = c.getTime();
		System.out.println(c.getTime().toString());
		System.out.println(future.toString());
		
	}
}
