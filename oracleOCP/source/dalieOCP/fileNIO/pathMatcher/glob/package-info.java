/**
 * <table border="1" style="border-collapse: collapse;">
 * 	<tr><th>Watch to Match</th><th>In a Glob</th><th>In a Regular Expression</th><tr>
 * 	<tr><td>Zero or more of any character, including a directory boundary</td><td>**</td><td>.*</td></tr>
 * 	<tr><td>Zeor or more fo any character, not including a directory boundary</td><td>*</td><td>N/A</td></tr>
 *	<tr><td>Exactly one character</td><td>?</td><td>.</td></tr>
 *	<tr><td>Any digit</td><td>[0-9]</td><td>[0-9]</td></tr>
 *	<tr><td>Begins with cat or dog</td><td>{cat, dog}*</td><td>(cat|dog).*</td></tr>
 * </table>
 * @author dalie.de
 *
 */
package dalieOCP.fileNIO.pathMatcher.glob;