/*
 * Created of DV0101 on 06.08.2009 12:02:44
 *
 * Filename	  EscapeSequenz.java
 */
package escapeSequenz;

/**
 * Es gibt für diese speziellen Zeichen sogenante Escape-Sequenzen. 
 * <br><br>
 * Darzustellendes Zeichen	Escape-Sequenz
 *	Tabulator						\t <br>
 *	Linefeed						\n <br>
 *	Carriage Return (Enter-Taste)	\r <br>
 *	Form Feed						\f <br>
 *	Backspace (Rücktaste)			\b <br>
 *	Apostroph						\' <br>
 *	Anführungszeichen				\" <br>
 *	Unicode-Zeichen					 <br>
 *	Oktal-Zeichen					\NNN <br>
 *	Backslash						\\ <br>
 * <br>
 * <b>eBook:</b> Java ist auch eine Insel<br> 
 * Kapitel 4 Umgang mit Zeichenketten<br>
 * @version 	1.00 06.08.2009 um 12:02:44
 * @author 		DV0101
 * <br><br>
 */
public class EscapeSequenz {

    
    public static void main(String[] args) {
        
        System.out.println("Tabulator: \tdanach");
        System.out.println("Linefeed: \ndanach");
        System.out.println("Carriage Return: \rdanach");
        System.out.println("Backspace: \bdanach");
        System.out.println("Apostroph: \'");
        System.out.println("Anführungszeichen: \"");
        System.out.println("Unicode-Zeichen: \u00A9");
        System.out.println("Oktal-Zeichen: \251");
        System.out.println("Backslash: \\");
	
    }//main
}//class EscapeSequenz
