package dalieOCP.object.relationship.association.aggregation;

import java.util.List;

class Organization {
	private List<Person> employees;

	
	public List<Person> getEmployees() {
		return employees;
	}

}

class Person {
	private String name;

	
	public String getName() {
		return name;
	}

}

class Execute {
	/*
	 * Aggregation : Since Organization has Person as employees, 
	 * relationship between them is Aggregation. 
	 * 
	 * While in case of Aggregation, including object can exists 
	 * without being part of main object.
	 * 
	 * In case of aggregation, one object is just a USER or another object.
	 * */
}
