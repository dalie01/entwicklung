package database.factory.type.business;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import database.Database;
import database.factory.type.DataTableType;
import logging.Logger;
import model.capi.type.Type;
import model.internal.type.BillingType;
import model.internal.type.ShippingType;


public class DataSetType extends DataTableType {

	private static List<Type> types = null;
	private static Type type = null;
	
    public static List<Type> getAllTypes(Database db) throws Exception {
    	List<Type> types = Collections.synchronizedList(new ArrayList<Type>());
    	
    	try{
    		types.add(getBillingType(db));
    	} catch(Exception e){
    		Logger.log(e);
    	}
    	
    	try{
    		types.add(getShippingType(db));
    	} catch(Exception e){
    		Logger.log(e);
    	}
    	
        if(types.size() == 0)
            throw new Exception("Records not Found");
      
        return types;
    } /* getAllTypes */
	
	public static Type getShippingType(Database db) throws Exception {
		types = Collections.synchronizedList(new ArrayList<Type>());
    	
    	List<List<Object>> rows = db.executeQuery("select * from "+db.getDbSchema()+ "."  + DataTableType.Id +
                        " where typeId = '" + DataTableType.Types.Shipping.toString() + "'");
        if(rows.size() == 0)
            throw new Exception("Record not Found");
        
        for(int i = 0;i < rows.size();i++) {
        	types.add(new ShippingType(rows.get(i)));
        }//for
        
        for (Type type : types) {
			return type;
		}
        
        return type;
    } /* getSchippingType */
	
 
	public static Type getBillingType(Database db) throws Exception {
		types = Collections.synchronizedList(new ArrayList<Type>());
    	
    	List<List<Object>> rows = db.executeQuery("select * from "+db.getDbSchema()+ "."  + DataTableType.Id +
                        " where typeId = '" + DataTableType.Types.Billing.toString() + "'");
        if(rows.size() == 0)
            throw new Exception("Record not Found");
        
        for(int i = 0;i < rows.size();i++) {
        	types.add(new BillingType(rows.get(i)));
        }//for
        
        for (Type type : types) {
			return type;
		}
        
        return type;
    } /* getBillingType */
    
	

    
}
