/**
 * <h6>Intrinsic Look that needs to be shared between different threads.</h6>
 * 
 * <p>In Java, an intrinsic lock is implied by each use of the synchronized keyword.</p>
 * 
 * <p>Each use of the synchronized keyword is associated with one of the two types of intrinsic lock:</p>
 * <ul>
 * 	<li>an "instance lock", attached to a single object</li>
 * 	<li>a "static lock", attached to a class</li>
 * </ul>
 * 
 * <p>Acquiring the instance lock only blocks other threads from invoking a synchronized instance method; <br/>
 * it does not block other threads from invoking an un-synchronized method, <br/>
 * nor does it block them from invoking a static synchronized method.</p>
 * 
 * <p>Similarly, acquiring the static lock only blocks other threads from invoking a static synchronized method; <br/>
 * it does not block other threads from invoking an un-synchronized method, <br/>
 *  nor does it block them from invoking a synchronized instance method.</p>
 *  
 *  <p>Outside of a method header, synchronized(this) acquires the instance lock.</p>
 *  
 *  <p>The static lock can be acquired outside of a method header in two ways:</p>
 *  <ul>
 *   <li>synchronized(Blah.class), using the class literal</li>
 *   <li>synchronized(this.getClass()), if an object is available</li>
 *  <ul>
 * 
 * 
 * @author dalie.de
 *
 */
package dalieOCP.concurrency.locks.intrinsicLock;