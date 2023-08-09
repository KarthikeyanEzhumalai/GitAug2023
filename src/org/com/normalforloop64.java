package org.com;

import java.util.*;

public class normalforloop64 {
	
	public static void main(String[] args) {
		
		List<Integer> li1 = new LinkedList<>();
		
		li1.add(105);
		li1.add(205);
		li1.add(305);
		li1.add(405);
		li1.add(505);
		li1.add(605);
		li1.add(705);
		li1.add(805);
		// Get the each value of list by using normal for loop()
		System.out.println("Normal for loop");
		
		for(int i=0; i<li1.size(); i++) {
			
			System.out.println(li1.get(i));				
		}
		
		//Get the each value of list by using enhanced for loop()
		System.out.println("Enhanced for loop:");
		for(Integer kjks : li1) {
			
			System.out.println(kjks);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
