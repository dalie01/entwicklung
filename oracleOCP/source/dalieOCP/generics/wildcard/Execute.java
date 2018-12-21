package dalieOCP.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

class Gift {}

class Book extends Gift{}
class Phone extends Gift{}

class Execute {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
//		List<Gift> whishList = new ArrayList<Book>();won't compile Book extends Gift 
//		List<Object> whishList = new ArrayList<String>();
		List<Gift> wList = new ArrayList<>();
		List<Gift> wList1 = new ArrayList<Gift>();
		
		List<?> objectList = new ArrayList<>();//<?> declaring only List of Objects
//		whishList.add(new Book()); // won't compile

		List<Gift> whishList = new ArrayList<>();
		whishList.add(new Book());
		whishList.add(new Phone());
		
		printOverView(whishList);
		
	}
	
	public static void printOverView(List<?> l) {// here will be passed only List of Type Objects
		for(Object item: l) {
			if(item instanceof Book)
				System.out.println("Book " + item);
			if(item instanceof Phone)
				System.out.println("Phone " + item);
		}
	}
}
