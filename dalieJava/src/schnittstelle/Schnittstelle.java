package schnittstelle;

interface Schnittstelle{
    // Alle Variablen sind automatisch public static final
    double MWST = 1.16;
    // Alle Methoden sind automatisch public abstract
    // Diese Methoden müssen in der Klasse, die die 
    // Schnittstelle verwendet implementiert werden.
    void berechnen();    
}

