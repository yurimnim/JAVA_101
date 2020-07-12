package com.bit.exam06;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryTest2 {
	public static Scanner sc = new Scanner(System.in);
	
	//메뉴 프린트 메소드 
	public static void printMenu() {
		System.out.println("1.추가, 2.검색, 3.삭제, 0.종료");
		System.out.print("입력==>");	
	}
	//메인
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String, String>(); 
		map.put("Mother","엄마" );
		map.put("Father","아빠" );
		map.put("son","아들" );
		
		int menu;
		while(true) {
			printMenu();
			menu = sc.nextInt();
			if (menu==0 ) {
				break;
			}
			switch(menu) {
				case 1: insert(map);break;
				case 2: search(map);break;
				case 3: delete(map);break;
			}
			
		}
		System.out.println("프로그램 종료");
	}
	
	//메소드
	private static void delete(HashMap<String, String> map) {
		String key;
		System.out.println("삭제할 단어를 입력하시오.");
		key = sc.next();
		String vaule = map.remove(key);
		if(vaule != null) {
			System.out.println(key + " 사전 내 삭제완료.");	
		}else {
			System.out.println(key + " 단어정보없음.");
		}
	}
	
	//서치 메소드 
	private static void search(HashMap<String, String> map) {
		String key, value;
		System.out.println("검색할 단어를 입력하시오.");
		key = sc.next();
		value = map.get(key);	
		if(value != null) {
			System.out.println(key + "의 의미는  " + value + " 입니다");
		} else {
			int a;
			System.out.println(key + " 는 사전에 없습니다.");
			System.out.println("등록하시겠습니까?(1:등록, 0:취소");
			a = sc.nextInt();
			if (a==1) {
				insert(map);
			}
		}
	}
	
	private static void insert(HashMap<String, String> map) {
		String key, value;
		System.out.println("등록할 영단어를 입력하시오.");
		key = sc.next();
		System.out.println("등록할 단어의 뜻을 입력하시오.");
		value = sc.next();
		
		map.put(key, value);
		System.out.println(key + " 등록완료");
	
	}
}
