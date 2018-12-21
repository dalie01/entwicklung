package database.dataSets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import database.Database;
import database.orderBy.DataSetOrderBy;
import database.tables.Address;

public class DataSetAddress {

	private static List<Address> addresses = null;
	
	/**
     * <b>get all Addresses of Database </b>
     * <br/>
     * @param
     * <ul><li>Database dbConn</li><li>int addressId</li></ul>
     * @return
     * <ul><li>List of Addresses</li></ul>
     */
    public static List<Address> reade(Database dbConn, int adressId) throws Exception {
    	addresses = Collections.synchronizedList(new ArrayList<Address>());
    	List<List<Object>> rows = dbConn.executeQuery("select * from "+dbConn.getDbSchema()+".adressen " +
                        "where adressId = "+adressId + 
                                " ORDER BY "+DataSetOrderBy.getOrderValue("Address_default",false));
        if(rows.size() == 0)
            throw new Exception("Record not Found");
        for(int i = 0;i < rows.size();i++) {
        	addresses.add(new Address(rows.get(i)));
        }//for
        return addresses;
    }//read

}//class DataSetAddress
