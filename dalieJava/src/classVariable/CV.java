package classVariable;

/**
 * @author DALiE
 * 
 * */
public class CV {

	/** class counter. */
	private static	int counter;
	/** number. */
	private int number;
	
	/** default. */
	public CV() {
		this.number = ++counter;
	}

	/** @return counter */
	public static int getCounter() {
		return counter;
	}

	/** @return number */
	public final int getNumber() {
		return number;
	}	
	
}
