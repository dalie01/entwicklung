package jdom;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Iterator;
import java.util.Locale;

import org.jdom.CDATA;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;

public class JDOMManipulation implements JDOMConstants
{
	/**
	 * Führt die folgenden Manipulationen am
	 * übergebenen Dokument durch:
	 * <ul>
	 *   <li>Tauscht Name und Vorname aus</li>
	 *   <li>Rechnet den Preis in DM um, falls möglich</li>
	 *   <li>Entfernt die Elemente &lt;f:foreign&gt;</li>
	 * </ul>
	 */
	public static void manipulate(Document doc)
	{
		Element elemBuecher = doc.getRootElement();
		
		// Über alle <buch>-Elemente von <buecher> iterieren
		for(Iterator iterBuch = elemBuecher.getChildren(BUCH_ELEMENT).iterator(); iterBuch.hasNext();)
		{
			Element elemBuch = (Element)iterBuch.next();
			
			// Über alle <autor>-Elemente von <buch> iterieren
			for(Iterator iterAutor = elemBuch.getChildren(AUTOR_ELEMENT).iterator(); iterAutor.hasNext();)
			{
				Element elemAutor = (Element)iterAutor.next();
				
				// Die Namensteile austauschen
				exchangeNames(elemAutor);
			}
			
			// Den Preis in DM umrechnen
			priceToDM(elemBuch.getChild(PREIS_ELEMENT));
			
			// Das <f:foreign>-Element entfernen
			Namespace nsForeign = Namespace.getNamespace(FOREIGN_PREFIX, FOREIGN_NAMESPACE);
			elemBuch.getChild(FOREIGN_ELEMENT, nsForeign).detach();
		}
	}
	
	private static void exchangeNames(Element elemAutor)
	{
		// Das <nachname>-Element finden
		Element elemNachname = elemAutor.getChild(NACHNAME_ELEMENT);
		
		// Das Element lösen und hinten neu hinzufügen
		elemAutor.addContent(elemNachname.detach());
	}
	
	private static void priceToDM(Element elemPreis)
	{
		// Deutsche Zahlenformattierung vorbereiten
		NumberFormat nf = NumberFormat.getNumberInstance(Locale.GERMANY);
		nf.setMaximumFractionDigits(2);

		// CDATA-Abschnitt aus <preis> abfragen
		CDATA cdatPreis = (CDATA)elemPreis.getContent().get(0);
		
		try
		{
			// Preis parsen und umrechnen
			Number numPreis = nf.parse(cdatPreis.getText());
			double dblPreis = numPreis.doubleValue();
			dblPreis *= 1.95583;
			
			// Preis neu in den CDATA-Abschnitt einsetzen
			cdatPreis.setText(nf.format(dblPreis));
		}
		catch(ParseException ex)
		{
			// Bei Formatierungsfehlern nichts unternehmen
		}
	}
}
