package com.bit.exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("�̸�", "��浿");
		map.put("�ּ�", "����� ������ �ڹٵ�");
		map.put("��ȭ", "010-2345-3333");
		
		System.out.println(map.get("��ȭ"));
		
		
//		ArrayList<String> data = new ArrayList<String>();
//		data.add("��浿");
//		data.add("����� ������ �ż���");
//		data.add("010-2323-3434");
//		System.out.println(data.get(2));
//		
	}

}
