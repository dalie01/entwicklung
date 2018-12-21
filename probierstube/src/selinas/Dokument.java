package selinas;

import help.HelpDate;

import java.util.Vector;

public class Dokument {

	/** KundenNummer des Dokuments  */
	private int kundenId;//KundenNr = 04711
	/** StandortId */
	private int standortId;//Standort 1 zu Kunde 07411
	/** DokuemtenTyp Typ z.b. Arbeitsanweisung */
	private String typ;//Arbeitsanweisung
	/** Nummer des Dokuments */
	private int nummer;//dokumentNr
	/** DokumentenId */
	private int id;//Id des Dokuments

	/** Beschreibt den dokumentenStatus (A)ktiv/(I)naktiv */
	private String status;//Status aktiv/inaktiv
	/** Titel */
	private String titel;//Titel des Dokuments
	/** kurze Beschreibung vom Dokument */
	private String descripten;//Beschreibung des Dokument
	/** Textinhalt vom Dokument */
	private String content;//Inhalt Longtext
	/** Gliederung */
	private String gliederung;//Gliederung 1.1 oder 1.2 freiwählbar
	/** Aufbewahrungsort vom Dokument */
	private String archiv; //Keller oder Tresor
	/** Lagerdauer vom Aufbewahrungsort */
	private String archivDate;// default is heute + 1 Jahr
	/** Vorgabefunktion */
	private String vorgabe; //Ja/nein
	/** SprachId des Dokuments */
	private String sprachId;//Sprachschlüssel des Dokuments

	/** Kennzeichen des User der Dokument erstellt hat */
	private String createUserId;//DV0101 AnmeldeKennnung am System
	/** Timestamp der Erstellung */
	private String createDate;//Datum der Erstellung
	/** Kennzeichen des User der letzten Aenderung */
	private String changeUserId;//DV0101 AnmeldeKennnung am System
	/** Timestamp der letzten Aenderung */
	private String changeDate;//Datum der letzten Änderung

	/**
	 *<b>Dokument</b><br><br>
	 * private String typ<br>
	 * private int nummer<br>
	 * private int Id<br>
	 * private String status<br>
	 * private String titel<br>
	 * private String descripten<br>
	 * private String content<br>
	 * private String gliederung<br>
	 * private String archiv<br>
	 * private String archivDate<br>
	 * private String vorgabe<br>
	 * private String sprachId<br>
	 * private String createUser<br>
	 * private String createDate<br>
	 * private String changeUser<br>
	 * private String changeDate<br>
	 */
	public Dokument() {
	}//Dokument

	public Dokument(Vector columns) throws Exception {

		this.kundenId = Integer.parseInt(columns.elementAt(0).toString());
		this.standortId = Integer.parseInt(columns.elementAt(1).toString());
		this.typ = columns.elementAt(2).toString();
		this.nummer = Integer.parseInt(columns.elementAt(3).toString());
		this.id = Integer.parseInt(columns.elementAt(4).toString());

		this.status = columns.elementAt(5).toString();
		this.titel = columns.elementAt(6).toString();
		this.descripten = columns.elementAt(7).toString();
		this.content = columns.elementAt(8).toString();
		this.gliederung = columns.elementAt(9).toString();
		this.archiv = columns.elementAt(10).toString();
		this.archivDate = HelpDate.getTT_MM_JJJJ_HHMMSSDB(columns.elementAt(11)
				.toString());
		this.vorgabe = columns.elementAt(12).toString();
		this.sprachId = columns.elementAt(13).toString();

		this.createUserId = columns.elementAt(14).toString();
		this.createDate = HelpDate.getTT_MM_JJJJ_HHMMSSDB(columns.elementAt(15)
				.toString());
		this.changeUserId = columns.elementAt(16).toString();
		this.changeDate = HelpDate.getTT_MM_JJJJ_HHMMSSDB(columns.elementAt(17)
				.toString());

	}// Dokument

	public int getKundenId() {
		return kundenId;
	}

	public void setKundenId(int kundenId) {
		this.kundenId = kundenId;
	}

	public int getStandortId() {
		return standortId;
	}

	public void setStandortId(int standortId) {
		this.standortId = standortId;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getDescripten() {
		return descripten;
	}

	public void setDescripten(String descripten) {
		this.descripten = descripten;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getGliederung() {
		return gliederung;
	}

	public void setGliederung(String gliederung) {
		this.gliederung = gliederung;
	}

	public String getArchiv() {
		return archiv;
	}

	public void setArchiv(String archiv) {
		this.archiv = archiv;
	}

	public String getArchivDate() {
		return archivDate;
	}

	public void setArchivDate(String archivDate) {
		this.archivDate = archivDate;
	}

	public String getVorgabe() {
		return vorgabe;
	}

	public void setVorgabe(String vorgabe) {
		this.vorgabe = vorgabe;
	}

	public String getSprachId() {
		return sprachId;
	}

	public void setSprachId(String sprachId) {
		this.sprachId = sprachId;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getChangeUserId() {
		return changeUserId;
	}

	public void setChangeUserId(String changeUserId) {
		this.changeUserId = changeUserId;
	}

	public String getChangeDate() {
		return changeDate;
	}

	public void setChangeDate(String changeDate) {
		this.changeDate = changeDate;
	}

	

}//class Dokument

