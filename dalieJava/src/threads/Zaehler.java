package threads;

// Es gibt 2 Möglichkeiten in Java einen Thread zu programmieren.
// Die Erste ist das Erben der Klasse Thread
// Die Zweite ist das Realisieren der Schnittstelle Runable.
class Zaehler implements Runnable{
    // static, damit die Threads die selbe Variable inkrementieren.
    static int i;
    // Diese Methode wird ausgeführt, wenn der Thread gestartet wird.
    @Override
	public void run(){
        i = 0;
        while(i < 100){
            try{
                System.out.println(Thread.currentThread().getName() + "  "+i);
                i++;
                // Lässt den Thread 0,1 Sekunden schlafen, also 100milliSekunden.
                // Kann eine Exception werfen.
            Thread.sleep(100);
            }catch(Exception e){
            }//try            
        }//while
    }//run
}//class
