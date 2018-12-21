/*
 * Created on 02.12.2009
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author DV0101
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Test {
	public static void main(String[] args) {
		Teil[] tarr= { new Teil("4-01-001","Pumpe"),new Teil("0-45-070","Lager"),new Teil("3-71-101","Bohrer")};
		Map map= new HashMap(); // eine Map, siehe 4.2.5
		for (int i=0;i<tarr.length;i++)
			//Teil unter Schlüssel teil.id ablegen
			map.put(tarr[i].id,tarr[i]);
		
		tarr= null; // kann zerstört werden
		//Teil mit Schlüssel "0-45-070" holen
		Teil teil= (Teil) map.get("0-45-070");
		System.out.println(teil.id+": "+teil.bez);
		
		for(Iterator it = map.entrySet().iterator(); it.hasNext(); ) {

			Map.Entry mapEntry = (Map.Entry)it.next();
			String key = (String)mapEntry.getKey();
    
			if (mapEntry.getValue() == null 
                    && map.containsKey(key)) {
        
				map.remove(key);

			}
		}
    		
		map= null; // kann zerstört werden
		//...
		
		}//main
}//class Test
