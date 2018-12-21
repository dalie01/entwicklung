package dalieOCP.generics._pratice;

import java.util.ArrayList;
import java.util.List;

final class P02 {
	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		
		print(l);

//		print(new ArrayList<>());//only in Java 8
		print(l);
		print1(new ArrayList<>());
		
	}
	
	public static void print(List<Integer> l) {
		System.out.println(l.size());
	}
	
	public static void print1(List<?> l) {//only a List of Objects
		System.out.println(l.size());
	}
}
