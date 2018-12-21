/**
 * @author      UDA<br>
 * @version     1.0<br>
 * Date of creation:  28.02.2007<br>
 * File:         Database.java<br>
 * Modifier:     UDA<br>
 * State:        Germany<br>
 *
 */
package flex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;
import java.util.Vector;

import com.ibm.as400.access.AS400JDBCDriver;

/**
 * @author      UDA<br>
 * @version     1.0<br>
 * Date of creation:  28.02.2007<br>
 * File:         Database.java<br>
 * Modifier:     UDA<br>
 * State:        Germany<br>
 * 
 * Database baut Verbindung <b>getConnection()</b>zur Datenbank auf<br>
 * SQL-Statment Abfrage aus <b>executeQuery(String sqlStatement)</b><br>
 * SQL-Statment Update aus <b>executeUpdate(String sqlStatement)</b><br>
 * liefert im Vector die Datenmenge zurück.
 */
public class Database {

    private Connection dbConnection;

    private Hashtable columnTypes = new Hashtable();

    private Vector columnNames = new Vector();

    private String dbType;

    private String dbHost;

    private String dbSchema;

    private String user;

    private String password;

    /**
     * @param String
     *            dbType = DatenbankTyp also mySql oder as400 <br>
     * @param String
     *            dbHost = DatenbankHost also IP-Adresse oder Name im Netz <br>
     * @param String
     *            dbSchema = DatenbankSchema also mySql = z.B flex oder bei
     *            as400 = FLEXDX Bibliothek <br>
     * @param String
     *            user = DatenbankUser z.B. DV0101
     * @param String
     *            password = Password für Datenbankzugriff
     *  
     */
    public Database(String dbType, String dbHost, String dbSchema, String user,
            String password) {

        this.dbType = dbType;
        this.dbHost = dbHost;
        this.dbSchema = dbSchema;
        this.user = user;
        this.password = password;
    }//Database

    /**
     * Welcher DatenbankTyp wird wo mit welchem User und Passwort angsprochen!!<br>
     * IF dbType = mySql dbConnection =<br>
     * DriverManager.getConnection("jdbc:mysql://"+dbHost+"/"+dbSchema,user,password);
     * IF dbType = as400 dbConnection =<br>
     * DriverManager.getConnection("jdbc:as400://"+dbHost+";translate binary =
     * true",user,password);
     */
    public void getConnection() throws Exception {
        try {

            if (dbType.equals("mySql")) {
                Class.forName("com.mysql.jdbc.Driver");
                if (dbHost.length() == 0) {
                    dbHost = "localhost";
                }//endif
                dbConnection = DriverManager.getConnection("jdbc:mysql://"
                        + dbHost + "/" + dbSchema, user, password);
            }//endif
            if (dbType.equals("as400")) {
                DriverManager.registerDriver(new AS400JDBCDriver());
                dbConnection = DriverManager.getConnection("jdbc:as400://"
                        + dbHost + ";translate binary = true", user, password);
            }//endif

        } catch (Exception ex) {
            throw new Exception("dbs connect " + ex.toString());
        }//try
    }//getConnection

    public Vector executeQuery(String sqlStatement) throws Exception {
        Vector result = executeQueryProcess(sqlStatement);
        if (result == null) {
            System.out.println("reconnect");
            getConnection();
            result = executeQueryProcess(sqlStatement);
        }//endif
        return result;
    }//executeQuery

    public Vector executeQueryProcess(String sqlStatement) throws Exception {
        Statement statement = null;
        try {
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

        Vector rows = new Vector();
        try {
            while (resultSet.next() == true) {
                Vector columns = new Vector();
                for (int i = 0; i < metaData.getColumnCount(); i++) {
                    columns.addElement((resultSet.getObject(i + 1)));
                }//for
                rows.addElement(columns);
            }//while
            columnNames.clear();
            columnTypes.clear();
            for (int i = 0; i < metaData.getColumnCount(); i++) {
                columnNames.addElement(metaData.getColumnName(i + 1));
                columnTypes.put(metaData.getColumnName(i + 1), metaData
                        .getColumnTypeName(i + 1));
            }//for
            resultSet.close();
            statement.close();
            return rows;
        } catch (SQLException ex) {
            throw new Exception("dbs query 3 " + ex.toString());
        }//try
    }//executeQuery

    public boolean executeUpdate(String sqlStatement) throws Exception {
        boolean result = executeUpdateProcess(sqlStatement);
        if (!result) {
            System.out.println("reconnect");
            getConnection();
            result = executeUpdateProcess(sqlStatement);
        }//endif
        return result;
    }//executeUpdate

    public boolean executeUpdateProcess(String sqlStatement) throws Exception {
        Statement statement = null;
        try {
            statement = dbConnection.createStatement();
        } catch (SQLException ex) {
            throw new Exception("dbs update 1 " + ex.toString());
        }//try
        try {
            statement.executeUpdate(sqlStatement);
            statement.close();
            return true;
        } catch (SQLException ex) {
            throw new Exception("dbs update 2 " + ex.toString());
        }//try
    }//executeUpdateProcess

    /*
     * Datenbankverbindung wird geschlossen
     * */
    public void close() throws Exception {
        try {
            dbConnection.close();
        } catch (SQLException ex) {
            throw new Exception("dbs close  " + ex.toString());
        }//try
    }//close

    /**
     * @return Returns alle <b>feldTypen</b> vom SQL-Statment.
     */
    public Hashtable getColumnTypes() {
        return (columnTypes);
    }//getColumnTypes

    /**
     * @return Returns alle <b>feldNamen</b> vom SQL-Statment.
     */
    public Vector getColumnNames() {
        return (columnNames);
    }//getColumnNames

    /**
     * @return Returns <b>Datenbankschema</b>.
     */
    public String getDbSchema() {
        return dbSchema;
    }//getDbSchema

}//class Database
