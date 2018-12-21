package dalieOCP.dateNumberCurrencies.numberFormat;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Execute {

	public static void main(String[] args){
		String line = "AAAAB11CDE";
		String pattern = "(\\d\\d)?";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(line);
		while(m.find()){
			System.out.println(m.start() + ";" + m.group() + ";" + m.end());
		}
	}
}
