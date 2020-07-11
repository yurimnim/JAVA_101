package com.bit.exam05;

import java.util.ArrayList;

public class ArrayListTest5 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("포도");
		list.add("수박");
//		list.remove(1);
//		list.remove("포도");
		list.clear();
		System.out.println(list);
		int n = list.indexOf("포도");
		System.out.println(n);
	}

}
