package com.bit.exam06;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryTest {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String, String>(); 
		map.put("Mother","엄마" );
		map.put("Father","아빠" );
		map.put("son","아들" );
	
		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력하시오:");
		String key = sc.next();
		String value = map.get(key);
		
		if(value == null) {
			System.out.println("정보없음");
		}else {
			System.out.println(key + "의 의미는 " + value + "입니다.");
		}		
	}
}
