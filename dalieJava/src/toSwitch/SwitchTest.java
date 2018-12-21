/*
 * Created on 10.10.2009
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package toSwitch;

/**
 * @author DV0101
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class SwitchTest {
	
	public static void main(String[] argv){
	      final int TRUE = 1231;
	      final int FALSE = 1237;
	      final int schulnote = 1;

	      Boolean bedingung = new Boolean( 50000 > 69000);

	      switch ( bedingung.hashCode() )
	      {
	         case TRUE:
	            System.out.println("true");
	            break;
	         case FALSE:
	            System.out.println("false");
	            break;
	       } //end-switch
	      
	      
	      switch (schulnote)
		  {
		     case 1:
		        System.out.println("sehr gut");
		        break;
		     case 2:
		        System.out.println("gut");
		        break;
		     case 3:
		        System.out.println("befriedigkend");
		        break;
		     case 4:
		        System.out.println("ausreichend");
		        break;
		     case 5:
		        System.out.println("mangelhaft");
		        break;
		     case 6:
		        System.out.println("ungenügend");
		        break;
		     default:
		        System.out.println("ungültiger Wert");
		  } //end-switch

	      
	   } //end main()

}//class SwitchTest
