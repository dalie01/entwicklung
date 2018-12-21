package xstream.ibm;

import java.io.FileInputStream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class XmlReader {

	public static void main(String[] args) {
		
		XStream xreader = new XStream(new DomDriver());
		
		try {
			
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\xstream\\ibm\\XmlWriter.xml");
	        xreader.alias("employee", Employee.class);
	        Employee x = (Employee)xreader.fromXML(fis);
	        System.out.println(x.getName() + x.getDesignation() + x.getDepartment());
	
		} catch (Exception e2) {
			System.out.println("reader "+e2.getMessage());
		}
		
	}//main
	
	
}//class XmlReader
