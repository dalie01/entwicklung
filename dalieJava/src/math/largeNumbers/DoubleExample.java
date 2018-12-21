package math.largeNumbers;

import java.math.BigDecimal;

/**
 * Demo of calculate with Double etc.
 * 
 * @author DALiE
 *
 * @version $Revision: 1.0 $
 */
public class DoubleExample {

	/**
	 * start to DoubleExamle
	 * @param args
	 */
	public static void main(String[] args) {
	
		BigDecimal a = new BigDecimal(new Double(10.0));
		BigDecimal b = new BigDecimal( "2" );
		BigDecimal c = a.add(b);   
		System.out.println(c);
		System.out.println(a.compareTo(c));
		
	}//main
	
}// DoubleExample
