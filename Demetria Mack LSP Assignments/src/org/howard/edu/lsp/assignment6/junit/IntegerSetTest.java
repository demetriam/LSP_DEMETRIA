package org.howard.edu.lsp.assignment6.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.lsp.assignment6.integerset.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class IntegerSetTest {
    @Test
    @DisplayName("IntegerSet.isEmpty test cases")
    public void testIsEmpty() {
       IntegerSet set1 = new IntegerSet ();
       assertTrue(set1.isEmpty());
       
       set1.add(1);
       assertFalse(set1.isEmpty());

}
    
    @Test
    @DisplayName("IntegerSet.clear test cases ")
    public void testClear(){	
		IntegerSet set1 = new IntegerSet();
		set1.clear();
		assertTrue(set1.isEmpty());
		
		
		
		IntegerSet set2 = new IntegerSet();
		for (int i=1;i<5;i++)
			set2.add(i);
		assertFalse(set2.isEmpty());  	
		set2.clear();
		assertTrue(set2.isEmpty());
    	
    }
    
    
    @Test
    @DisplayName("IntegerSet.length test cases ")
    public void testlength() {
    	IntegerSet set1 = new IntegerSet();
    	assertTrue(set1.length()==0);
    	
    	IntegerSet set2 = new IntegerSet();
    	for(int i = -20; i<20; i++)
    		set2.add(i);
    	assertTrue(set2.length() == 40);
   
    }
    
    
    @Test
    @DisplayName("IntegerSet.equals test cases ")
    public void testequals() {
    	
    	IntegerSet set1 = new IntegerSet();
    	IntegerSet set2 = new IntegerSet();
    	IntegerSet set3 = new IntegerSet();
    	
    	
    	
    	for(int i = -20;i<20; i++)
    		set1.add(i);
    	for(int i = -20;i<20; i++)
    		set2.add(i);
    	for(int i = -10;i<10; i++)
    		set3.add(i);
    	assertFalse(set1.equals(set3)== true);
    	
    	assertTrue(set1.equals(set2) == true ); 
    	
    }
    
    
    @Test
    @DisplayName("IntegerSet.contains test cases ")
    public void testcontains() {
    	IntegerSet set1 = new IntegerSet();
    	IntegerSet set2 = new IntegerSet();
    	assertFalse(set1.contains(99));
    	
    	for(int i = -30;i<30; i++)
    		set2.add(i);
    	assertFalse(set2.contains(-31));
    	assertFalse(set2.contains(31));
    	assertTrue(set2.contains(0));
    	assertTrue(set2.contains(9));
    	
    	
    	for(int i = -20;i<20; i++)
    		set1.add(i);
    	assertFalse(set1.contains(-30));
    	assertFalse(set1.contains(21));
    	assertTrue(set1.contains(0));
    	assertTrue(set1.contains(10));
 	
    }
    
    
    @Test
    @DisplayName("IntegerSet.largest test cases ")
    public void testlargest() throws IntegerSetException {
    	IntegerSet set1 = new IntegerSet();
    	
    	assertThrows(IntegerSetException.class,() -> set1.largest(), "Set length is 0 cannot search ");
    	
   
    	
    }
    
    
    @Test
    @DisplayName("IntegerSet.smallest test cases ")
    public void testsmallest() throws IntegerSetException {
    	
 
    }
    
    @Test
    @DisplayName("IntegerSet.add test cases ")
    public void testadd() {
    	IntegerSet set1 = new IntegerSet();
    	set1.add(0);
    	assertTrue(set1.contains(0));
    	
    	for(int i= 1; i<50;i++) {
    		set1.add(i);
    		assertTrue(set1.contains(i));
    		assertFalse(set1.contains(i*100));  
    		assertTrue(set1.contains(i%100));
    	}
    	
    	
    }
   
    
    @Test
    @DisplayName("IntegerSet.remove test cases ")
    public void testremove() {
//    	IntegerSet set1 = new IntegerSet();
//		
//		for (int i = 1;i<100;i++) {
//			set1.add(i);
//			set1.remove(i);
//			assertFalse(set1.contains(i));
//		}
	}
    
    
    @Test
    @DisplayName("IntegerSet.union test cases ")
    public void testunion() {
    	IntegerSet set1 = new IntegerSet();
    	IntegerSet set2 = new IntegerSet();
    	IntegerSet set3 = new IntegerSet();
    	
    	set1.union(set2);
		assertTrue(set1.equals(set2));
		assertTrue(set1.equals(set3));
		
		
    	for(int i =1;i<20;i++) {
    		set1.add(i);
    		set3.add(i);
    	}
    		
    	for (int i = -1;i>-20;i--) {
    		set2.add(i);
    	set1.union(set2);
    	assertTrue(set1.contains(9));
    	
    	}
    		
    	assertFalse(set1.length()== set3.length());
		assertTrue(set1.length() == set3.length()+set2.length());

    
    }
    
    
    @Test
    @DisplayName("IntegerSet.intersect test cases ")
    public void testintersect() {
    	IntegerSet set1 = new IntegerSet();
    	
    	
    }
    
    
    @Test
    @DisplayName("IntegerSet.diff test cases ")
    public void testdiff() {
    	
    	
    }
    
    
    @Test
    @DisplayName("IntegerSet.toString test cases ")
    public void testtoString() {
    	
    	
    }
    
    
}
