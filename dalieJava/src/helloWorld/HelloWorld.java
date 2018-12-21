package helloWorld;

import java.util.ArrayList;
import java.util.List;


public class HelloWorld {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		StringBuffer result = new StringBuffer();
		for (String string : list) {
			result.append(string);
		}
		System.out.println(result.toString());			
	}//main
	
}//class HelloWorld
