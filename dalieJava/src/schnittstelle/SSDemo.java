package schnittstelle;


class SSDemo{
    public static void main(String[] args)throws Exception {        
        // In diesen Array können alle Objekte mit aufgenommen
        // werden, die das Interface Schnittstelle realisieren.
        Schnittstelle[] s = new Schnittstelle[2];
        Schuh adidas = new Schuh();
        Fussballplatz schalke = new Fussballplatz();
        s[0] = adidas;
        s[1] = schalke;                
        for (int i = 0; i < s.length; i++){
            s[i].berechnen();
        	System.out.println(Schnittstelle.MWST);
    	}//for   
    
    }//main
}//class