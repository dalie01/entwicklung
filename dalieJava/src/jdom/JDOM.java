package jdom;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.jdom.DefaultJDOMFactory;
import org.jdom.Document;
import org.jdom.JDOMException;
import org.jdom.JDOMFactory;

public class JDOM
{
    static final String pfaddatei = "C:\\Dokumente und Einstellungen\\Administrator\\IBM\\rationalsdp6.0\\workspace\\dalieJava\\data\\hello.xml";
	/**
	 * Demonstriert die verschiedenen Funktionen von JDOM
	 */
	public static void main(String[] args) throws IOException, JDOMException, TransformerFactoryConfigurationError, TransformerException
	{
		// PrintWriter für die Ausgabe und DocumentFactory vorbereiten
		PrintWriter output = new PrintWriter(System.out);
		
		JDOMFactory factory = new DefaultJDOMFactory();
		
		// Dokument parsen und serialisieren
		Document doc = JDOMParsing.parse(factory);
		JDOMSerialization.serialize(doc, output);
		
		JDOMSerialization.serialize(doc, new FileWriter(pfaddatei));
        
		
		//separate(output);
		
		// Neues Dokument im Speicher anlegen und serialisieren
		doc = JDOMCreation.createBuecherDocument(factory);
		JDOMSerialization.serialize(doc, new FileWriter(pfaddatei));
		//separate(output);
		
		//Über Dokument navigieren und Infos ausgeben
		//JDOMNavigation.navigate(doc, output);
		//separate(output);
		
		// Dokment manipulieren und neu serialisieren
		//JDOMManipulation.manipulate(doc);
		//JDOMSerialization.serialize(doc, new FileWriter(pfaddatei));
		//separate(output);
		
		// Dokument transformieren und Ergebnis serialisieren
		//Document docTransformed = JDOMTransformation.transform(doc, factory);
		//JDOMSerialization.serialize(docTransformed, new FileWriter(pfaddatei));
	}
	
	private static void separate(PrintWriter out)
	{
		out.println();
		out.println("==============================================");
		out.println();
	}
}
