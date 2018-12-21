package dalieOCP.collection.array.exercise;

import java.util.Arrays;

class A {
//class A implements Comparable<A> {
	
	int i;
	
	A(Integer i){
		this.i = i;
	}
	
	public int compareTo(A a){
		return this.i - a.i; 
	}
}

class Exercise {

	public static void main(String[] args) {
		A[] aS = new A[] {new A(1), new A(2)};
		Arrays.sort(aS);//compile fine throw Runtime Exception ClassCastException A cannot be cast to java.lang.Comparable
		
		for(A a : aS)
			System.out.println(a.i);
	}
}
