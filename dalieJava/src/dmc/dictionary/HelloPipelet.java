package dmc.dictionary;

import java.util.Dictionary;


/**
 * a class for demonstration to use a java.util.dictionary
 *
 * @version 	1.00 13.12.2010 um 22:01:12
 * @author 		DV0101
 * 
 * */
public class HelloPipelet implements Pipelet{
	/* HelloPipelet: demonstration java.util.dictionary  */
	
	HelloPipelet(){
		init();
	}//HelloPipelet
	
	@Override
	public void execute(Dictionary<Object,Object> dict) {
		dict.put("Hello", "Hello");
	}//execute

	@Override
	public void init() {
		System.out.println("INIT: " + this.getClass().getName());
	}//init

}//HelloPipelet
