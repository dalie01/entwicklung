/**
 * <h6>File and Directory Attributes</h6>
 * 
 * <p>Read and change file and directory attributes <br/>
 * 	BasicFileAttributes, DosFileAttributes and PosixFileAttributes interfaces.
 * </p>
 * 
 * <table border="1" style="border-collapse: collapse;">
 * <tr><th>Description</th><th>IO Approach</th><th>NIO.2 Approach</th></tr>
 * <tr><td>Get the last modified date/time</td><td>File file = new File("test");<br/>file.lastModified();</td><td>Path path = Paths.get("test"); <br/>Files.getLastModifiedTime(path);</td></tr>
 * <tr><td>Is read permission set</td><td>File file = new File("test");<br/>file.canRead();</td><td>Path path = Paths.get("test"); <br/>Files.isReadable(path);</td></tr>
 * <tr><td>Is write permission set</td><td>File file = new File("test");<br/>file.canWrite();</td><td>Path path = Paths.get("test"); <br/>Files.isWriteable(path);</td></tr>
 * <tr><td>Is execute permission set</td><td>File file = new File("test");<br/>file.canExecute();</td><td>Path path = Paths.get("test"); <br/>Files.isExecuteable(path);</td></tr>
 * <tr><td>Set the last modified date/time</td><td>File file = new File("test");<br/>file.setLastModified(timeInMillis);</td><td>Path path = Paths.get("test"); <br/>FileTime fileTime = FileTime.fromMillis(timeInMillis)<br/>Files.setLastModifiedTime(path, fileTime);</td></tr>
 * </table>
 * @author dalie.de
 *
 */
package dalieOCP.filesAndDirectoryAttributes;