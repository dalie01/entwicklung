/*
 * @author DV0101 on 21.01.2010 um 15:38:41 
 *
 * ReplaceInAString.java 
 * 
 * no Copyright
 */
package string;

/**
 * <b>Class</b>ReplaceInASring :<br>Only for Demonstration.<br>
 * 
 * @version 1.00 on 12.01.2010 um 15:38:41
 * @author dv0101
 * <br><br>
 * Ersetzt alle Vorkommen des Musters, <br> 
 * durch den String replacement.
 */
public class ReplaceInAString {
	/* used for demonstration of String.replaceAll */
	
	public static void main(String args[]){
		String htmlString = "<p>Eine <b>Open-Source-Lizenz</b> ist<br /> eine " +
				"<a class='mw-redirect' " +
				"title='Softwarelizenz' href=\"http://de.wikipedia.org/wiki/Softwarelizenz\">Softwarelizenz</a>, " +
				"die den Prinzipien der " +
				"<a title=\"Open Source Initiative\" href=\"http://de.wikipedia.org/wiki/Open_Source_Initiative\">Open Source Initiative</a> " +
				"folgt und aus diesem Grund den " +
				"<a title=\"Quelltext\" href=\"http://de.wikipedia.org/wiki/Quelltext\">Quelltext</a> " +
				"der Software zur Verf&uuml;gung stellt. " +
				"Eine Erweiterung der Open-Source-Lizenzen stellen die allgemeinen <b>Freien Lizenzen</b> dar, " +
				"die nicht nur <a title=\"Software\" href=\"http://de.wikipedia.org/wiki/Software\">Software</a>, " +
				"sondern auch <a title=\"Freie Inhalte\" href=\"http://de.wikipedia.org/wiki/Freie_Inhalte\">Freie Inhalte</a> " +
				"lizenzieren.</p>";
		System.out.println(htmlString.replaceAll("\\<.*?\\>", ""));
	}//main
	
}//class Replace
