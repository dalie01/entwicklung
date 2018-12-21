/*
 * Created of DV0101 on 12.09.2009 20:19:09
 *
 * Filename	  PersonType.java
 */
package projektVerwaltung;

import java.util.ArrayList;

/**
 * Class description goes here.
 *
 * @version 	1.00 12.09.2009 um 20:19:09
 * @author 		DV0101
 * <br><br>
 * private   = "false" nur sichtbar innerhalb der Klasse<br>
 * ohne      = 	       sichtbar innerhalb Package<br>
 * protected = "false" sichtbar innerhalb Package und abgeleiteten Klassen<br>
 * public    = "false" sichtbar ausserhalb<br>
 */
public abstract class PersonType {
    
    /** ID of PersonType */
    private String persID;

	private GehaltsgruppeType gehaltsgruppe = GehaltsgruppeType.valueOf("1a");

    private ArrayList<Object> mitarbeitInProjekt;

    private Qualifikationsprofil qualifikationsprofil;

    private String vorname;

    private String nachname;


    /** PersonType */
    public PersonType() {
        mitarbeitInProjekt = new ArrayList<Object>();
    }//PersonType

    /**
     * 
     * @param vMitarbeitInProjekt 
     * */
    public void addMitarbeitInProjekt(Object vMitarbeitInProjekt) throws IndexOutOfBoundsException{
        mitarbeitInProjekt.add(vMitarbeitInProjekt);
    }//addMitarbeitInProjekt 

    /**
     * 
     * @param index
     * @param vMitarbeitInProjekt
     * */
    public void addMitarbeitInProjekt(int index, java.lang.Object vMitarbeitInProjekt)throws IndexOutOfBoundsException{
        mitarbeitInProjekt.add(index, vMitarbeitInProjekt);
    }//addMitarbeitInProjekt 
    
    /**
     *
     * */
     public void clearMitarbeitInProjekt(){
         mitarbeitInProjekt.clear();
     }//clearMitarbeitInProjekt() 
     
     /**
      * 
      * @param index 
      * */
     public Object getMitarbeitInProjekt(int index) throws IndexOutOfBoundsException {
         //-- check bounds for index
         if ((index < 0) || (index > mitarbeitInProjekt.size())) {
             throw new IndexOutOfBoundsException();
         }//endif
         
         return mitarbeitInProjekt.get(index);
     }//getMitarbeitInProjekt 

     /**
      * 
      * */
     public Object[] getMitarbeitInProjekt(){
         int size = mitarbeitInProjekt.size();
         java.lang.Object[] mArray = new Object[size];
         for (int index = 0; index < size; index++) {
             mArray[index] = mitarbeitInProjekt.get(index);
         }//for
         return mArray;
     }//getMitarbeitInProjekt 

     /**
      * 
      * */
     public int getMitarbeitInProjektCount(){
         return mitarbeitInProjekt.size();
     }//getMitarbeitInProjektCount() 

     /**
      * 
      * @param index
      * @param vMitarbeitInProjekt
      * */
     public void setMitarbeitInProjekt(int index, Object vMitarbeitInProjekt) throws IndexOutOfBoundsException {
         //-- check bounds for index
         if ((index < 0) || (index > mitarbeitInProjekt.size())) {
             throw new IndexOutOfBoundsException();
         }//endif
         mitarbeitInProjekt.set(index, vMitarbeitInProjekt);
     }//setMitarbeitInProjekt 

     /**
      * 
      * @param mitarbeitInProjektArray
      * */
     public void setMitarbeitInProjekt(Object[] mitarbeitInProjektArray){
         //-- copy array
         mitarbeitInProjekt.clear();
         for (int i = 0; i < mitarbeitInProjektArray.length; i++) {
             mitarbeitInProjekt.add(mitarbeitInProjektArray[i]);
         }//for
     }//setMitarbeitInProjekt
     
     
     /** @param qualifikationsprofil */
     public void setQualifikationsprofil(Qualifikationsprofil qualifikationsprofil){
         this.qualifikationsprofil = qualifikationsprofil;
     }//setQualifikationsprofil 
     
     /** @return Returns the Qualifikationsprofil */
      public Qualifikationsprofil getQualifikationsprofil(){
          return this.qualifikationsprofil;
      }//getQualifikationsprofil  
      
    /** @return Returns the nachname */
    public String getNachname() {
        return nachname;
    }//gentNachname
    /** @param nachname The nachname to set */
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }//setNachname
    /** @return Returns the persID.*/
    public String getPersID() {
        return persID;
    }//getPersID
    /** @param persID The persID to set.*/
    public void setPersID(String persID) {
        this.persID = persID;
    }//setPersID
    /** @return Returns the vorname. */
    public String getVorname() {
        return vorname;
    }//getVorname
    /** @param vorname The vorname to set. */
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }//setVorname
}//class PersonType
