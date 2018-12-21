package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IterableString implements Iterable<Character> ,Iterator<Character>{

	private String str;
	private int count;
	
	IterableString(String s) {
		str = s;
	} //IterableString
	
	@Override
	public boolean hasNext() { 
	    if(count < str.length()) return true; 
	    return false; 
	  }//hasNext
	 
	  @Override
	public Character next() { 
	    if(count == str.length())  
	      throw new NoSuchElementException(); 
	 
	    count++; 
	    return str.charAt(count-1); 
	  }//next 
	 
	  @Override
	public void remove() { 
	    throw new UnsupportedOperationException(); 
	  }//remove
	 
	  @Override
	public Iterator<Character> iterator() { 
	    return this; 
	  }//Iterator
	
	public static void main(final String[] args) {
		
		IterableString x = new IterableString("Hello World"); 
		 
	    for (char ch : x) {
	      System.out.print(ch); 
	    }
	}//main
	
}//class Main
