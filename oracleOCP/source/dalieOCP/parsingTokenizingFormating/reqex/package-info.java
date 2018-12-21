/**
 * <p>
 * 	Class Matcher is an engine that interprets a Pattern and matches
 * 		it against a character sequence.
 * </p>
 * <p>
 * 	Search, parse, and replace strings by using regular expressions,<br/>
 * 	using expression patterns for matching limited to . (dot), * (star),<br/>
 *  + (plus), ?, \d, \D, \s, \S, \w, \W, \b, \B, [], ().<br/>
 *  <br/>
 *  It will throw a runtime exception (unchecked) <br/>
 *  <strong>PatternSyntaxExecption</strong> in case the regex pattern is in valid. 	
 * </p>
 *	<p>
 *	 	<a href="http://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html"><b>Summary of regular-expression</b></a>
 * </p>
 * 
 * <ul>
 *		<li><b>finding Stuff</b>
 *			<ul>
 *				<li>java.util.regex.Pattern;</li>
 *					<ul><li>to hold the representation of regex expression</li></ul> 
 *				<li>java.util.regex.Matcher;</li> 
 *					<ul>
 *						<li>is used to invoke the regex engine</li>
 *						<li>Matcher is to use the Pattern.matcher method(which takes String sourceData)</li>
 *						<li>Pattern p = Patter.comile(search)<br/>
 *							Matcher m = p.matcher method(which takes String sourceData)<br/>
 *							m.find() gets true if it matches<br/>
 *							while(m.find()){
 *								<br/>&nbsp;&nbsp; the <b>m.start()</b> to get the start position <br/>&nbsp;&nbsp;
 *								the <b>m.goup()</b> to get the start position <br/>&nbsp;&nbsp;
 *								the <b>m.end()</b> to get the end position <br/>
 *							}		
 *						</li>
 *					</ul>
 * 					<b>meta characters</b>
 *					<ul>
 * 						<li>\d digit(0-9) \D no digit(anything BUT 0-9)</li>
 * 						<li>\s whitespace character (e.g. space, \t, \n, \f, \r) \S non-whitespace character</li>
 * 						<li>\w A word character (letters (a– z and A– Z), digits, or the “_” [underscore]) 
 * 							<br>\W A non-word character (everything else)</li>
 * 						<li>\b A word “boundary” (ends of the string and between \w and not \w— more soon) 
 * 							<br>\B A non-word “boundary” (between two \w’s or two not \w’s)</li>
 *                      <li> in A+ the quantifier + applies to the character A</li>
 *                      <li> in \w* the quantifier * applies to the token \w</li>
 *                      <li> in carrots? the quantifier ? applies to the character s—not to carrots</li>
 *                      <li> in (?:apple,|carrot,)+ the quantifier + applies to the subexpression (?:apple,|carrot,)</li>
 *					</ul> 
 *               </li>
 *				<li>java.util.Scanner</li>
 *			</ul>
 *		</li>
 *</ul>
 */
package dalieOCP.parsingTokenizingFormating.reqex;