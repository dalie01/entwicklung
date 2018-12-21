package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Demo for use retainAll (Collection c)
 * */
public class GetIntersection {
	/* Intersection: Schnittmenge/Überscheidung */
	
	public static void main(String[] args) {
		/* Behält nur die Elemente in dieser Sammlung, 
		 * die in der angegebenen Auflistung (optional Betrieb) enthalten sind. */
		 
		String orig[] = { "1st", "2nd", "3rd", "4th", "5th", "1st", "2nd", "3rd", "4th", "5th" };
		String act[] = { "2nd", "3rd", "6th" };
		
		List<String> origList = new ArrayList<String>(Arrays.asList(orig));
		List<String> actList = Arrays.asList(act);

		/*
		 * Retains only the elements in this collection 
		 * that are contained in the specified collection (optional operation).  
		 * */
		System.out.println(origList.retainAll(actList));
		System.out.println(origList);
		
	}
	
}//class GetIntersection
