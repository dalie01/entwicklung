package dalieOCP.generics.wildcard.lowerBounded;

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
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<? super Gift> wList = new ArrayList<Object>();
		List<? super Gift> wList1 = new ArrayList<Gift>();
//		List<? super Gift> wList2 = new ArrayList<Book>();
		
		List<? super Gift> wishList = new ArrayList<>();//<? super means all Object of Gift and all there Sub Classes.
//		wishList.add(new Object()); won't compile higher Class Level 
//		wishList.add(new Gift()); not possible but only why Gift abstract
		wishList.add(new Book());
		wishList.add(new Phone());
		
		printOverView(wishList);
	}
	
	public static void printOverView(List<? super Gift> l) {//Lower only passed Objects
		for(Object item: l) {
			
			((Gift) item).print();
		}
	}
}
