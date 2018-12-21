package dalieOCP.jdbc.sqlTypeJavaType;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Execute {
	@SuppressWarnings({ "null", "unused" })
	public static void main(String[] args) throws SQLException {
		Statement statement = null;
		ResultSet rs = null;
		 
		rs = statement.executeQuery("SELECT * FROM ...");
		
		boolean b = rs.getBoolean("columnIndex");
		String s = rs.getString("columnLabel");
		 
		Object o = rs.getObject("columnLabel");
		if(o instanceof java.lang.Integer) {
			int i = ((Integer)o).intValue();
		}
	}
}
