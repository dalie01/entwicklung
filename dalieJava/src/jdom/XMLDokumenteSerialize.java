/*
 * Created on 07.04.2009
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package jdom;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.jdom.Document;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

/**
 * @author dv0101
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class XMLDokumenteSerialize {

    public static void serialize(Document doc, PrintWriter out) throws IOException
	{
		// Formatierung-Objekt für die Ausgabe anlegen (Pretty-Print)
		Format format = Format.getPrettyFormat();
		
		// Serializer anlegen
		XMLOutputter serializer = new XMLOutputter(format);
		
		// Dokument ausgeben
		serializer.output(doc, out);
		out.flush();
	}
	public static void serialize(Document doc, FileWriter out) throws IOException
	{
		// Formatierung-Objekt für die Ausgabe anlegen (Pretty-Print)
		Format format = Format.getPrettyFormat();
		
		// Serializer anlegen
		XMLOutputter serializer = new XMLOutputter(format);
		
		// Dokument ausgeben
		serializer.output(doc, out);
		out.flush();
	}
    
}//class XMLDokumenteSerialize
