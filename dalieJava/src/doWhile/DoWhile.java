/*
 * Created on 29.04.2009
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package doWhile;

/**
 * @author DV0101
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class DoWhile {
    /* demonstration of doWhile  */
    
    public static void main(String[] args) {
		int i = 0;
		
		while (i <= 100) {
			System.out.println(i + "\n");
			i ++;
			if (i > 5)
			break;
		}// while
		for(i=1;i<=100;i++){
			System.out.println(i);
			if (i == 50)
			break;
		}//for
	}//main 
}//class DoWhile
