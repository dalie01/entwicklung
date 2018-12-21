/*
 * Created on 01.03.2007
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package flex; 

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author dv0101
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class FlexDatum {

    Calendar cal = Calendar.getInstance(); 
   
    /**
     * @return das Laufzeit-Datum Format TT.MM.JJJJ HH:MM:SS
     */
    public String getTT_MM_JJJJ_HHMMSS(){
        DateFormat formater = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss"); 
        return formater.format(cal.getTime());
    }//getjjmmyy
    
    
}//clas FlexDatum
