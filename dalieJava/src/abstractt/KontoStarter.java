package abstractt;

import logger.Loggable;

class KontoStarter implements Loggable {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException{
        Konto[] feld = new Konto[1000];
        feld[0] = new Girokonto(new Kunde("Adam"), 100, 0.5);
        feld[1] = new Sparkonto(new Kunde("Eva"), 500, 10);
        feld[2] = new Girokonto(new Kunde("Kain"), 4100, 0.5);
        feld[3] = new Girokonto(new Kunde("Abel"), 8100, 0.5);
        
        logger.info(KontoStarter.class.getName());
       System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        for (int i = 0; i < feld.length; i++){
            if(feld[i] != null)
                feld[i].anzeigen();
        }
        
        //s1.anzeigen();
        //if (!s1.auszahlen(600))
          //  System.out.println("Konto überzogen!");
        //s1.zinsen();
        //s1.anzeigen();
        
        
    }//main
}//class
