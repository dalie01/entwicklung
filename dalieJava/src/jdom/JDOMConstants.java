package jdom;

public interface JDOMConstants
{
	// Konstanten f�r Elementnamen
	public static final String BUECHER_ELEMENT = "buecher";
	public static final String BUCH_ELEMENT = "buch";
	public static final String TITEL_ELEMENT = "titel";
	public static final String AUTOR_ELEMENT = "autor";
	public static final String VORNAME_ELEMENT = "vorname";
	public static final String NACHNAME_ELEMENT = "nachname";
	public static final String PREIS_ELEMENT = "preis";
	public static final String VERLAG_ELEMENT = "verlag";

	// Konstanten f�r das Schema-Instance-Attribut
	public static final String SCHEMA_INSTANCE_PREFIX = "xsi";
	public static final String SCHEMA_INSTANCE_URI = "http://www.w3.org/2001/XMLSchema-instance";

	// Konstante f�r Attributname
	public static final String JAHR_ATTRIBUT = "jahr";
	public static final String SCHEMA_LOCATION = "noNamespaceSchemaLocation";
	
	// Konstanten f�r das Element mit Pr�fix und Namensraum
	public static final String FOREIGN_ELEMENT = "foreign";
	public static final String FOREIGN_PREFIX = "f";
	public static final String FOREIGN_NAMESPACE = "http://wwww.javaundxml.de/foreign";

	// Konstante f�r einen Kommentar
	public static final String KOMMENTAR = "Ein wirklich tolles Buch!";
	
	// Konstante f�r die Einr�ckung der Navigationsausgabe
	public static final String INDENT = "    ";
	
	// Konstanten f�r Input-Dateien
	public static final String DOCUMENT = "data/books.xml";
	public static final String XSLT = "data/books.xslt";
	public static final String SCHEMA = "books.xsd";
}
