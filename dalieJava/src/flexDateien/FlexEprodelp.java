/*
 * Autor dv0101 <br> Date of creation: 03.03.2008 <br> File FlexEprodelp.java
 * <br> State Geramany
 *  
 */
package flexDateien;

import java.util.Vector;

import flex.Database;

public class FlexEprodelp {

    private String protnr; //produktNr
    private String procod; //produktCode
    private String protyp; //produktTyp
    private String pronam; //produktName
    private String proean; //eanNr
    private String prokds; //kurzBezeichung
    private String prolds; //langBezeichung
    private String prolif; //lieferNummer
    private int prommg; //lieferMenge
    private int prosta; //mengenStaffel
    private int probeh; //bestellEinheit
    private int provep; //verpackungsMenge
    private int propeh; //preisMenge
    private String proieh; //inhaltEinheit
    private int prolze; //lieferZeit
    private int prowfl; //workflow
    private String prolik; //proBild
    private float proopr; //preis o_mwst
    private float prompr; //preis m_mwst
    private String provva; //variationVater
    private String prokre; //kapitelRefcode
    private String prozol; //taxNummer
    private String pronex; //nexMartArtikel
    private String proonl; //onlineStatus
    private String proost; //oderStatus 25
    private String prokey; //produktKey			
    private String proode; //internerCode						
    private int proseq;	//interneSeqNr	
    private Vector columnNames = new Vector();

    public FlexEprodelp() {
    }//FlexEprodelp

    public FlexEprodelp(Vector colum) {
        protnr = colum.elementAt(0).toString();
        procod = colum.elementAt(1).toString();
        protyp = colum.elementAt(2).toString();
        pronam = colum.elementAt(3).toString();
        proean = colum.elementAt(4).toString();
        prokds = colum.elementAt(5).toString();
        prolds = colum.elementAt(6).toString();
        prolif = colum.elementAt(7).toString();
        prommg = Integer.parseInt(colum.elementAt(8).toString());
        prosta = Integer.parseInt(colum.elementAt(9).toString());
        probeh = Integer.parseInt(colum.elementAt(10).toString());
        provep = Integer.parseInt(colum.elementAt(11).toString());
        propeh = Integer.parseInt(colum.elementAt(12).toString());
        proieh = colum.elementAt(13).toString();
        prolze = Integer.parseInt(colum.elementAt(14).toString());
        prowfl = Integer.parseInt(colum.elementAt(15).toString());
        prolik = colum.elementAt(16).toString();
        proopr = Float.parseFloat(colum.elementAt(17).toString());
        prompr = Float.parseFloat(colum.elementAt(18).toString());
        provva = colum.elementAt(19).toString();
        prokre = colum.elementAt(20).toString();
        prozol = colum.elementAt(21).toString();
        pronex = colum.elementAt(22).toString();
        proonl = colum.elementAt(23).toString();
        proost = colum.elementAt(24).toString();
        prokey = colum.elementAt(25).toString();
        proode = colum.elementAt(26).toString();
        proseq = Integer.parseInt(colum.elementAt(27).toString());
    }//FLEXEprodelp

    public Vector read(Database con) throws Exception {
        Vector liste = new Vector();
        Vector rows = con.executeQuery("select * from " + con.getDbSchema()
                + ".eprodelp");
        this.columnNames = con.getColumnNames();
        for (int i = 0; i < rows.size(); i++) {
            liste.addElement(new FlexEprodelp((Vector) rows.elementAt(i)));
        }//for
        return liste;
    }//read

    public Vector getColumnNames() {
        return (columnNames);
    }//getColumnNames

    /**
     * @return Returns the probeh.
     */
    public int getProbeh() {
        return probeh;
    }

    /**
     * @param probeh
     *            The probeh to set.
     */
    public void setProbeh(int probeh) {
        this.probeh = probeh;
    }

    /**
     * @return Returns the procod.
     */
    public String getProcod() {
        return procod;
    }

    /**
     * @param procod
     *            The procod to set.
     */
    public void setProcod(String procod) {
        this.procod = procod;
    }

    /**
     * @return Returns the proean.
     */
    public String getProean() {
        return proean;
    }

    /**
     * @param proean
     *            The proean to set.
     */
    public void setProean(String proean) {
        this.proean = proean;
    }

    /**
     * @return Returns the proieh.
     */
    public String getProieh() {
        return proieh;
    }

    /**
     * @param proieh
     *            The proieh to set.
     */
    public void setProieh(String proieh) {
        this.proieh = proieh;
    }

    /**
     * @return Returns the prokds.
     */
    public String getProkds() {
        return prokds;
    }

    /**
     * @param prokds
     *            The prokds to set.
     */
    public void setProkds(String prokds) {
        this.prokds = prokds;
    }

    /**
     * @return Returns the prokre.
     */
    public String getProkre() {
        return prokre;
    }

    /**
     * @param prokre
     *            The prokre to set.
     */
    public void setProkre(String prokre) {
        this.prokre = prokre;
    }

    /**
     * @return Returns the prolds.
     */
    public String getProlds() {
        return prolds;
    }

    /**
     * @param prolds
     *            The prolds to set.
     */
    public void setProlds(String prolds) {
        this.prolds = prolds;
    }

