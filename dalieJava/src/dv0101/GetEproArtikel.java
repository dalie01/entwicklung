package dv0101;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * @author      UDA<br>
 * @version     1.0<br>	
 * Date of creation:  31.03.2004<br>
 * File:         GetEproArtikel.java<br>
 * Modifier:     UDA<br>
 * Revision:     Revision<br>
 * State:        Germany<br>
*/
 
public class GetEproArtikel { 
    	
    static final String pfaddatei = "C:\\Dokumente und Einstellungen\\DV0101\\IBM\\rationalsdp6.0\\workspace\\DV0101\\dv0101\\_HDProdukt.txt";
    //static final String pfaddatei = "/home/Transfer/Epro/mediando/_HDProdukt.txt";
    public static void main(String[] args) {
        System.out.println("Programm startet");
        try{
			EproArtikel art = new EproArtikel(new DataOutputStream(new BufferedOutputStream(new FileOutputStream(pfaddatei))));
			art.outputFile();	
			}catch(Exception io){
		        System.out.println(io.getMessage());
		    }//try
			System.out.println("Datei wurde unter: " + pfaddatei + " erstellt!!!");
			System.out.println("Programm endet"); 
    }//main
}//class GetEproArtikel
