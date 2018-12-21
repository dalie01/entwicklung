package jdom;

import java.io.File;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.stream.StreamSource;

import org.jdom.Document;
import org.jdom.JDOMFactory;
import org.jdom.transform.JDOMResult;
import org.jdom.transform.JDOMSource;

public class JDOMTransformation implements JDOMConstants
{
	/**
	 * Transformiert das gegebene Dokument und gibt
	 * das Ergebnis zurück.
	 */
	public static Document transform(Document docuInput, JDOMFactory f) throws TransformerFactoryConfigurationError, TransformerException
	{
		// Natives Source-Objekt anlegen
		JDOMSource source = new JDOMSource(docuInput);
		
		// Natives Result-Objekt unter Verwendung der gegebenen
		// DocumentFactory anlegen
		JDOMResult result = new JDOMResult();
		result.setFactory(f);
		
		
		// Transformer anlegen
		Transformer transformer = TransformerFactory.newInstance().newTransformer(new StreamSource(new File(XSLT)));
		
		// Transformation durchführen
		transformer.transform(source, result);
		
		// Ergebnisdokument zurückgeben
		return result.getDocument();
	}
}
