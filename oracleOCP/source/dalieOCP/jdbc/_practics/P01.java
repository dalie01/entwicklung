package dalieOCP.jdbc._practics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

final class P01 {

	public static void main(String[] args) throws SQLException {

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "inxs");
				Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery("select * from  book")) {
					while (rs.next()) {
						System.out.println(rs.getString(1));

					}
		}
	}
}
