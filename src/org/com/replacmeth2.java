package org.com;

import java.util.*;

public class replacmeth2 {
	
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
		li.add(10);
		System.out.println(li);
		
		//Replace the value present in 7th index as 90()
		
		li.set(7, 90);
		System.out.println(li);
		
		
		
		
	}

}
