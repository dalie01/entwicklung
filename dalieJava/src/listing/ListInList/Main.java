package listing.ListInList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	/* List allow duplicate entries but Set does not allow. */
	public static void main(String[] args) {

		List<Object> column = null;
		List<List<Object>> rows = Collections
				.synchronizedList(new ArrayList<List<Object>>());

		column = new ArrayList<Object>();
		column.add("1");
		column.add("java");

		rows.add(column);

		column = new ArrayList<Object>();
		column.add("2");
		column.add("xml");
		rows.add(column);

		for (List<Object> list : rows) {
			Product product = new Product(list);
			System.out.println(product.toString());
		}//for

	}//main

}//class Main
