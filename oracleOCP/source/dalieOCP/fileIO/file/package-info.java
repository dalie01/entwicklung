/**
 * <h6>java.io.File</h6>
 * <ul>
 * 	<li><b>file.createNewFile()</b> this method created actually the file <br> 
 * 	<li><b>file.delete()</b> You can't delete a directory if it's not empty,<br/> 
 * 		or will get an error </li> 
 * 	<li><b>file.exsist()</b> returns true if file already exist<br/>
 * 		and returns true if file already exist
 * 	</li>
 * 	<li><b>file.isDirecotry()</b> Tests whether the file denoted by<br/> 
 * 		this abstract pathname is a directory. </li> 
 * 	<li><b>file.isFile()</b> true if the file path is a file, else false</li> 
 * 	<li><b>file.mkdir()</b> true if the directories was created, with all necessary parent directories; else false.</li> 
 * 	<li><b>file.renameTo()</b>You must given the existing File object<br/> 
 * 		a valid new File object with the new name that you want. It is okay<br/>
 * 		to rename a directory, even if it isn't empty.
 * </li> 
 * 	<li>always is required error handling by java.io.IOException</li>
 * </ul>
 * 
 * <p>File file new File("foo"); Never creates an actual file.<br/> 
 * There are two ways a create a File. <br/>
 * 1. Invoke the file.createNewFile() method<br/>
 * 2. Create a Writer or Stream. Whenever you create an instance of this classes <br/>
 * you automatically create a file, unless one already exists, for instance.<br/>
 * <b>Be careful</b> is not true for directories. </p>
 * 
 * @author dalieuwe
 *
 */
package dalieOCP.fileIO.file;