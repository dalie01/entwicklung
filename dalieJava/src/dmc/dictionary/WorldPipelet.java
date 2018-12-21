package dmc.dictionary;

import java.util.Dictionary;

/**
 * a class for demonstration to use a java.util.dictionary
 *
 * @version 	1.00 13.12.2010 um 22:04:19
 * @author 		DV0101
 * 
 * */
public class WorldPipelet implements Pipelet {
	/* WorldPipelet: demonstration java.util.dictionary  */

	WorldPipelet(){
		init();
	}//WorldPipelet
	
	@Override
	public void execute(Dictionary<Object,Object> dict) {
		dict.put("World", "World");
	}//execute

	@Override
	public void init() {
		System.out.println("INIT: " + this.getClass().getName());
	}//init

}//class WorldPipelet
