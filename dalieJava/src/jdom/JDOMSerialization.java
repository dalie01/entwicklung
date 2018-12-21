package jdom;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.jdom.Document;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class JDOMSerialization
{
	/**
	 * Serialisiert das �bergebene Dokument auf den
	 * �bergebenen PrintWriter.
	 */
	public static void serialize(Document doc, PrintWriter out) throws IOException
	{
		// Formatierung-Objekt f�r die Ausgabe anlegen (Pretty-Print)
		Format format = Format.getPrettyFormat();
		
		// Serializer anlegen
		XMLOutputter serializer = new XMLOutputter(format);
		
		// Dokument ausgeben
		serializer.output(doc, out);
		out.flush();
	}
	public static void serialize(Document doc, FileWriter out) throws IOException
	{
		// Formatierung-Objekt f�r die Ausgabe anlegen (Pretty-Print)
		Format format = Format.getPrettyFormat();
		
		// Serializer anlegen
		XMLOutputter serializer = new XMLOutputter(format);
		
		// Dokument ausgeben
		serializer.output(doc, out);
		out.flush();
	}
}
