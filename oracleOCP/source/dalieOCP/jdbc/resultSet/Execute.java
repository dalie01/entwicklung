package dalieOCP.jdbc.resultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

class Execute {

	public static void main(String[] args) {
		try(Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "inxs");
				Statement s = c.createStatement()){
			
				/*
				 * The ResultSet object can be read-only, scrollable, or updatable. 
				 * By default, a ResultSet object is only read-only and can be 
				 * traversed in only one (forward) direction. 
				 * You can create a scrollable ResultSet (that can be traversed forward and backward) and/or 
				 * an updatable ResultSet by passing the relevant parameters during the creation of a 
				 * Statement object.
				 * */
				ResultSet rS = s.executeQuery("select * from book");
				ResultSetMetaData rsmd = rS.getMetaData();
				
				System.out.println(rsmd.getColumnCount());
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
