package com.bit.exam04;

import java.util.Date;
import java.util.HashSet;

public class HashSetTest {
	
	
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(2020);
		set.add("bitcamp");
		set.add(new Date());
		set.add(true);
		set.add(35.6);
		set.add(2020);
		boolean f2 = set.add(50.0);
		boolean f = set.add(2020);
		System.out.println(f2);
		System.out.println(f);
		System.out.println(set);
	}

}
