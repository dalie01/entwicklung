/**
 * <h6>Livecycle of a thread</h6>
 * 
 * <ul>
 * 	<li><b>NEW</b> - A thread that has been created but hasn't yet started is in this state.<br/><br/></li>
 * 	<li><b>RUNNABLE</b> -Thread state for a runnable thread. A thread in this state is executing in the JVM but it may be waiting for other resources from the OS, such as a processor.<br/><br/></li>
 * 	<li><b>BLOCKED</b> - A thread that’s blocked waiting for a monitor lock is in this state.<br/><br/></li>
 * 	<li><b>WAITING</b> - A thread that’s waiting indefinitely for another thread to perform a particular action is in this state.<br/><br/></li>
 *  <li><b>TIMED-WAITING</b> - A thread that’s waiting for another thread to perform an action for up to a specified waiting time is in this state.<br/><br/></li>
 *  <li><b>TERMINATED</b> - A thread whose run() method has finished is in this state (still a thread object but not a thread of execution).<br/><br/></li>
 * </ul>
 * 
 * <p>The states READY and RUNNING are together referred to as the RUNNABLE state.</p>
 * @author dalieuwe
 *
 */
package dalieOCP.threating.livecycle;