/**
 * <h6>File Navigation and IO</h6>
 * 
 * <table border="1" style="border-collapse: collapse;">
 * 	<tr><th>java.io.Class</th><th>Extends From</th><th>Key Constructor</th><th>Key Methods</th></tr>
 * 	<tr><td>File</td><td>Object</td><td>File, String<br/>String<br/>String,String</td><td>createNewFile()<br/>delete()<br/>exist()<br/>isDirectory()<br/>isFile()<br/>list()<br/>mkdir()<br/>renameTo()</td></tr>
 * 	<tr><td>FileWriter</td><td>Writer</td><td>File<br/>String</td><td>close()<br/>flush()<br/>write()<br/></td></tr>
 * 	<tr><td>BufferedFileWriter</td><td>Writer</td><td>Writer</td><td>close()<br/>flush()<br/>newLine()<br/>write()<br/></td></tr>
 * 	<tr><td>PrintWriter</td><td>Writer</td><td>File<br/>String<br/>OutputStream<br/>Writer<br/></td><td>close()<br/>flush()<br/>format(),printf()<br/>print(),println()<br/>write()<br/></td></tr>
 * 	<tr><td>FileReader</td><td>Reader</td><td>File<br/>String</td><td>read()<br/></td></tr>
 * 	<tr><td>BufferedReader</td><td>Reader</td><td>Reader</td><td>read()<br/>newLine()<br/></td></tr>
 * </table>
 * 
 * 
 * <p>java.io.Stream classes are used to read and write <b>bytes</b>, and <br>
 *  	java.io.Reader(s) and java.io.Writer(s) are used to read and write <b>characters.</b></p>
 * <ul>
 * 	<li><b>java.io.File</b> 
 * 		<br>says that the File is "an abstract representation of file and directory pathnames"
 * 		<br>The File class isn't used to actually read or write data;
 * 		<br>it's used to work a higher level, making new empty files, searching for files, deleting files,
 * 		<br>making directories and working with paths.  
 * 	</li>
 *  <li><b>java.io.FileReader</b>
 *  	<br>This class is used to read characters files. Its read() methods are fairly low level
 *  	<br>allowing you to read single characters, the whole stream of characters, or a fixed number of characters
 *  	<br>FileReaders are usually wrapped by higher-level objects such as BufferedReaders, 
 *  	<br>which improve performance and provide more convenient ways to work with data. 
 *  </li>
 *  <li><b>java.io.BufferedReader</b>
 *  	<br>This class is used to make lower-level Reader class like FileReader
 *  		more efficient and easier to use.
 *  	<br>Compared to FileReaders, BufferedReader read relatively large chunks
 *  	<br> of data a file at once and keep this data in buffer,
 * 		<br>file-writing operations are faster
 * 		<br>provides a newLine() method
 * 	 <li><b>java.io.PrintWriter</b>
 * 		<br>extends the Writer
 * 		<br>is more powerful and flexible then Writer 
 * 		<br>provides method like format(), printf() or append()
 *   </li>
 *   <li><b>java.io.Console</b>
 *   	<br>provides methods to read input from the console and
 *   	<br>write formatted output to the console output.
 *   </li>
 *  </li>
 * </ul>
 * 
 * @author dalieuwe
 *
 */
package dalieOCP.fileIO;