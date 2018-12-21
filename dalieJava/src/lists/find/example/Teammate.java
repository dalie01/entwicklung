package lists.find.example;

public class Teammate {

	private String name;
	private String lastName;
	private boolean authorized;
	
	Teammate(){
		
	} /*Teammate*/
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isAuthorized() {
		return authorized;
	}
	public void setAuthorized(boolean authorized) {
		this.authorized = authorized;
	}
	
} /*class Teammate*/
