/**
 * <h6>Working with Dates,Numbers and Currencies</h6>
 * 
 * <ul>
 * 	<li><b>java.util.Date</b><br>
 * 		<ul>
 * 			<li>bridge between Calendar and DateFormate class</li>
 * 			<li>instance of Date represents a mutable date and time, to a millisecond </li>
 * 			<li>Date d = new Date(); create a Date <br> String d = d.toString(); get a String value</li>
 * 		</ul>
 * </li>
 * 	<li><b>java.util.Calender</b><br>
 * 		<ul>
 * 			<li>huge variety of methods to convert and manipulate dates and times</li>
 * 			<li>Calendar c = new Calendar().getInstance() <br> Calendar c = new Calendar().getInstance(new Locale()); </li>
 * 		</ul>
 * </li>
 * <li><b>java.text.DateFormat</b><br>
 * 		<ul>
 * 			<li>is used to format dates such as styles </li>
 * 			<li>also dates for numerous locales</li>
 * 		</ul>
 * </li>
 * <li><b>java.text.NumberFormat</b><br>
 * 		<ul>
 * 			<li>to format numbers an currencies </li>
 * 			<li>also dates for numerous locales</li>
 * 		</ul>
 * </li>
 *  	<li><b>java.util.Locale</b><br>
 * 		<ul>
 * 			<li>is used in conjunction with DateFormate and NumberFormat and Currencies</li>
 * 			<li>new <b style="color:red">Locale</b>("language", "country"); <br> new Locale("language")</li>
 * 		</ul>
 * </li>
 * </ul>
 *
 */
package dalieOCP.dateNumberCurrencies;