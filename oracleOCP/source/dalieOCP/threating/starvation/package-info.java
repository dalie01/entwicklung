/**
 * <h6>Starvation</h6>
 * 
 * <p>
 * 	Starvation describes a situation where a thread is unable <br> to gain regular access to shared resources and is unable to make progress.<br/>
 *  This happens when shared resources are made unavailable for long periods by threads.<br/>
 *  For example, suppose an object provides a synchronized method that often takes a long time to return.<br/>
 *  If one thread invokes this method frequently, other threads that also need <br/> frequent synchronized access to the same object will often be blocked.
 * </p>
 * @author dalie.de
 *
 */
package dalieOCP.threating.starvation;