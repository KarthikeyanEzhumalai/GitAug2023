package org.com;

import java.util.*;

public class Newarraylist1 {

	public static void main(String[] args) {

		List<Integer> li1 = new LinkedList<>();

		li1.add(10);
		li1.add(20);
		li1.add(30);
		li1.add(40);
		li1.add(50);
		li1.add(60);
		li1.add(70);
		li1.add(80);
		System.out.println("List one values:\n" + li1);

		List<Integer> li2 = new LinkedList<>();
		li2.add(100);
		li2.add(200);
		li2.add(300);
		li2.add(400);
		li2.add(500);
		li2.add(600);
		li2.add(700);
		li2.add(800);
		System.out.println("List 2nd values:\n" + li2);
		li2.retainAll(li1);
		System.out.println("Common values in List:\n" + li2);

	}

}
