/*
 * Division.java 
 * @author Administrator on 07.03.2009 um 09:03:46 
 */
package division;
/**
 * <b>Class</b>Division:<br>Only for Demonstration<br>
 * 
 * @version 1.00 on 07.03.2009 um 09:03:46
 * @author dv0101
 */
public class Division {
	/* used of demonstraion for division */
	
	/**
     * divide(dividiere) without null
     * @param zaehler 
     * @param nenner
     */
    public int toDivide(int zaehler, int nenner)throws Exception{
    	try{
    		return zaehler/nenner;
    	}catch(Exception ex){
    		throw new Exception ("the result is not correct " + ex.toString());
    	}//try
    }//dividiere
    
    public static void main(String[] args){
    	Division d = new Division();
        try {
			System.out.println("4 : 2 = "+d.toDivide(8,2));
			System.out.println("4 : 0 = "+d.toDivide(3,0));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}//try
    }//main
    
}//class Division
