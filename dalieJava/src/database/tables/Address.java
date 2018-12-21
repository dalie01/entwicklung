package database.tables;

import java.util.List;

public class Address {

	    /** AdresseId = KundenNr */
	    private int adressId = 0;//adressId = KundenNr 04711
	    /** AdressArt (U)ser,(R)erchnung oder (K)undenadresse */
	    private String adressArt = "";//adressArt = (U)ser,(R)echnungs oder (K)Kundenadresse
	    /** UserId */
	    private String userId = "";
	    /** Strasse */
	    private String strasse = "";//strasse Wilhelm Pieck Straße
	    /** Nummer der Strasse */
	    private String nummer = "";//nummer 16
	    /** PLZ vom Ort */
	    private String plz = "";//plz 6902
	    /** Ort */
	    private String ort = "";//ort Jena
	    /** Land */
	    private String land = "";//land DDR
	    /** Telefon */
	    private String telefon = "";//04711/4711
	    /** Fax */
	    private String fax = "";//04711/4799
	    /** @MailAdresse */
	    private String mail = "";//xyz@mailto.de
	    
	    /** Kennzeichen des User der Typ erstellt hat */
	    private String createUserId;//DV0101 AnmeldeKennnung am System
	    /** Timestamp der Erstellung */
	    private String createDate;//Datum der Erstellung
	    /** Kennzeichen des User der letzten Aenderung */
	    private String changeUserId;//DV0101 AnmeldeKennnung am System
	    /** Timestamp der letzten Aenderung */
	    private String changeDate;//Datum der letzten Änderung
	    
	    /**
	     * <b>Adresse</b><br><br>
	     * private String adressId<br>
	     * private String adressArt<br>
	     * private String strasse<br>
	     * private String nummer<br>
	     * private Strint ort<br>
	     * private String telefon<br>
	     * private String fax<br>
	     * private String mail<br>
	     */
	    public Address(){
	    }//Address
	    public Address(List<Object> columns){
	        this.adressId = Integer.parseInt(columns.get(0).toString());
	        this.adressArt = columns.get(1).toString();
	        this.userId = columns.get(2).toString();
	        this.strasse = columns.get(3).toString(); 
	        this.nummer = columns.get(4).toString();
	        this.plz = columns.get(5).toString();
	        this.ort = columns.get(6).toString();
	        this.land = columns.get(7).toString();
	        
	        this.telefon = columns.get(8).toString();
	        this.fax = columns.get(9).toString();
	        this.mail = columns.get(10).toString();
	        
	        this.createUserId = columns.get(11).toString();
	        this.createDate = columns.get(12).toString();
	        this.changeUserId = columns.get(13).toString();
	        this.changeDate = columns.get(14).toString();
	    }//Address
	    
	    
	        /**
	         * @return Returns the adressArt.
	         */
	        public String getAdressArt() {
	                return adressArt;
	        }
	        /**
	         * @param adressArt The adressArt to set.
	         */
	        public void setAdressArt(String adressArt) {
	                this.adressArt = adressArt;
	        }
	        /**
	         * @return Returns the adressId.
	         */
	        public int getAdressId() {
	                return adressId;
	        }
	        /**
	         * @param adressId The adressId to set.
	         */
	        public void setAdressId(int adressId) {
	                this.adressId = adressId;
	        }
	        /**
	         * @return Returns the changeDate.
	         */
	        public String getChangeDate() {
	                return changeDate;
	        }
	        /**
	         * @param changeDate The changeDate to set.
	         */
	        public void setChangeDate(String changeDate) {
	                this.changeDate = changeDate;
	        }
	        /**
	         * @return Returns the changeUserId.
	         */
	        public String getChangeUserId() {
	                return changeUserId;
	        }
	        /**
	         * @param changeUserId The changeUserId to set.
	         */
	        public void setChangeUserId(String changeUserId) {
	                this.changeUserId = changeUserId;
	        }
	        /**
	         * @return Returns the createDate.
	         */
	        public String getCreateDate() {
	                return createDate;
	        }
	        /**
	         * @param createDate The createDate to set.
	         */
	        public void setCreateDate(String createDate) {
	                this.createDate = createDate;
	        }
	        /**
	         * @return Returns the createUserId.
	         */
	        public String getCreateUserId() {
	                return createUserId;
	        }
	        /**
	         * @param createUserId The createUserId to set.
	         */
	        public void setCreateUserId(String createUserId) {
	                this.createUserId = createUserId;
	        }
	        /**
	         * @return Returns the fax.
	         */
	        public String getFax() {
	                return fax;
	        }
	        /**
	         * @param fax The fax to set.
	         */
	        public void setFax(String fax) {
	                this.fax = fax;
	        }
	        /**
	         * @return Returns the land.
	         */
	        public String getLand() {
	                return land;
	        }
	        /**
	         * @param land The land to set.
	         */
	        public void setLand(String land) {
	                this.land = land;
	        }
	        /**
	         * @return Returns the mail.
	         */
	        public String getMail() {
	                return mail;
	        }
	        /**
	         * @param mail The mail to set.
	         */
	        public void setMail(String mail) {
	                this.mail = mail;
	        }
	        /**
	         * @return Returns the nummer.
	         */
	        public String getNummer() {
	                return nummer;
	        }
	        /**
	         * @param nummer The nummer to set.
	         */
	        public void setNummer(String nummer) {
	                this.nummer = nummer;
	        }
	        /**
	         * @return Returns the ort.
	         */
	        public String getOrt() {
	                return ort;
	        }
	        /**
	         * @param ort The ort to set.
	         */
	        public void setOrt(String ort) {
	                this.ort = ort;
	        }
	        /**
	         * @return Returns the plz.
	         */
	        public String getPlz() {
	                return plz;
	        }
	        /**
	         * @param plz The plz to set.
	         */
	        public void setPlz(String plz) {
	                this.plz = plz;
	        }
	        /**
	         * @return Returns the strasse.
	         */
	        public String getStrasse() {
	                return strasse;
	        }
	        /**
	         * @param strasse The strasse to set.
	         */
	        public void setStrasse(String strasse) {
	                this.strasse = strasse;
	        }
	        /**
	         * @return Returns the telefon.
	         */
	        public String getTelefon() {
	                return telefon;
	        }
	        /**
	         * @param telefon The telefon to set.
	         */
	        public void setTelefon(String telefon) {
	                this.telefon = telefon;
	        }
	        /**
	         * @return Returns the userId.
	         */
	        public String getUserId() {
	                return userId;
	        }
	        /**
	         * @param userId The userId to set.
	         */
	        public void setUserId(String userId) {
	                this.userId = userId;
	        }
			@Override
			public String toString() {
				return "Address [adressId=" + adressId + ", adressArt="
						+ adressArt + ", userId=" + userId + ", strasse="
						+ strasse + ", nummer=" + nummer + ", plz=" + plz
						+ ", ort=" + ort + ", land=" + land + ", telefon="
						+ telefon + ", fax=" + fax + ", mail=" + mail
						+ ", createUserId=" + createUserId + ", createDate="
						+ createDate + ", changeUserId=" + changeUserId
						+ ", changeDate=" + changeDate + "]";
			}
	        
}//class Address
