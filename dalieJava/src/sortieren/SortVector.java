package sortieren;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.Vector;

public class SortVector {
	
	/**
     * @param args
     */
    public static void main(String[] args) {
        new SortVector().doIt();
    }//main
 
    @SuppressWarnings("unchecked")
	private void doIt() {
        Vector v = new Vector();
        Random r = new Random();
 
        for (int i = 0; i < 10; i++) {
            v.add(new CTimer(new Date(r.nextInt(10000000)), new Date(r.nextInt(10000000) + 10000001)));
        }//for
 
        for (Iterator iter = v.iterator(); iter.hasNext();) {
            CTimer timer = (CTimer) iter.next();
            System.out.println(timer);
        }
 
        Collections.sort(v, new Comparator() 
        	{@Override
			public int compare(Object o1, Object o2) {
                CTimer c1 = (CTimer) o1;
                CTimer c2 = (CTimer) o2;
                return c1.startTime.compareTo(c2.startTime);
            }
        }
        );
        System.out.println("After Sorting: ");
 
        for (Iterator iter = v.iterator(); iter.hasNext();) {
            CTimer timer = (CTimer) iter.next();
            System.out.println(timer);
        }
 
    }
 
class CTimer {
	Date startTime, endTime;
  
    public CTimer(Date startTime, Date endTime) {
    	this.startTime = startTime;
    	this.endTime = endTime;
    }//CTimer
 
    @Override
	public String toString() {
    	return super.toString() + "Start: " + startTime + " | End: " + endTime;
    }//toString
    
}//class CTimer

}//class SortVector
