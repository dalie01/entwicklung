/**
 * <h6>Normalizing a Path</h6>
 * <p>The normalize() method returns a new Path, and will<br/>
 * 		<b>return</b> a Path with redundant name <b>elements eliminated</b>.
 * 	<br/>	
 * 		Path f1 = Paths.get("dire\\dire1\\dire2\\Execute.txt");
 * <br/> 
 * 		Path f2 = Paths.get("dire\\dire1\\dire2\\dire3\\Execute.txt");
 * <br/>
 * 		Path f3 ? f1.normaliz 
 * </p>
 * 
 * <ul>
 * 	<li>'.' returns the current directory</li>
 * 	<li>'..' returns the parent directory</li>
 * </ul>
 * @author dalie.de
 *
 */
package dalieOCP.filesPathAndPaths.path.normalizingAPath;
