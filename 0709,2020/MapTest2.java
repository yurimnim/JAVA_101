package com.bit.exam08;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest2 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();//������ �������� �ʴ´�.
		
		map.put("��浿", 22);
		map.put("�����", 30);
		map.put("������", 25);
		map.put("������", 25);
		System.out.println(map);
		
		//��� ���������� ��ճ��̸� ���Ͽ� ����غ���. 
		
//		
//		Iterator<String> key_list = map.keySet().iterator();
//
//		int sum = 0;
//		while(key_list.hasNext()) {
//			String key = key_list.next();
//			sum += map.get(key);
//		}
//		int avg = sum/map.size();
//		
//		System.out.println(avg);
	
		
		Iterator<String> iter = map.keySet().iterator();
		
		int sum = 0;
		
		while(iter.hasNext()) {
			String key = iter.next();
			sum = sum + map.get(key);
		}
		int avg = sum/map.size();
		System.out.println("���� �� ���:" + avg);
	}

}
