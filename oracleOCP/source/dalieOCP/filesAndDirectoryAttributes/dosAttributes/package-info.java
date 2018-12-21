/**
 * <h6>Group of Attributes: DOS Attributes</h6>
 * 
 * <p>DosFileAttributes and DosFileAttributeView—
 * The DosFileAttributes interface extends BasicFileAttributes 
 * and defines methods to access attributes specific to Windows files and directories. 
 * The DosFileAttributeView interface defines methods to modify the DOS file attributes.
 * 
 * <p>Only provided on Windows<br/>
 * 		<b>Files.readAttributes(path,DosFileAttributes.class)</b>to get all DOS Attributes<br/>
 * 	<b>Files.setAttribute(file, "dos:hidden", true);</b> to modify<br/>
 * 	If you <b>read/write</b> invalid Attributes it's throws a runtime exception ClassCastExeception
 * </p>
 * 
 * <ul><li>archive&nbsp;->&nbsp;is typical used by backup programs</li><li>hidden</li><li>read only</li><li>system&nbsp;->&nbsp;is file part of operation system</li></ul>
 * @author dalieuwe
 *
 */
package dalieOCP.filesAndDirectoryAttributes.dosAttributes;


