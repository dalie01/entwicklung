package listing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

/**
 * @author dv0101 am 04.07.2008 um 20:32:53
 *
 * Listen.java
 * 
 */

public class Listen {

//  die mittlerste methode 
	public static String[] vtest1(String el[], int retsize) {
	//Verwendet Vector
	   Vector v = new Vector(el.length + 10);
	   for (int i = 0; i < el.length; ++i) {
	     v.addElement(el[i]);
	   }//for
	   
	   String[] ret = new String[retsize];
	   for (int i = 0; i < retsize; ++i) {
	     ret[i] = (String)v.elementAt(i);
	   }//for
	   
	   return ret;
	   
	 }//vtest1
 
 	// die langsamste	
	 public static String[] vtest2(String el[], int retsize){
 	  //Verwendet LinkedList
	   LinkedList l = new LinkedList();
	   for (int i = 0; i < el.length; ++i) {
	     l.add(el[i]);
	   }//for
	   
	   String[] ret = new String[retsize];
	   Iterator it = l.iterator();
	   
	   for (int i = 0; i < retsize; ++i) {
	     ret[i] = (String)it.next();
	   }//for
	   return ret;
	}//vtest2


	// die perfomanteste(schnellste)	 
	 public static String[] vtest3(String el[], int retsize){
	   //Verwendet ArrayList
	   ArrayList l = new ArrayList(el.length + 10);
	   
	   for (int i = 0; i < el.length; ++i) {
	     l.add(el[i]);
	   }//for
	   
	   String[] ret = new String[retsize];
	   
	   for (int i = 0; i < retsize; ++i) {
	     ret[i] = (String)l.get(i);
	   }//for
	   return ret;
	 }//vtest3
    
}//class Listen

