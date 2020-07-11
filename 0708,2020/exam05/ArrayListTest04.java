package com.bit.exam05;

import java.util.ArrayList;

public class ArrayListTest04 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("포도");
		list.add("수박");
		System.out.println(list);
		list.add(1,"오렌지");
		System.out.println(list);
	}

}
