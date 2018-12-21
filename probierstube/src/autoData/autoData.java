package autoData;

import java.util.Hashtable;

public class autoData {
	
	/** The 1 type */
    public static final int VALUE_0_TYPE = 0;
    /** The instance of first type */
    public static final String[] VALUE_0 = {"TEST1","TEST2","TEST3"};
       

    /** The 1a type */
    public static final int VALUE_1_TYPE = 1;
    /** The instance of 1a type */
    public static final String[] VALUE_1 = {"Option 1","Option 2","Option 3","Option 4"};
    
    /** The 2 type */
    public static final int VALUE_2_TYPE = 2;
    /** The instance of 2 type */
    public static final String[] VALUE_2 = {"Item 1","Item 3","Item 4"};
    
    private static Hashtable memberTable = init();
    
    private int type = -1;
    private String stringValue = null;
    
    /** GehaltsgruppeType */
    private autoData(int type,String value) {
        this.type = type;
        this.stringValue = value;
    }//GehaltsgruppeType

    private static Hashtable init() {
        Hashtable members = new Hashtable();
        members.put("1", VALUE_0);
        members.put("2", VALUE_1);
        members.put("3", VALUE_2);
        return members;
    }//init
    
    
    /**
    * Returns a new ColumHeader based on the given String value.
    * @param string
   */ 
   public static String[] valueOf(String typ){
       String obj[] = null;
       if (typ != null) 
           obj = (String[])memberTable.get(typ);
       if (obj == null) {
           String err = "'" + typ + "' is not a valid";
           throw new IllegalArgumentException(err);
       }//endif
       return obj;
   }//valueOf 
    
    /** Returns the type of this GehaltsgruppeType */
    public int getType(){
        return this.type;
    }//getType() 
    
    /** Returns the String representation of this GehaltsgruppeType */
    public String toString(){
        return this.stringValue;
    }//toString() 
	
}//class autoData.java

