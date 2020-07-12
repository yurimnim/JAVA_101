package com.bit.exam08;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest2 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();//순서가 유지되지 않는다.
		
		map.put("고길동", 22);
		map.put("김순신", 30);
		map.put("강유신", 25);
		map.put("유관순", 25);
		System.out.println(map);
		
		//모든 구성원들의 평균나이를 구하여 출력해보자. 
		
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
		System.out.println("나이 총 평균:" + avg);
	}

}
