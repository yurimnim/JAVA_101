package com.bit.exam06;

import java.util.HashMap;
import java.util.Scanner;


public class Programming11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		System.out.println("�˻��� �ܾ �Է��Ͻÿ�");
		input = sc.next();
		
		HashMap<String,String> EngDic = new HashMap<String, String>(); 
		EngDic.put("Apple","���" );
		EngDic.put("Grapes","����" );
		EngDic.put("Watermelon","����" );
	
		System.out.println(input + ": "+ EngDic.get(input));
		
			if(EngDic.get(input) == null) {
				System.out.println("��������");
			}
		}

	}


