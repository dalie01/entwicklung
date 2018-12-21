package dv0101;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * @author UDA
 * @version 1.0
 * @since 26.02.2008
 * @return pfaddatei definieren <br>
 *         Meldung programm startet <br>
 *         methode main <br>
 *         new FlexAdressen <br>
 *  
 */

public class GetFlexAdressen {
    

    //static final String pfaddatei = "C:\\Dokumente und Einstellungen\\DV0101\\IBM\\rationalsdp6.0\\workspace\\DV0101\\dv0101\\adressen.csv";
    static final String pfaddatei = "/home/Transfer/psFtp/Adressen.csv";

    public static void main(String[] args) {
        System.out.println("Programm startet");
        try {
            FlexAdressen adr = new FlexAdressen(new DataOutputStream(
                    new BufferedOutputStream(new FileOutputStream(pfaddatei))));
            adr.outputFile();
        } catch (Exception io) {
            System.out.println(io.getMessage());
        }//try
        System.out.println("Datei wurde unter: " + pfaddatei + " erstellt!!!");
        System.out.println("Programm endet");
    }//main

}//class GetFlexAdressen
