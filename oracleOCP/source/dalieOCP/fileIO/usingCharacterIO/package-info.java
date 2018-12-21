/**
 * <h6>Using character I/O with readers and writers</h6>
 * 
 * <p>
 * 	Reader and Writer are abstract base classes for reading and writing Unicode compliant
 * character data. They don’t replace the byte-oriented I/O classes, but supplement them.
 * </p>
 * <p>
 * 	Classes Reader and Writer handle 16-bit Unicode well, which isn’t supported by the
 * byte-oriented InputStream and OutputStream classes. Also note that Java’s primitive
 * data type char stores 16-bit Unicode values. Even though you can use InputStream
 * and OutputStream to read and write characters, you should use the character-oriented
 * Reader and Writer classes to read and write character data. Internationalization is
 * possible only by using 16-bit Unicode values. Also Reader and Writer classes offer
 * faster I/O operations.
 * </p>
 * 
 * @author dalie.de
 *
 */
package dalieOCP.fileIO.usingCharacterIO;