package com.bit.exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("이름", "고길동");
		map.put("주소", "서울시 마포구 자바동");
		map.put("전화", "010-2345-3333");
		
		System.out.println(map.get("전화"));
		
		
//		ArrayList<String> data = new ArrayList<String>();
//		data.add("고길동");
//		data.add("서울시 마포구 신수동");
//		data.add("010-2323-3434");
//		System.out.println(data.get(2));
//		
	}

}
