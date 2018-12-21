/**
 * <h6>Retrieving Information about a path</h6>
 * 
 * <p>The <tt>path</tt> interfaces defines a bunch of methods that return<br/>
 * 	useful information about the path.
 * </p>
 * 
 * <ul>
 * 	<li><b>Path.getFileName()</b> Returns the filename<br/>
 * 		 or the last element of the sequence of name elements. </li>
 * <li><b>Path.getName(int index)</b>Returns the path element<br/> 
 * 		corresponding to the specified index. (On Windows C:\ <br/>
 * 		and on UNIX the root is /.)</li>
 * <li><b>getNameCount()</b>Returns the number of elements in this path, <br/> 
 * 		excluding the root</li>
 * <li><b>getParent()</b>Returns the parent path, or null is haven't</li>
 * <li><b>getRoot()</b>Returns the root of path, or null is root</li>
 * <li><b>subPath(int beginIndex, int endIndex)</b>Returns a subsequence of this path</li>
 * <li><b>toString</b>Returns the string representation of this path.</li>
 * <li><b>Path.resolve()</b>To combine two Paths.</li>
 * <li><b>Path.relativize()</b>Find the same path content, and removed.</li>
 * </ul>
 * 
 * <p>the .. denote a parent directory; . denote this directory.</p>
 * @author dalie.de
 *
 */
package dalieOCP.filesPathAndPaths.path;