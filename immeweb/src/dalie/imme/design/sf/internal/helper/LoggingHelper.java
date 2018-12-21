package dalie.imme.design.sf.internal.helper;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingHelper {

	 private static Logger logger;

	    /**
	     * get Logger-Instant.
	     * 
	     * @return Logger-Instant of Typ <code>Logger</code>
	     */
	    private static Logger getLogger() {
	      if (logger == null) {
	        logger = Logger.getLogger("help");
	      }//endif
	      return logger;
	    }//getLogger

	    /**
	     * logged messages.
	     * 
	     * @param th
	     *          <code>Throwable</code> with triggered Message
	     */
	    public static void log(Throwable th) {
	      getLogger().log(Level.SEVERE, null, th);
	    }//log

	    /**
	     * Logged Error, to identify which class and method is thrown error.
	     * 
	     * @param className identify class
	     * @param methodName identify method
	     * @param th errorLog
	     */
	    public static void log(String className, String methodName, Throwable th) {
	      getLogger().logp(Level.SEVERE, className, methodName, null, th);
	    }//log
}
