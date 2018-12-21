package dalieOCP.collection.size;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Execute {

	public static void main(String[] args) {
		String[] items = {"ONE","TWO","THREE","FOUR"};
		List<String> s = Collections.unmodifiableList(Arrays.asList(items));
		
		System.out.println(items.length);//4
		System.out.println("INXS".length());//4
		System.out.println(s.size());//4 count of Elements
		System.out.println(s.get(0));//One index begins at 0
		System.out.println(s.get(2));//Three
		System.out.println(s.get(items.length-1));//Four
		System.out.println(s.get(0).length());//3
		
		for(int i = 0 ; i < items.length ; i++ )
			System.out.println(s.get(i));//ONE,TWO,THREE,FOUR
		
		for(int i = s.size()-1; i >= 0 ; i-- )
			System.out.println(s.get(i));//FOUR,THREE,TWO;ONE
		
		
	}
}
