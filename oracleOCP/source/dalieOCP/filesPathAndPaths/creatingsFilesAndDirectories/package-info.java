/**
 * <table border="1" style="border-collapse: collapse;">
 * 	<tr><th>Description</th><th>I/O Approach</th><th>NIO.2 Approach</th></tr>
 * 	<tr><td>Create an empty Directory</td><td>File file = new File("dir");<br/>file.mkdire();</td><td>Path path = Paths.get("a/b");<br/>Files.createDirecotries(path)</td></tr>
 * 	<tr><td>Create an empty File</td><td>File file = new File("\test.txt");<br/>file.createNewFile();</td><td>Path path = Paths.get("\test.txt");<br>Files.createFile(path);</td></tr>
 * 	<tr><td>Create a directory,including<br/> any missing parent directories</td><td>File file = new File("a/b/c");<br/>file.mkdirs();</td><td>Path path = Paths.get("a/b/c");<br/>Files.createDirectories(path);</td></tr>
 *  <tr><td>Check if a file or an directory exist</td><td>File file = new File("test");<br/>file.exist();</td><td>Path path = new Paths.get("test");<br/>Files.exist(path);</td></tr>
 * </table>
 * @author dalie.de
 *
 */
package dalieOCP.filesPathAndPaths.creatingsFilesAndDirectories;