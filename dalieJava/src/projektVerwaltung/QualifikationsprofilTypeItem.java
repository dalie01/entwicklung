/*
 * Created of DV0101 on 12.09.2009 19:26:31
 *
 * Filename	  QualifikationsprofilTypeItem.java
 */
package projektVerwaltung;

/**
 * Class description goes here.
 *
 * @version 	1.00 12.09.2009 um 19:26:31
 * @author 		DV0101
 * <br><br>
 * private   = "false" nur sichtbar innerhalb der Klasse<br>
 * ohne      = 	       sichtbar innerhalb Package<br>
 * protected = "false" sichtbar innerhalb Package und abgeleiteten Klassen<br>
 * public    = "false" sichtbar ausserhalb<br>
 */
public class QualifikationsprofilTypeItem implements java.io.Serializable {

    private String qualifikation;
    private String leistungsstufe;
    
    /** QualifikationsprofilTypeItem */
    public QualifikationsprofilTypeItem() {
       
    }//QualifikationsprofilTypeItem

    
    /** @return Returns the leistungsstufe. */
    public String getLeistungsstufe() {
        return leistungsstufe;
    }
    /** @param leistungsstufe The leistungsstufe to set. */
    public void setLeistungsstufe(String leistungsstufe) {
        this.leistungsstufe = leistungsstufe;
    }
    /** @return Returns the qualifikation. */
    public String getQualifikation() {
        return qualifikation;
    }
    /** @param qualifikation The qualifikation to set. */
    public void setQualifikation(String qualifikation) {
        this.qualifikation = qualifikation;
    }
}//class QualifikationsprofilTypeItem
