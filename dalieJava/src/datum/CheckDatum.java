/*
 * Created of DV0101 on 12.02.2010 16:16:14
 *
 * Filename	  Immobilie.java
 */
package datum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Class to demo for Datums-Check.
 *
 * @version 	1.00 12.02.2010 um 16:16:14
 * @author 		DV0101
 * 
 */
public class CheckDatum {
	
	public static void main (String args[]){
	String datum = "29.Februar.2010";
    SimpleDateFormat df = new SimpleDateFormat("dd.MMMM.yyy");

    /* Weiﬂt den Parser an auf existierende Datumswerte zu achten, 
    ohne die Zeile wird aus 32.01.2003, 01.02.2003 */
    df.setLenient(false);

    try {
      Date date = df.parse(datum);
    } catch (ParseException e) {   
      System.out.println(e.getMessage());
    }
	}//main
}//class CheckDatum
