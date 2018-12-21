package jdom;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import org.jdom.Attribute;
import org.jdom.CDATA;
import org.jdom.Comment;
import org.jdom.Content;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.Text;

public class JDOMNavigation implements JDOMConstants
{
	/**
	 * Navigiert über ein gegebenes Dokument
	 * und gibt Informationen darüber aus.
	 */
	public static void navigate(Document doc, PrintWriter out) throws IOException
	{
		navigateContent(doc.getRootElement(), out, "");
		out.flush();
	}
	
	private static void navigateContent(Content content, PrintWriter out, String indent)
	{
		// Knoten ist ein Element
		if(content instanceof Element)
		{
			// Ausgabepuffer anlegen und Typecast durchführen
			StringBuffer output = new StringBuffer();
			Element element = (Element)content;
			
			// Name, Präfix und Namensraum abfragen
			String localName = element.getName();
			String prefix = element.getNamespacePrefix();
			String namespaceURI = element.getNamespaceURI();
			
			// Element-Information vorbereiten und dann ausgeben
			output.append(indent).append("- Element: ");
			if(prefix != null && prefix.length() > 0)
				output.append(prefix).append(':');
			output.append(localName);
			if(namespaceURI != null && namespaceURI.length() > 0)
				output.append(" (NS: ").append(namespaceURI).append(')');
			output.append(":");

			out.println(output);

			// Einrückung für nächste Ebene erzeugen
			String nextIndent = indent + INDENT;
			
			// Getrennt über Kind-Attribute, -Namensraumdeklarationen
			// und sonstige -Inhalte navigieren (rekursiv)
			for(Iterator it = element.getAttributes().iterator(); it.hasNext();)
			{
				Attribute attribute = (Attribute)it.next();
				processAttribute(attribute, out, nextIndent);
			}

			Namespace nsElement = element.getNamespace();
			if(nsElement != null)
				processNamespace(nsElement, out, nextIndent);
			
			for(Iterator it = element.getAdditionalNamespaces().iterator(); it.hasNext();)
			{
				Namespace namespace = (Namespace)it.next();
				processNamespace(namespace, out, nextIndent);
			}
			
			for(Iterator it = element.getContent().iterator(); it.hasNext();)
			{
				Content currentNode = (Content)it.next();
				navigateContent(currentNode, out, nextIndent);
			}
		}
		// Knoten ist ein CDATA-Abschnitt
		else if(content instanceof CDATA)
		{
			// Ausgabepuffer anlegen und Typecast durchführen
			StringBuffer output = new StringBuffer();
			CDATA cdata = (CDATA)content;
			
			// Textinhalt abfragen und ausgeben
			String textContent = cdata.getText();
			output
				.append(indent)
				.append("- CDATA-Abschnitt: ")
				.append(textContent);

			out.println(output);
		}
		// Knoten ist ein Text-Knoten
		else if(content instanceof Text)
		{
			// Ausgabepuffer anlegen und Typecast durchführen
			StringBuffer output = new StringBuffer();
			Text text = (Text)content;
			
			// Textinhalt abfragen und ausgeben
			String textContent = text.getText();
			output
				.append(indent)
				.append("- Text: ")
				.append(textContent);

			out.println(output);
		}
		// Knoten ist ein Kommentar
		else if(content instanceof Comment)
		{
			// Ausgabepuffer anlegen und Typecast durchführen
			StringBuffer output = new StringBuffer();
			Comment comment = (Comment)content;
			
			// Textinhalt abfragen und ausgeben
			String textContent = comment.getText();
			output
				.append(indent)
				.append("- Kommentar: ")
				.append(textContent);

			out.println(output);
		}
			// Knoten ist ein Attribut
			// Knoten ist eine Namensraum-Deklaration
	}
	
	private static void processAttribute(Attribute attribute, PrintWriter out, String indent)
	{
		// Ausgabepuffer anlegen
		StringBuffer output = new StringBuffer();
		
		// Name, Präfix, Namensraum und Wert abfragen
		String localName = attribute.getName();
		String prefix = attribute.getNamespacePrefix();
		String namespaceURI = attribute.getNamespaceURI();
		String value = attribute.getValue();
		
		// Attribut-Information vorbereiten und dann ausgeben
		output.append(indent).append("- Attribut: ");
		if(prefix != null && prefix.length() > 0)
			output.append(prefix).append(':');
		output.append(localName);
		if(namespaceURI != null && namespaceURI.length() > 0)
			output.append(" (NS: ").append(namespaceURI).append(')');
		output.append(": ").append(value);
		
		out.println(output);
	}
	
	private static void processNamespace(Namespace namespace, PrintWriter out, String indent)
	{
		// Ausgabepuffer anlegen
		StringBuffer output = new StringBuffer();
		
		// Präfix und Namensraum abfragen
		String prefix = namespace.getPrefix();
		String namespaceURI = namespace.getURI();
		
		if(prefix.length() == 0 && namespaceURI.length() == 0)
			return;
		
		// Deklarations-Information vorbereiten und dann ausgeben
		output
			.append(indent)
			.append("- Namensraum-Deklaration: ")
			.append(prefix)
			.append(" - > ")
			.append(namespaceURI);

		out.println(output);
	}
}
