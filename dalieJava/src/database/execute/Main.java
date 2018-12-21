package database.execute;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import database.Database;
import database.dataSets.DataSetAddress;
import database.tables.Address;

public class Main {
	public static void main(String[] args) {
		Database mySql = Database.getInstance("mySql");
		try {
			mySql.setUp();
			
			List<Address> addressen = DataSetAddress.reade(mySql,1);
			for (Address address : addressen) {
				System.out.println(address.toString());
			}//for
			
			Set<String> columnNames = mySql.getColumnNames();
			for (String string : columnNames) {
				System.out.println(string);
			}//for
			
			Map<Object, Object> columnTypes = mySql.getColumnTypes();
			Iterator i = columnTypes.entrySet().iterator();
		    while(i.hasNext()){
		    	 Map.Entry pairs = (Map.Entry)i.next();
		         System.out.println(pairs.getKey() + " = " + pairs.getValue());

		    }//while
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally{
			try { mySql.close(); } catch(Exception e) { }
		}//catch
	}//main
}//class Main
