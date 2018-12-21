package dalieOCP.collection.set.treeSet._practice;

import java.util.Set;
import java.util.TreeSet;

class Person {
	
	private static int count = 0;
	private String id = "0", interest;
	
	public Person(String interest) {
		this.interest = interest;
		this.id = "" + ++count;
	}
	
	public String toString() {
		return id;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}
	
}

final class P02 {

	String name = "MATH";
//	Set<Person> set = new HashSet<Person>();
//	Set<Person> set = new LinkedHashSet<Person>();
	Set<Person> set = new TreeSet<Person>();
	public void add(Person p) {
		if(name.equals(p.getInterest()))set.add(p);
	}
	
	
	public static void main(String[] args) {
		P02 p02 = new P02();
		p02.add(new Person("MATH"));//dalieOCP.collection.set.treeSet._practice.Person cannot be cast to java.lang.Comparable
		System.out.println("A");
		p02.add(new Person("MATH"));
		System.out.println("B");
		System.out.println(p02.set);
		
	}
}
