/*
 * Created on 26.02.2007
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package dv0101;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * @author dv0101
 * @since
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class HalloWorld {

    static final String pfaddatei = "C:\\Dokumente und Einstellungen\\DV0101\\IBM\\rationalsdp6.0\\workspace\\DV0101\\dv0101\\adressen.csv";

    public static void main(String[] args) {
        System.out.println("Hallo World");
        try {
            FlexAdressen adr = new FlexAdressen(new DataOutputStream(
                    new BufferedOutputStream(new FileOutputStream(pfaddatei))));
            adr.outputFile();
        } catch (Exception io) {
            System.out.println(io.getMessage());
        }//try

    }//main
}//class HalloWorld
