package arrayList;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		
		List<String> lS = new ArrayList<>();
		lS.add(0,"Hello");
		lS.add(1,"World");
		lS.remove(1);
		lS.add(0,"INXS");
		lS.add(2, "new World");
		System.out.println( lS.get(lS.size()-1) + lS.indexOf("INXS") + lS.toString() + lS.subList(1, 1).toString());
		String s = " Hello ".trim();
		System.out.println(s.substring(5));
		String s1 = s.concat("w");
		
		
		System.out.println(false == false);/* true */
		System.out.println(false != false);/* false */
		System.out.println(false == true); /* false */
		System.out.println(false != true); /* true */
		
		System.out.println(true == false); /* false */
		System.out.println(true != false); /* true */
		System.out.println(true == true);  /* true */
		System.out.println(true != true);  /* false */
	
		System.out.println(true & false);
		System.out.println(true & true);
		System.out.println(true | false);
		System.out.println(true | true);
		
		System.out.println(false & false);
		System.out.println(false & true);
		System.out.println(false | false);
		System.out.println(false | true);
	}
}
