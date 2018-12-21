/**
 * <h6>Factory</h6>
 * 
 * <p>Factory methods are static methods that return an instance of the native class.<br/>
 * Factory methods :<br/>
 * * have names, unlike constructors, which can clarify code.<br/>
 * * do not need to create a new object upon each invocation - objects can be cached and reused, if necessary.<br/>
 * * can return a sub type of their return type - in particular, can return an object <br/>
 *   whose implementation class is unknown to the caller. 
 *   This is a very valuable and widely used feature in many frameworks which use interfaces 
 *   as the return type of static factory methods.
 *   <br/><br/>
 *   The factory pattern (also known as the factory method pattern) is a creational design pattern.<br/>
 *   A factory is a Java class that is used to encapsulate object creation code.<br/>
 *   A factory class instantiates and returns a particular type of object based on data passed to the factory. <br/>
 *   The different types of objects that are returned from a factory typically are subclasses of a common parent class.<br/>
 *   The data passed from the calling code to the factory can be passed either when the factory is created <br/>
 *   or when the method on the factory is called to create an object. <br/>
 *   This creational method is often called something such as getInstance or getClass .<p>
 * 
 * @author dalie.de
 *
 */
package dalieOCP.pattern.factory;