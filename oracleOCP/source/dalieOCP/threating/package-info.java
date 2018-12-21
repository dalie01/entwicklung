/**
 * <h6>Threads class Thread & Interface Runnable</h6>
 * 
 * <p><a href="http://www.straub.as/java/threads/index.html">please see</a><p>
 * 
 * <ul>
 * 	<li>a Thread instance is a Java object</li>
 * 	<li>A thread of execution has its own set of program counter<br/>
 * 		(PC) registers to store the next set of instructions to execute.
 * 	</li>
 *  <li>It also has its own stack that stores method <br/> 
 *  	frames to store the state of a method invocation. <br/>
 *  	The state of a method invocation includes the value of local variables,<br/> 
 *  	method parameters, method return values, exception handler parameters, and intermediate values.
 *  </li>
 *  <li>Have you ever wondered how many threads your Java application has? At least one—the main thread. <br/>
 *  A JVM starts execution of a Java application using a thread of execution: main. <br/>
 *  This thread executes code defined in method main() and can create other threads of execution.
 *  </li>
 *  <li>Each thread is created with a priority. Its range varies from 1 to 10, with 1 being the lowest
 *  priority and 10 the highest priority. By default, a thread creates another thread with the
 *  same priority as its own. It can also be explicitly set for a Thread instance, using Thread’s
 *  method setPriority(int). A thread scheduler might choose to execute threads with
 *  higher priorities over threads with lower priorities, though you can’t guarantee it.
 *  </li>
 * </ul>
 * 
 * <p>
 * 	Even if you don’t create a multithreaded Java application, you
 * can’t ignore these concepts. Java technologies like swing in Core Java and
 * Servlets in web applications and many popular Java frameworks implicitly
 * multithread and call your code from multiple threads. Developing
 * safe code that works and behaves well in a multithreaded environment
 * demands knowledge about multithreading and synchronization.
 * </p>
 * 
 * @author dalieuwe
 *
 */
package dalieOCP.threating;