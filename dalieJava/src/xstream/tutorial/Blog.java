package xstream.tutorial;

import java.util.ArrayList;
import java.util.List;

public class Blog {

	private Author writer;
	private List<Entry> entries = new ArrayList<Entry>();
	
	public Blog(Author writer){
		this.writer = writer;
	}//Blog
	
	public void add(Entry entry){
		entries.add(entry);
	}//add
	
	public List<Entry> getContent(){
		return entries;
	}//getContent
	
}//class Blog
