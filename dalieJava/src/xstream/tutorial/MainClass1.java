package xstream.tutorial;

import com.thoughtworks.xstream.XStream;

public class MainClass1 {

	public static void main(String[] args) {
		
		Blog teamBlog = new Blog(new Author("Dalie"));
		teamBlog.add(new Entry("first","My first Entry"));
		teamBlog.add(new Entry("second","My next Entry"));
		
		XStream xstream = new XStream();
		System.out.println(System.getProperty("user.dir"));
		System.out.println(xstream.toXML(teamBlog));
	}//main
}//class MainClass1
