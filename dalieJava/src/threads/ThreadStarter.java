package threads;

class ThreadStarter{
    public static void main(String[] args){
        /*
        Zaehler z1 = new Zaehler();
        Zaehler z2 = new Zaehler();
        z1.setName("Alpha");
        z2.setName("Beta");
        z1.start();
        z2.start();
        */
        Zaehler z1 = new Zaehler();
        Zaehler z2 = new Zaehler();
        Thread t1 = new Thread(z1);
        Thread t2 = new Thread(z2);
        t1.setName("Alpha");        
        t2.setName("Beta");
        t1.start();
        t2.start();
        
        // In der main Methode läuft der so genannte
        // "main Thread".
        System.out.println(Thread.currentThread().getName());
    }//main
}//class
