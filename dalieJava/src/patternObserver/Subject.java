/*
 * Created of DV0101 on 30.04.2010 15:35:21
 *
 * Filename	  Subject.java
 */
package patternObserver;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * abstract class Subject.
 *
 * @version 	1.00 30.04.2010 um 15:35:21
 * @author 		DV0101
 */
public abstract class Subject {
    
	private  ArrayList observers = new ArrayList();
    
	/** attach: anhängen */
    public void attach(Observer s) {
        observers.add(s);
    }//attach
    
    /** detach: lösen  */
    public void detach(Observer s) {
        observers.remove(s);
    }//detach
    
    /** notifyObserver: benachrichtigen */
    public void notifyObserver() {
        Iterator itObservers = observers.iterator();
        while ( itObservers.hasNext() ) {
            Observer ob = (Observer)itObservers.next();
            ob.update();
        }//while
    }//notifyObserver
    
}//class Subject
