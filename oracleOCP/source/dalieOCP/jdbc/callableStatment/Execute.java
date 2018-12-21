package dalieOCP.jdbc.callableStatment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

class Execute {
	
	public static void main(String[] args) throws Exception {
		try( Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "inxs");
				CallableStatement cstmt = conn.prepareCall("{call checkBooksByTitle(?,?,?)}") ){
			
			cstmt.setString(1, "LOHN");
			
			cstmt.registerOutParameter(2, java.sql.Types.VARCHAR);
			cstmt.registerOutParameter(3, java.sql.Types.VARCHAR);
			
			cstmt.executeQuery();
			
			System.out.println(cstmt.getString(2));
			System.out.println(cstmt.getString(3));
		} 
	}
}
