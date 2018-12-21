/*
 * Created of DV0101 on 12.09.2009 19:30:23
 *
 * Filename	  QualifikationsprofilType.java
 */
package projektVerwaltung;

import java.util.ArrayList;
import java.util.List;

/**
 * Class description goes here.
 *
 * @version 	1.00 12.09.2009 um 19:30:23
 * @author 		DV0101
 * <br><br>
 * private   = "false" nur sichtbar innerhalb der Klasse<br>
 * ohne      = 	       sichtbar innerhalb Package<br>
 * protected = "false" sichtbar innerhalb Package und abgeleiteten Klassen<br>
 * public    = "false" sichtbar ausserhalb<br>
 */
public abstract class QualifikationsprofilType implements java.io.Serializable {

    /** internal content storage */
    private String content = "";
    private List<QualifikationsprofilTypeItem> items;
    
    /** QualifikationsprofilType */
    public QualifikationsprofilType() {
        items = new ArrayList<QualifikationsprofilTypeItem>(); 
    }//QualifikationsprofilType
    
    /**
     * 
     * @param vQualifikationsprofilTypeItem
     * */
    public void addQualifikationsprofilTypeItem(QualifikationsprofilTypeItem vQualifikationsprofilTypeItem)throws IndexOutOfBoundsException {
        items.add(vQualifikationsprofilTypeItem);
    }//addQualifikationsprofilTypeItem

    /**
     * 
     * @param index
     * @param vQualifikationsprofilTypeItem
     * */
    public void addQualifikationsprofilTypeItem(int index, QualifikationsprofilTypeItem vQualifikationsprofilTypeItem)throws IndexOutOfBoundsException{
        items.add(index, vQualifikationsprofilTypeItem);
    }//addQualifikationsprofilTypeItem 

    /**
    *
    * */
    public void clearQualifikationsprofilTypeItem(){
        items.clear();
    }//clearQualifikationsprofilTypeItem()
    
    
    /**
     * get QualifikationsprofilTypeItem
     * @param index
     * */
    public QualifikationsprofilTypeItem getQualifikationsprofilTypeItem(int index)throws IndexOutOfBoundsException {
        /* check bounds for index */
        if ((index < 0) || (index > items.size())) {
            throw new IndexOutOfBoundsException();
        }//endif
        
        return items.get(index);
    }//getQualifikationsprofilTypeItem 

    /** get the highest QualifikationsprofilTypeItem */
    public QualifikationsprofilTypeItem[] getQualifikationsprofilTypeItem(){
        int size = items.size();
        QualifikationsprofilTypeItem[] mArray = new QualifikationsprofilTypeItem[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = items.get(index);
        }//for
        return mArray;
    }//getQualifikationsprofilTypeItem 

    /** get the count of QualifikationsprofilTypeItems */
    public int getQualifikationsprofilTypeItemCount(){
        return items.size();
    }//getQualifikationsprofilTypeItemCount 
    
    /**
     * remove QualifikationsprofilTypeItem
     * @param vQualifikationsprofilTypeItem
     * */
    public boolean removeQualifikationsprofilTypeItem(QualifikationsprofilTypeItem vQualifikationsprofilTypeItem){
        boolean removed = items.remove(vQualifikationsprofilTypeItem);
        return removed;
    }//removeQualifikationsprofilTypeItem 
    
    /**
     * 
     * @param index
     * @param vQualifikationsprofilTypeItem
    **/
    public void setQualifikationsprofilTypeItem(int index, QualifikationsprofilTypeItem vQualifikationsprofilTypeItem) throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > items.size())) 
            throw new IndexOutOfBoundsException();
        
        items.set(index, vQualifikationsprofilTypeItem);
    }//setQualifikationsprofilTypeItem 

    /**
     * 
     * @param qualifikationsprofilTypeItemArray
    **/
    public void setQualifikationsprofilTypeItem(QualifikationsprofilTypeItem[] qualifikationsprofilTypeItemArray){
        //-- copy array
        items.clear();
        for (int i = 0; i < qualifikationsprofilTypeItemArray.length; i++) {
            items.add(qualifikationsprofilTypeItemArray[i]);
        }//for
    }//setQualifikationsprofilTypeItem 
    
    
    /**
     * To check whether the specified element exists in Java ArrayList use
     * boolean contains(Object element) method.
     * It returns true if the ArrayList contains the specified objct, false otherwise.
     * */
    public boolean foundQualifikationsprofilTypeItem(QualifikationsprofilTypeItem vQualifikationsprofilTypeItem) {
        	return items.contains(vQualifikationsprofilTypeItem);
    }//foundQualifikationsprofilTypeItem
     
    
    /**
     * To get an index of specified element in ArrayList use
     * int indexOf(Object element) method.
     * This method returns the index of the specified element in ArrayList.
     * It returns -1 if not found.
     * */
    public boolean foundQualifikationsprofilTypeItem(String index) {
        int found = items.indexOf(index);
        if(found == -1) {
            return false;
        }else {
            return true;
        }//endif
    }//foundQualifikationsprofilTypeItem
    
    
    /** @return Returns the content */
    public String getContent() {
        return content;
    }//getContent
    
    /** @param content The content to set */
    public void setContent(String content) {
        this.content = content;
    }//setContent
    
}//class QualifikationsprofilType
