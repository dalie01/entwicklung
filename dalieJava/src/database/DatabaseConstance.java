package database;

public interface DatabaseConstance {
	
	public static final int initialSize = 0;    // The initial number of connections that are created when the pool is started. Since: 1.2
	public static final int maxActive = 8;      // The maximum number of active connections that can be allocated from this pool at the same time, or negative for no limit.
	public static final int maxIdle = 8;        // The maximum number of connections that can remain idle in the pool, without extra ones being released, or negative for no limit.
	public static final int minIdle = 0;        // The minimum number of connections that can remain idle in the pool, without extra ones being created, or zero to create none.
	public static final int maxWait = -1;       // The maximum number of milliseconds that the pool will wait (when there are no available connections) for a connection to be returned before throwing an exception, or -1 to wait indefinitely.

	public static final String  validationQuery = "SELECT 1";                   // The SQL query that will be used to validate connections from this pool before returning them to the caller. If specified, this query MUST be an SQL SELECT statement that returns at least one row.
	public static final boolean testOnBorrow = true;                            // The indication of whether objects will be validated before being borrowed from the pool. If the object fails to validate, it will be dropped from the pool, and we will attempt to borrow another. NOTE - for a true value to have any effect, the validationQuery parameter must be set to a non-null string.
	public static final boolean testOnReturn = false;                           // The indication of whether objects will be validated before being returned to the pool. NOTE - for a true value to have any effect, the validationQuery parameter must be set to a non-null string.
	public static final boolean testWhileIdle = false;                          // The indication of whether objects will be validated by the idle object evictor (if any). If an object fails to validate, it will be dropped from the pool. NOTE - for a true value to have any effect, the validationQuery parameter must be set to a non-null string.
	public static final int     timeBetweenEvictionRunsMillis = -1;             // The number of milliseconds to sleep between runs of the idle object evictor thread. When non-positive, no idle object evictor thread will be run.
	public static final int     numTestsPerEvictionRun = 3;                     // The number of objects to examine during each run of the idle object evictor thread (if any).
	public static final long    minEvictableIdleTimeMillis = 1000 * 60 * 30;    // The minimum amount of time an object may sit idle in the pool before it is eligable for eviction by the idle object evictor (if any).
	public static final String  connectionInitSqls = "";                             // A Collection of SQL statements that will be used to initialize physical connections when they are first created. These statements are executed only once - when the configured connection factory creates the connection.

}
