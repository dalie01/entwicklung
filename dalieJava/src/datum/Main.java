package datum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
	/** Constant used to access 'Date is between 18 and 27' */
	private final static String BETWEEN = "Specifed date is 18 to 27";
	/** Constant used to access 'Date is older 18'  */
	private final static String MIN_AGE = "Your Age is older than 18";
	/** Constant used to access 'Date is younger than 27' */
	private final static String MAX_AGE = "Your Age is younger than 27";
	
	/**
	 * @param args
	 */
	public static void main(final String[] args) {

		/** List of ErrorEntry's */	
		List<String> error = new ArrayList<String>();
		/** datum */
		String datum = "31.Februar.1985";
	    SimpleDateFormat df = new SimpleDateFormat("dd.MMMM.yyy");
		
	    try {
	        Date birthdate = df.parse(datum);
	        System.out.println(DatesCheck.isDateWorkDay(birthdate));
	        if(DatesCheck.isDateBetweenAges(birthdate, 18, 27))
	        	error.add(BETWEEN);
	        if(!DatesCheck.isDateMinAge(birthdate, 18))
	         	error.add(MIN_AGE);
	        if(!DatesCheck.isDateMaxAge(birthdate, 27))
	        	error.add(MAX_AGE);
	      } catch (ParseException e) {   
	        System.out.println(e.getMessage());
	        
	      }
	      for (String message : error) {
			System.out.println(message);
	      }
	      
	}//main
}//main
