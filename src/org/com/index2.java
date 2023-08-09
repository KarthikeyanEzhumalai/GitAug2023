package org.com;

import java.util.*;

public class index2 {
	public static void main(String[] args) {
		
		List<Integer> li = new LinkedList<>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		
		// To get the value 2nd index()
		int ind = li.indexOf(30);
		
		System.out.println("Last index value of 2nd: "+ind);

		

	}

}
