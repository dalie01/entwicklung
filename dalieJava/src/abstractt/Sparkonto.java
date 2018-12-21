package abstractt;

class Sparkonto extends Konto{
    
    Sparkonto(Kunde k, double ktoStand, double zinsSatz){
        super(k, ktoStand, zinsSatz);
    }//Sparkonto
    
    @Override
	void einzahlen(double betrag) {
        if (betrag > 0)
            setKtoStand(     getKtoStand() + betrag        );
    }//einzahlen
    
    @Override
	boolean auszahlen(double betrag) {
        if (betrag <= getKtoStand()){
            setKtoStand( getKtoStand()- betrag );
            return true;
        }else{
            return false;
        }//if
    }//auszahlen
        
    
}