package org.howard.edu.lsp.finalExam;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapUtilities {
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2)
    		throws MapUtilitiesException {
    
    	int count = 0; 
    	for (Map.Entry<String, String> mapElement: map1.entrySet()) {
    		String key = mapElement.getKey();
    		String val = mapElement.getValue();
    		if(map2.containsKey(key)) {
    			String compareVal = (map2.get(key));
    			if (val.equals(compareVal)) {
    				count ++;
    			}
    		}
    	}
    	return count; 
    		
    	} 
	}