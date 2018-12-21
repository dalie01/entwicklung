/*
 * Created of DV0101 on 24.04.2010 14:39:22
 *
 * Filename       CheckDateTime.java
 * */
package datum;

/**
 * CheckDateTime only for demo.
 * */
public class CheckDateTime {
	
	/**main: start */
	public static void main(String[] args){
		System.out.println(getTimeUnit(123)); // 123 ms 
		System.out.println(getTimeUnit(1234)); // 1 sec 
		System.out.println(getTimeUnit(12345)); // 12 sec 
		System.out.println(getTimeUnit(123456)); // 2 min 
		System.out.println(getTimeUnit(1234567)); // 20 min 
		System.out.println(getTimeUnit(12345678)); // 3 hr 
		System.out.println(getTimeUnit(123456789)); // 1 days 
		System.out.println(getTimeUnit(1234567890)); // 14 days 
		System.out.println(getTimeUnit((123456789 + 123456789))); //2 days
	}//main
	
	/** getTimeUnit: investigating time and unit */
	private static String getTimeUnit(int time) {
		String unit = "ms";
		if (time >= 365 * 24 * 60 * 60 * 1000L) {
			unit = "years";
			time /= 365 * 24 * 60 * 60 * 1000L;
		} else if (time >= 24 * 60 * 60 * 1000) {
			unit = "days";
			time /= 24 * 60 * 60 * 1000;
		} else if (time >= 60 * 60 * 1000) {
			unit = "hr";
			time /= 60 * 60 * 1000;
		} else if (time >= 60 * 1000) {
			unit = "min";
			time /= 60 * 1000;
		} else if (time >= 1000) {
			unit = "sec";
			time /= 1000;
		} // Execution continues here if any of the conditions match 
		return time + " " + unit;
	}//getTimeUnit
}//class CheckDateTime
