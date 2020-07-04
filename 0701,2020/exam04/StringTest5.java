package com.bit.exam04;
//주민번호를 입력받아 나이와 성별을 판단하여 출력하는 프로그램을 작성 

import java.util.Date;
import java.util.Scanner;

public class StringTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String juminNo;
		System.out.print("주민등록번호를 작성하시오==>");
		juminNo = sc.next();
		
		//올해 계산
		Date today = new Date();
		int year = today.getYear();
				
		//주민번호 추출
		int check= Integer.parseInt(juminNo.substring(7,8));		
		int checkyr = Integer.parseInt(juminNo.substring(0, 2));

	
		//나이계산 체크 
		if(check == 3 || check == 4 || check==7 || check ==8) {
			year = year - 100;
		}
		
		//성별판별
		if(check == 1 ||check == 3 || check == 5 || check == 7) {
			System.out.println("성별: 남");
		}else {
			System.out.println("성별: 여 ");
		}
		
		int age = year - checkyr + 1;
		System.out.println("올해나이:" + age);
				
	}

}
