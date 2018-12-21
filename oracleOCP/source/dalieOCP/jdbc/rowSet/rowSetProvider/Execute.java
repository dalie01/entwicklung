package dalieOCP.jdbc.rowSet.rowSetProvider;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

class Execute {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		try {
			RowSetFactory rowSetFactory = RowSetProvider.newFactory() ;
			JdbcRowSet jdbcRowSet = rowSetFactory.createJdbcRowSet();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
