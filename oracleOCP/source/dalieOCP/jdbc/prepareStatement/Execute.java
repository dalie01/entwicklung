package dalieOCP.jdbc.prepareStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class Execute {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try( Connection conn = DriverManager.getConnection("jdbc:mysql://dalieweb.de/usr_web4857_1", "web4857", "selina2009");
				java.sql.PreparedStatement statement = conn.prepareStatement("select * from adressen where userId like ?")){
//			java.sql.PreparedStatement statement = conn.prepareStatement("Update adressen set adressArt = 'U' where userId like ?")){
			
//			statement.setString(1, "userId");
			statement.setString(1, "%DV%");
//			statement.setString(3, "now()");
			System.out.println(statement.toString());
			
			/*
			 * The execute method returns a boolean to indicate the form 
			 * of the first result. You must call either the method 
			 * getResultSet or getUpdateCount to retrieve the result; 
			 * you must call getMoreResults to move to any subsequent result(s).
			 * */
			/* true if the first result is a ResultSet object; 
			 * false if the first result is an update count or there is no result */
			System.out.println(statement.execute());
//			System.out.println(statement.getUpdateCount());
			java.sql.ResultSet resultSet = statement.executeQuery();
			
			while(resultSet.next()) {
				System.out.format("%1$s %4$s %2$s %3$s %n" ,resultSet.getString(1), resultSet.getTimestamp(15), resultSet.getTime(15), resultSet.getString(3));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
