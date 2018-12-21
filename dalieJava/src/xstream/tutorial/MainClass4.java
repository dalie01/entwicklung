package xstream.tutorial;

import com.thoughtworks.xstream.XStream;

public class MainClass4 {

	public static void main(String[] args) {
		
		Blog teamBlog = new Blog(new Author("Dalie"));
		teamBlog.add(new Entry("first","My first Entry"));
		teamBlog.add(new Entry("second","My next Entry"));
		
		XStream xstream = new XStream();
		xstream.alias("blog", Blog.class);
		xstream.alias("entry", Entry.class);
		xstream.aliasField("author",Blog.class,"writer");
		xstream.addImplicitCollection(Blog.class,"entries");
		
		xstream.useAttributeFor(Blog.class,"writer");
		xstream.registerConverter(new AuthorConverter());
		
		System.out.println(xstream.toXML(teamBlog));
		
	}//main
	
}//class MainClass4
