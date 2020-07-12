package com.bit.exam06;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryTest2 {
	public static Scanner sc = new Scanner(System.in);
	
	//�޴� ����Ʈ �޼ҵ� 
	public static void printMenu() {
		System.out.println("1.�߰�, 2.�˻�, 3.����, 0.����");
		System.out.print("�Է�==>");	
	}
	//����
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String, String>(); 
		map.put("Mother","����" );
		map.put("Father","�ƺ�" );
		map.put("son","�Ƶ�" );
		
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
		System.out.println("���α׷� ����");
	}
	
	//�޼ҵ�
	private static void delete(HashMap<String, String> map) {
		String key;
		System.out.println("������ �ܾ �Է��Ͻÿ�.");
		key = sc.next();
		String vaule = map.remove(key);
		if(vaule != null) {
			System.out.println(key + " ���� �� �����Ϸ�.");	
		}else {
			System.out.println(key + " �ܾ���������.");
		}
	}
	
	//��ġ �޼ҵ� 
	private static void search(HashMap<String, String> map) {
		String key, value;
		System.out.println("�˻��� �ܾ �Է��Ͻÿ�.");
		key = sc.next();
		value = map.get(key);	
		if(value != null) {
			System.out.println(key + "�� �ǹ̴�  " + value + " �Դϴ�");
		} else {
			int a;
			System.out.println(key + " �� ������ �����ϴ�.");
			System.out.println("����Ͻðڽ��ϱ�?(1:���, 0:���");
			a = sc.nextInt();
			if (a==1) {
				insert(map);
			}
		}
	}
	
	private static void insert(HashMap<String, String> map) {
		String key, value;
		System.out.println("����� ���ܾ �Է��Ͻÿ�.");
		key = sc.next();
		System.out.println("����� �ܾ��� ���� �Է��Ͻÿ�.");
		value = sc.next();
		
		map.put(key, value);
		System.out.println(key + " ��ϿϷ�");
	
	}
}
