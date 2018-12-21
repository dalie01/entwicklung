package dalieOCP.jdbc.statementExecute;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Execute {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "inxs");
				Statement statement = con.createStatement()){
			
			/*
			 * execute: Returns true if the first object that the query returns is a ResultSet object. 
			 * Use this method if the query could return one or more ResultSet objects. 
			 * Retrieve the ResultSet objects returned from the query by repeatedly calling Statement.getResutSet.
			 * 
			 * cannot be called on a PreparedStatement or CallableStatement.
			 * */
			boolean rSet = statement.execute("Select * from book");//
			ResultSet eSet = statement.getResultSet();

			/*
			  * executeQuery: Returns one ResultSet object.
			  * */
			ResultSet resultSet = statement.executeQuery("Select * from book");
			
			/*
			 * executeUpdate: Returns an integer representing the number of rows affected by the SQL statement. 
			 * This method is used for INSERT, DELETE, or UPDATE SQL statements. 
			 * */
			int affectedRowCount = statement.executeUpdate("delete from test.book where ISBN = '20-..';");
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
