package schnittstelle;

class Fussballplatz implements Schnittstelle{
    int x = 200;
    @Override
	public void berechnen() {
        System.out.println("Die Fl�che ist 200");
    }
    
}
