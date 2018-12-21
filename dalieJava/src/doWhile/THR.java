/*
 * Created on 27.04.2009
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package doWhile;

/**
 * @author dv0101
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class THR {

    public static void main(String args[]) {
        double t = 0.5, h = 3, r = 9;
        t = 2;
        do {
            h = 1;
            do {
                r = 1;
                do {
                    if ((t + h + r == 100) && (0.5 * t + 3 * h + 9 * r == 100)) {
                        System.out.println(t + "  " + h + "  " + r);
                    }//end if
                    r = r + 1;
                } while (r < 11);
                h = h + 1;
            } while (h < 33);
            t = r + 2;
        } while (t < 98);
    }//main
    
}//class THR
