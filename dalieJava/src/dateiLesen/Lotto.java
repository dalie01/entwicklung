/*
 * Created on 27.04.2009
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package dateiLesen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author dv0101
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Lotto {

        public static void main(String[] args) throws IOException{
            FileReader datei = new FileReader("z:\\daten\\glasnek\\lotto.dat");
            BufferedReader edatei = new BufferedReader(datei);
            String zeile;
            int[] lottoFeld = new int[50];
            int izahl;
            zeile = edatei.readLine();
            while(zeile != null){
                //System.out.println(zeile);
                izahl = Integer.parseInt(zeile);
                lottoFeld[izahl]++;
                zeile = edatei.readLine();
            }//while
            edatei.close();
          //Ausgabe  
          for(int i = 1; i < lottoFeld.length; i++)
              System.out.println(i + "     " + lottoFeld[i] + "  ");   
        }//main
}//class Lotto
