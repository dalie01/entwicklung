package schnittstelle;


class Schuh implements Schnittstelle{
    int x = 1;    
    @Override
	public void berechnen() {
        System.out.println("Die Fl�che ist 1");
    }    
}

