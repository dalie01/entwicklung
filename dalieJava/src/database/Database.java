package database;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.sql.DataSource;

import org.apache.commons.dbcp.ConnectionFactory;
import org.apache.commons.dbcp.DriverManagerConnectionFactory;
import org.apache.commons.dbcp.PoolableConnectionFactory;
import org.apache.commons.dbcp.PoolingDataSource;
import org.apache.commons.pool.impl.GenericObjectPool;



public class Database implements DatabaseConstance {
	
	private static Properties property = new Properties();
	private static Database factory = null;

	private ConnectionFactory cF = null;
    private GenericObjectPool<?> cP = null;

    private boolean defaultAutoCommit = true;   // The default auto-commit state of connections created by this pool.
    private boolean defaultReadOnly;            // The default read-only state of connections created by this pool. If not set then the setReadOnly method will not be called. (Some drivers don't support read only mode, ex: Informix)
    
	private Connection dbConnection = null;
	private DataSource dataSource = null; 
	
    private Map<Object,Object> columnTypes = new HashMap<Object,Object>();
    private Set<String> columnNames = new HashSet<String>();
    private String dbType;
    private String dbHost;
    private String dbSchema;
    private String user;
    private String password;

	static {
		String pfaddatei = System.getProperty("user.dir")
				+ "/resources/database.properties";
		try {
			property.load(new FileInputStream(pfaddatei));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}// catch
	}// static
	
	 /**
     * @param String
     *            dbType = Database Type e.g. mySql or as400 <br>
     * @param String
     *            dbHost = Database Host is valid is IP-Address or Domain <br>
     * @param String
     *            dbSchema = Database Schema e.g. mySql = e.g flex or bei
     *            as400 = FLEXDX Bibliothek <br>
     * @param String
     *            user = Database User z.B. DV0101
     * @param String
     *            password = Password for Database Access
     * */
    public Database(String dbType, String dbHost, 
    		String dbSchema, String user, String password) {
        this.dbType = dbType;
        this.dbHost = dbHost;
        this.dbSchema = dbSchema;
        this.user = user;
        this.password = password;
        
    } /* Database */
    
    private Database(final String dbType) {
    	this.dbType = dbType;
    	this.dbHost = property.getProperty("dbHost");
        this.dbSchema = property.getProperty("dbSchema");
        this.user = property.getProperty("user");
        this.password = property.getProperty("password");
    
    } /* Database */
    
    /** getInstace to retrieve a Instance to Database */
    public static Database getInstance(final String dbType) {
    	
    	if (factory == null) {
    		factory = new Database(dbType);
    	}
    	
    	return factory;
    
    } /* getInstace */

    /** getInstace to retrieve a Instance to Database */
	public static Database getInstance(final String dbType, 
			final String dbHost, final String dbSchema, 
			final String user, final String password) {
		
		if (factory == null) {
			factory = new Database(dbType, dbHost, dbSchema, user,password);
		}
		
		return factory;
		
	} /* getInstace */
    

    public void setUp() throws Exception {
        
        if (dbType.equals("mySql")) {
        	Class.forName("com.mysql.jdbc.Driver").newInstance();
            
        	if (dbHost.length() == 0) {
                dbHost = "localhost";
            }//endif
            
        	cF = new DriverManagerConnectionFactory("jdbc:mysql://"
                    + dbHost + "/" + dbSchema, user, password);
        	
        }//endif
        
        if (dbType.equals("as400")) {
            Class.forName("com.ibm.as400.access.AS400JDBCDriver").newInstance();
        
            if (dbHost.length() == 0) {
                dbHost = "localhost";
            }//endif
            
            cF = new DriverManagerConnectionFactory("jdbc:as400://"
            		+ dbHost + ";translate binary = true", user, password);
       
        }//endif
        
        GenericObjectPool.Config config = new GenericObjectPool.Config();
        config.maxActive = maxActive;   //150;
        config.maxIdle = maxIdle;       //100;
        config.minIdle = minIdle;       //30;
        config.maxWait = maxWait;       //1000;
        config.testOnBorrow = testOnBorrow;
        config.testOnReturn = testOnReturn;
        config.testWhileIdle = testWhileIdle;
        config.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
        config.numTestsPerEvictionRun = numTestsPerEvictionRun;
        config.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;

        cP = new GenericObjectPool(null, config);
       
        PoolableConnectionFactory pFactory =
            new PoolableConnectionFactory(
                    cF,cP,null,
                    validationQuery,defaultReadOnly,defaultAutoCommit);
       
        dataSource = new PoolingDataSource(cP);

    } //setupDataSource

