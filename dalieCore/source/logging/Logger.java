/*
 * Created of DAliE on 11.08.2015 21:56:46
 *
 * Filename	  Logger.java
 */
package logging;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Level;


/**
 * Logger Log based of Log4j.
 * 
 * @author dalieuwe
 * @since 1.0.0.0
 *
 */
public class Logger {

	private static Properties property = new Properties();
	public static org.apache.log4j.Logger log = getLogger();
	
	
	static {
		try {
			property.load(new FileInputStream(
					System.getProperty("user.dir") + 
						File.separator + "resource" + 
							File.separator + "log4j.properties"));
			
			log = org.apache.log4j.Logger.getLogger(
					property.getProperty("log4j.org.domain"));

		} catch (Exception e) {
			System.out.println("Please allocate " 
					+ System.getProperty("user.dir") + 
						File.separator + "resource" + 
							File.separator + "log4j.properties" + 
								" with Key = log4j.org.domain");
		}// catch
		
	}

	public static org.apache.log4j.Logger getLogger() {
		if (log == null) {
		
			log = org.apache.log4j.Logger.getLogger(Logger.class.getName());
		}//endif
		
		return log;
	} /* Logger */
	
	/**
	 * Log as Info on occurrence by failed process.
	 * @param th Throwable with throw Mistake
	 */
	public static void log(Throwable th) {
		getLogger().log(Level.INFO, th);
	} /* log */
	
	/**
     * Log as Info expansive Object.
     * 
     * @param o class defined class in which the occured is
     * @param methodName Method Name to identify
     * @param th Throwable
     */
    public static void log(Object o, Throwable th) {
      getLogger().log(Level.INFO, o.getClass().getName() + "." + th.getStackTrace()[0].getMethodName(), th);
    }
    
    
    /**
     * Log as Error expansive Object.
     * 
     * @param o class defined class in which the occured is
     * @param methodName Method Name to identify
     * @param th Throwable
     */
    public static void error(Object o, String methodName, Throwable th) {
        getLogger().error(o.getClass() + "." + methodName, th);
    }
    
    /**
	 * Log Info occurrence by process.
	 * 
	 * @param message 
	 */
	public static void info(String message) {
		getLogger().log(Level.INFO, message);
	} 
	
	/**
	 * Log Info occurrence by process.
	 * 
	 * @param message 
	 */
	public static void info(Object message) {
		getLogger().log(Level.INFO, message);
	} 
}
