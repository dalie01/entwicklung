/**
 * <h6>Protect shared data</h6>
 * 
 * <p><b>Thread Safe</b> Making your applications thread safe means<br/> 
 * securing your shared data so that it stores correct data, <br/>
 * even when it’s accessed by multiple threads.</p>
 * 
 * <p>
 * 	A thread releases the lock on an object monitor after it exits a
 *  synchronized method, whether due to successful completion or due to an
 *  exception.  
 *  <br/><a href="http://www.artima.com/insidejvm/ed2/threadsynch.html">please see</a>
 * </p>
 * 
 * <ul>
 * 	<li><b>synchronized methods</b>
 * 		<ul>
 * 			<li>First, it is not possible for two invocations of synchronized methods on the same object to interleave. When one thread is executing a synchronized method for an object, all other threads that invoke synchronized methods for the same object block (suspend execution) until the first thread is done with the object.</li>
 * 			<li>Second, when a synchronized method exits, it automatically establishes a happens-before relationship with any subsequent invocation of a synchronized method for the same object. This guarantees that changes to the state of the object are visible to all threads.<br/><br/></li>	
 *			<li>A thread releases the lock on an object monitor after it exits a synchronized method, whether due to successful completion or due to an exception.<br/><br/></li>
 *			<li>Note that <b>constructors cannot be synchronized</b> — using the synchronized keyword with a constructor is a <b>syntax error</b>.</li> 
 * 		</ul>
 * </li>
 * </ul>
 * 
 * @author dalieuwe
 *
 */
package dalieOCP.threating.sharedData;