    public List<List<Object>> executeQuery(final String sqlStatement) throws Exception {
    	List<List<Object>> result = executeQueryProcess(sqlStatement);
        return result;
    }//executeQuery

    private List<List<Object>> executeQueryProcess(final String sqlStatement) throws Exception {
        Statement statement = null;
        try {
        	dbConnection = dataSource.getConnection();
            statement = dbConnection.createStatement();
        } catch (Exception ex) {
            throw new Exception("dbs query 1 " + ex.toString());
        }//try

        ResultSet resultSet = null;
        ResultSetMetaData metaData = null;

        try {
            resultSet = statement.executeQuery(sqlStatement);
            metaData = resultSet.getMetaData();
        } catch (SQLException ex) {
            throw new Exception("dbs query 2 " + ex.toString());
        }//try


        List<List<Object>> rows = Collections.synchronizedList(new ArrayList<List<Object>>());
        try {
            while (resultSet.next() == true) {
            	List<Object> columns = new ArrayList<Object>();
            
            	for (int i = 0; i < metaData.getColumnCount(); i++) {
                    columns.add((resultSet.getObject(i + 1)));
                } /* for */
                rows.add(columns);
                
            } /* while */
            
            columnNames.clear();
            columnTypes.clear();
            
            for (int i = 0; i < metaData.getColumnCount(); i++) {
                columnNames.add(metaData.getColumnName(i + 1));
                columnTypes.put(metaData.getColumnName(i + 1), metaData
                        .getColumnTypeName(i + 1));
            } /* for */
            
            resultSet.close();
            statement.close();
            
            return rows;
            
        } catch (SQLException ex) {
            throw new Exception("executeQueryProcess: " + ex.toString());
        
        }//try
        
    }//executeQuery

    public boolean executeUpdate(final String sqlStatement) throws Exception {
        boolean result = executeUpdateProcess(sqlStatement);
        return result;
    } /* executeUpdate */

    
    private boolean executeUpdateProcess(final String sqlStatement) throws Exception {
        Statement statement = null;
        
        try {	
            statement = dbConnection.createStatement();
        
        } catch (SQLException ex) {
            throw new Exception("executeUpdateProcess: " + ex.toString());
        
        }
        
        try {
            statement.executeUpdate(sqlStatement);
            
            if (statement != null) { 				
            	statement.close();
            }
            
            return true;
        
        } catch (SQLException ex) {
            throw new Exception("executeUpdateProcess: " + ex.toString());
        
        } 
        
    } /* executeUpdateProcess */

    /** connection of database to close. */
    public void close() throws Exception {
    	
    	if (dbConnection != null) {			
    		dbConnection.close();
		}
    	
    } /* close */

    /** @return Returns Map <b>columnTyp</b> from SQL-Statement.*/
    public Map<Object,Object> getColumnTypes() {
        return (columnTypes);
    } /* getColumnTypes */

    /** @return Returns Set <b>columnNames</b> from SQL-Statement.*/
    public Set<String> getColumnNames() {
        return (columnNames);
    } /* getColumnNames */

    /** @return Returns <b>Database Schema</b>*/
    public String getDbSchema() {
        return dbSchema;
    } /* getDbSchema */
    
} /* class Database */
