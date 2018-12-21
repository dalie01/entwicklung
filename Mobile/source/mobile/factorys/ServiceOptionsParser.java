package mobile.factorys;

import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.Node;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.dom.DOMSource;

import mobile.capi.mapping.ServiceOption;
import mobile.capi.mapping.ServiceOptionConflict;
import mobile.internal.mapping.ServiceOptionConflictImpl;
import mobile.internal.mapping.ServiceOptionImpl;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class ServiceOptionsParser {

	/** contains all parsed Product elements */
	private static  Collection<ServiceOption> serviceOptions;
	
	/**
	 * Determine content of file.
	 * 
	 * @param inputStream FileInputStream for xmlDatei	  
	 * @throws IOException 
	 * @throws ParserConfigurationException 
	 * @throws SAXException 
	 * @throws SOAPException 
	 * @throws ParseException 
	 * */
	public static void parseServiceOptions(final InputStream inputStream) 
			throws IOException, ParserConfigurationException, SAXException, SOAPException, ParseException {
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);
		DocumentBuilder builder = dbf.newDocumentBuilder();
		Document document = builder.parse(inputStream);
		DOMSource domSource = new DOMSource(document);

		SOAPMessage message = MessageFactory.newInstance().createMessage();
		SOAPPart soapPart = message.getSOAPPart();
		soapPart.setContent(domSource);
		message.saveChanges();

		SOAPBody body = message.getSOAPBody();
		parse(body);
	}
	
	public static void parse(SOAPBody body) throws ParseException{
		
		NodeList allServiceOptions = body.getElementsByTagName("ns5:serviceOption");
		serviceOptions = new ArrayList<ServiceOption>();
		
		for (Element serviceOption : elements(allServiceOptions)) {

			List<Element> response = elements(serviceOption.getChildNodes());
			

			serviceOptions.add(getServiceOptions(response));
		}
		
	}
	
	private static ServiceOption getServiceOptions(List<Element> response) 
			throws ParseException {
		
		ServiceOption sOption = new ServiceOptionImpl();
		
		for (Element element : response) {
		
			if (element.getTagName().equalsIgnoreCase("ns5:productId")) {

				sOption.setProductId(element.getTextContent().replaceAll("[^A-Za-z0-9]", ""));
			}
			if (element.getTagName().endsWith("ns5:installed")) {
				sOption.setInstalled(Boolean.parseBoolean(element.getTextContent()));
			}
			if (element.getTagName().endsWith("ns5:status")) {
				sOption.setStatus(element.getTextContent());
			}
			if (element.getTagName().endsWith("ns5:modifiable")) {
				sOption.setModifiable(Boolean.parseBoolean(element.getTextContent()));
			}
			if (element.getTagName().endsWith("ns5:activationDate")) {
				sOption.setActivationDate(element.getTextContent());
			}
			if (element.getTagName().endsWith("ns5:activationDate")) {
				sOption.setActivationDateDate(extractDate(element));
			}
			if (element.getTagName().endsWith("ns5:earliestDeactivationDate")) {
				sOption.setEarliestDeactivationDate(element.getTextContent());
			}			
			if (element.getTagName().endsWith("ns5:earliestDeactivationDate")) {
				sOption.setEarliestDeactivationDateDate(extractDate(element));
			}
			if (element.getTagName().endsWith("ns5:dependsOn")) {
				sOption.setDependsOn(element.getTextContent());
			}
			if (element.getTagName().endsWith("ns5:conflictsWith")) {
				sOption.setServiceOptionConflicts(extractServiceOptionsConflicts(element));
			}
			
		}

		return sOption;
	}
	
	/**
	 * Determine ServiceOptionConflicts.
	 * @param element response
	 * @return ServiceOptionConflicts
	 */
	private static List<ServiceOptionConflict> extractServiceOptionsConflicts (Element element) {
		
		List<ServiceOptionConflict> servOptionConflicts = new ArrayList<ServiceOptionConflict>(); 
		ServiceOptionConflict servOptionConflict = new ServiceOptionConflictImpl();
		servOptionConflict.setProductId(element.getTagName());
		servOptionConflicts.add(servOptionConflict);
		return servOptionConflicts;
	}

	/**
	 * Determine Date from response.
	 * @param datum element response
	 * @return date Object
	 * @throws ParseException
	 */
	private static Date extractDate(Element datum) throws ParseException {
		String tmpDate = datum.getTextContent();
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date convertedDate = (Date) formatter.parse(tmpDate);
		return convertedDate;
	}
	
	/**
	 * Determine List of Elements from Result.
	 * 
	 * @param nodes List of all Nodes
	 * @return List<Element>
	 */
	private static List<Element> elements(NodeList nodes) {

		List<Element> result = new ArrayList<Element>(nodes.getLength());

		for (int i = 0; i < nodes.getLength(); i++) {
			Node node = (Node) nodes.item(i);

			if (node instanceof Element) {
				result.add((Element) node);
			}

		}

		return result;
	}

	/**
	 * Contained all ServiceOptions as Result.
	 * @return serviceOptions parsed from XML
	 */
	public static Collection<ServiceOption> getServiceOptions() {
		return serviceOptions;
	}
	
	
}
