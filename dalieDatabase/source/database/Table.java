package database;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.apache.commons.io.IOUtils;

import database.Utils.capi.Init;
import database.Utils.capi.Migrate;
import logging.Logger;

public abstract class Table implements Init, Migrate {
	
	protected abstract boolean createTable(Database db);
	protected abstract String getId();
	
	/**
	 * CharField for DatabaseTable.
	 * 
	 * @param fieldName Name of Column
	 * @param fieldLength Char Length
	 * @param fieldPosition Position of Column only for Comment
	 * @param fieldComment Comment to describe this field  
	 * @return CharField add to Table
	 */
	public static String fieldChar(final String fieldName, 
				final String fieldLength, final String fieldPosition, final String fieldComment){
		
		return fieldName +" char(" + fieldLength + ") NOT NULL COMMENT '"+fieldPosition+" "+fieldComment+"',";
	}
	
	public static String fieldText(final String fieldName, 
			final String fieldLength, final String fieldPosition, final String fieldComment){
	
		return fieldName +" text(" + fieldLength + ") NOT NULL COMMENT '"+fieldPosition+" "+fieldComment+"',";
	}
	
	public static String fieldByte(final String fieldName, 
			final String fieldLength, final String fieldPosition, final String fieldComment){
	
		return fieldName +" BIT(" + fieldLength + ") NOT NULL COMMENT '"+fieldPosition+" "+fieldComment+"',";
	}
	
	public static String fieldByte(final String fieldName, 
			final String fieldPosition, final String fieldComment){
	
		return fieldName +" BIT(1) NOT NULL COMMENT '"+fieldPosition+" "+fieldComment+"',";
	}

	public static String fieldBlob(final String fieldName, 
			final String fieldPosition, final String fieldComment){
	
		return fieldName +" BLOB NOT NULL COMMENT '"+fieldPosition+" "+fieldComment+"',";
	}
	
	public static String fieldFloat(final String fieldName, 
			final String fieldPosition, final String fieldComment){
	
		return fieldName +" FLOAT NOT NULL COMMENT '"+fieldPosition+" "+fieldComment+"',";
	}
	
	
	public static String fieldCharValue(final String fieldName, final String value){
		return " " + fieldName + " = " + ValueChar(value);
	}
	
	public static String fieldIntValue(final String fieldName, final String value){
		return " " + fieldName + " = " + ValueInt(value);
	}
	
	public static String ValueChar(final Object value){
		return "'" + value + "',";
	}
	public static String ValueInt(final Object value){
		return value + ",";
	}
	
	public static String ValueDate(){
		return "now()";
	}
	
	public static String ValueUpdateAdditionals(){
		StringBuffer sb = new StringBuffer();
		sb.append(fieldIntValue("changeDate",ValueDate()));
		sb.append(" changeUser = 'DV0101'");
		return sb.toString();
	}
	
	public static String ValueAdditionals(){
		StringBuffer sb = new StringBuffer();
		sb.append(ValueChar("DV0101") + ValueDate() + ",");
		sb.append(ValueChar("DV0101") + ValueDate());
		return sb.toString();
	}
	
	/**
	 * Set Additional DataFields to Table.
	 * 
	 * Field as are:
	 * 
	 * createUser char(10) Id for USER as created.
	 * createDate date time TimeStamp as created.
	 * <br>
	 * changeUser char(10) Id for USER as last changed.
	 * changeDate date time TimeStamp as last change.
	 * 
	 * @param positionIndex automatically increment 
	 * @return all required Fields.
	 */
	public static String tableAdditions(final String positionIndex) {
		int index = Integer.parseInt(positionIndex);
		StringBuffer sb = new StringBuffer();
		sb.append (
		"createUser char(10) NOT NULL COMMENT '" + index + " Create-User',");
		index = prefix(index);
		sb.append(
		"createDate DATETIME NOT NULL COMMENT '" + index + " Create-TimeStamp',"); 
		index = prefix(index);
		sb.append(
		"changeUser char(10) NOT NULL COMMENT '" + index + " Change-User',");
		index = prefix(index);
		sb.append(
		"changeDate DATETIME NOT NULL COMMENT '" + index + " Change-TimeStamp',");
		
		return sb.toString();
	} /* tableAdditions */
	
	/**
	 * Create all Imported Table definitions currently 
	 * <br>	specified to mySql Engine.
	 * 
	 * @param comment as added to Table Comment
	 * @return Table definitions
	 */
	public static String tableDriver(final String comment){
		return "ENGINE = myisam CHARACTER SET latin1 COLLATE latin1_german1_ci COMMENT = '"+comment+"'";
	}
	
	/**
	 * internal User increment Index 
	 * 
	 * @param x actually index.
	 * @return current index.
	 */
	private static int prefix(int x) {
	 return ++x; 
	} /* prefix */
	
	/**
     * Serializes a given {@link Serializable} object.
     * 
     * @param obj The object to serialize.
     * @return A string representation of the serialized {@code obj} object.
     * 
     */
    public static String serializeObject(final Object obj) {

        ObjectOutputStream out = null;
        
        try {
            
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            out = new ObjectOutputStream(baos);

            out.writeObject(obj);
            out.flush();

            /* This encoding induces a bijection between byte[] and String (unlike UTF-8) */
            return baos.toString("ISO-8859-1");
            
        } catch (IOException ex) {
            
            Logger.log(ex);
            
        } finally {
            
            IOUtils.closeQuietly(out);
            
        }
        
        return null;
        
    }
    /**
     * deserialize an object from a given input string.
     * 
     * @param <T> type to be returned
     * @param inputStr The input string to deserialize.
     * @return The deserialized object.
     * 
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserializeObject(final String inputStr) {

        ObjectInputStream in = null;
        
        try {
            
            /* This encoding induces a bijection between byte[] and String (unlike UTF-8) */
            ByteArrayInputStream bais = new ByteArrayInputStream(inputStr.getBytes("ISO-8859-1"));
            in = new ObjectInputStream(bais);

            return (T) in.readObject();
            
        } catch (IOException ex) {
            
            System.out.println("deserialization error:" + ex.getMessage());
            
        } catch (ClassNotFoundException ex) {
            
            System.out.println("deserialization error:" + ex.getMessage());
            
        } finally {
            
            IOUtils.closeQuietly(in);
            
        }
        
        return null;
        
    }
    
    
    
	/**
	 * Drop Table if exist.
	 * 
	 * @param db database connection
	 */
	protected static synchronized boolean dropTable(Database db, String Id){
		try {

			return db.executeUpdate("DROP TABLE if exists " + Id);

		} catch (Exception e) {
			Logger.log(Table.class, e);
		}
		return false;
	} /* dropTable */

}
