/*
 * Created on 07.04.2009
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package jdom;

import org.jdom.Element;
import org.jdom.JDOMFactory;

/**
 * @author dv0101
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class XMLDokumenteCreate implements XMLDokumenteConstants {
    
    public static org.jdom.Document createDokumenteElemente(JDOMFactory f) {
        
        //Wurzelelement generieren und ein Dokument daraus erzeugen
		Element elementsOfDokuments = createDokumente(f);
		return f.document(elementsOfDokuments);
    }//createDokumentElemente
    
    private static org.jdom.Element createDokumente(JDOMFactory f){
        
        Element dokumente = f.element("dokumente");
        
        Element elementDokument;
        elementDokument = createElementDokument(f);
        dokumente.addContent(elementDokument);
        
        //dokumente.addContent(dokumente);
        
        return dokumente;
    }//createDokument
    
    private static org.jdom.Element createElementDokument(JDOMFactory f) {
        
        Element dokument = f.element(DOKUMENT_ELEMENT);
        Element elementsOfDokument = createElementsOfDokument(f);
        dokument.addContent(elementsOfDokument);
        
        return dokument;
    }//createElementDokument
    
    private static org.jdom.Element createElementsOfDokument(JDOMFactory f) {
        
        Element elementOfDokument = f.element(DOKUMENT_KUNDENID_ELEMENT);
        elementOfDokument.addContent("1");
        
        Element standortId = f.element(DOKUMENT_STANDORTID_ELEMENT);
        standortId.addContent("1");
        
        elementOfDokument.addContent(standortId);
        
        return elementOfDokument;
    }//createElementDokument

}//class XMLDokumenteCreate
