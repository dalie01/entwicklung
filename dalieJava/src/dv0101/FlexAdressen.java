package dv0101;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;

import flex.Database;
import flex.FlexDatum;
import flex.FlexSeparatoren;
import flexDateien.FlexCusmasb;

/**
 * @author DV0101 <U>Dalies, Uwe </U>
 * @version 1.0: <B>Hallo </B>
 * @param erwartet
 *            ein java.io.DataOutputStream new
 *            DataOutputStream(newBufferedOutputStream(new
 *            FileOutputStream("C:\excampel.txt")));
 */
public class FlexAdressen {

    final static String CRLF = System.getProperty("line.separator");

    final String[] header = { "HDR", "AEB Compliance Screening", "1.0",
            new FlexDatum().getTT_MM_JJJJ_HHMMSS(), "FLEX" };

    Database con = new Database("as400", "FLEX", "FLEXDX", "INET01", "flexen");
    FlexSeparatoren aeb = new FlexSeparatoren();
    DataOutputStream out;

    /**
     * Adressen erwartet ein java.io.DataOutputStream
     * new DataOutputStream(newBufferedOutputStream(new FileOutputStream("C:\excampel.txt"))); 
     **/
    public FlexAdressen(DataOutputStream out) {
        this.out = out;
    }//Adressen

    public void outputFile() {
        for (int i = 0; i < header.length; i++) {
            try {
                out.writeBytes(header[i].toString()
                                + getCRLF(i, header.length));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }//try
        }//for

        try {
            con.getConnection();
            Vector allcusmasb = new FlexCusmasb().read(con);
            con.close();
            for (int i = 0; i < allcusmasb.size(); i++) {
                FlexCusmasb cusmasf = (FlexCusmasb) allcusmasb.elementAt(i);
                try {
                    System.out.println(cusmasf.getCusno());
                    out.writeBytes("ADR" + aeb.FS);//DTA Set ID 1
                    out.writeBytes(cusmasf.getCusno().trim() + ";");//Reference ID 2
                    out.writeBytes("CustomerNumber" + ";");//Reference Comment 3
                    out.writeBytes(aeb.FS);//AddressType 4
                    out.writeBytes(cusmasf.getCusnm().trim() + ";");//Name 5
                    out.writeBytes(cusmasf.getCusa2().trim() + ";");//Strasse 6
                    out.writeBytes(cusmasf.getZipcd().trim() + ";");//PLZ 7
                    out.writeBytes(cusmasf.getCusa4().trim() + ";");//Ort 8
                    out.writeBytes(aeb.FS);//District 9
                    out.writeBytes(getvaildgetLancd(cusmasf.getLancd()).trim()
                            + aeb.FS);//ISO Code Country 10
                    out.writeBytes(aeb.FS);//Phone No 11
                    out.writeBytes(aeb.FS);//Post box 12
                    out.writeBytes(aeb.FS);//Postcode Postbox 13
                    out.writeBytes(aeb.FS);//City Postbox 14
                    out.writeBytes(aeb.FS);//eMail 15
                    out.writeBytes(aeb.FS);//Fax 16
                    out.writeBytes(cusmasf.getCusnm().trim() + ";");//Name 1 17
                    out.writeBytes(aeb.FS);//Name 2 18
                    out.writeBytes(aeb.FS);//Name 3 19 
                    out.writeBytes(aeb.FS);//Titel 20
                    out.writeBytes(aeb.FS);//Surname 21 
                    out.writeBytes(aeb.FS);//Prenames 22
                    out.writeBytes(aeb.FS);//Date of Birth 23
                    out.writeBytes(aeb.FS);//Passport Data 24
                    out.writeBytes(aeb.FS);//City of Birth 25
                    out.writeBytes(aeb.FS);//Country of Birth ISO 26
                    out.writeBytes(aeb.FS);//Nationality ISO 27
                    out.writeBytes(aeb.FS);//Position 28
                    out.writeBytes(aeb.FS);//ni Number 29
                    out.writeBytes(aeb.FS);//Info 30
                    out.writeBytes(aeb.FS);//Free 1 31
                    out.writeBytes(aeb.FS);//Free 2 32
                    out.writeBytes(aeb.FS);//Free 3 33
                    out.writeBytes(aeb.FS);//Free 4 34
                    out.writeBytes(aeb.FS);//Free 5 35
                    out.writeBytes(aeb.FS);//Free 6 36
                    out.writeBytes(aeb.RSPcDatei);//Free 7 37 + Line.Separator
                    //out.writeBytes(System.getProperty("line.separator"));//Free 7 37 + Line.Separator
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }//try
            }//for

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
    }//outoutFile

    /**
     * @param i interner Z‰hler
     * @param x anzahl Feldgruppenelemente
     * @return Kennzeichen Satzende oder gibt Feldseperator ";" aus
     * ist i gleich (x-1) anzahl Feldgruppenelemente -> dann ist Satzende erreicht und es wird das Satzschluﬂkennzeichen ausgeben
     */
    String getCRLF(int i, int x) {
        if (i == (x - 1))
            return aeb.RSPcDatei;
        else
            return aeb.FS;
    }//getCRLF

    String getvaildgetLancd(String s) {

        if (s.equalsIgnoreCase("001"))
            return "DE";
        if (s.equalsIgnoreCase("ENG"))
            return "GB";
        if (s.equalsIgnoreCase("FRA"))
            return "FR";
        else
            return s;

    }//getVaildLancd

}// class FlexAdressen
