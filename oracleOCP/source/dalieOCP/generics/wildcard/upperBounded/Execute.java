package dalieOCP.generics.wildcard.upperBounded;

import java.util.ArrayList;
import java.util.List;

abstract class Gift {
	
	abstract void print();
	
}

class Book extends Gift{
	
	void print() {
		System.out.println("Book");
	}
	
}
class Phone extends Gift{

	void print() {
		System.out.println("Phone");
	}
	
}


class Execute {

	public static void main(String[] args) {
//		List<? extends Gift> bookList = new ArrayList<>();
//		bookList.add(new Book());//won't compile
		
		/*
		 * You can’t write any values to the collection.
		 * You can’t add any object to a List defined as List<? extends Gift> 
		 * because such a list can refer to a list of either Gift, Book, or Phone. 
		 * Adding a mismatched object can pollute the list, which isn’t allowed.
		 * 
		 * */
		
		List<Book> booklist = new ArrayList<Book>();
		booklist.add(new Book());
		printOverView(booklist);
	}
	

	public static void printOverView(List<? extends Gift> l) { 
		/* This List<? extends Gift> is an upper-bounded wildcard. 
		 * You can iterate and read values from a collection declared with upper-bounded wildcard. 
		 * */
		for(Gift gift : l){
			gift.print();
		}
	}
}
