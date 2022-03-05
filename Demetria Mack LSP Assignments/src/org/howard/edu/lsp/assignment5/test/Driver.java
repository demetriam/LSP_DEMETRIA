package org.howard.edu.lsp.assignment5.test;
import org.howard.edu.lsp.assignment5.implementation.*;

public class Driver {

	
	public static void main(String[] args) throws IntegerSetException {
		
		IntegerSet set1 = new IntegerSet(); // instantiate new object
		set1.add(4);
		set1.add(2);
		set1.add(5);
		set1.add(6);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(4);
		set2.add(5);
		set2.add(8);
		set2.add(9);
//		
//		for (int i = 0;i<10;i++)
//			set1.add(i);
//		
//		for (int j = 0;j>-10;j--)
//			set2.add(j);
//		

		
		System.out.println("The length of Set1 is " + set1.length());
		System.out.println("The length of Set2 is " + set2.length());
		
		
		
		System.out.println("The values of Set1 are " + set1.getSet());
		System.out.println("The values of Set2 are " + set2.getSet());
		
		System.out.println("Are the sets equal ? " + set1.equals(set2));
		
		
		System.out.println("Smallest value in Set1 is " + set1.smallest());
		System.out.println("Smallest value in Set2 is " + set2.smallest());
		
		System.out.println("Largest value in Set2 is " + set1.largest());
		
		
		
		set1.union(set2);	// union of set1 and set2
		System.out.println("Result of union of Set1 and Set2 " + set1.toString());

		
		set1.intersect(set2); 
		System.out.println("Result of Intersection of Set1 and Set2 " + set2.toString());
		
		
		// test for difference and intersection
		
		
	}
	
}
