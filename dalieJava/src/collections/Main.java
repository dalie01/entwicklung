package collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

/**
 * demo of use a interface of java.util.collection
 * and a demo of extensible loop
 * */
public class Main {

	public static void main(String[] args) {
		
		/**collection: interface of java.util.Collection */
		Collection<String> collection = null;
		
		Vector<String> vector = new Vector<String>();
		vector.add("one");
		vector.add("two");
		vector.add("three");
		
		collection = vector;

		/* extend for */
		for(String arg : collection){
			System.out.println(arg);
		}//for

		/* Compiler creates */
		for(Iterator<String> arg = collection.iterator(); arg.hasNext();){
			System.out.println(arg.next());
		}//for
		
		/* or just for next composition */
		Iterator<String> i = collection.iterator();
		while(i.hasNext()){
			String arg = i.next();
			System.out.println(arg);
			
		}//while
		
	}//main
	
}//main
