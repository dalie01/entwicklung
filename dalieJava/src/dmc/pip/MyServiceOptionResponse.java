package dmc.pip;

import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.Node;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.dom.DOMSource;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import dmc.capi.servicemanagement.ServiceOption;
import dmc.capi.servicemanagement.ServiceOptionConflict;
import dmc.internal.mapping.servicemanagement.ServiceOptionConflictImpl;
import dmc.internal.mapping.servicemanagement.ServiceOptionImpl;

/**
 * @author dalieuwe
 * 
 */
public class MyServiceOptionResponse {

	/**
	 * Demo for PIP-Simulator.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(
					System.getProperty("user.dir")
							+ "\\dmc\\pipelet\\xml\\data\\servicemanagement\\serviceoption\\ServiceOptionResponse.xml");
			
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

			SOAPBody body = message.getSOAPBody();

			Collection<ServiceOption> myServiceOptions = new ArrayList<ServiceOption>();
			NodeList allServiceOptions = body.getElementsByTagName("ns5:serviceOption");
			
			for (Element serviceOption : elements(allServiceOptions)) {

				List<Element> response = elements(serviceOption.getChildNodes());

				myServiceOptions.add(getServiceOptions(response));
			}

			for (ServiceOption serviceOption : myServiceOptions) {
				System.out.println(serviceOption.toString());
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

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


	private static ServiceOption getServiceOptions(List<Element> response) throws ParseException {

		// Set<ServiceOption> sServiceOption = new HashSet<ServiceOption>();
		ServiceOption sOption = new ServiceOptionImpl();
		for (Element element : response) {
			// System.out.println(element.getTagName() + ";" +
			// element.getTextContent());

			if (element.getTagName().equalsIgnoreCase("ns5:productId")) {

				sOption.setProductId(element.getTextContent());
			}
			if (element.getTagName().endsWith("ns5:installed")) {
				sOption.setInstalled(true);
			}
			if (element.getTagName().endsWith("ns5:status")) {
				sOption.setStatus(element.getTextContent());
			}
			if (element.getTagName().endsWith("ns5:modifiable")) {
				sOption.setModifiable(true);
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
			// sServiceOption.add(sOption);
		}
		// System.out.println(sOption.toString());

		return sOption;
	}

	/**
	 * Determine ServiceOptionConflicts.
	 * @param element response
	 * @return ServiceOptionConflicts
	 */
	private static List<ServiceOptionConflict> extractServiceOptionsConflicts(
			Element element) {
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

}
