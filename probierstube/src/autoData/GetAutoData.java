package autoData;

public class GetAutoData {
	
	public static String writeDokumentHeaderToPageContext(String[] columnHeader) throws Exception {
	    String TableTRTH = "\"";   	
        	for(int i = 0; i < columnHeader.length; i++){
        		TableTRTH = TableTRTH + "\",\"" + columnHeader[i].toString();
        	}//for
	   return TableTRTH +"\"";
	}//writeDokumentHeaderToPageContext
	
	
}//class GetAutoData.java

