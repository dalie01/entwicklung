package dmc.dictionary;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Main {


	public static void main(String[] args) {
		Dictionary<Object,Object> dict = new Hashtable<Object, Object>();
		
		new HelloPipelet().execute(dict);
		dict.put("Test", "Test");
		new WorldPipelet().execute(dict);
			
		getDictionaryValue(dict);
		
	}//main
	
	static void getDictionaryValue(Dictionary<Object,Object> dict){
		final Enumeration<Object> keys = dict.keys();
		while (keys.hasMoreElements()){
			final Object key = keys.nextElement();
			final Object value = dict.get(key);
			System.out.println(key.toString() + value.toString());		
		}//while
	}//getDictionaryValue
}//Main
