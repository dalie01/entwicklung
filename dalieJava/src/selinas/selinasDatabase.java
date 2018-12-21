package selinas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;
import java.util.Vector;

/**
 * @author u.dalies am 01.08.2006 um 21:14:48
 *
 * selinasDatabase.java * 
 */

public class selinasDatabase {
	
	private Connection dbConnection;
	private Hashtable columnTypes = new Hashtable();
	private Vector columnNames = new Vector();
	private String dbType;
	private String dbHost; 
	private String dbSchema;
	private String user;
	private String password;
	
	public selinasDatabase(String dbType, String dbHost, String dbSchema, String user, String password){
		
		this.dbType = dbType;
		this.dbHost = dbHost;
		this.dbSchema = dbSchema;
		this.user = user;
		this.password = password;
	}	

	public void getConnection() throws Exception{
		try{
			if (dbType.equals("mySql")){  
				Class.forName("com.mysql.jdbc.Driver");
				if (dbHost.length() == 0){
					dbHost = "localhost";
				}//endif
				dbConnection = DriverManager.getConnection("jdbc:mysql://"+dbHost+"/"+dbSchema,user,password);
			}//endif
			}catch (Exception ex){
				throw new Exception ("dbs connect " + ex.toString());
			}//try
	}//getConnection
	
	public Vector executeQuery(String sqlStatement) throws Exception{
		Vector result = executeQueryProcess(sqlStatement);
			if (result == null){
				System.out.println("reconnect");
				getConnection();
				result = executeQueryProcess(sqlStatement);
			}//endif    
			return result;    	
	}//executeQuery	

	public Vector executeQueryProcess(String sqlStatement) throws Exception{
		Statement statement = null;
		try{
				statement = dbConnection.createStatement();
			}catch (Exception ex){
				throw new Exception ("dbs query 1 " + ex.toString());
			}//try

		ResultSet resultSet = null;
		ResultSetMetaData metaData = null; 
	
		try{
				resultSet = statement.executeQuery(sqlStatement);
				metaData = resultSet.getMetaData();
			}catch (SQLException ex){
				throw new Exception ("dbs query 2 " + ex.toString());
			}//try

		Vector rows = new Vector();
		try{
			while (resultSet.next() == true){
				Vector columns = new Vector();
				for (int i = 0; i < metaData.getColumnCount(); i++){
					columns.addElement((resultSet.getObject(i+1)));
				}//for
				rows.addElement(columns);
				}//while
				columnNames.clear();
				columnTypes.clear();
				for (int i = 0; i < metaData.getColumnCount(); i++){
				columnNames.addElement(metaData.getColumnName(i+1));
				columnTypes.put(metaData.getColumnName(i+1),metaData.getColumnTypeName(i+1));			
				}//for
				resultSet.close();
				statement.close();
				return rows;
			}catch (SQLException ex){
				throw new Exception ("dbs query 3 " + ex.toString());
			}//try
	}//executeQuery

	

	public boolean executeUpdate(String sqlStatement) throws Exception{
		boolean result = executeUpdateProcess(sqlStatement);
		if (!result){
			System.out.println("reconnect");
			getConnection();
			result = executeUpdateProcess(sqlStatement);
		}//endif    
		return result;    	
	}//executeUpdate	

	public boolean executeUpdateProcess(String sqlStatement) throws Exception {
		Statement statement = null;
		try{
			statement = dbConnection.createStatement();
		}catch (SQLException ex){
			throw new Exception ("dbs update 1 " + ex.toString());
		}//try	
		try{
			statement.executeUpdate(sqlStatement);
			statement.close();
			return true;
		}catch (SQLException ex){
			throw new Exception ("dbs update 2 " + ex.toString());
		}//try
	}//executeUpdateProcess

	public void close() throws Exception{
		try{
			dbConnection.close();
		}catch (SQLException ex){
			throw new Exception ("dbs close  " + ex.toString());
		}//try
	}//close
	
	public Hashtable getColumnTypes(){
		return(columnTypes);
	}//getColumnTypes
	
	public Vector getColumnNames(){
		return(columnNames);
	}//getColumnNames
	public String getDbSchema() {
		return dbSchema;
	}//getDbSchema

}//class selinasDatabase





