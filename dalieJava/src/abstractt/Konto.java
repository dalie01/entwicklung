package abstractt;

/**
 * @author dv0101 am 15.03.2007 um 12:34:24 <BR>
 *         Konto.java <BR>
 *         <B>abstract </B> Klassen Vererbungsbeziehungen zwischen Objekten
 *         werden in der Regel mit Hilfe von Klassendefinitionen hergestellt.
 *         Dabei bezeichnet man die "vererbende" Klasse als <b>Basisklasse </b>
 *         oder auch <b>Superklasse </b> und die "erbende" Klasse als
 *         <b>abgeleitete Klasse </b> bzw. <b>Subklasse </b>. Eine besondere
 *         Bedeutung haben dabei <b>abstrakte </b> Klassen. Eine abstrakte
 *         Klasse definiert Schnittstellen für Methoden und Eigenschaften ohne
 *         die zugehörige Implementierung zur Verfügung zu stellen, so dass es
 *         nicht möglich ist, Objekte daraus zu generieren. Erst von daraus
 *         abgeleiteten Klassen können, sofern entsprechende Implementierungen
 *         der Methoden bzw. Eigenschaften zur Verfügung gestellt werden,
 *         Objekte generiert werden.
 */

abstract class Konto {
    int ktoNr;

    private double ktoStand;

    Kunde k;

    double zinsSatz;

    static int counter = 10000;

    Konto(Kunde k, double ktoStand, double zinsSatz) {
        this.k = k;
        this.ktoStand = ktoStand;
        this.zinsSatz = zinsSatz;
        ktoNr = counter++;
    }//konto

    /**
     * @return ktoStand
     */
    public double getKtoStand() {
        return ktoStand;
    }//getKtoStand

    /**
     * Kontostand an Objekt Konto private ktoStand
     * 
     * @param wert
     */
    public void setKtoStand(double wert) {
        ktoStand = wert;
    }//setKtoStand

    void anzeigen() {
        System.out.println("KontoNr: " + ktoNr);
        System.out.println("Kunde: " + k.name + " KundenNr: " + k.kdNr);
        System.out.println("Kontostand: " + ktoStand);
        System.out.println("ZinsSatz: " + zinsSatz);
    }//anzeigen

    /**
     * berechne neuen Kontostand aus zinsSatz
     */
    void zinsen() {
        ktoStand = ktoStand * (1 + zinsSatz / 100);
    }//zinsen

    abstract void einzahlen(double betrag);

    abstract boolean auszahlen(double betrag);
}//Konto

