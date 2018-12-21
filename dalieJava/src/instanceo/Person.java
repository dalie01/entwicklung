/*
 * Person.java 
 * @author DV0101 on 30.04.2010 um 16:54:11 
 * 
 * no Copyright
 */
package instanceo;

/**
 * <b>Class</b>Person:<br>Only for Demonstration.<br>
 * 
 * @version 1.00 on 30.04.2010 um 16:54:11
 * @author dv0101
 * <br><br>
 * The instanceof keyword can be used to test, <BR>
 * if an object is of a specified type.
 */
public class Person {
	
	private int ssn;
	private String name;
	
	public Person(String name, int ssn) {
		this.name= name;
		this.ssn= ssn;
	}//Person
	
	/** equals: Objekt = this.person */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person)
			return name.equals(((Person)obj).getName()) &&
			       ssn == ((Person)obj).getSSN();
		return false;
	}//equals
	
	/** toString: Objekt to String */
	@Override
	public String toString() {
		String t= name + "  SSN: " + ssn;
		return t;
	}//toString
	
	public String getName() {
		return name;
	}//getName
	public int getSSN() {
		return ssn;
	}//getSSN
}//class Person
