package dalieOCP.collection.map._practice;

import java.util.HashMap;
import java.util.Map;

class Book {
	
	String title, isbn;

	public boolean equals(Object o){
		return (o instanceof Book && ((Book)o).isbn.equals(this.isbn));
	}
}


class BookStore {
	
	Map<Book, Integer> map = new HashMap<Book, Integer>();
	
	int getNumberOfCopies(Book b) {
//		Integer getNumberOfCopies(Book b) {
		return map.get(b);
	}
	
	void addBook(Book b, int nOfCopies) {
		map.put(b, nOfCopies);
	}
}

final class P01 {

	static BookStore bs = new BookStore();
	
	public static void main(String[] args) {
		Book b = new Book();
		b.isbn = "111";
		bs.addBook(b, 10);
		/*
		 * a Book object is stored in BookStore. 
		 * The same Book object is being used to retrieve the number of copies value. 
		 * Since the object that was stored in the Map and the object that was used 
		 * to retrieve the value from the map are the same object, 
		 * their hash codes will be the same 
		 * and hence map will be able to find it among its name-value pairs. 
		 * Thus, this will print 10.
		 * */
		System.out.println(bs.getNumberOfCopies(b));
		
		
		b = new Book();
		b.isbn = "111";
		/*
		 * Note that its hash code will be different from the previously created book object. 
		 * But as per equals() method of Book, they are equal because their isbn are same. 
		 * When you try to use the new Book object to find the value, map will not find anything 
		 * because of a different hash code. 
		 * So map.get() will return null.
		 * */
		System.out.println(bs.getNumberOfCopies(b));
		
		/*
		 * The return type of the method is an int (and not an Integer). 
		 * But map.get always returns an object (not a primitive.) 
		 * So auto-unboxing will try to convert null into an int, which will throw a NullPointerException.
		 * */
		
	}
}
