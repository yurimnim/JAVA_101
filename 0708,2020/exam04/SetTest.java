package com.bit.exam04;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(100);
		set.add(200);
		set.add(300);
		System.out.println(set);
		
		int sum = 0;
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			int n = (Integer)iter.next();
			sum += n;
		}
		System.out.println("요소의 총합은:" + sum);
	}
}
