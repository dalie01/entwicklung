package persistenz;

import java.io.Serializable;

class Spielfigur implements Serializable{
    String name;
    int energie;
    int waffe;
    
    Spielfigur(String name, int energie){
        this.name = name;
        this.energie = energie;
        waffe = 0;
    }//Ko
    
    void waffeBenutzen(int i){
        if (i == 1)
            System.out.println("Ich nehme das Messer");
        if (i == 2)
            System.out.println("Ich nehme das Beil");
        if (i == 3)
            System.out.println("Ich nutze den Zauberspruch");
    }
    
    void setWaffe(int i){
        waffe = i;
    }
    
    void abnipplen(){
        energie -= 10;
    }
    
    void anzeigen(){
        System.out.println("Name " + name + " Energie " + energie + " Waffe " + waffe);
    }
}
