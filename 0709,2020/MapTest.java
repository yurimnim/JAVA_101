package com.bit.exam08;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
//		HashMap<String, Integer> map = new HashMap<String, Integer>();//������ �������� �ʴ´�.

//		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();//������ �����ȴ�.
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();//key�� ������ ���� ������ �ȴ�.
		
		map.put("��浿", 22);
		map.put("�����", 30);
		map.put("������", 25);
		System.out.println(map);
		
	
	}

}
