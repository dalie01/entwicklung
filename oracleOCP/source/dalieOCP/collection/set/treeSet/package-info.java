/**
 * <h6>TreeSet</h6>
 * 
 * <p>
 * In the absence of passing a Comparator instance to a TreeSet
 * constructor, the objects that you add to a TreeSet must implement
 * Comparable.<br/> 
 * In the Execute example, String (which implements Comparable) <br/>
 * objects are added to the TreeSet.<br/> 
 * Watch out for storing objects of wrapper classes, Enum and File in a TreeSet; they all implement
 * Comparable.<br/>
 * The natural order of enum constants is the order in which they’re declared.<br/>
 * StringBuffer and StringBuilder don’t implement Comparable.
 * </p>
 * 
 * @author dalie.de
 *
 */
package dalieOCP.collection.set.treeSet;