package com.bit.exam07;

import java.util.HashMap;

public class MapTest01 {
	public static void main(String[] args) {
		HashMap<String, String> data = new HashMap<String, String>();
		data.put("name", "고길동");
		data.put("addr", "서울시 자바동");
		String a = data.put("tel", "010-1123-1234"); //tel은 아직 null
		String b = data.put("tel", "010-2223-1222"); 
		System.out.println(data);
		System.out.println(b);
	}
}
