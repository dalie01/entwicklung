package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;

public class DBTablePropertyRead {

	private static Properties property = new Properties();
	
	public static void main(String[] args) {
		String pfaddatei = System.getProperty("user.dir")
				+ "/src/test/LocalizedStrings.properties";
	try {
		property.load(new FileInputStream(pfaddatei));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}// catch
		for ( Entry<Object, Object> prop : property.entrySet()) {
			String key = prop.getKey().toString();
			String val = prop.getValue().toString();
			
			System.out.println(key.length() +":"+ key);
			System.out.println(val.length() +":"+ val);
		}
		
	}
	
} /* DBTablePropertyRead */
