/*
 * Person.java
 * @author dv0101 am 29.08.2008 um 22:14:24
 *
 * no Copyright
 */
package array;
/**
 * <b>Class</b>Person:<br>beschreibt eine Person.<br>
 * <b>Attribute</b> <li>Personalnummer<li>Name<br>
 * 
 * @version 	1.00 29.08.2008 um 22:14:24*
 * @author 	    DV0101
 */
class Person{
    /* Dieses Objekt wird im PersonenStarter verwendet. */
    /* Und dient zur Demonstration von Arrays(Feld) */

    /** Anzahl der Personen gesamt */
    static int counter = 1;/*Klassenvariable*/
    /** Personalnummer */
    int nr;/*Instanzvariablen*/
    /** Name der Person */
    String name;
    
    /** 
     * Create a Objekt of Person
     * @param Namen vom Typ String
     */
    Person(String name){
        //erst Klassenvariable(static)rechnen
        //und dann an Instanzvarible nr übergeben.
        nr = counter++;
        this.name = name;
    }//Person
    
    /**
     * <b>zeige von Person<b> 
     * <li>Personalnummer
     * <li>Name
     */
    void anzeigen(){
        System.out.println("Nr: " + nr + "     Name: " + name);
    }//anzeigen

}//class
