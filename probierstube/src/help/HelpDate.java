package help;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;



public class HelpDate {

	Calendar cal = Calendar.getInstance();

	/**
	 * @return das Laufzeit-Datum Format TT.MM.JJJJ HH:MM:SS
	 */
	public String getTT_MM_JJJJ_HHMMSS() {
		DateFormat formater = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		return formater.format(cal.getTime());
	}//getjjmmyy

	/**
	 * @return das Laufzeit-Datum Format JJJJ
	 */
	static public String getJJJJ() {
		DateFormat formater = new SimpleDateFormat("yyyy");	
		return formater.format(Calendar.getInstance().getTime());
	}//getJJJJ

	static public String getTT_MM_JJJJ_HHMMSSDB(String dbDate) {
			return dbDate.substring(8, 10) + "." + dbDate.substring(5, 7) + "."
					+ dbDate.substring(0, 4) + " um "
					+ dbDate.substring(11, 19);
	}//getTT_MM_JJJJ_HHMMSSDB
}
//class HelpDate

