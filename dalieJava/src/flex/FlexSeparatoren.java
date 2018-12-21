package flex;

/**
 * @author dv0101 am 15.03.2008 um 12:34:24
 * <BR>
 * FlexSeparatoren.java
 * <BR> 
 * <B>FlexSeparatroen </B> Eine Textdatei enthält Zeichen
 * mit Codewerten > x001F und ist zeilenorientiert. Die Zeilen entsprechen
 * Datenrecords unterschiedlicher Länge und werden durch einen
 * <B>Recordseparator (RS) </B> getrennt. Hier ist das virtuelle „new line“
 * Zeichen (nl) nach dem POSIX-Standard gefordert (entweder als Doppelzeichen cr =
 * x000D und lf = x000A z.B. in Windows Umgebungen, oder nur lf = x000A in UNIX
 * oder MAC Umgebungen). Die Datenfelder eines Datensatzes müssen in einer Zeile
 * stehen und müssen durch einen <B>Feldseparator (FS) </B> getrennt werden. Als
 * Standard- Feldseparator wird das Semikolon (x003B) vereinbart. Als
 * <B>Feldbegrenzer (FB) </B> wird das Hochkomma/Hochkomma zur Kennzeichnung
 * alfanummerischer Werte festgelegt.
 *  
 */

public class FlexSeparatoren {

    /**
     * RS = Recordseparator retrun System.getProperty("line.separator");
     */
    public final String RS = System.getProperty("line.separator");

    /**
     * RSPcDatei = Recordseparator für PC Datei return "\r\n"
     */
    public final String RSPcDatei = "\r\n";

    /**
     * FS = Feldseparator z.B "FLEX";100;"DV0101" return Semikolon
     */
    public final String FS = ";"; //Semikolon

    /**
     * FB = Feldbegrenzer z.B "FLEX";100;"DV0101" return "
     */
    public String FB = "\"";//wird als " interpretiert

    public FlexSeparatoren(){
    }//FlexSeparatoren
    
    public FlexSeparatoren(String mediando){
        if(mediando.equalsIgnoreCase("mediando"));
            this.FB = "$";
    }//FlexSeparatoren
    
    
}//class FlexSeprarator

