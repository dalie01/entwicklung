/*
 * MainClass.java 
 * @author Administrator on 05.12.2009 um 17:49:15 
 * 
 * no Copyright
 */
package random;

import java.util.Random;

/**
 * <b>Class</b>MainClass:<br>Only for Demonstration.<br>
 * 
 * @version 1.00 on 05.12.2009 um 17:49:15
 * @author dv0101
 * <br><br>
 * Generating Random Real Numbers.
 */
public class MainClass {
	/* used for demonstration of random */
	
	public static void main(String[] args){
		
		Random generator = new Random();
		/* 
		 * So need a random integer in the range 1 to 6. 
		 * "nextInt" can give you one in the range 0 to 5, 
		 * and you can translate this to the range you need:
		 * */
		System.out.println(generator.nextInt(6) + 1);
	}//main
}//class main
