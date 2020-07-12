package com.bit.exam04;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListandLinkedList {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(100);
		a.add(200);
		a.add(300);
		System.out.println(a);
		a.add(1, 500);
		System.out.println(a);
		
		LinkedList<Integer> b = new LinkedList<Integer>();
		b.add(100);
		b.add(200);
		b.add(300);
		System.out.println(b);
		b.add(1, 500);
		System.out.println(b);
	}
}
