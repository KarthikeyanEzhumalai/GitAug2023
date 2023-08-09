package org.com;

import java.util.*;

public class replacmeth1 {
	
	public static void main(String[] args) {
		
		List<Integer> li = new LinkedList<>();
		
		//Replace the value 300 into 350 in the list()
		
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		li.add(500);
		li.add(600);
		li.add(700);
		System.out.println(li);
		
		li.set(2, 350);
		System.out.println(li);

		
		
		
		
		
		
		
	}

}
