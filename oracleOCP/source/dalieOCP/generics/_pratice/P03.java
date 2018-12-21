package dalieOCP.generics._pratice;

import java.util.ArrayList;
import java.util.List;

final class P03 {

	@SuppressWarnings({"rawtypes", "unchecked" })
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		
		List l2 = l1;//is allowed for backward compatibility "raw types" warning
		l2.add("Hello");//also warning
		
		List<Double> l3 = l2;
		l3.add(10.0);
		
		System.out.println(l3);
	}
}
