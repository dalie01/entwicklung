/**
 * <h6>Interface RowSetFactory</h6>
 * 
 * <p>The Interface <b><i>java.sql.rowset.RowSetFactory</i></b> defines <br/>
 *  the implementation of a factory that can be used to obtain <b>different</b> Types <br/>
 *  of <b><i>RowSet</b></i> implementations.  </p>
 * 
 * <ul>
 * 	<li><b>CachedRowSet</b> createCachedRowSet()</li>
 * 	<li><b>FilteredRowSet</b> createFilteredRowSet()</li>
 * 	<li><b>JdbcRowSet</b> createJdbcRowSet()</li>
 * 	<li><b>JoinRowSet</b> createJoinRowSet()</li>
 * 	<li><b>WebRowSet</b> createWebRowSet()</li>
 * </ul>
 * @author dalie.de
 *
 */
package dalieOCP.jdbc.rowSet.rowSetFactory;