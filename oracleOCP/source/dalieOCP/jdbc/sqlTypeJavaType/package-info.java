/**
 * <h6>SQLTypes match to Java Type</h6>
 * 
 * <table border="1" style="border-collapse: collapse">
 * 	<tr><th>SQL Type</th><th>Java Type</th><th>ResultSet get methods</th></tr>
 * 	<tr><td>BOOLEAN</td><td>boolean</td><td>getBoolean(String columnName)<br/>getBoolean(int columnIndex)</td></tr>
 * 	<tr><td>INTEGER</td><td>int</td><td>getInt(String columnName)<br/>getInt(int columnIndex)</td></tr>
 * 	<tr><td>DOUBLE, FLOAT</td><td>double</td><td>getDouble(String columnName)<br/>getDouble(int columnIndex)</td></tr>
 *	<tr><td>REAL</td><td>float</td><td>getFloat(String columnName)<br/>getFloat(int columnIndex)</td></tr>
 *	<tr><td>BIGINT</td><td>long</td><td>getLong(String columnName)<br/>getLong(int columnIndex)</td></tr>
 *	<tr><td>CHAR,VARCHAR,<br/>LONGVARCHAR</td><td>String</td><td>getString(String columnName)<br/>getString(int columnIndex)</td></tr>
 *	<tr><td>DATE</td><td>java.sql.Date</td><td>getDate(String columnName)<br/>getDate(int columnIndex)</td></tr>
 *	<tr><td>TIME</td><td>java.sql.Time</td><td>getTime(String columnName)<br/>getTime(int columnIndex)</td></tr>
 *	<tr><td>TIMESTAMP</td><td>java.sql.Timestamp</td><td>getTimestamp(String columnName)<br/>getTimestamp(int columnIndex)</td></tr>
 *	<tr><td>Any of the above</td><td>java.lang.Object</td><td>getObject(String columnName)<br/>getObject(int columnIndex)</td></tr>
 * </table>
 * 
 * @author dalie.de
 *
 */
package dalieOCP.jdbc.sqlTypeJavaType;