package dalieOCP.jdbc.connectionMetaData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Execute {
	public static void main(String[] args) {
		
		try( 
			Connection conn = DriverManager.getConnection("jdbc:mysql://dalieweb.de/usr_web4857_1", "web4857", "selina2009");
			java.sql.Statement statement = conn.createStatement();
			java.sql.ResultSet resultSet = statement.executeQuery("select * from adressen");){
			java.sql.ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
				
			System.out.println(resultSetMetaData.getColumnCount());
			System.out.println(resultSetMetaData.getTableName(1));
			System.out.println(resultSetMetaData.getColumnName(1));
			System.out.println(resultSetMetaData.getColumnDisplaySize(1));
			
			while(resultSet.next()) {
				System.out.format("%1$s %2$s %3$s %n" ,resultSet.getString(1), resultSet.getDate(15), resultSet.getTime(15));
//				System.out.format("%s %n" ,resultSet.getString(1));
			}

			resultSet.close();
			statement.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
