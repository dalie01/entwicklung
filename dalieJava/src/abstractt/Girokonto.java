package abstractt;


class Girokonto extends Konto{
    double dispo;
    
    Girokonto(Kunde k, double ktoStand, double zinsSatz){
        super(k, ktoStand, zinsSatz);
        dispo = 500;
    }//Sparkonto
    
    @Override
	void einzahlen(double betrag) {
        if (betrag > 0)
            setKtoStand(     getKtoStand() + betrag        );
        if (betrag > 20 * dispo)
            System.out.println("Ungewöhnliche Transaktion bei: "+ ktoNr);
    }//einzahlen
    
    @Override
	boolean auszahlen(double betrag) {
        if (getKtoStand() - betrag < dispo){
            setKtoStand(getKtoStand() - betrag);
            return true;
        }else{
            return false;
        }//if
    }//auszahlen
}


