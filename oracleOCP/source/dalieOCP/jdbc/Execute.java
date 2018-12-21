package dalieOCP.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

class Execute {

	public static void main(String[] args) throws Exception {

		//Class.forName("com.mysql.jdbc.Driver").newInstance();
		
		try( Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "DV0101", "inxs");
				java.sql.Statement statement = conn.createStatement();
				java.sql.ResultSet resultSet = statement.executeQuery("Select * from book")){
				
			while(resultSet.next()) {
//				System.out.format("%1$s %2$s %3$s %n" ,resultSet.getString(1), resultSet.getDate(15), resultSet.getTime(15));
				System.out.format("%s %n" ,resultSet.getString(1));
			}
			
		} 
	}
}
