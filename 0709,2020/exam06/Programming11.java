package com.bit.exam06;

import java.util.HashMap;
import java.util.Scanner;


public class Programming11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		System.out.println("검색할 단어를 입력하시오");
		input = sc.next();
		
		HashMap<String,String> EngDic = new HashMap<String, String>(); 
		EngDic.put("Apple","사과" );
		EngDic.put("Grapes","포도" );
		EngDic.put("Watermelon","수박" );
	
		System.out.println(input + ": "+ EngDic.get(input));
		
			if(EngDic.get(input) == null) {
				System.out.println("정보없음");
			}
		}

	}


