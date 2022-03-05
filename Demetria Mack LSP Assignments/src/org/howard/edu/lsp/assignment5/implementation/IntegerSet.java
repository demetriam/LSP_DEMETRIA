package org.howard.edu.lsp.assignment5.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import java.util.HashMap;

public class IntegerSet {
	
	/**
	 * constructor creates a new private ArrayList will add behaviors to it. 
	 */
	private ArrayList<Integer> set;
	
	public IntegerSet() {
		this.set = new ArrayList<Integer>();
	};
		
	/**
	 * return item at given index integers 
	 */
	public ArrayList<Integer> getSet() { return set; }
	
	
	public int get(int index) {
		return set.get(index);
	}

	/**
	 * Clears the internal representation of the set
	 */ 
	public void clear() {
		set.clear();
	};
	
	/**
	 * returns the length of the set
	 */
	public int length() {
		return set.size();
	}; 
	
	/**
	 * converted Integer set b to an ArrayList 
	 * sorted both Array Lists and compared them. 
	 * @return true/ false checks if two sets are equal. Tested by the built in method .equals
	 */
	
//	public boolean equals(IntegerSet b) {
//		if (b.length() != set.size()) {
//			return false;
//		} else {		
//			
//		
//			ArrayList <Integer> tempSet1 = new ArrayList<Integer>(set);
//			ArrayList <Integer> tempSet2 = new ArrayList<Integer>(b);
//			
//			IntegerSet.toArray(tempSet2);
//			
//			Collections.sort((tempSet1));
//			Collections.sort(tempSet2);
//			
//			return tempSet1.equals(tempSet2);	
//				
//			}	  
//	 }
	/**
	 * 
	 * the @param value is an integer that could possibly be apart of the set 
	 * @returns a boolean true or false  depending on whether the passed parameter is in the set or not
	 */
	
	public boolean contains(int value) {
		for (int i = 0; i < set.size(); i++) {
			if(value == set.get(i)) {
				return true;
			}
		}
		return false; 
	 };    
	
	/**
	 * 
	 * @return largest member in the set
	 * if the length of the set is zero a throws IntegerSetException occurs. 
	 */
	public int largest() throws IntegerSetException {
		if(set.size() == 0 ) {
			throw new IntegerSetException("Set length is 0");
		}
		else {
			int maxVal = set.get(0);
			int compVal = set.get(0);
			
			for (int i = 0;i<set.size();i++) {
				compVal = set.get(i);
				if( compVal > maxVal )
					maxVal = compVal;
			}
			return maxVal; 
		}	
	 }; 
	
	/**
	 * 
	 * @return smallest member in the set
	 * if the length of the set is zero a throws IntegerSetException occurs. 
	 */
	public int smallest() throws IntegerSetException{
		if(set.size() == 0 ) {
			throw new IntegerSetException("Set length is 0");
		}
		else {
			int minVal = set.get(0);
			int compVal = set.get(0);
			
			for (int i = 0;i<set.size();i++) {
				compVal = set.get(i);
				if( compVal < minVal )
					minVal = compVal;
			}
			return minVal; 
		}	
	}
		
	/**
	 * 
	 * item that will be added as an element to the set if it is not already
	 * if the item is already a member, bypass it & nothing occurs
	 */
	
	public void add(int item) {
		if (!set.contains(item)) {
			set.add(item);	
		}
	}
	
	/**
	 * 
	 * item that will be removed as an element to the set if it exists in the set 
	 * if the item is not already a member, bypass it & nothing occurs
	 */
	public void remove(int item) {
		boolean check = set.contains(item);
		if (check == false );
			set.remove(item);
	}
	

	/**
	 * combines the unique members of both the sets. Called on and the set passed in as an argument
	 * this new unique set updates the set 
	 */
	public void union(IntegerSet intSetb) {
		List<Integer> setB = intSetb.getSet();	
		for (int i = 0; i<setB.size(); i++) {
			if (!this.contains(setB.get(i))) {
				this.add(setB.get(i));
			}
		}
    }

	/**
	 * finds the common integers in the sets . Called on and the set passed in as an argument. 
	 * The new set only contains items present in both the original sets and updates the set. 
	 */
	public void intersect(IntegerSet intSetb) {
		ArrayList<Integer> setB = intSetb.getSet();
			for(int i = 0;i<setB.size(); i++) {
				if( intSetb.contains(i)) {
					setB.add(i);
				}
			}
			this.set = setB;
	}; 
	
	
	/**
	 * finds the differences between integers in the sets. Called on and the set passed in as an argument. 
	 * The new set only contains differences.  
	 */
	public void diff(IntegerSet intSetb) {
		for(int i=0; i<set.size(); i++) { 
			if(intSetb.contains(set.get(i))) { 
				set.remove(set.get(i)); 
				intSetb.remove(set.get(i));
			};
		} 	
		for(int i=0; i<intSetb.length();i++) {
			set.add(intSetb.get(i)); 
		}

		
	}
	
	/**
	 * checks is set is empty returns boolean depending on if the set is empty or not
	 */
	public boolean isEmpty(){
		if (set.size() == 0) {; 
			return true;
		} else {
			return false;
		}		
	}
		
	/**
	 * returns string representation of the set
	 */
	public String toString() {
		return set.toString();
	}
	
	
		
}; 
