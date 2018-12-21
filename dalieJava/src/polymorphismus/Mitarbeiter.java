package polymorphismus;

import java.util.Date;

/**
 * @author u.dalies am 14.11.2007 um 19:46:03
 * <BR>
 * Bisher haben wir Vererbung eingesetzt, und jede Klasse konnte Objekte bilden. 
 * Das ist allerdings nicht immer sinnvoll, nämlich genau dann, wenn eine Klasse 
 * nur in einer Vererbungshierarchie existieren soll. 
 * Sie kann dann als Modellierungsklasse eine Ist-eine-Art-von-Beziehung ausdrücken 
 * und Signaturen für die Unterklassen vorgeben. 
 * Eine Oberklasse besitzt dabei Vorgaben für die Unterklasse, das heißt, 
 * alle Unterklassen erben die Methoden. 
 * Ein Exemplar der Oberklasse selbst muss nicht existieren.
 * Um das in Java auszudrücken, setzen wir den Modifizierer abstract an die Typdeklaration der Oberklasse. 
 * Von dieser Klasse können dann keine Exemplare gebildet werden. 
 * Ansonsten verhalten sich die abstrakten Klassen wie normale, sie enthalten die gleichen Eigenschaften 
 * und können auch selbst von anderen Klassen erben. Abstrakte Klassen sind das Gegenteil von konkreten Klassen.
 * <BR>
 * Mitarbeiter.java
 * 
 */

public abstract class Mitarbeiter {
  
    int personnr;
    String name;
    Date eintritt;
    
    public Mitarbeiter() {
    }//Mitarbeiter
    
    /**
     * Das Schlüsselwort abstract class leitet die Deklaration einer abstrakten Klasse ein. 
     * Eine Klasse kann ebenso abstrakt sein wie eine Methode. 
     * Eine abstrakte Methode gibt lediglich die Signatur vor, 
     * und eine Unterklasse implementiert irgendwann diese Methode. 
     * Die Klasse ist somit für den Kopf der Methode zuständig, 
     * während die Implementierung an anderer Stelle erfolgt. 
     * Durch abstrakte Methoden wird ausgedrückt, 
     * dass die Oberklasse keine Ahnung von der Implementierung hat
     *  und dass sich die Unterklassen darum kümmern müssen.
    **/
    public abstract double monatsBrutto();
    
}//class Mitarbeiter

