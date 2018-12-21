package dalieOCP.generics.wildcard._practice;

import java.util.ArrayList;
import java.util.List;

final class P01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); 
		list.add("A"); 
		List<? extends String> list2 = new ArrayList<>(); 
//		List<? super String> list3 = new ArrayList<>(); 
		list.addAll(list2);
//		list.addAll(list3);
	}
}
