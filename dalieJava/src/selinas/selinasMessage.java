package selinas;

import java.util.Vector;

/**
 * @author u.dalies am 20.02.2007 um 19:58:29
 *
 * selinasMessage.java
 * 
 */

public class selinasMessage {
    
    private String errorTyp = "";
    private String errorMsg = "";
    
    
    public selinasMessage(){
     	
    }//selinasMessage
    
    public selinasMessage(Vector columns){
        errorTyp = columns.elementAt(0).toString();
        errorMsg = columns.elementAt(1).toString();
    }//selinasMessage
    
    
    public selinasMessage query(selinasDatabase dbConn,String msgID,String sprachkey) throws Exception{
		Vector rows = dbConn.executeQuery("select errorTyp, errorMsg from "+dbConn.getDbSchema()+".daliemsg where errorNummer = '"+msgID+"' and sprachkey = '"+sprachkey+"'");	
		return	new selinasMessage((Vector) rows.elementAt(0));
	}//query	
    
    
    /**
     * @return Returns the errorMsg.
     */
    public String getErrorMsg() {
        return errorMsg;
    }//getErrorMsg
    
    /**
     * @return Returns the errorTyp.
     */
    public String getErrorTyp() {
        return errorTyp;
    }//getErrorTyp
    
    
}//class selinasMessage

