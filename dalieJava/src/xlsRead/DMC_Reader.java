package xlsRead;

import java.io.FileInputStream;

public class DMC_Reader {

	public static void main(String[] args) {
		
		String fileName = System.getProperty("user.dir") + "\\xlsRead\\RoamingDB.xls";
		
		try {
			XLSRoamingParser roaming = new XLSRoamingParser(new FileInputStream(fileName));
			roaming.parse();
			roaming.determineGroupVOs();
			roaming.determineRegionVOs();
			roaming.determineCountryVOs();
			roaming.determineOperatorVO();
			roaming.determineRoamingVOs();
		    
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}//main
	
}//class DMC_Reader
