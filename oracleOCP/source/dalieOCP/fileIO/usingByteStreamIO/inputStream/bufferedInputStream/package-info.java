/**
 * <h6>java.io.BufferedInputStream</h6>
 * 
 * <p>
 * 	The BufferedInputStream class provides buffering to your input streams. 
 * 	Buffering can speed up IO quite a bit.<br/> 
 *  Rather than read one byte at a time from the network or disk, the BufferedInputStream 
 *  reads a larger block at a time into an internal buffer.<br> 
 *  When you read a byte from the BufferedInputStream you are therefore reading it from its internal buffer.<br>
 *  When the buffer is fully read, the BufferedInputStream reads another larger block of data into the buffer.<br>
 *  This is typically much faster than reading a single byte at a time from an InputStream, 
 *  especially for disk access and larger data amounts. 
 * </p>
 * 
 * @author dalie.de
 *
 */
package dalieOCP.fileIO.usingByteStreamIO.inputStream.bufferedInputStream;