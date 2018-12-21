package xstream.ibm;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import com.thoughtworks.xstream.XStream;

public class XmlWriter {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setName("dalie");
		e.setDesignation("Developer");
		e.setDepartment("IT");
		
		
		XStream xstream = new XStream();

		try {
			FileOutputStream fos = new FileOutputStream (System.getProperty("user.dir") + "\\xstream\\ibm\\XmlWriter.xml");
      		PrintWriter writer = new PrintWriter (new OutputStreamWriter (fos, "ISO-8859-1"), true);
      		writer.println("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>");
      		xstream.alias("employee", Employee.class);
			xstream.toXML(e, writer);
		} catch (Exception e2) {
			System.out.println("writer :"+e2.getMessage());
		}//try
		
	}//main
	
}//class XmlWriter
