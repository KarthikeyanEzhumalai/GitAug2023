package org.com;

import java.util.*;

public class indexchapter {

	public static void main(String[] args) {

		List<Integer> i1 = new LinkedList<>();

		i1.add(10);
		i1.add(20);
		i1.add(30);
		i1.add(40);

		// To get the first index values of 10 ()
		int ind = i1.indexOf(10);
		System.out.println("First Index Of Pos: " + ind);

	}

}
