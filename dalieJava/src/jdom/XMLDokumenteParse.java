/*
 * Created on 07.04.2009
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package jdom;

import java.io.File;
import java.io.IOException;

import org.jdom.Document;
import org.jdom.JDOMException;
import org.jdom.JDOMFactory;
import org.jdom.input.SAXBuilder;

/**
 * @author dv0101
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class XMLDokumenteParse {

    public static Document parse(JDOMFactory f, String pfadDatei) throws JDOMException, IOException {
		// Parser erzeugen und Factory setzen
		SAXBuilder parser = new SAXBuilder();
		parser.setFactory(f);
		
		// Parsen und Ergebnis zurück geben 
		return parser.build(new File(pfadDatei));
	}//parse
    
}//class XMLDokumenteParse
