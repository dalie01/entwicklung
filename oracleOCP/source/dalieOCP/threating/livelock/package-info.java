/**
 * <h6>Livelock</h6>
 * 
 * <p>
 * 	A thread often acts in response to the action of another thread.<br/>
 *  If the other thread's action is also a response to the action of another thread,<br/>
 *  then livelock may result. As with deadlock, livelocked threads are unable to make further progress.<br/>
 *  However, the threads are not blocked — they are simply too busy responding to each other to resume work.<br/>
 *  This is comparable to two people attempting to pass each other in a corridor: <br/>
 *  Alphonse moves to his left to let Gaston pass, while Gaston moves to his right to let Alphonse pass.<br/>
 *  Seeing that they are still blocking each other, Alphone moves to his right, while Gaston moves to his left.<br/>
 *  They're still blocking each other, so...
 * </p>
 * @author dalie.de
 *
 */
package dalieOCP.threating.livelock;