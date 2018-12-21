/*
 * Created on 01.03.2007
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package flexDateien;

import java.util.Vector;

import flex.Database;


/**
 * @author DV0101 <U>Dalies, Uwe</U>
 * @version 1.0: <B>Hallo</B>
 * <BR><BR>  
 */
public class FlexCusmasb {

    private String cusno = ""; //Customer number
    private String cusnm = ""; //Alpha sort name
    private String cusa1 = ""; //CUSTOMER ADDRESS 1
    private String cusa2 = ""; //CUSTOMER ADDRESS 2
    private String cusa3 = ""; //CUSTOMER ADDRESS 3
    private String cusa4 = ""; //CUSTOMER ADDRESS 4
    private String cctyn = ""; //CUSTOMER country name
    private String zipcd = ""; //Zip Code
    private String kydekr = ""; //Debitor/Kreditor
    private String lancd = ""; //Language code
    
    
    public FlexCusmasb(){
    }//FlexCusmasb
    public FlexCusmasb( Vector columns){
        cusno = columns.elementAt(0).toString();
        cusnm = columns.elementAt(1).toString();
        cusa1 = columns.elementAt(2).toString();
        cusa2 = columns.elementAt(3).toString();
        cusa3 = columns.elementAt(4).toString();
        cusa4 = columns.elementAt(5).toString();
        cctyn = columns.elementAt(6).toString();
        zipcd = columns.elementAt(7).toString();
        kydekr = columns.elementAt(8).toString();
        lancd = columns.elementAt(9).toString();
    }//FlexCusmasb
    
    
    public Vector read(Database con) throws Exception {
		Vector liste = new Vector();
		System.out.println("select cusno,cusnm,cusa1,cusa2,cusa3,cusa4,cctyn,zipcd,kydekr,landcd from "+ con.getDbSchema() +".cusmasb");
		Vector rows = con.executeQuery("select cusno,cusnm,cusa1,cusa2,cusa3,cusa4,cctyn,zipcd,kydekr,lancd from "+ con.getDbSchema() +".cusmasb");
		for (int i = 0; i < rows.size(); i++){
			liste.addElement(new FlexCusmasb((Vector) rows.elementAt(i)));
		}//for
		return liste;
    }//read
    
    
    /**
     * @return Returns the cctyn Customer country name.
     */
    public String getCctyn() {
        return cctyn;
    }
    /**
     * @param cctyn The cctyn to set Customer country name.
     */
    public void setCctyn(String cctyn) {
        this.cctyn = cctyn;
    }
    /**
     * @return Returns the cusa1 Customer address 1.
     */
    public String getCusa1() {
        return cusa1;
    }
    /**
     * @param cusa1 The cusa1 to set Customer address 1.
     */
    public void setCusa1(String cusa1) {
        this.cusa1 = cusa1;
    }
    /**
     * @return Returns the cusa2 Customer address 2.
     */
    public String getCusa2() {
        return cusa2;
    }
    /**
     * @param cusa2 The cusa2 to set Customer address 2.
     */
    public void setCusa2(String cusa2) {
        this.cusa2 = cusa2;
    }
    /**
     * @return Returns the cusa3 Customer address 3.
     */
    public String getCusa3() {
        return cusa3;
    }
    /**
     * @param cusa3 The cusa3 to set Customer address 3.
     */
    public void setCusa3(String cusa3) {
        this.cusa3 = cusa3;
    }
    /**
     * @return Returns the cusa4 Customer address 4.
     */
    public String getCusa4() {
        return cusa4;
    }
    /**
     * @param cusa4 The cusa4 to set Customer address 5.
     */
    public void setCusa4(String cusa4) {
        this.cusa4 = cusa4;
    }
    /**
     * @return Returns the cusnm Alpha sort name.
     */
    public String getCusnm() {
        return cusnm;
    }
    /**
     * @param cusnm The cusnm to set Alpha sort name.
     */
    public void setCusnm(String cusnm) {
        this.cusnm = cusnm;
    }
    /**
     * @return Returns the cusno Customer Number.
     */
    public String getCusno() {
        return cusno;
    }
    /**
     * @param cusno The cusno to set Customer Number.
     */
    public void setCusno(String cusno) {
        this.cusno = cusno;
    }
    /**
     * @return Returns the kydekr Debitor/Kreditor.
     */
    public String getKydekr() {
        return kydekr;
    }
    /**
     * @param kydekr The kydekr to set Debitor/Kreditor.
     */
    public void setKydekr(String kydekr) {
        this.kydekr = kydekr;
    }
    /**
     * @return Returns the landcd Language Code.
     */
    public String getLancd() {
        return lancd;
    }
    /**
     * @param landcd The landcd to set Language Code.
     */
    public void setLandcd(String lancd) {
        this.lancd = lancd;
    }
    /**
     * @return Returns the zipcd Zip Code.
     */
    public String getZipcd() {
        return zipcd;
    }
    /**
     * @param zipcd The zipcd to set Zip Code.
     */
    public void setZipcd(String zipcd) {
        this.zipcd = zipcd;
    }
}//class FlexCusmasb
