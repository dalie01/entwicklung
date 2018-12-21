/*
 * Created on 11.02.2010
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package iSeries;

import java.beans.PropertyVetoException;
import java.io.IOException;

import com.ibm.as400.access.AS400SecurityException;
import com.ibm.as400.access.ErrorCompletingRequestException;
import com.ibm.as400.access.ObjectDoesNotExistException;



/**
 * @author DV0101
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class callPgmFromJava {

	public static void main(String args[]) throws PropertyVetoException, 
				AS400SecurityException, ErrorCompletingRequestException, IOException, InterruptedException, 
				ObjectDoesNotExistException {

		com.ibm.as400.access.AS400 system = new com.ibm.as400.access.AS400("mysystem","myuser","mypwd");
		//create program call
		com.ibm.as400.access.ProgramCall pgm = new com.ibm.as400.access.ProgramCall();

		//identify the program to run
		String progName = "/QSYS.LIB/YOUR.LIB/MYPRICE.PGM";

		// create parameter list for the program
		com.ibm.as400.access.ProgramParameter[] pList = new com.ibm.as400.access.ProgramParameter[4];

		//this is for conversion of java String to/from native
		com.ibm.as400.access.AS400Text rtParm = new com.ibm.as400.access.AS400Text(1);

		//identify fist param
		pList[0] = new com.ibm.as400.access.ProgramParameter(rtParm.toBytes(" "), 1);
		
		/*
		 * 1. Initialize an AS400PackedDecimal object with a length of 6 that has null decimal positions.
		 * */
		com.ibm.as400.access.AS400PackedDecimal cust = new com.ibm.as400.access.AS400PackedDecimal(6, 0);

		/* identify param 
		 * 2. Create a BigDecimal object that is equal from customerNumber.
		 * 
		 * */
		pList[1] = new com.ibm.as400.access.ProgramParameter(cust.toBytes(new java.math.BigDecimal("custNumber")), 4);

		// this is for conversion of java String to/from native
		com.ibm.as400.access.AS400Text item = new com.ibm.as400.access.AS400Text(15);

		/* identify param */
 		pList[2] = new com.ibm.as400.access.ProgramParameter(item.toBytes(new String("skuNumber")), 15);

		//this is used to convert between java(BigDecimal) and Packed floating point decimal
		com.ibm.as400.access.AS400PackedDecimal pric = new com.ibm.as400.access.AS400PackedDecimal(7, 2);

		/* identify param */
		pList[3] = new com.ibm.as400.access.ProgramParameter(pric.toBytes(new java.math.BigDecimal("0")), 4);

		/*
		 * Here, we create a program parameter for an AS/400-packed decimal field with a
		 * length of 5, two decimal positions, and an initial value of zero. 
		 * This program parameter actually takes three bytes. 
		 * 
		 * This is done in four steps:
		 * 1. Create a BigDecimal object that is equal to zero.
		 * 2. Initialize an AS400PackedDecimal object with a length of 5 that has two decimal positions
		 * 3. Use the toBytes method of the AS400PackedDecimal field to convert the
		 * 	  BigDecimal that was created in step one to an array of bytes.
		 * 4. Create a ProgramParameter with a length of three and initialize it with the byte
		 *    array created in the previous step.
		 * */
		pList[4] = new com.ibm.as400.access.ProgramParameter(new com.ibm.as400.access. AS400PackedDecimal(5, 2).toBytes(new java.math.BigDecimal(0)), 3);
		
		//set the system to AS/400
		pgm.setSystem(system);
		// set program and parameters
		pgm.setProgram(progName, pList);

		// run the program
		if (pgm.run() != true) {
			com.ibm.as400.access.AS400Message[] messageList = pgm.getMessageList();
			for (int msg = 0; msg < messageList.length; msg++) {
				// this is to print error message to standard out
				System.out.println(messageList[msg]);
			}//for
		} else {

			if (((String) (rtParm.toObject(pList[0].getOutputData(), 0))).equals(" ")) {
				// get the price
				double intPrice = ((java.math.BigDecimal) (new com.ibm.as400.access.AS400PackedDecimal(7, 2)).toObject(pList[3].getOutputData(), 0)).doubleValue();

				// create number format for displaying the price
				java.text.NumberFormat nf = java.text.NumberFormat.getCurrencyInstance();

				// set the text
				System.out.println(nf.format(intPrice));

			}//endif
			
		}//endif

		//Done with the system.
		system.disconnectAllServices();
	}//main
	
}//call PgmFromJava
