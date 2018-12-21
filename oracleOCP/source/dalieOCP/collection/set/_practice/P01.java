package dalieOCP.collection.set._practice;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

final class P01 {

	public static void main(String[] args) {
		Set<String> sH = new HashSet<>();//no guarantee of order 
		sH.add("01a");
		sH.add("02b");
		sH.add("03c");
		sH.add("01a");
		sH.add("04d");
		sH.add("05e");
		for(String s: sH) {
			System.out.println("sH_" + s);
		}
		
		
		Set<String> sT = new TreeSet<>();
		sT.add("A");
		sT.add("C");
		sT.add("B");
		sT.add("A");
		for(String s: sT) {
			System.out.println("sT_" +s);
		}
		
		SortedSet<String> ssT = new TreeSet<>();
		ssT.add("04");
		ssT.add("01");
		ssT.add("02");
		ssT.add("03");
		ssT.add("01");
		ssT.add("04");
		for(String s: ssT) {
			System.out.println("ssT_" + s);
		}
	}
}
