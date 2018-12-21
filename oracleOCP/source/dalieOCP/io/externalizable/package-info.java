/**
 * <h6>Interface Externalizable</h6>
 * 
 * <p>
 * 	 If you want restricted serialization or don't want some portion<br/>
 * 	 of your object to be serialized then use Externalizable.<br/> 
 * 	 The Externalizable interface extends the Serializable interface<br/> 
 * 	 and adds two methods, writeExternal() and readExternal().<br/> 
 *   These are automatically called while serialization or deserialization.<br/> 
 *   While working with Externalizable we should remember that the default constructor<br/> 
 *   should be public else the code will throw exception.
 * 
 * </p>
 * 
 * @author dalieuwe
 *
 */
package dalieOCP.io.externalizable;