package dmc.pip;

import java.io.FileInputStream;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.Name;
import javax.xml.soap.Node;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.soap.Text;
import javax.xml.transform.dom.DOMSource;

import org.w3c.dom.Document;

public class TestServiceOptionResponse {
		
	public static void main(String[] args) {
		
			/*
			FileReader testFile = new FileReader(new File(System.getProperty("basedir",".")+"/test-resources" + File.separator + "soap-part.xml"));
	        StAXOMBuilder stAXOMBuilder =
	                OMXMLBuilderFactory.createStAXOMBuilder(
	                        OMAbstractFactory.getSOAP11Factory(),
	                        XMLInputFactory.newInstance().createXMLStreamReader(
	                                testFile));
	        */
		FileInputStream fis;
		try {
			fis = new FileInputStream(System.getProperty("user.dir") + "\\dmc\\pipelet\\xml\\data\\servicemanagement\\serviceoption\\ServiceOptionResponse.xml");
	        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	        dbf.setNamespaceAware(true);
	        DocumentBuilder builder = dbf.newDocumentBuilder();
	        Document document = builder.parse(fis);
	        DOMSource domSource = new DOMSource(document);

	        SOAPMessage message = MessageFactory.newInstance().createMessage();

	        // Get the SOAP part and set its content to domSource
	        SOAPPart soapPart = message.getSOAPPart();
	        soapPart.setContent(domSource);
	        message.saveChanges();

	        SOAPHeader header = message.getSOAPHeader();
	        if (header != null) {
	            Iterator iter1 = header.getChildElements();
	            getContents(iter1, "");
	        }

	        SOAPBody body = message.getSOAPBody();
	        Iterator iter2 = body.getChildElements();
	        getContents(iter2, "");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());;
		}
	    }

	    public static void getContents(Iterator iterator, String indent) {
	        while (iterator.hasNext()) {
	            Node node = (Node)iterator.next();
	            SOAPElement element = null;
	            Text text = null;

	            if (node instanceof SOAPElement) {
	                element = (SOAPElement)node;

	                Name name = element.getElementName();

	                Iterator attrs = element.getAllAttributes();

	                while (attrs.hasNext()) {
	                    Name attrName = (Name)attrs.next();
	                    System.out.println(attrName);
	                }

	                Iterator iter2 = element.getChildElements();
	                getContents(iter2, indent + " ");
	            } else {
	                text = (Text)node;
	                String content = text.getValue();
	                System.out.println(content);
	            }
	        }
			
			
			
			
		
	}

}
