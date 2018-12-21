/**
 * <h6>Formating with printf() and format()</h6>
 * <ul>
 * 	<li>both java.io.PrintStream</li>
 * </ul>
 * <br/>
 * <h6>%[arg_index$] [flags] [width] [.precision] conversion char</h6>
 * <ul>
 * 	<li>required elements the % and a conversion character</li>
 * 	<li>[] optional</li>
 * 	<li><b>arg_index$</b> represents the number of argument <br/>
 * 		An integer followed directly by a $, this indicates which <br/> 
 * 		argument should be printed in this position. </li>
 * 	<li><b>flags</b>
 * 	 	<ul>
 * 			<li>- Left-justify this argument</li>
 * 			<li>+ Include a sign(+ or -) with this argument</li>
 * 			<li>0 Pad this argument with zeros</li>
 * 			<li>, Use local-specific grouping separators (i.e. the comma in 123,345)</li>
 * 			<li>( Enclose negative number in parentheses</li>
 * 		</ul>
 * </li>
 * 	<li><b>width</b> minimum number of character to print.<br/>(if you want nice, even columns, you'll use this)</li>
 * 	<li><b>precision</b> indicates the number of digits to print after the decimal point
 * 		<ul>
 * 			<li>b boolean</li>
 * 			<li>c char</li>
 * 			<li>d integer</li>
 * 			<li>f floating point</li>
 * 			<li>s string</li>
 * 		</ul>
 * </li>
 * </ul>
 * <h6>System.out.printf("%1$+-,20.2f %2$,.3f",f1 ,f2);</h6>
 * <ul>
 * 	<li>% required</li>
 * 	<li>1 identifier of argument (f1)</li>
 * 	<li>$ in depends of identifier</li>
 * 	<li>+- = include + or -</li>
 * 	<li>, = grouping 100.000,00</li>
 * 	<li>20 = output minimum 20 characters</li>
 * 	<li>.2 precision 2 after comma</li>
 * 	<li>f conversion to floating point required</li>
 * </ul>
 */
package dalieOCP.parsingTokenizingFormating.formating;