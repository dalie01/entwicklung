package zoudalie;

import static java.lang.System.out;

import org.apache.commons.lang.StringEscapeUtils;

public class HelloWorld {
	
	public static void main(String[] args) {
		out.print(StringEscapeUtils.escapeHtml("L'indirizzo 1 � obbligatorio. Si prega di indicare una strada. Inserisci una citt� o APO/FPO."));
	}

}
