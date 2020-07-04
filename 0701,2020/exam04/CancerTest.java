package com.bit.exam04;

import java.util.Date;
import java.util.Scanner;

/*
 사용자에게 이름과 주민번호를 입력받아 무료암검진 대상자인지 판별하고
 무료암검진 항목을 출력하는 프로그램 작성 
 처리조건:: 무료암검진 대상자 나이 40세 이상 본인 홀수년도 == 홀수년도에/짝수년도면 짝수년도에
 ## 무료 암검진 조건##
 나이가 40세 이상 남자: 간암, 위암  
 나이가 40세 이상 여자: 간암,위암, 유방암, 자궁암
 나이가 50세 이상 남자: 간암, 위암, 대장암
 나이가 50세 이상 여자: 간암, 위암, 대장암, 유방암, 자궁암 
 */

public class CancerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		
		int thisYr = today.getYear() + 1900;
			
		String juminNo,name;
		
		//입력
		
		System.out.print("이름을 입력하십시오 ==> ");
		name = sc.next();
		System.out.print("주민등록번호를 입력하십시오 ==>"); 
		juminNo = sc.next();
		
		
		//나이,성별추출 
		int gender = Integer.parseInt(juminNo.charAt(7) +"");
		int birthYr = Integer.parseInt(juminNo.substring(0, 2));
		
		
		if(gender == 3 || gender == 4 || gender == 7 || gender == 8 ) {
			birthYr = birthYr + 2000;
		}else {
			birthYr = birthYr + 1900;
		}
		
		
		int age = thisYr - birthYr + 1;
		int check = birthYr % 2;
		
		if (age < 40 || check != birthYr%2) {
			System.out.println(name +"님은 올해 암검진 대상자가 아닙니다.");
			return;
		}
		
		String r = "위암, 간암"; 
		
		if (age >=50) {
			r += ", 대장암";
		} 
		
		if (gender == 2) {
			r += ", 유방암, 자궁암";
		}
		
		System.out.println(name + " 님은 올해 " + thisYr + " 년도 무료 암검진 대상자 입니다. 진행가능 검사:" + r);
			
		/*
		if(check == thisYr % 2) {
			if (gender == 1) {
				if (age >=40 && age < 50) {
					System.out.println(name +"님 올해 암검진 대상자:" + age + " 세::" + "진행가능 검사: "+ r);
				} else if (age >=50) {
					System.out.println(name +"님 올해 암검진 대상자: " + age + " 세::" + "진행가능 검사: "+ r + "대장암");
				} else {
					System.out.println(name +"님은 올해 암검진 대상자가 아닙니다");
				}
		 } else if (gender == 2)
			 if (age >=40 && age < 50) {
					System.out.println(name +"님 올해 암검진 대상자: " + age + " 세::" + "진행가능 검사: "+ r + "유방암, 자궁암");
				} else if (age >=50) {
					System.out.println(name +"님 올해 암검진 대상자: " + age + " 세::" + "진행가능 검사: "+ r + "대장암, 유방암, 자궁암");
				} else {
					System.out.println(name +"님은 올해 암검진 대상자가 아닙니다");
				}
		} else {
			System.out.println(name + "님은 올해 암검진 대상자가 아닙니다.");
		}
		*/
	}
	
	
}
