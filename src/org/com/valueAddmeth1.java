package org.com;

import java.util.*;

public class valueAddmeth1 {
	
	public static void main(String[] args) {
		
		List<Integer> li = new LinkedList<>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		System.out.println(li);
		
		//Add a value 50 in the 2nd index and display the list after adding.
		
		li.set(2, 50);
		System.out.println(li);
		
		
		
		
		
		
		
		
		
		
		
	}

}
