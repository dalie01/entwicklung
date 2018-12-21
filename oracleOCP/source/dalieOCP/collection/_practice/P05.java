package dalieOCP.collection._practice;

import java.util.ArrayList;
import java.util.List;

final class P05 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(30);
		l.add(20);
		l.add(1,10);
		l.add(null);
		System.out.println(l.size() + ":" + l);//4:[30,10,20,null]
		List<Integer> l1 = new ArrayList<>();
		l1.addAll(l);
//		l1.add(5,9);//IndexOutOfBoundsException
		l1.add(4,9);
		System.out.println(l1.size() + ":" + l1);//5:[30,10,20,null,9]
		
		List<Integer> l3 = l1.subList(1, 4);
		System.out.println(l3.size() + ":" + l3);//3:[10,20,null]
		
		l3.clear();
		System.out.println(l3.size() + ":" + l3);//0:[];
	}
}
