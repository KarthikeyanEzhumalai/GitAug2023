package org.com;

import java.util.*;

public class index6 {

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
		// To get each index value of 70th()

		for (int i = 0; i < li.size(); i++) {
			
			Integer in2 = li.get(i);

			if (in2 == 70) {
				System.out.println(i);
			}

		}

	}

}
