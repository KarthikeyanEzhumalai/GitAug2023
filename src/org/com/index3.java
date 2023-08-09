package org.com;

import java.util.LinkedList;
import java.util.List;

public class index3 {
	
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
		
		// To find the index value of 50th()
		
	int ind = li.indexOf(50);
	System.out.println("Index value of 50th: "+ind);
		
		
		
		
		
		
		
		
	}

}
