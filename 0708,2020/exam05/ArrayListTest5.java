package com.bit.exam05;

import java.util.ArrayList;

public class ArrayListTest5 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("���");
		list.add("����");
		list.add("����");
//		list.remove(1);
//		list.remove("����");
		list.clear();
		System.out.println(list);
		int n = list.indexOf("����");
		System.out.println(n);
	}

}
