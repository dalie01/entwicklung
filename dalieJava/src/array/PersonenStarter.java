package array;

class PersonenStarter{
    
    
    
    public static void main(String[] args){
        Person[] feld = new Person[3];
        Person p1 = new Person("Kirsten");
        Person p2 = new Person("Jürgen");
        Person p3 = new Person("Ute");
        feld[0] = p1;
        feld[1] = p2;
        feld[2] = p3;
        for (int i = 0; i < feld.length; i++) 
            feld[i].anzeigen(); 
        
    }//main
}//class

