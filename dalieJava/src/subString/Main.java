package subString;

import org.apache.commons.lang3.StringUtils;

public class Main {

	public static void main(String[] args) {
		String pageUrl = "MobileApp?Page=LANGUAGE-TAB";
		String DN_PAGE_URL = "Page";
		String result = null;
		result = StringUtils.substring(pageUrl,((pageUrl.indexOf("="))+1), pageUrl.length());
		if (StringUtils.contains(pageUrl , DN_PAGE_URL)) {
			
		}
		System.out.println(result + ":" + ((pageUrl.indexOf("="))+1) + ";" + ((pageUrl.length())-1));
		
	}
}
