package com.bit.exam07;

import java.util.HashMap;

public class MapTest01 {
	public static void main(String[] args) {
		HashMap<String, String> data = new HashMap<String, String>();
		data.put("name", "��浿");
		data.put("addr", "����� �ڹٵ�");
		String a = data.put("tel", "010-1123-1234"); //tel�� ���� null
		String b = data.put("tel", "010-2223-1222"); 
		System.out.println(data);
		System.out.println(b);
	}
}
