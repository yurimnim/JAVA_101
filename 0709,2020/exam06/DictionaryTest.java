package com.bit.exam06;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryTest {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String, String>(); 
		map.put("Mother","����" );
		map.put("Father","�ƺ�" );
		map.put("son","�Ƶ�" );
	
		Scanner sc = new Scanner(System.in);
		System.out.print("�ܾ �Է��Ͻÿ�:");
		String key = sc.next();
		String value = map.get(key);
		
		if(value == null) {
			System.out.println("��������");
		}else {
			System.out.println(key + "�� �ǹ̴� " + value + "�Դϴ�.");
		}		
	}
}
