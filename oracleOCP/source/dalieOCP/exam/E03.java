package dalieOCP.exam;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;

final class E03 {

	public static void main(String[] args) throws SQLException {
		try (java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","inxs");
				java.sql.Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
				           ResultSet.CONCUR_UPDATABLE)) {
			
				java.sql.ResultSet rs = stmt.executeQuery("select * from book;");
				while(rs.next()) {
					System.out.println(rs.getString(1));
				}

				javax.sql.rowset.RowSetFactory rsp = javax.sql.rowset.RowSetProvider.newFactory();
				JdbcRowSet jdbcRowSet = rsp.createJdbcRowSet();
				jdbcRowSet.setUrl("jdbc:mysql://localhost:3306/test");
				jdbcRowSet.setUsername("root");
				jdbcRowSet.setPassword("inxs");
				jdbcRowSet.setCommand("select * from book");
				jdbcRowSet.execute();
				while(jdbcRowSet.next()) {
					System.out.println(jdbcRowSet.getString(1));
				}
		}
	}
}
