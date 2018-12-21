package dv0101; 

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;

import flex.Database;
import flex.FlexSeparatoren;
import flexDateien.FlexEprodelp;

/**
 * @author UDA
 * @version 1.0
 * @since 26.02.2008
 * @return mit diesem Programm werden alle Artikel <br>
 *         die in der Bibl FLEXDX Datei:EPRODELP <br>
 *         in eine OUTPUT-Datei geschrieben. <br>
 *         Die OUTPUT-Datei wurde nach Vorgaben der Firma Epro <br>
 *         defeniert, und dient als Schnittstelle zur mediando Datenbank. <br>
 *  
 */

public class EproArtikel {
    
    
    Database con = new Database("as400","FLEX","FLEXDT","INET01","flexen");
    FlexSeparatoren mediando = new FlexSeparatoren("mediando");
    DataOutputStream out;
    
    /**
     * @param EproArtikel erwartet ein java.io.DataOutputStream <br>
     * static final String pfadDatei = "/home/Transfer/Epro/mediando/_HDProdukt.txt";
     * new DataOutputStream(newBufferedOutputStream(new FileOutputStream("pfadDatei")));<br> 
     **/
    EproArtikel(DataOutputStream out){
        this.out = out;    
    }//Adressen
    
    
    public void outputFile() {
        try {
            FlexEprodelp artikel = new FlexEprodelp();
            con.getConnection();
            Vector alleprodel = artikel.read(con);//alle Artikel
            Vector columnNames = artikel.getColumnNames();//alle feldNamen
            con.close();
            for (int i = 0; i < columnNames.size(); i++) {
                out.writeBytes(mediando.FB +columnNames.elementAt(i).toString().trim()
                        + mediando.FB + getCRLF(i,columnNames.size()));
            }//for

            try {
                for(int i = 0; i < alleprodel.size();i++){
                    FlexEprodelp eprodelf = (FlexEprodelp) alleprodel.elementAt(i);
                    out.writeBytes(mediando.FB+eprodelf.getProtnr().toString().trim()//produktNr
                            + mediando.FB + mediando.FS);
                    out.writeBytes(mediando.FB + eprodelf.getProcod().toString().trim()//produktCode
                            + mediando.FB + mediando.FS);
                    out.writeBytes(mediando.FB + eprodelf.getProtyp().toString().trim()//produktTyp
                            + mediando.FB + mediando.FS);
                    out.writeBytes(mediando.FB + eprodelf.getPronam().toString().trim()//produktName
                            + mediando.FB + mediando.FS);
                    out.writeBytes(mediando.FB + eprodelf.getProean().toString().trim()//eanCode
                            + mediando.FB + mediando.FS);
                    out.writeBytes(mediando.FB + eprodelf.getProkds().toString().trim()//kurzBezeichung
                            + mediando.FB + mediando.FS);
                    out.writeBytes(mediando.FB + eprodelf.getProlds().toString().trim()//langBezeichung
                            + mediando.FB + mediando.FS);
                    out.writeBytes(mediando.FB + eprodelf.getProlif().toString().trim()//lieferNummer
                            + mediando.FB + mediando.FS);
                    out.writeBytes(eprodelf.getPrommg()//lieferMenge
                            + mediando.FS);
                    out.writeBytes(eprodelf.getProsta()//mengenStaffel
                            + mediando.FS);
                    out.writeBytes(eprodelf.getProbeh()//bestellEinheit
                            + mediando.FS);
                    out.writeBytes(eprodelf.getProvep()//verpackMenge
                            + mediando.FS);
                    out.writeBytes(eprodelf.getPropeh()//preisMenge
                            + mediando.FS);
                    out.writeBytes(mediando.FB + eprodelf.getProieh().toString().trim()//inhaltEinheit
                            + mediando.FB + mediando.FS);
                    out.writeBytes(eprodelf.getProlze()//lieferZeit
                            + mediando.FS);
                    out.writeBytes(eprodelf.getProwfl()//workflow
                            + mediando.FS);
                    out.writeBytes(mediando.FB + eprodelf.getProlik().toString().trim()//proBild
                            + mediando.FB + mediando.FS);
                    out.writeBytes(eprodelf.getProopr()//preisOMwst
                            + mediando.FS);
                    out.writeBytes(eprodelf.getPrompr()//preisMWwst
                            + mediando.FS);
                    out.writeBytes(mediando.FB + eprodelf.getProvva().toString().trim()//variationVater
                            + mediando.FB + mediando.FS);
                    out.writeBytes(mediando.FB + eprodelf.getProkre().toString().trim()//kapitelRefcode
                            + mediando.FB + mediando.FS);
                    out.writeBytes(mediando.FB + eprodelf.getProzol().toString().trim()//taxNummer
                            + mediando.FB + mediando.FS);
                    out.writeBytes(mediando.FB + eprodelf.getPronex().toString().trim()//nexMartArtikel
                            + mediando.FB + mediando.FS);
                    out.writeBytes(mediando.FB + eprodelf.getProonl().toString().trim()//onlineStatus
                            + mediando.FB + mediando.FS);
                    out.writeBytes(mediando.FB + eprodelf.getProost().toString().trim()//orderStatus
                            + mediando.FB + mediando.FS);
                    out.writeBytes(mediando.FB + eprodelf.getProkey().toString().trim()//produktKey
                            + mediando.FB + mediando.FS);
                    out.writeBytes(mediando.FB + eprodelf.getProode().toString().trim()//internerCode
                            + mediando.FB + mediando.FS);
                    out.writeBytes(eprodelf.getProseq()//interneSeq.Nr
                            + mediando.FS);
                    out.writeBytes(mediando.RSPcDatei);// + Line.Separator
                    }//for
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }//try

        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try {
            out.flush();//Datei ausgeben
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }//outputFile
    
    
    /**
     * @param i interner Z‰hler
     * @param x anzahl Feldgruppenelemente
     * @return Kennzeichen Satzende oder gibt Feldseperator ";" aus
     * ist i gleich (x-1) anzahl Feldgruppenelemente -> dann ist Satzende erreicht und es wird das Satzschluﬂkennzeichen ausgeben
     */
    String getCRLF(int i, int x){
        if(i == (x - 1))
            return mediando.RSPcDatei;
        else
            return mediando.FS;
    }//getCRLF
    
}//class EproArtikel
