package org.howard.edu.lsp.finalExam;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MapUtilitiesJunit {
	HashMap<String, String> map1= new HashMap<>();
	HashMap<String, String> map2= new HashMap<>();
	HashMap<String, String> map3= new HashMap<>();
	
	
	
    @Test
    @DisplayName("Test if All keys are Common ")
    public void testCommonKeys() throws MapUtilitiesException {
    	map1.put("Alice","Healthy");
		map1.put("Mary","Ecastic");
		map1.put("Bob","Happy");
		map1.put("Chuck","Fine");
		map1.put("Felix","Sick");
		
		
		map2.put("Alice","Healthy");
		map2.put("Mary","Ecastic");
		map2.put("Bob","Happy");
		map2.put("Chuck","Fine");
		map2.put("Felix","Sick");
		
		assertEquals(5, MapUtilities.commonKeyValuePairs(map1,map2));

}
    
    @Test
    @DisplayName("Test for two equal keys ")
    public void testfortwoequalkey() throws MapUtilitiesException {
    	map1.put("Alice","Healthy");
		map1.put("Mary","Ecastic");
		map1.put("Bob","Happy");
		map1.put("Chuck","Fine");
		map1.put("Felix","Sick");
		
		
		map2.put("Alice","Healthy");
		map2.put("Mary","Ecastic");
		map2.put("Jamie","Upset");
		map2.put("Macey","Okay");
		map2.put("Jamie","Bored");
		
		assertEquals(2, MapUtilities.commonKeyValuePairs(map1,map2));
		
	

}
    
    
    @Test
    @DisplayName("Test for no common pairs")
    public void nocommonpairs() throws MapUtilitiesException {
    	map1.put("Alice","Healthy");
		map1.put("Mary","Ecastic");
		map1.put("Bob","Happy");
		map1.put("Chuck","Fine");
		map1.put("Felix","Sick");
		
		
		
		map2.put("Joe","Angry");
		map2.put("Dave","Upset");
		map2.put("Demetria","Confused");
		map2.put("Dia","Okay");
		map2.put("Jackson","Flustered");
		
		
		assertEquals(0, MapUtilities.commonKeyValuePairs(map1,map2));

}
    
    @Test
    @DisplayName("Empty Hash Maps")
    public void emptyhashmaps() throws MapUtilitiesException {
    	
    	map1.put("Alice","Healthy");
		map1.put("Mary","Ecastic");
		map1.put("Bob","Happy");
		map1.put("Chuck","Fine");
		map1.put("Felix","Sick");
		
		
    	map3.put("Alice","Healthy");
		map3.put("Mary","Ecastic");
		map3.clear();
		
		
		
		assertEquals(0, MapUtilities.commonKeyValuePairs(map1,map3));

}
    
   
  
//
}
