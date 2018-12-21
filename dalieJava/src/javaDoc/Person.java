/*
 * Name of File.java
 * @author dv0101 am 29.08.2008 um 22:14:24
 *
 * Copyright notice
 */
package javaDoc;
/**
 * Class description goes here.
 *
 * @version 	1.00 29.08.2008 um 22:14:24*
 * @author 	Firstname Lastname
 * <br><br>
 * private="false" nur sichtbar innerhalb der Klasse<br>
 * ohne sichtbar innerhalb Package<br>
 * protected="false" sichtbar innerhalb Package und abgeleiteten Klassen<br>
 * public="false" sichtbar ausserhalb<br>
 */
class Person {
    /* A class implementation comment can go here. */

    /** classVar1 documentation comment */
    static int counter = 1;/*Klassenvariable*/
    /** classVar2 documentation comment */
    int nr;/*Instanzvariablen*/
    /** classVar3 documentation comment */
    String name;
    /** 
     * ...constructor Person documentation comment...
     * @param name
     */
    Person(String name){
        nr = counter++;
        this.name = name;
    }//Person
    
    /**
     * ...method doSomething documentation comment...
     */
    void anzeigen(){
        System.out.println("Nr: " + nr + "     Name: " + name);
    }//anzeigen
   
    /**
     * ...method doSomethingElse documentation comment...
     * @param someParam description
     */
    public void doSomethingElse(Object someParam) {
        // ...implementation goes here... 
    }//doSomethingElse

}//class



