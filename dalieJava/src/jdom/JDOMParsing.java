package jdom;

import java.io.File;
import java.io.IOException;

import org.jdom.Document;
import org.jdom.JDOMException;
import org.jdom.JDOMFactory;
import org.jdom.input.SAXBuilder;

public class JDOMParsing implements JDOMConstants
{
	/**
	 * Parst eine Datei und erzeugt ein Dokument daraus.
	 */
	public static Document parse(JDOMFactory f) throws JDOMException, IOException
	{
		// Parser erzeugen und Factory setzen
		SAXBuilder parser = new SAXBuilder();
		parser.setFactory(f);
		
		// Parsen und Ergebnis zurück geben
		return parser.build(new File(DOCUMENT));
	}
}
