package hashtable;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Hashtable;

class HT{
    public static void main(String[] args){
        Hashtable ht = new Hashtable();
        // Drei Objekte vom Typ Vokabel erzeugen
        Vokabel v1 = new Vokabel("walk", "Verb");
        Vokabel v2 = new Vokabel("drink", "Verb");
        Vokabel v3 = new Vokabel("house", "Substantiv");
        // In die HashTable zu dem Schlüssel gehen,
        // den Wert v1 hinzunehmen.
        ht.put("gehen", v1);
        ht.put("trinken", v2);
        ht.put("Haus", v3);        
        String s = null;        
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            s = br.readLine();
        }catch(Exception e){
        }//try
        
        // Ist der Schlüssel überhaupt vorhanden?
        if (ht.containsKey(s)){
            System.out.print("Das Wort " + s + " heisst auf englisch: ");
            // ht.get(s) holt den Wert zu Schlüssel s.
            // Konvertieren in Vokabel und zugriff auf die Attribute.
            System.out.print(((Vokabel)ht.get(s)).ewort + " und ist ein " + ((Vokabel)ht.get(s)).awort+".");
        }else{
            System.out.println("Wort nicht gefunden.");
        }//if        
    }//main
}//class

class Vokabel{
    String ewort;
    String awort;
    Vokabel(String a, String b){
        ewort = a;
        awort = b;
    }
    
    
}//class