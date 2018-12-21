/*
 * Created of DV0101 on 29.04.2009 16:29:44
 *
 * Filename	  Uebersetzer.java
 */
package hashmap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * A Demo of HashMap.
 *
 * @version 	1.00 29.04.2009 um 16:29:44
 * @author 		DV0101
 * 
 */
public class Uebersetzer {

    public static void main(String[] args){
		
		HashMap woerterbuch = new HashMap();
		Vokabel vo = new Vokabel();
			
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
			System.out.println("Bitte das Wort was gelernt werde soll.");
																			
			String eingabe = br.readLine();
			
			woerterbuch.put(eingabe,(new Vokabel("sehen","walk")));
			eingabe = br.readLine();
			woerterbuch.put(eingabe,(new Vokabel("automatisch","auto")));			
			
			try{
			    String such = br.readLine();
			
			    if(woerterbuch.containsKey(such)){
			        System.out.println( ((Vokabel)woerterbuch.get(such)).ewort + " und "+ ((Vokabel)woerterbuch.get(such)).awort+ ". gefunden");
			
			    }else{
			        System.out.println("Nichts gefunden");
			    }//endif
			
			
			    /* alle Einträge werden auf Inhalt geprüft ->
			     * gefundener Eintrag wird gedruckt -> 
			     * danach aus HashMap gelöchst. 
			     * Das ganze so lange, bis alles gelöscht ist. */
			    while(!woerterbuch.isEmpty()){
			        such = br.readLine();
			        System.out.println( ((Vokabel)woerterbuch.remove(such)).ewort + " gelöscht");
			    }//while
			
			    if(woerterbuch.isEmpty()){
			        System.out.println("leer");
			    }//endif
			
			}catch(Exception e){
			    System.out.println(e.getMessage());
			}//catch	
		}catch(Exception e){
			System.out.println(e.getMessage());
		}//catch

	}//main	
    
}//class Uebersetzer
