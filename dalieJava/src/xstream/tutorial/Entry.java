package xstream.tutorial;

public class Entry {

	private String 
	/**title: The Title of Entry */
	title,
	/**description: Description of Entry */
	description;
	
	public Entry(String title, String description){
		this.title = title;
		this.description = description;
	}//Entry
	/**@return Title of Entry */
	public String getTitle(){
		return title;
	}//getTitle
	
	/**@return The description of Entry */
	public String getDescription(){
		return description;
	}//getDescription
	
}//class Entry
