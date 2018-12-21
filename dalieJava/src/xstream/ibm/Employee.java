package xstream.ibm;

public class Employee {

	private String 
	/**name: Name of the Employee*/
	name,
	/**designation: Designation from Employee */
	designation,
	/**department: Department to work Employee*/
	department;

	/**@return name */
	public String getName() {
		return name;
	}//getName
	/** String to set Name */
	public void setName(String name) {
		this.name = name;
	}//setName
	/** @return designation */
	public String getDesignation() {
		return designation;
	}//getDesignation
	/** String to set designation */
	public void setDesignation(String designation) {
		this.designation = designation;
	}//setDesignation
	/** @return department */
	public String getDepartment() {
		return department;
	}//getDepartment
	/** String to set department */
	public void setDepartment(String department) {
		this.department = department;
	}//setDepartment
	
}//class Employee
