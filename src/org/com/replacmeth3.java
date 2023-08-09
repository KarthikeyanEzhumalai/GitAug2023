package org.com;

import java.util.*;

public class replacmeth3 {

	public static void main(String[] args) {

		List<Integer> li = new LinkedList();

		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		li.add(30);
		System.out.println("Before replace:\n" + li);
		// Replace the 10 into 100 in List by using normal for loop()
		for (int i = 0; i < li.size(); i++) {
			Integer val = li.get(i);
			if (val == 10) {
				Integer set = li.set(i, 100);
			}
		}
		System.out.println("After replace:\n" + li);

	}
}