    /**
     * @return Returns the prolif.
     */
    public String getProlif() {
        return prolif;
    }

    /**
     * @param prolif
     *            The prolif to set.
     */
    public void setProlif(String prolif) {
        this.prolif = prolif;
    }

    /**
     * @return Returns the prolik.
     */
    public String getProlik() {
        return prolik;
    }

    /**
     * @param prolik
     *            The prolik to set.
     */
    public void setProlik(String prolik) {
        this.prolik = prolik;
    }

    /**
     * @return Returns the prolze.
     */
    public int getProlze() {
        return prolze;
    }

    /**
     * @param prolze
     *            The prolze to set.
     */
    public void setProlze(int prolze) {
        this.prolze = prolze;
    }

    /**
     * @return Returns the prommg.
     */
    public int getPrommg() {
        return prommg;
    }

    /**
     * @param prommg
     *            The prommg to set.
     */
    public void setPrommg(int prommg) {
        this.prommg = prommg;
    }

    /**
     * @return Returns the prompr.
     */
    public float getPrompr() {
        return prompr;
    }

    /**
     * @param prompr
     *            The prompr to set.
     */
    public void setPrompr(float prompr) {
        this.prompr = prompr;
    }

    /**
     * @return Returns the pronam.
     */
    public String getPronam() {
        return pronam;
    }

    /**
     * @param pronam
     *            The pronam to set.
     */
    public void setPronam(String pronam) {
        this.pronam = pronam;
    }

    /**
     * @return Returns the pronex.
     */
    public String getPronex() {
        return pronex;
    }

    /**
     * @param pronex
     *            The pronex to set.
     */
    public void setPronex(String pronex) {
        this.pronex = pronex;
    }

    /**
     * @return Returns the proonl.
     */
    public String getProonl() {
        return proonl;
    }

    /**
     * @param proonl
     *            The proonl to set.
     */
    public void setProonl(String proonl) {
        this.proonl = proonl;
    }

    /**
     * @return Returns the proopr.
     */
    public float getProopr() {
        return proopr;
    }

    /**
     * @param proopr
     *            The proopr to set.
     */
    public void setProopr(float proopr) {
        this.proopr = proopr;
    }

    /**
     * @return Returns the proost.
     */
    public String getProost() {
        return proost;
    }

    /**
     * @param proost
     *            The proost to set.
     */
    public void setProost(String proost) {
        this.proost = proost;
    }

    /**
     * @return Returns the propeh.
     */
    public int getPropeh() {
        return propeh;
    }

    /**
     * @param propeh
     *            The propeh to set.
     */
    public void setPropeh(int propeh) {
        this.propeh = propeh;
    }

    /**
     * @return Returns the prosta.
     */
    public int getProsta() {
        return prosta;
    }

    /**
     * @param prosta
     *            The prosta to set.
     */
    public void setProsta(int prosta) {
        this.prosta = prosta;
    }

    /**
     * @return Returns the protnr.
     */
    public String getProtnr() {
        return protnr;
    }

    /**
     * @param protnr
     *            The protnr to set.
     */
    public void setProtnr(String protnr) {
        this.protnr = protnr;
    }

    /**
     * @return Returns the protyp.
     */
    public String getProtyp() {
        return protyp;
    }

    /**
     * @param protyp
     *            The protyp to set.
     */
    public void setProtyp(String protyp) {
        this.protyp = protyp;
    }

    /**
     * @return Returns the provep.
     */
    public int getProvep() {
        return provep;
    }

    /**
     * @param provep
     *            The provep to set.
     */
    public void setProvep(int provep) {
        this.provep = provep;
    }

    /**
     * @return Returns the provva.
     */
    public String getProvva() {
        return provva;
    }

    /**
     * @param provva
     *            The provva to set.
     */
    public void setProvva(String provva) {
        this.provva = provva;
    }

    /**
     * @return Returns the prowfl.
     */
    public int getProwfl() {
        return prowfl;
    }

    /**
     * @param prowfl
     *            The prowfl to set.
     */
    public void setProwfl(int prowfl) {
        this.prowfl = prowfl;
    }

    /**
     * @return Returns the prozol.
     */
    public String getProzol() {
        return prozol;
    }

    /**
     * @param prozol
     *            The prozol to set.
     */
    public void setProzol(String prozol) {
        this.prozol = prozol;
    }

    /**
     * @param columnNames
     *            The columnNames to set.
     */
    public void setColumnNames(Vector columnNames) {
        this.columnNames = columnNames;
    }
    /**
     * @return Returns the prokey.
     */
    public String getProkey() {
        return prokey;
    }
    /**
     * @param prokey The prokey to set.
     */
    public void setProkey(String prokey) {
        this.prokey = prokey;
    }
    /**
     * @return Returns the proode.
     */
    public String getProode() {
        return proode;
    }
    /**
     * @param proode The proode to set.
     */
    public void setProode(String proode) {
        this.proode = proode;
    }
    /**
     * @return Returns the proseq.
     */
    public int getProseq() {
        return proseq;
    }
    /**
     * @param proseq The proseq to set.
     */
    public void setProseq(int proseq) {
        this.proseq = proseq;
    }
}//class FlexEprodelp
