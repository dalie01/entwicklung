package hashset;

import java.util.HashSet;


/**
 * Check if a particular element exists in Java HashSet Example<br>
 * This Java Example shows how to check whether an elements is contained in Java<br>
 * HashSet using contains method.<br>
 * <a href="http://www.java-examples.com/collections">nachlesen</a><br>
 * <br>
 * @version 	1.00 28.09.2010 on 07:30:27
 * @author 		DV0101
 * <br><br>
 * */
public class CheckElementHashSetExample {
	
	public static void main(String[] args) {
		
		//create object of HashSet
		HashSet<Integer> hSet = new HashSet<Integer>();
		 
	
		//add elements to HashSet object
		hSet.add(new Integer("1"));
		hSet.add(new Integer("2"));
		hSet.add(new Integer("3"));
		
		/* To check whether a particular value exists in HashSet use
		 * boolean contains(Object value) method of HashSet class.
		 * It returns true if the HashSet contains the value, otherwise false.
		 * */
		boolean blnExists = hSet.contains(new Integer("3"));
		System.out.println("3 exists in HashSet ? : " + blnExists);
		
	}//main
	
}//CheckElementHashSetExample
