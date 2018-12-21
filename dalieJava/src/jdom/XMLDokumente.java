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
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.jdom.DefaultJDOMFactory;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMFactory;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

/**
 * @author dv0101
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class XMLDokumente implements XMLDokumenteConstants {

   

        JDOMFactory factory;

        XMLDokumente(DefaultJDOMFactory factory) {
            this.factory = factory;
        }

        public org.jdom.Document getAllElementsOfDokument() {
            //Wurzelelement generieren und ein Dokument daraus erzeugen
            return factory.document(createAllElementsOfDokumente());
        }//createDokumentElemente

        protected org.jdom.Element createAllElementsOfDokumente() {

            Element dokumente = factory.element("dokumente");
            dokumente.addContent(createsAllElementsOfDokument());
            return dokumente;
        }//createALLElementsOfDokumente

        protected org.jdom.Element createsAllElementsOfDokument() {

            Element dokument = factory.element(DOKUMENT_ELEMENT);

            Element kundenId = factory.element(DOKUMENT_KUNDENID_ELEMENT);
            kundenId.addContent("1");
            dokument.addContent(kundenId);

            Element standortId = factory.element(DOKUMENT_STANDORTID_ELEMENT);
            standortId.addContent("1");
            dokument.addContent(standortId);

            return dokument;
        }//createsAllElementsOfDokument

        public org.jdom.Element createsAllElementsOfAdress (Vector adresse, Vector columnNames){
            Element root = new Element("dokument");
            List allElemente = new ArrayList();
            for(int i = 0; i < adresse.size(); i++) {
                Element element = new Element(columnNames.elementAt(i).toString());
                element.setText(adresse.elementAt(i).toString());
                allElemente.add(element);
            }//for
            Element adress = new Element("adress");
            adress.setContent(allElemente);
            root.addContent(adress);
            return root;
        }//createsAllElementsOfAdress
        
        public void serialize(Document doc, FileWriter out) throws IOException {
            // Formatierung-Objekt für die Ausgabe anlegen (Pretty-Print)
            Format format = Format.getPrettyFormat();
            format.setEncoding("ISO-8859-1");
            // Serializer anlegen
            XMLOutputter serializer = new XMLOutputter(format);
            // Dokument ausgeben
            serializer.output(doc, out);
            out.flush();
            out.close();
        }//serialize
        public static void serialize(Document doc, PrintWriter out) throws IOException {
    		Format format = Format.getPrettyFormat();
    		format.setEncoding("ISO-8859-1");
    		XMLOutputter serializer = new XMLOutputter(format);
    		serializer.output(doc, out);
    		out.flush();
    		out.close();
    	}//serialize
}//class XMLDokumente
