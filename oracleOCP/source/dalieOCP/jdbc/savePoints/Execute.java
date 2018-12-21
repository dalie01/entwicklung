package dalieOCP.jdbc.savePoints;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;

public class Execute {

	public static void main(String[] args) {
		
		try( Connection conn = DriverManager.getConnection("jdbc:mysql://dalieweb.de/usr_web4857_1", "web4857", "selina2009")){
			conn.setAutoCommit(false);
			java.sql.Statement statement = conn.createStatement();
			
//			String iQ1 = "Insert INTO adressen Values(1,'U','ORACLE1','STREET1','9','99999','CITY1','GERMANY','0999/99999','0999/9998','mail@email.de', 'DV0101', now(), 'DV0101', now() )";
//			String iQ2 = "Insert INTO adressen Values(1,'U','ORACLE2','STREET1','9','99999','CITY1','GERMANY','0999/99999','0999/9998','mail@email.de', 'DV0101', now(), 'DV0101', now() )";
			String dQ1 = "Delete from adressen where userId = 'ORACLE1'";
			String dQ2 = "Delete from adressen where userId = 'ORACLE2'";
			boolean b1 = statement.execute(dQ1);
			Savepoint sp1 = conn.setSavepoint();
			boolean b2 = statement.execute(dQ2);
			conn.rollback(sp1);
			conn.close();
			
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}
}
