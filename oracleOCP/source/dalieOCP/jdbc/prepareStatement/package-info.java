/**
 * <h6>PreparedStatement</h6>
 * 
 * <p>PreparedStatements as are precompiled.<br/>
 * 	Reducing execution time.<br>
 * 	The preparedStatement object is constructed before<br>
 * 	we final execute the query. Parameters passed into query<br/>
 *  are referred to as IN parameters.<br/>
 *  (placeholder character, a question mark ?)   	
 * </p>
 * 
 * <p>
 * The database parses, compiles, and performs query optimization on the SQL statement.
 *	Compared to executing SQL statements directly, prepared statements have two main advantages:</p>
 *
 * <ul>
 *	<li>Prepared statements reduces parsing time as the preparation on the query is done only 
 *	once (although the statement is executed multiple times)</li>
 *	<li>Bound parameters minimize bandwidth to the server as you need send only 
 *	the parameters each time, and not the whole query</li>
 *	<li>Prepared statements are very useful against SQL injections, because 
 *	parameter values, which are transmitted later using a different protocol, 
 *	need not be correctly escaped. If the original statement template is not 
 *	derived from external input, SQL injection cannot occur.</li>
 * </ul>
 * 
 * @author dalie.de
 *
 */
package dalieOCP.jdbc.prepareStatement;