package com.bit.exam05;

import java.util.ArrayList;

public class ArrayListTest04 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("���");
		list.add("����");
		list.add("����");
		System.out.println(list);
		list.add(1,"������");
		System.out.println(list);
	}

}
