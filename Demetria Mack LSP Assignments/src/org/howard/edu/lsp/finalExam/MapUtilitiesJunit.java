package org.howard.edu.lsp.finalExam;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MapUtilitiesJunit {
	HashMap<String, String> map1= new HashMap<>();
	HashMap<String, String> map2= new HashMap<>();
	HashMap<String, String> map3= null;
    @Test
    @DisplayName("Test if All keys are Common ")
    public void testCommonKeys() {
    	map1.put("Alice","Healthy");
		map1.put("Mary","Ecastic");
		map1.put("Bob","Happy");
		map1.put("Chuck","Fine");
		map1.put("Felix","Sick");
		
		
		map2.put("Mary","Ecastic");
		map2.put("Felix","Healthy");
		map2.put("Ricardo","Superb");
		map2.put("Tam","Fine");
		map2.put("Bob","Happy");
		
		assertFalse(map1.equals(map2));

}
    
    @Test
    @DisplayName("Test for Cleared Hash Maps ")
    public void testClear(){	
    	map1.put("Alice","Healthy");
		
		map2.put("Mary","Ecastic");
		
		map1.clear();
		map2.clear();
		
		
		assertTrue(map1.isEmpty());
    	
    }
    
    
    
    @Test
    @DisplayName("Test If All keys are common in Hash Map ")
    public void testSameMap(){	
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
		
		
		
		
		assertTrue(map1.equals(map2));
    	
    }

    @Test
    @DisplayName("Test Null Map against populated one ")
    public void mapisNull(){	
    	map1.put("Alice","Healthy");
		map1.put("Mary","Ecastic");
		map1.put("Bob","Happy");
		map1.put("Chuck","Fine");
		map1.put("Felix","Sick");
		
		
		assertFalse(map1.equals(map3));
    	
    }
}
