package schnittstelle;


class Schuh implements Schnittstelle{
    int x = 1;    
    @Override
	public void berechnen() {
        System.out.println("Die Fläche ist 1");
    }    
}

