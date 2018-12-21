package jdom;

import org.jdom.Attribute;
import org.jdom.CDATA;
import org.jdom.Comment;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMFactory;
import org.jdom.Namespace;

public class JDOMCreation implements JDOMConstants
{
	/**
	 * Erzeugt ein neues Dokument.
	 */
	public static Document createBuecherDocument(JDOMFactory f)
	{
		// Wurzelelement generieren und ein Dokument daraus erzeugen
		Element elemBuecher = createBuecher(f);
		Document result = f.document(elemBuecher);
		
		return result;
	}
	
	private  static Element createBuecher(JDOMFactory f)
	{
		// Autoren für die Bücher anlegen
		String[] autorNiedermeier = new String[] {"Niedermeier", "Stephan"};
		String[] autorScholz = new String[] {"Scholz", "Michael"};
		String[] autorSkulschus = new String[] {"Skulschus", "Marco"};
		String[] autorWiederstein = new String[] {"Wiederstein", "Uwe"};
		
		// Element <buecher> anlegen
		Element elemBuecher = f.element(BUECHER_ELEMENT);
		
		// Attribut für Schema-Location anlegen und zuweisen
		Namespace nsSchemaLocation = Namespace.getNamespace(SCHEMA_INSTANCE_PREFIX, SCHEMA_INSTANCE_URI);
		Attribute attrSchemaLocation = f.attribute(SCHEMA_LOCATION, SCHEMA, nsSchemaLocation);
		elemBuecher.setAttribute(attrSchemaLocation);
		
		// Die vier Bücher anlegen und hinzufügen
		Element elemBuch;
		
		elemBuch = createBuch(f, "Java und XML", "2005", "Galileo Computing", "(unbekannt)", new String[][]{autorNiedermeier, autorScholz});
		elemBuecher.addContent(elemBuch);
		
		elemBuch = createBuch(f, "Cocoon 2 und Tomcat", "2004", "Galileo Computing", "59,90", new String[][]{autorNiedermeier});
		elemBuecher.addContent(elemBuch);
		
		elemBuch = createBuch(f, "XML Schema", "2004", "Galileo Computing", "39,90", new String[][]{autorSkulschus, autorWiederstein});
		elemBuecher.addContent(elemBuch);
		
		return elemBuecher;
	}
	
	private static Element createBuch(JDOMFactory f, String titel, String jahr, String verlag, String preis, String[][] autoren)
	{
		// Element <buch> anlegen
		Element elemBuch = f.element(BUCH_ELEMENT);
		
		// Attribut jahr hinzufügen
		Attribute attrJahr = f.attribute(JAHR_ATTRIBUT, jahr);
		elemBuch.setAttribute(attrJahr);
		
		// Einen Kommentar einfügen
		Comment commToll = f.comment(KOMMENTAR);
		elemBuch.addContent(commToll);
		
		// Ein Element mit Präfix und Namenraum einfügen
		Namespace nsForeign = Namespace.getNamespace(FOREIGN_PREFIX, FOREIGN_NAMESPACE);
		Element elemForeign = f.element(FOREIGN_ELEMENT, nsForeign);
		elemBuch.addContent(elemForeign);
		
		// Element <titel> einfügen
		Element elemTitel = f.element(TITEL_ELEMENT);
		elemTitel.addContent(titel);
		elemBuch.addContent(elemTitel);
		
		// Elemente <autor> einfügen
		for(int i = 0; i < autoren.length; ++i)
		{
			Element elemAutor = createAutor(f, autoren[i]);
			elemBuch.addContent(elemAutor);
		}
		
		// Element <verlag> einfügen
		Element elemVerlag = f.element(VERLAG_ELEMENT);
		elemVerlag.addContent(verlag);
		elemBuch.addContent(elemVerlag);
		
		// Element <preis> mit CDATA-Abschnitt einfügen
		Element elemPreis = f.element(PREIS_ELEMENT);
		CDATA cdataPreis = f.cdata(preis);
		elemPreis.addContent(cdataPreis);
		elemBuch.addContent(elemPreis);
		
		return elemBuch;
	}
	
	private static Element createAutor(JDOMFactory f, String[] autor)
	{
		// Element <autor> anlegen
		Element elemAutor = f.element(AUTOR_ELEMENT);
		
		// Element <nachname> anlegen und hinzufügen
		Element elemNachname = f.element(NACHNAME_ELEMENT);
		elemNachname.addContent(autor[0]);
		elemAutor.addContent(elemNachname);
		
		// Element <vorname> anlegen und hinzufügen
		Element elemVorname = f.element(VORNAME_ELEMENT);
		elemVorname.addContent(autor[1]);
		elemAutor.addContent(elemVorname);
		
		return elemAutor;
	}
}
