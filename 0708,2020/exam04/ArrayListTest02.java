package com.bit.exam04;

import java.util.ArrayList;

public class ArrayListTest02 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		
		int sum = 0;
		for(int i=0;i<list.size();i++) {
			int n = (Integer)list.get(i);
			sum += n;
		}
		System.out.println("데이터의 총합 " + sum);
	}

}
