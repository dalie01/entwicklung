/*
 * Created of DV0101 on 7.07.2009 14:02:44
 *
 * Filename	  Formatieren.java
 */
package formatieren;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DateFormat, MessageFormat und NumberFormat erweitern die abstrakte Klasse Format. <br>
 * Die Unterklassen übernehmen die Ein-/Ausgabe für Datumsangaben,<br>
 * für allgemeine Programmmeldungen und für Zahlen.<br>
 * <br>
 * <b>eBook:</b> Java ist auch eine Insel<br> 
 * Kapitel 4.9.2 Die Format-Klassen im Überblick<br>
 * @version 	1.00 07.07.2009 um 14:02:44
 * @author 		DV0101
 * <br><br>
 */
public class Formatieren {

    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
        System.out.println(format.format(new Date()));
        
        DecimalFormat f = new DecimalFormat("#.000");
        System.out.println(f.format(2.00449));
        System.out.println(f.format(2.00450));
        System.out.println(f.format(2.00451));

        DecimalFormat d = new DecimalFormat("Guthaben #,##0.00;Schulden #,##0.00");
        System.out.println(d.format(50000.994));
        System.out.println(d.format(50000.999));
        System.out.println(d.format(-50000.99));
    }//main
    
}//class Formatieren
