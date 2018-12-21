/**
 * <h6>FilterStream</h6>
 * The <code>java.io</code> package provides a set of abstract classes that define<br> 
 * and partially implement <i>filter streams</i>.<br/> 
 * A filter stream filters data as it's being read from or written to the stream. The filter streams are 
 * <code>FilterInputStream</code>or
 * <code>FilterOutputStream</code>,<code>FilterInputStream</code>
 * <code>FilterOutputStream</code>.<br/>
 * A filter stream is constructed on another stream (the <i> underlying</i> stream). The <code>read</code> method in a readable  filter stream reads input from the underlying stream, filters it, and passes on the filtered data to the caller. The <code> write</code> method in a writable filter stream filters the data  and then writes it to the underlying stream. The filtering done  by the streams depends on the stream. Some streams buffer the data, some count data as it goes by, and others convert data to another form. 
 * <p>
 * Most filter streams provided by the <code>java.io</code> package  are subclasses of <code>FilterInputStream</code> and <code> FilterOutputStream</code> and are listed here:
 * </p>
 * <ul>
 * 	<li><code>DataInputStream</code> and <code>DataOutputStream</code></li>
 * <li><code>BufferedInputStream</code> and <code>BufferedOutputStream</code></li>
 * <li><code>LineNumberInputStream</code></li>
 * <li><code>PushbackInputStream</code></li>
 * <li><code>PrintStream</code> (This is an output stream.)</li><
 * /ul>
 * 
 * @author dalie.de
 *
 */
package dalieOCP.fileIO.filterStream;