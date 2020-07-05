package com.bit.exam05;

import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int cnt = 0;
		
		System.out.print("문자열을 입력하세요 ==> ");
		str = sc.nextLine().trim();
		
		str = str.replaceAll(" ", "");
		str = str.toLowerCase();
		
		for (int i = 0; i <= str.length()-5; i++) {
			String str2 = str.substring(i, i+5);
			if (str2.equals("hello")) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}