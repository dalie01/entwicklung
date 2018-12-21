/*
 * Created of DV0101 on 12.09.2009 17:50:27
 *
 * Filename	  GehaltsgruppeType.java
 */
package projektVerwaltung;

import java.util.Hashtable;

/**
 * Class description goes here.
 *
 * @version 	1.00 12.09.2009 um 17:50:27
 * @author 		DV0101
 * <br><br>
 * private   = "false" nur sichtbar innerhalb der Klasse<br>
 * ohne      = 	       sichtbar innerhalb Package<br>
 * protected = "false" sichtbar innerhalb Package und abgeleiteten Klassen<br>
 * public    = "false" sichtbar ausserhalb<br>
 */
public class GehaltsgruppeType implements java.io.Serializable {

    /** The 1 type */
    public static final int VALUE_0_TYPE = 0;
    /** The instance of first type */
    public static final GehaltsgruppeType VALUE_0 = new GehaltsgruppeType(VALUE_0_TYPE,"1");

    /** The 1a type */
    public static final int VALUE_1_TYPE = 1;
    /** The instance of 1a type */
    public static final GehaltsgruppeType VALUE_1 = new GehaltsgruppeType(VALUE_1_TYPE,"1a");
    
    /** The 2 type */
    public static final int VALUE_2_TYPE = 2;
    /** The instance of 2 type */
    public static final GehaltsgruppeType VALUE_2 = new GehaltsgruppeType(VALUE_2_TYPE,"2");
    
    private static Hashtable memberTable = init();
    
    private int type = -1;
    private String stringValue = null;
    
    /** GehaltsgruppeType */
    private GehaltsgruppeType(int type,String value) {
        this.type = type;
        this.stringValue = value;
    }//GehaltsgruppeType

    private static Hashtable init() {
        Hashtable members = new Hashtable();
        members.put("1", VALUE_0);
        members.put("1a", VALUE_1);
        members.put("2", VALUE_2);
        return members;
    }//init
    
    /**
     * Returns a new GehaltsgruppeType based on the given String value.
     * @param string
    */
    public static GehaltsgruppeType valueOf(String string){
        Object obj = null;
        if (string != null) 
            obj = memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid GehaltsgruppeType";
            throw new IllegalArgumentException(err);
        }//endif
        return (GehaltsgruppeType) obj;
    }//valueOf 
    
    
    /** Returns the type of this GehaltsgruppeType */
    public int getType(){
        return this.type;
    }//getType() 
    
    /** Returns the String representation of this GehaltsgruppeType */
    @Override
	public String toString(){
        return this.stringValue;
    }//toString() 

}//class GehaltgruppeType
