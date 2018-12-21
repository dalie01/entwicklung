package abstractt;

class Kunde{
    String name;
    int kdNr;
    static int counter = 1;
    
    Kunde(String name){
        this.name = name;
        kdNr = counter++;
    }
    void kundeAnzeigen(){
        System.out.println("KdNr: " + kdNr + "   Name: "+ name);
    }//kA    
}//class
