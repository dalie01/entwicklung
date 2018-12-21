package datum;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * class DatesCheck is.
 * */
/**
 * @author DALiE
 *
 */
final class DatesCheck {

	/**
	 * DatesCheck.
	 * */
	private DatesCheck() {
	}

	/**
	 * check Date is between minAge and maxAge. <br/>
	 *
	 * @param checkDate 01.01.1999
	 * @param minAge 18
	 * @param maxAge 19
	 * <br/>
	 * @return boolean
	 * **/
	public static boolean isDateBetweenAges(final Date checkDate,
		final int minAge, final int maxAge) {

		if (isDateMinAge(checkDate, minAge)
				|| isDateMaxAge(checkDate, maxAge)) 
			return false;
		
			return true;
		
	} //isDateBetweenAges

	/**
	 * check Date is older than age. <br/>
	 *
	 * @param checkDate 01.01.1999
	 * @param age 18
	 * <br/>
	 * @return boolean
	 * */
	public static boolean isDateMinAge(final Date checkDate,
			final int age) {

		Date date = getDateForAge(age);

		if (checkDate.compareTo(date) > 0) {
			return true;
		} else {
			return false;
		} //endif

	} // isDateMinAge

	/**
	 * check Date is younger than age. <br/>
	 *
	 * @param checkDate 01.01.1999
	 * @param age 27
	 * <br/>
	 * @return boolean
	 * */
	public static boolean isDateMaxAge(final Date checkDate,
			final int age) {

		Date date = getDateForAge(age);

		if (checkDate.compareTo(date) < 0) {
			return true;
		} else {
			return false;
		} //endif

	} //isDateMinAge
	
	/**
	 * check Date is before Date on Day's. <br/>
	 *
	 * @param checkDate 01.01.1999
	 * @param day 18
	 * <br/>
	 * @return boolean
	 * */
	public static boolean isDateBeforeDate(final Date checkDate,
			final int day) {
		
		Date date = getDateForDay(day);
		
		if (checkDate.before(date)) 
			return true;
		
		return false;
	} //isDateBeforeDate
	
	/**
	 * check Date is Day of the Week. <br/>
	 *
	 * @param checkDate 01.01.1999
	 * <br/>
	 * @return boolean
	 * */
	public static boolean isDateWorkDay(final Date checkDate) {
		
		if ( getDayOfDate(checkDate) >= 1 
				&& getDayOfDate(checkDate) <= 6 ) 
			return true;
		
		return false;
	} //isDateWorkDay

	/**
	 * determine Date of age.
	 * <br/>
	 * @param age year
	 * @return Date
	 ***/
	private static Date getDateForAge(final int age) {

		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		year = year - age;
		Calendar myCal =
			new GregorianCalendar(year,
					calendar.get(Calendar.MONTH),
					calendar.get(Calendar.DAY_OF_MONTH));

		return myCal.getTime();
	} //getDateForAge
	
	/**
	 * determine Date of day.
	 * <br/>
	 * @param int - the value of given days
	 * @return Date
	 ***/
	private static Date getDateForDay(final int day) {

		Calendar calendar = Calendar.getInstance();
		int currentDay = calendar.get(Calendar.YEAR);
		currentDay -= day;
		Calendar myCal =
			new GregorianCalendar(Calendar.YEAR,
					calendar.get(Calendar.MONTH),
					calendar.get(day));

		return myCal.getTime();
	} //getDateForDay

	/**
	 * determine Day of the Week.
	 * <br/>
	 * @param date - the given Date
	 * @return the value for the given calendar field.
	 ***/
	private static int getDayOfDate(final Date date) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		return calendar.get(Calendar.DAY_OF_WEEK);
	} // getDayOfDate
} //Class CompareDates
