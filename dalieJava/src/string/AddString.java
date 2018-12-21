/*
 * Created on 19.01.2010
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package string;

/**
 * @author DV0101
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class AddString {

	public static void main(String args[]){
		String userId = "DV0501";
		String newUserId = userId.substring(0,4) + getUserCounter(userId);
		System.out.println(newUserId);
	}//main
	
	public static String getUserCounter(String count){
		int counter = (Integer.parseInt(count.substring(4,count.length())) + 1);
			if (counter < 10){
				return "0" + (new Integer(counter)).toString();
			}else {
				return (new Integer(counter)).toString();
			}//endif
	}//getUserCounter
	
}//class AddString
